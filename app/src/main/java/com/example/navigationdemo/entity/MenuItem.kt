package com.example.navigationdemo.entity

data class MenuItem(
    var text:String? = null,
    var action:(()->Unit)? = null
)