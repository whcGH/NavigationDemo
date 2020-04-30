package com.example.navigationdemo.ui.target

import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import com.example.navigationdemo.ui.target.viewmodel.TargetReturnArgViewModel
import kotlinx.android.synthetic.main.fragment_target_return_arg.*

class TargetReturnArgFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_target_return_arg

    private val viewModel by lazy {
        getSharedViewModel<TargetReturnArgViewModel>()
    }

    override fun initView() {
        btn_return.setOnClickListener {
            viewModel.textArg.postValue(edit_content.text.toString().trim())
            findNavController().navigateUp()
        }
    }
}
