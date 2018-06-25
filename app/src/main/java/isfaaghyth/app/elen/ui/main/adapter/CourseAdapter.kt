package isfaaghyth.app.elen.ui.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.data.Course
import isfaaghyth.app.elen.ui.main.MainView
import kotlinx.android.synthetic.main.item_course.view.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class CourseAdapter(private val course: List<Course>, private val mainView: MainView): RecyclerView.Adapter<CourseAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCourse(course[position], mainView)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(LayoutInflater.from(parent?.context).inflate(R.layout.item_course, parent, false))

    override fun getItemCount(): Int = course.size

    class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindCourse(course: Course, mainView: MainView) {
            itemView.txtCourseCount.text = course.tasks.size.toString()
            itemView.txtCourseName.text = course.course_name
            itemView.txtTime.text = course.tasks[0].due
            itemView.cardItem.setOnClickListener {
                mainView.onCourseClicked(course)
            }
        }
    }

}