package com.example.myapplication

class Dice (val numSides:Int){
    fun roll():Int{
        return (0..numSides).random()
    }
}