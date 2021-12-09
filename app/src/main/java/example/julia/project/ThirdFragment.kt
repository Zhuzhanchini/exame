package example.julia.project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, fragment_container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val view = inflater.inflate(R.layout.fragment_third, fragment_container, false)



        return view
    }


}