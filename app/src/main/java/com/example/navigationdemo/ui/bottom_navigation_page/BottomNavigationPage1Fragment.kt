package com.example.navigationdemo.ui.bottom_navigation_page

import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_target.*

class BottomNavigationPage1Fragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_target

    override fun initView() {
        tv_content.text = "BottomNavigationPage1"
//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
//            findNavController().popBackStack(R.id.navigation_ui_sample,false)
//        }
    }
}