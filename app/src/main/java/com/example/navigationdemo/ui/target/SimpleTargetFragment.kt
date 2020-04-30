package com.example.navigationdemo.ui.target

import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_target.*

class SimpleTargetFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_target

    override fun initView() {
        tv_content.text = "this is simple target fragment"
    }
}