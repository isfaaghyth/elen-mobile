package isfaaghyth.app.elen.ui.coursedetail

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.data.Task
import kotlinx.android.synthetic.main.item_task.view.*

/**
 * Created by isfaaghyth on 6/14/18.
 * github: @isfaaghyth
 */
class TaskAdapter(private val task: List<Task>) : RecyclerView.Adapter<TaskAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindTask(task[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(LayoutInflater.from(parent?.context).inflate(R.layout.item_task, parent, false))

    override fun getItemCount(): Int = task.size

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindTask(task: Task) {
            itemView.txtCourseName.text = task.title
            itemView.txtDueDate.text = task.due.split(":")[1] //TODO(remove due date)
            itemView.txtLink.text = task.link
        }
    }
}