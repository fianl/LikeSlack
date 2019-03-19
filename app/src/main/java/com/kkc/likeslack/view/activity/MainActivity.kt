package com.kkc.likeslack.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kkc.likeslack.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivLeftMenu.setOnClickListener {
            if(dlMain.isDrawerOpen(clSideMenu))
                dlMain.closeDrawer(clSideMenu)
            else
                dlMain.openDrawer(clSideMenu)
        }
    }
}
