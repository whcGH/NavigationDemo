package com.example.navigationdemo.ui.target.viewmodel

import androidx.lifecycle.ViewModel
import com.example.navigationdemo.entity.UnPeekLiveData

class TargetReturnArgViewModel : ViewModel() {
    val textArg = UnPeekLiveData<String?>()
}