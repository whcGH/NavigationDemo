package com.example.navigationdemo

import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navigationdemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_bottom_navigation.*

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navController = navHostFragment.navController

//        navController.addOnDestinationChangedListener { controller, destination, arguments ->
//            if (destination.id in listOf(R.id.tab1, R.id.tab2, R.id.tab3)) {
//                bottom.visibility = View.VISIBLE
//            } else {
//                bottom.visibility = View.GONE
//            }
//        }
//
//        bottom.setupWithNavController(navController)
        tool_bar.setupWithNavController(navController)
    }

    fun select() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navController = navHostFragment.navController.navigate(
            R.id.action_global_navigation3,
            null,
            defaultAnimOption
        )
    }
}

val defaultAnimOption = NavOptions.Builder()
    .setEnterAnim(R.anim.anim_right_in)
    .setExitAnim(R.anim.anim_left_out)
    .setPopEnterAnim(R.anim.anim_left_in)
    .setPopExitAnim(R.anim.anim_right_out)
    .build()
