package com.android.goods_market

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    lateinit var menuBtn : ImageView
    lateinit var drawer : DrawerLayout
    lateinit var mainTopSearch : ImageView
    lateinit var mainTopAlert : ImageView
    lateinit var addBtn : ImageView
    lateinit var homeBtn : ImageView
    lateinit var myPageBtn : ImageView
    lateinit var mainBoxImage1 : ImageView
    lateinit var mainBoxText1 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        menuBtn = findViewById<ImageView>(R.id.menuBtn)
        drawer = findViewById<DrawerLayout>(R.id.drawer)
        mainTopAlert = findViewById<ImageView>(R.id.mainTopAlert)
        mainTopSearch = findViewById<ImageView>(R.id.mainTopSearch)
        addBtn = findViewById<ImageView>(R.id.addBtn)
        homeBtn = findViewById<ImageView>(R.id.homeBtn)
        myPageBtn = findViewById<ImageView>(R.id.myPageBtn)
        mainBoxImage1 = findViewById<ImageView>(R.id.mainBoxImage1)
        mainBoxText1 = findViewById<TextView>(R.id.mainBoxText1)
        menuBtn.setOnClickListener {
            drawer.openDrawer(GravityCompat.START)
        }
        mainTopAlert.setOnClickListener {
            Toast.makeText(this,"알림이 없습니다.", Toast.LENGTH_SHORT).show()
        }
        mainTopSearch.setOnClickListener {
            Toast.makeText(this,"검색 기능은 준비 중입니다.", Toast.LENGTH_SHORT).show()
        }
        addBtn.setOnClickListener {
            var intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }
        myPageBtn.setOnClickListener {
            var intent = Intent(this, MyPageActivity::class.java)
            startActivity(intent)
        }
        mainBoxImage1.setOnClickListener {
            var intent = Intent(this, PurchaseActivity::class.java)
            startActivity(intent)
        }
        mainBoxText1.setOnClickListener {
            var intent = Intent(this, PurchaseActivity::class.java)
            startActivity(intent)
        }

    }

}