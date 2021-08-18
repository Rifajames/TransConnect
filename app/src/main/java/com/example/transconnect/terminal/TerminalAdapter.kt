package com.example.transconnect.terminal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.transconnect.R
import com.example.transconnect.data.bus.Bus
import com.example.transconnect.data.terminal.Terminal
import java.util.ArrayList

class TerminalAdapter (
    private val context: Context,
    private val terminals : List<Terminal>,
    val listener : (Terminal) -> Unit
) : RecyclerView.Adapter<TerminalAdapter.TerminalViewHolder>(){
    class TerminalViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imageSrc = view.findViewById<ImageView>(R.id.imgterminal)
        val terminalname = view.findViewById<TextView>(R.id.terminalbus)
        val terminalkoridor = view.findViewById<TextView>(R.id.koridorbuss)
        fun bindView(terminal: Terminal,listener: (Terminal) -> Unit){
            imageSrc.setImageResource(terminal.tImgSrc)
            terminalname.text = terminal.terminalKoridor
            terminalkoridor.text = terminal.terminalroute
            itemView.setOnClickListener { listener(terminal) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TerminalViewHolder
    = TerminalViewHolder(LayoutInflater.from(context).inflate(R.layout.terminal_item,parent,false))

    override fun onBindViewHolder(holder: TerminalViewHolder, position: Int) {
        holder.bindView(terminals[position],listener)
    }

    override fun getItemCount(): Int {
        return terminals.size
    }
}