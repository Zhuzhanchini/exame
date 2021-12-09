package example.julia.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class FirstFragment : Fragment() {
    lateinit var portalRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
      val view = inflater.inflate(R.layout.fragment_first, container, false)
        portalRecyclerView = view.findViewById(R.id.portal_recycler_view)
        return view


    }



}