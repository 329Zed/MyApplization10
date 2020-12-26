package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val fragment = BlankFragment()
        val fragment2 = BlankFragment2()
        val fragment3 = BlankFragment3()

        val bnv = findViewById<BottomNavigationView>(R.id.bnv)
        bnv.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.game ->
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,fragment)
                        .commit()
                R.id.support ->
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,fragment2)
                        .commit()
                R.id.settings ->
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,fragment3)
                        .commit()
            }
            true
        }

        var isExit :Boolean  = false
        fun exitclick2(){
            val handler = Handler()
            if((!isExit)){
                isExit = true
                Toast.makeText(this,"再点一次退出",Toast.LENGTH_LONG).show()
                handler.postDelayed({
                    isExit = false},2000)
                }else{
                    finish()
                System.exit(0)
                }
            }
        }






}
//        val button3 = findViewById<Button>(R.id.button3)
//        val button4 = findViewById<Button>(R.id.button4)
//        button3.setOnClickListener{
//            finish()
//        }
//        button4.setOnClickListener{
//            val login = Intent(this,::class.java)
//            startActivity(login)
//       }









