package com.kkc.likeslack.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import com.kkc.likeslack.R
import com.kkc.likeslack.view.fragment.MessagingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {
    private var fragmentManager: FragmentManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager

        ivLeftMenu.setOnClickListener {
            if(dlMain.isDrawerOpen(clSideMenu))
                dlMain.closeDrawer(clSideMenu)
            else
                dlMain.openDrawer(clSideMenu)
        }
    }
}
