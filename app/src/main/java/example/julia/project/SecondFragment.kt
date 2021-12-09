package example.julia.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SecondFragment : Fragment() {

    lateinit var zakupkiRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val zakupkiList: List<String> = listOf("Контракт №1", "Контракт №2")

        zakupkiRecyclerView = view.findViewById(R.id.zakupki_recycler_view)
        zakupkiRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        zakupkiRecyclerView.adapter = ZakupkiAdapter(zakupkiList)

        return view
    }


}