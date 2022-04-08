package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.GridView
import com.example.myapplication.adapter.CustomAdapter
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.model.Constant
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var condition = 0

    var gridView: GridView? = null
    var customAdapter: CustomAdapter? = null
    var constantList: MutableList<Constant>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView = findViewById<View>(R.id.gridView) as GridView
        constantList = ArrayList()
        intent = getIntent()
        condition = intent.getIntExtra("condition", 0)
        if (condition == 1) {
            centralRecipes()
        } else if (condition == 2) {
            isanRecipes()
        } else if (condition == 3) {
            SouthwestRecipes()
        } else if (condition == 4) {
            NorthRecipes()
        }
        customAdapter = CustomAdapter(this@MainActivity, constantList, condition)
        gridView!!.adapter = customAdapter
    }

    var url = arrayOf(
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp",
        "https://gitlab.com/ecedreamer/ecomtuts/-/tree/master/ecomapp"
    )

    fun centralRecipes() {
        constantList!!.add(
            Constant(
                R.drawable.a1,
                resources.getString(R.string.cenT1),
                resources.getString(R.string.cenM1),
                resources.getString(R.string.cenP1),
                resources.getString(R.string.cenU1),
                resources.getString(R.string.cenUU1)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a2,
                resources.getString(R.string.cenT2),
                resources.getString(R.string.cenM2),
                resources.getString(R.string.cenP2),
                resources.getString(R.string.cenU2),
                resources.getString(R.string.cenUU2)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a3,
                resources.getString(R.string.cenT3),
                resources.getString(R.string.cenM3),
                resources.getString(R.string.cenP3),
                resources.getString(R.string.cenU3),
                resources.getString(R.string.cenUU3)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a4,
                resources.getString(R.string.cenT4),
                resources.getString(R.string.cenM4),
                resources.getString(R.string.cenP4),
                resources.getString(R.string.cenU4),
                resources.getString(R.string.cenUU4)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a5,
                resources.getString(R.string.cenT5),
                resources.getString(R.string.cenM5),
                resources.getString(R.string.cenP5),
                resources.getString(R.string.cenU5),
                resources.getString(R.string.cenUU5)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a6,
                resources.getString(R.string.cenT6),
                resources.getString(R.string.cenM6),
                resources.getString(R.string.cenP6),
                resources.getString(R.string.cenU6),
                resources.getString(R.string.cenUU6)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a7,
                resources.getString(R.string.cenT7),
                resources.getString(R.string.cenM7),
                resources.getString(R.string.cenP7),
                resources.getString(R.string.cenU7),
                resources.getString(R.string.cenUU7)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.a8,
                resources.getString(R.string.cenT8),
                resources.getString(R.string.cenM8),
                resources.getString(R.string.cenP8),
                resources.getString(R.string.cenU8),
                resources.getString(R.string.cenUU8)
            )
        )
    }

    fun isanRecipes() {
        constantList!!.add(
            Constant(
                R.drawable.b4,
                resources.getString(R.string.esanT1),
                resources.getString(R.string.esanM1),
                resources.getString(R.string.esanP1),
                resources.getString(R.string.esanU1),
                resources.getString(R.string.esanUU1)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b1,
                resources.getString(R.string.esanT2),
                resources.getString(R.string.esanM2),
                resources.getString(R.string.esanP2),
                resources.getString(R.string.esanU2),
                resources.getString(R.string.esanUU2)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b8,
                resources.getString(R.string.esanT3),
                resources.getString(R.string.esanM3),
                resources.getString(R.string.esanP3),
                resources.getString(R.string.esanU3),
                resources.getString(R.string.esanUU3)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b2,
                resources.getString(R.string.esanT4),
                resources.getString(R.string.esanM4),
                resources.getString(R.string.esanP4),
                resources.getString(R.string.esanU4),
                resources.getString(R.string.esanUU4)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b3,
                resources.getString(R.string.esanT5),
                resources.getString(R.string.esanM5),
                resources.getString(R.string.esanP5),
                resources.getString(R.string.esanU5),
                resources.getString(R.string.esanUU5)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b5,
                resources.getString(R.string.esanT6),
                resources.getString(R.string.esanM6),
                resources.getString(R.string.esanP6),
                resources.getString(R.string.esanU6),
                resources.getString(R.string.esanUU6)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b6,
                resources.getString(R.string.esanT7),
                resources.getString(R.string.esanM7),
                resources.getString(R.string.esanP7),
                resources.getString(R.string.esanU7),
                resources.getString(R.string.esanUU7)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.b7,
                resources.getString(R.string.esanT8),
                resources.getString(R.string.esanM8),
                resources.getString(R.string.esanP8),
                resources.getString(R.string.esanU8),
                resources.getString(R.string.esanUU8)
            )
        )
    }

    fun SouthwestRecipes() {
        constantList!!.add(
            Constant(
                R.drawable.c1,
                resources.getString(R.string.southT1),
                resources.getString(R.string.southM1),
                resources.getString(R.string.southP1),
                resources.getString(R.string.southU1),
                resources.getString(R.string.southUU1)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c2,
                resources.getString(R.string.southT2),
                resources.getString(R.string.southM2),
                resources.getString(R.string.southP2),
                resources.getString(R.string.southU2),
                resources.getString(R.string.southUU2)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c3,
                resources.getString(R.string.southT3),
                resources.getString(R.string.southM3),
                resources.getString(R.string.southP3),
                resources.getString(R.string.southU3),
                resources.getString(R.string.southUU3)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c4,
                resources.getString(R.string.southT4),
                resources.getString(R.string.southM4),
                resources.getString(R.string.southP4),
                resources.getString(R.string.southU4),
                resources.getString(R.string.southUU4)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c5,
                resources.getString(R.string.southT5),
                resources.getString(R.string.southM5),
                resources.getString(R.string.southP5),
                resources.getString(R.string.southU5),
                resources.getString(R.string.southUU5)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c6,
                resources.getString(R.string.southT6),
                resources.getString(R.string.southM6),
                resources.getString(R.string.southP6),
                resources.getString(R.string.southU6),
                resources.getString(R.string.southUU6)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c7,
                resources.getString(R.string.southT7),
                resources.getString(R.string.southM7),
                resources.getString(R.string.southP7),
                resources.getString(R.string.southU7),
                resources.getString(R.string.southUU7)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.c8,
                resources.getString(R.string.southT8),
                resources.getString(R.string.southM8),
                resources.getString(R.string.southP8),
                resources.getString(R.string.southU8),
                resources.getString(R.string.southUU8)
            )
        )
    }

    fun NorthRecipes() {
        constantList!!.add(
            Constant(
                R.drawable.d1,
                resources.getString(R.string.northT1),
                resources.getString(R.string.northM1),
                resources.getString(R.string.northP1),
                resources.getString(R.string.northU1),
                resources.getString(R.string.northUU1)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.d2,
                resources.getString(R.string.northT2),
                resources.getString(R.string.northM2),
                resources.getString(R.string.northP2),
                resources.getString(R.string.northU2),
                resources.getString(R.string.northUU2)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.d3,
                resources.getString(R.string.northT3),
                resources.getString(R.string.northM3),
                resources.getString(R.string.northP3),
                resources.getString(R.string.northU3),
                resources.getString(R.string.northUU3)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.d4,
                resources.getString(R.string.northT4),
                resources.getString(R.string.northM4),
                resources.getString(R.string.northP4),
                resources.getString(R.string.northU4),
                resources.getString(R.string.northUU4)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.d5,
                resources.getString(R.string.northT5),
                resources.getString(R.string.northM5),
                resources.getString(R.string.northP5),
                resources.getString(R.string.northU5),
                resources.getString(R.string.northUU5)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.d6,
                resources.getString(R.string.northT6),
                resources.getString(R.string.northM6),
                resources.getString(R.string.northP6),
                resources.getString(R.string.northU6),
                resources.getString(R.string.northUU6)
            )
        )
        constantList!!.add(
            Constant(
                R.drawable.d7,
                resources.getString(R.string.northT7),
                resources.getString(R.string.northM7),
                resources.getString(R.string.northP7),
                resources.getString(R.string.northU7),
                resources.getString(R.string.northUU7)
            )
        )
    }
}