package com.kkc.likeslack.view.dialog

import android.app.Dialog
import android.content.Context
import com.kkc.likeslack.R

class ChannelDetailDialog: Dialog {
    constructor(context: Context): super(context) {
        setContentView(R.layout.dialog_channel_detail)
    }
}