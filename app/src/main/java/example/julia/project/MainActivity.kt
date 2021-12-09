package example.julia.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView




lateinit var portalRecyclerView: RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        portalRecyclerView = findViewById(R.id.portal_recycler_view)

        val portalList: List<Portal> = listOf(
            Portal("Минобрануки России", R.drawable.portalminobr),
            Portal("ЦОИАС", R.drawable.portalcbias),
            Portal("Официальный сайт ГМУ", R.drawable.portalbasgov),
            Portal("ИАС Мониторинг", R.drawable.givts),

            )
        portalRecyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        portalRecyclerView.adapter = PortalAdapter(portalList)


    }

}

private fun replaceFragment(fragment: Fragment) {}

