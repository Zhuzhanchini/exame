package example.julia.project

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

lateinit var button_2020:Button
class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, fragment_container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val view = inflater.inflate(R.layout.fragment_third, fragment_container, false)
        button_2020=view.findViewById(R.id.button_2020)



        button_2020.setOnClickListener {
            val link = Uri.parse("https://monitoring.miccedu.ru/iam/2021/_vpo/inst.php?id=334")
            val intent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(intent)
        }
        return view
    }


}