package com.kkc.likeslack.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kkc.likeslack.R
import com.kkc.likeslack.view.dialog.ChannelDetailDialog
import data.ChannelData
import kotlinx.android.synthetic.main.fragment_messaging.*

class MessagingFragment: Fragment() {
    private var channelTitle: String? = null
    private var channelId: String? = null

    companion object {
        fun newInstance(channel: ChannelData): MessagingFragment {
            var fragment = MessagingFragment()
            var bundle = Bundle()
            bundle.putString("TITLE", channel.title)
            bundle.putString("ID", channel.id)
            fragment.arguments = bundle

            return fragment
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_messaging, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        channelTitle = savedInstanceState?.getString("TITLE")
        channelId = savedInstanceState?.getString("ID")

        tvChannelTitle.text = channelTitle
        tvChannelTitle.setOnClickListener {
            var detailInfo = ChannelDetailDialog(context!!)
            detailInfo.show()
        }
    }
}