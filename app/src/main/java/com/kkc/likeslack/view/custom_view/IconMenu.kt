package com.kkc.likeslack.view.custom_view

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.kkc.likeslack.R
import kotlinx.android.synthetic.main.view_icon_menu.view.*

class IconMenu: FrameLayout {
    constructor(context: Context): super(context) {
        init()
    }

    constructor(context: Context, attr: AttributeSet): super(context, attr) {
        init()
        getAttrs(attr)
    }

    private fun init() {
        var li = LayoutInflater.from(context)
        var rootView = li.inflate(R.layout.view_icon_menu, this, false)
        addView(rootView)
    }

    private fun getAttrs(attr: AttributeSet) {
        var typedArray = context.obtainStyledAttributes(attr, R.styleable.IconMenu)
        setTypedArray(typedArray)
    }

    private fun setTypedArray(typedArray: TypedArray) {
        var icon_res = typedArray.getResourceId(R.styleable.IconMenu_icon, R.drawable.menu)
        var title_res = typedArray.getString(R.styleable.IconMenu_text)

        ivIconImage.setImageResource(icon_res)
        tvMenuTitle.text = title_res

        typedArray.recycle()
    }

}