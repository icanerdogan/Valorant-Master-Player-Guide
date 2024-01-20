package com.ibrahimcanerdogan.masterplayerguide.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ibrahimcanerdogan.masterplayerguide.util.Resource
import com.ibrahimcanerdogan.masterplayerguide.view.adapter.map.MapAdapter
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.map.MapViewModel
import com.ibrahimcanerdogan.masterplayerguide.view.viewmodel.map.MapViewModelFactory
import com.ibrahimcanerdogan.masterplayerguide.R
import com.ibrahimcanerdogan.masterplayerguide.databinding.FragmentMapBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MapFragment : Fragment() {

    private var _binding : FragmentMapBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(MapViewModel::class.java)
    }

    @Inject
    lateinit var factory: MapViewModelFactory

    @Inject
    lateinit var mapAdapter: MapAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewMap.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = mapAdapter
        }

        mapAdapter.onMapItemClick = {
           val fragment = MapDetailFragment.newInstance(
               mapName = it.displayName ?: "",
               mapCoordinate = it.coordinates ?: "",
               mapSplashIcon = it.splash ?: "",
               mapDisplayIcon = it.displayIcon
           )

            val fragmentManager = childFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.frameLayoutMap, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        setMapData()
    }

    private fun setMapData() {
        viewModel.getAllMapData()
        viewModel.mapData.observe(viewLifecycleOwner) { response ->
            when(response) {
                is Resource.Success -> {
                    setProgressBar(false)
                    response.data.let {
                        mapAdapter.setData(it!!)
                    }
                }
                is Resource.Error -> {
                    setProgressBar(false)
                    response.message?.let {
                        Toast.makeText(activity, it, Toast.LENGTH_LONG).show()
                        println("An error occured: $it")
                    }
                }
                is Resource.Loading -> {
                    setProgressBar(true)
                }
            }
        }
    }

    private fun setProgressBar(isShown : Boolean) {
        binding.progressIndicator.visibility = if (isShown) View.VISIBLE else View.GONE
    }

    override fun onResume() {
        super.onResume()
        requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView).visibility = View.VISIBLE
    }
}