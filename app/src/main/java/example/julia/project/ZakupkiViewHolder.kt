package example.julia.project

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZakupkiViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val contractTextView: TextView =
        itemView.findViewById(R.id.zakupki_text_view)

    fun bind(name: String) {
        contractTextView.text = name


    }
}