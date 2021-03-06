package com.nazirov.telegramui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(var context: Context, var items: ArrayList<Chat>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val chat = items[position]

        if (holder is MessageViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_message = holder.tv_message

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullname
            tv_message.text = chat.message
        }

    }

    override fun getItemCount(): Int {
       return items.size
    }
    class MessageViewHolder(view: View) :RecyclerView.ViewHolder(view) {
        var iv_profile :ImageView = view.findViewById(R.id.iv_profile)
        var tv_fullname :TextView = view.findViewById(R.id.tv_fullname)
        var tv_message :TextView = view.findViewById(R.id.tv_message)
    }
}