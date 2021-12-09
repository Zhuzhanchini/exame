package example.julia.project

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PortalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val portalImageView: ImageView = itemView.findViewById(R.id.portal_image_view)
    private val portalTextView: TextView = itemView.findViewById(R.id.portal_text_view)

    fun bind(portal: Portal) {
        portalTextView.text = portal.name
        portalImageView.setImageResource(portal.image)


    }
}