package com.kkc.likeslack.view.custom_view

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kkc.likeslack.R
import data.BaseMessageData

class MessageAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private var context: Context? = null
    private var inflater: LayoutInflater? = null
    private var msgList = ArrayList<BaseMessageData>()

    constructor(context: Context) {
        this.context = context
        inflater = LayoutInflater.from(context)
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        var view = inflater!!.inflate(R.layout.view_base_message, p0, false)
        return BaseMessageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return msgList.size
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        (p0 as BaseMessageViewHolder).setMessageInfo(msgList[p1])
    }

    class BaseMessageViewHolder: RecyclerView.ViewHolder {
        var ivUserProfile: ImageView? = null
        var tvUserName: TextView? = null
        var tvMsgTime: TextView? = null
        var tvMsgContent: TextView? = null
        var ivAttachedImage: ImageView? = null
        var clAttachedFile: ConstraintLayout? = null
        var ivAttachedFileImage: ImageView? = null
        var tvAttachedFileName: TextView? = null
        var tvAttachedFileType: TextView? = null

        constructor(view: View): super(view) {
            ivUserProfile = view.findViewById(R.id.ivUserProfile)
            tvUserName = view.findViewById(R.id.tvUserName)
            tvMsgTime = view.findViewById(R.id.tvMessageTime)
            tvMsgContent = view.findViewById(R.id.tvMessageContent)
            ivAttachedImage = view.findViewById(R.id.ivAttachedImage)
            clAttachedFile = view.findViewById(R.id.clAttachedFile)
            ivAttachedFileImage = view.findViewById(R.id.ivAttachedFileImage)
            tvAttachedFileName = view.findViewById(R.id.tvAttachedFileName)
            tvAttachedFileType = view.findViewById(R.id.tvAttachedFileType)
        }

        fun setMessageInfo(msg: BaseMessageData) {

        }
    }
}