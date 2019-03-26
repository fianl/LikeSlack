package com.kkc.likeslack.view.dialog

import android.app.Dialog
import android.content.Context
import com.kkc.likeslack.R
import kotlinx.android.synthetic.main.dialog_channel_detail.*

class ChannelDetailDialog: Dialog {
    constructor(context: Context): super(context) {
        setContentView(R.layout.dialog_channel_detail)

        flClose.setOnClickListener { dismiss() }
    }
}