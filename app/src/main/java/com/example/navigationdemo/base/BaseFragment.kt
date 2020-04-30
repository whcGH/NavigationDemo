package com.example.navigationdemo.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment : Fragment() {
    abstract fun getLayoutId(): Int
    abstract fun initView()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

   inline fun <reified T : ViewModel> getViewModel(): T =
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[T::class.java]

    inline fun <reified T : ViewModel> getSharedViewModel(): T =
        ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory())[T::class.java]
}