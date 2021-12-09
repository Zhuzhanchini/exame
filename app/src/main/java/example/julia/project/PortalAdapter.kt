package example.julia.project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PortalAdapter(private val portalList: List<Portal>): RecyclerView.Adapter<PortalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PortalViewHolder {
        val itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.portal_list_item, parent,false)
        return PortalViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PortalViewHolder, position: Int) {
        val portal= portalList[position]
        holder.bind(portal)
    }

    override fun getItemCount(): Int {
       return portalList.size
    }
}