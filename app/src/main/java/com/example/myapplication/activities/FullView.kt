package com.example.myapplication.activities


import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri
import android.widget.TextView
import android.widget.VideoView
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.ActionBarDrawerToggle
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.activities.CentralRecipes
import com.example.myapplication.activities.IsanRecipes
import com.example.myapplication.activities.NorthRecipes
import com.example.myapplication.activities.SouthRecipes
import com.example.myapplication.activities.RateUsDialog
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer

class FullView : AppCompatActivity() {

    var title: String? = null
    var ejza: String? = null
    var targeeb: String? = null
    var image = 0
    var condtion = 0
    var urls: String? = null
    var u: String? = null
    var btn: Button? = null
    var titleTxt: TextView? = null
    var ejzaTitle: TextView? = null
    var ejzaTxt: TextView? = null
    var tarqeebTitle: TextView? = null
    var tarqeebTxt: TextView? = null
    var url: TextView? = null
    var imageView: ImageView? = null
    var videoView: VideoView? = null
    var drawerLayout: DrawerLayout? = null
    var navigationView: NavigationView? = null
    var actionBarDrawerToggle: ActionBarDrawerToggle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_view)
        navigationView = findViewById<View>(R.id.navigation) as NavigationView
        drawerLayout = findViewById<View>(R.id.drawer) as DrawerLayout
        navigationView!!.setNavigationItemSelectedListener { item: MenuItem? ->
            onContextItemSelected(
                item!!
            )
        }
        actionBarDrawerToggle = object :
            ActionBarDrawerToggle(this@FullView, drawerLayout, R.string.open, R.string.close) {
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
                R.id.cen -> startActivity(Intent(this@FullView, CentralRecipes::class.java))
                R.id.san -> startActivity(Intent(this@FullView, IsanRecipes::class.java))
                R.id.north -> startActivity(Intent(this@FullView, NorthRecipes::class.java))
                R.id.south -> startActivity(Intent(this@FullView, SouthRecipes::class.java))
                R.id.rate_us -> startActivity(Intent(this@FullView, RateUsDialog::class.java))
            }
            true
        }
        titleTxt = findViewById<View>(R.id.titleFullView) as TextView
        ejzaTitle = findViewById<View>(R.id.ejzaTitle) as TextView
        ejzaTxt = findViewById<View>(R.id.ejza) as TextView
        tarqeebTitle = findViewById<View>(R.id.tarqeebTitle) as TextView
        tarqeebTxt = findViewById<View>(R.id.tarqeeb) as TextView
        imageView = findViewById<View>(R.id.thumbnailFullView) as ImageView
        url = findViewById<View>(R.id.url) as Button
        val youTubePlayerView = findViewById<YouTubePlayerView>(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)
        val button = findViewById<View>(R.id.bntBack) as Button
        button.setOnClickListener {
            startActivity(
                Intent(
                    this@FullView,
                    CentralRecipes::class.java
                )
            )
        }
        intent = getIntent()
        image = intent.getIntExtra("image", 0)
        condtion = intent.getIntExtra("condition", 0)
        title = intent.getStringExtra("title")
        ejza = intent.getStringExtra("ejza")
        targeeb = intent.getStringExtra("tarqeeb")
        urls = intent.getStringExtra("url")
        u = intent.getStringExtra("u")
        if (condtion == 1) {
            ejzaTitle!!.gravity = Gravity.LEFT
            ejzaTxt!!.gravity = Gravity.LEFT
            tarqeebTitle!!.gravity = Gravity.LEFT
            tarqeebTxt!!.gravity = Gravity.LEFT
            ejzaTitle!!.text = "วัตถุดิบ"
            tarqeebTitle!!.text = "วิธีทำ"
        }
        if (condtion == 2) {
            ejzaTitle!!.gravity = Gravity.LEFT
            ejzaTxt!!.gravity = Gravity.LEFT
            tarqeebTitle!!.gravity = Gravity.LEFT
            tarqeebTxt!!.gravity = Gravity.LEFT
            ejzaTitle!!.text = "วัตถุดิบ"
            tarqeebTitle!!.text = "วิธีทำ"
        }
        if (condtion == 3) {
            ejzaTitle!!.gravity = Gravity.LEFT
            ejzaTxt!!.gravity = Gravity.LEFT
            tarqeebTitle!!.gravity = Gravity.LEFT
            tarqeebTxt!!.gravity = Gravity.LEFT
            ejzaTitle!!.text = "วัตถุดิบ"
            tarqeebTitle!!.text = "วิธีทำ"
        }
        if (condtion == 4) {
            ejzaTitle!!.gravity = Gravity.LEFT
            ejzaTxt!!.gravity = Gravity.LEFT
            tarqeebTitle!!.gravity = Gravity.LEFT
            tarqeebTxt!!.gravity = Gravity.LEFT
            ejzaTitle!!.text = "วัตถุดิบ"
            tarqeebTitle!!.text = "วิธีทำ"
        }
        imageView!!.setImageResource(image)
        titleTxt!!.text = title
        ejzaTxt!!.text = ejza
        tarqeebTxt!!.text = targeeb
        url!!.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(urls)
            startActivity(i)
        }
        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = u
                youTubePlayer.loadVideo(videoId!!, 0f)
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle!!.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}