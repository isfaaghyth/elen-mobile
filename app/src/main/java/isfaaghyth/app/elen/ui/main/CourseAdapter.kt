package isfaaghyth.app.elen.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.data.Course
import kotlinx.android.synthetic.main.item_task.view.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class CourseAdapter(private val course: List<Course>): RecyclerView.Adapter<CourseAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCourse(course[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(LayoutInflater.from(parent?.context).inflate(R.layout.item_task, parent, false))

    override fun getItemCount(): Int = course.size

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindCourse(course: Course) {
            itemView.txtCourseCount.text = course.tasks.size.toString()
            itemView.txtCourseName.text = course.course_name
            when(course.tasks.size) {
                0 -> itemView.viewDueDate.visibility = View.GONE
                else -> itemView.viewDueDate.visibility = View.VISIBLE
            }
        }
    }

}