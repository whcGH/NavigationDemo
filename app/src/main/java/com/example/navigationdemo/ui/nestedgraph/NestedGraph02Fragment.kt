package com.example.navigationdemo.ui.nestedgraph

import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_target.*

class NestedGraph02Fragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_target

    override fun initView() {
        tv_content.text = "this is second nested graph page"
    }
}