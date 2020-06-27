package com.example.navigationdemo.ui

import androidx.navigation.NavOptions
import com.example.navigationdemo.R

val defaultAnimOption = NavOptions.Builder()
    .setEnterAnim(R.anim.anim_right_in)
    .setExitAnim(R.anim.anim_left_out)
    .setPopEnterAnim(R.anim.anim_left_in)
    .setPopExitAnim(R.anim.anim_right_out)
    .build()

val fragmentTransition = NavOptions.Builder()
    .setEnterAnim(R.anim.fragment_open_enter)
    .setExitAnim(R.anim.fragment_open_exit)
    .setPopEnterAnim(R.anim.fragment_close_enter)
    .setPopExitAnim(R.anim.fragment_close_exit)
    .build()