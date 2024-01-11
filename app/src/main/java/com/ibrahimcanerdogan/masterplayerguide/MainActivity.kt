package com.ibrahimcanerdogan.masterplayerguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.ibrahimcanerdogan.masterplayerguide.view.fragment.AgentFragment
import com.ibrahimcanerdogan.masterplayerguide.view.fragment.MapFragment
import com.ibrahimcanerdogan.masterplayerguide.view.fragment.WeaponFragment
import com.ibrahimcanerdogan.masterplayerguide.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(AgentFragment())
        binding.bottomNavigationView.menu.get(1).isChecked = true
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.navigation_agent -> replaceFragment(AgentFragment())
                R.id.navigation_maps -> replaceFragment(MapFragment())
                R.id.navigation_weapon -> replaceFragment(WeaponFragment())
                // R.id.navigation_other -> replaceFragment(OtherFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()
    }
}