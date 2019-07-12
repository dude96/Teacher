package com.example.teacher

import com.example.myapplication.Person

class Manager:Person() {
    override fun getDescription():String{
        return "Manager name:$name"
    }

}