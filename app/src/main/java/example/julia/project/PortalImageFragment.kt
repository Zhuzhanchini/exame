package example.julia.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class PortalImageFragment : Fragment() {

    lateinit var portalImageView: ImageView
    lateinit var nextPortalButton: Button

    private val portalList: List<Int> = listOf(
        R.drawable.minobrrf,
        R.drawable.miccedu,
        R.drawable.port3,
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.portal_image_fragment, container, false)


        portalImageView = view.findViewById(R.id.portal_image_view)
        nextPortalButton = view.findViewById(R.id.next_portal_button)

        nextPortalButton.setOnClickListener {
            portalImageView.setImageResource(portalList.random())

        }


        return view


    }



}



