package com.ibrahimcanerdogan.masterplayerguide.view.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

open class BaseViewModel(
    private val app : Application
)  : AndroidViewModel(app)