package com.example.navigationdemo.ui

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.R
import com.example.navigationdemo.base.BaseFragment
import com.example.navigationdemo.entity.MenuItem
import com.example.navigationdemo.ui.adapter.MenuListAdapter
import com.example.navigationdemo.ui.target.viewmodel.TargetReturnArgViewModel
import kotlinx.android.synthetic.main.fragment_menu_list.*

class GoNextPageSampleFragment : BaseFragment() {
    override fun getLayoutId(): Int = R.layout.fragment_menu_list
    private val adapter by lazy {
        MenuListAdapter()
    }
    private val viewModel by lazy {
        getSharedViewModel<TargetReturnArgViewModel>()
    }

    override fun initView() {
        viewModel.textArg.observe(this, Observer {
            if (!it.isNullOrBlank()) {
                Toast.makeText(
                    requireContext(),
                    "get return textArg = $it",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        recycler_view.adapter = adapter
        adapter.setNewData(
            mutableListOf(
                MenuItem("navigate with action id") {
                    findNavController().navigate(R.id.action_goNextPageSampleFragment_to_simpleTargetFragment)
                },
                MenuItem("navigate with action id and argument") {
                    val bundle = Bundle()
                    bundle.putString("textArg", "test text")
                    bundle.putInt("intArg", 6)
                    findNavController().navigate(
                        R.id.action_goNextPageSampleFragment_to_targetWithArgFragment,
                        bundle, defaultAnimOption
                    )
                },
                MenuItem("navigate with safe args and action") {
                    val action =
                        GoNextPageSampleFragmentDirections.actionGoNextPageSampleFragmentToTargetWithArgFragment(
                            "test text",
                            6
                        )
                    findNavController().navigate(action, defaultAnimOption)
                },
                MenuItem("navigate with global action") {
                    findNavController().navigate(
                        R.id.action_global_simpleTargetFragment, null,
                        defaultAnimOption
                    )
                },
                MenuItem("navigate with return argument") {
                    findNavController().navigate(
                        R.id.action_goNextPageSampleFragment_to_targetReturnArgFragment, null,
                        defaultAnimOption
                    )
                },
                MenuItem("navigate to nested graph") {
                    findNavController().navigate(
                        R.id.action_goNextPageSampleFragment_to_navigation2, null,
                        defaultAnimOption
                    )
                },
                MenuItem("navigate to deep link") {
                    findNavController().navigate(
                        Uri.parse("test://navigationdemo.com/deeplink/target"),
                        defaultAnimOption
                    )
                },
                MenuItem("navigate to deep link with argument") {
                    // https://stackoverflow.com/questions/50887228/jetpack-navigation-deeplink-with-query-parameters  参照此解决 deep link 带多个参数的问题
                    val uri =
                        Uri.parse("test://navigationdemo.com/deeplink/target2?textArg=aaa&intArg=222")
                    findNavController().navigate(uri, defaultAnimOption)
                }
            )
        )
    }
}