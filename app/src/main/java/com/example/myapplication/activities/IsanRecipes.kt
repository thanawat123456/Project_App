package com.example.myapplication.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.myapplication.R
import com.google.android.material.navigation.NavigationView
import java.util.ArrayList

class IsanRecipes : AppCompatActivity() {
    var slideModelList: MutableList<SlideModel>? = null
    var imageSlider: ImageSlider? = null
    var bcen: Button? = null
    var bisan: Button? = null
    var bnorth: Button? = null
    var bsouth: Button? = null

    var drawerLayout: DrawerLayout? = null
    var navigationView: NavigationView? = null
    var actionBarDrawerToggle: ActionBarDrawerToggle? = null


    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask()
        }
        finishAffinity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isan_recipes)

        navigationView = findViewById<View>(R.id.navigation) as? NavigationView
        drawerLayout = findViewById<View>(R.id.drawer) as? DrawerLayout
        navigationView!!.setNavigationItemSelectedListener { item: MenuItem? ->
            onContextItemSelected(
                item!!
            )
        }
        actionBarDrawerToggle = object :
            ActionBarDrawerToggle(this@IsanRecipes, drawerLayout, R.string.open, R.string.close) {
            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
            }

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
            }
        }


        actionBarDrawerToggle!!.syncState()

        drawerLayout!!.addDrawerListener(actionBarDrawerToggle as ActionBarDrawerToggle)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        navigationView!!.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.cen -> startActivity(
                    Intent(
                        this@IsanRecipes,
                        CentralRecipes::class.java
                    )
                )
                R.id.san -> startActivity(Intent(this@IsanRecipes, IsanRecipes::class.java))
                R.id.north -> startActivity(
                    Intent(
                        this@IsanRecipes,
                        NorthRecipes::class.java
                    )
                )
                R.id.south -> startActivity(
                    Intent(
                        this@IsanRecipes,
                        SouthRecipes::class.java
                    )
                )
                R.id.rate_us -> startActivity(Intent(this@IsanRecipes, RateUsDialog::class.java))
            }
            true
        }



        imageSlider = findViewById<View>(R.id.image_slider) as ImageSlider
        addImage()
    }
    fun addImage() {
        slideModelList = ArrayList()
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b1, "ส้มตำ", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b2, "ลาบ", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b3, "ก้อย", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b4, "อ่อมหมู", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b5, "แกงหน่อไม้", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b6, "ไส้กรอกอีสาน", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b7, "ซุปหน่อไม้", ScaleTypes.CENTER_CROP))
        (slideModelList as ArrayList<SlideModel>).add(SlideModel(R.drawable.b8, "ก้อยไข่มดแดง", ScaleTypes.CENTER_CROP))
        imageSlider!!.setImageList(slideModelList as ArrayList<SlideModel>, ScaleTypes.FIT)
    }

    fun ViewAll(view: View) {
        val intent = Intent(this@IsanRecipes, MainActivity::class.java)
        when (view.id) {
            R.id.btnall -> intent.putExtra("condition", 2)
        }
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle!!.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}