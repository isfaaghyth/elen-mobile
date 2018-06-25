package isfaaghyth.app.elen.ui.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.data.MainMenu
import isfaaghyth.app.elen.ui.coursedetail.TaskAdapter
import kotlinx.android.synthetic.main.item_mainmenu.view.*

/**
 * Created by isfaaghyth on 6/25/18.
 * github: @isfaaghyth
 */

class BottomMenuAdapter(private val data: List<MainMenu>) : RecyclerView.Adapter<BottomMenuAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BottomMenuAdapter.Holder =
            BottomMenuAdapter.Holder(LayoutInflater.from(parent?.context).inflate(R.layout.modal_mainmenu, parent, false))

    override fun onBindViewHolder(holder: BottomMenuAdapter.Holder?, position: Int) {
        holder?.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(menu: MainMenu) {
            itemView.imgIcon.setImageResource(menu.icon)
            itemView.txtTitle.text = menu.title
        }
    }

}
