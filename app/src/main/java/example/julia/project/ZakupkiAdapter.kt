package example.julia.project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ZakupkiAdapter(private val zakupkiList: List<String>) :
    RecyclerView.Adapter<ZakupkiViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZakupkiViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.zakupki_list_item, parent, false)
        return ZakupkiViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ZakupkiViewHolder, position: Int) {
        val name = zakupkiList[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int {
        return zakupkiList.size
    }
}