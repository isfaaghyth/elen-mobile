package isfaaghyth.app.elen.ui.coursedetail

import android.support.v7.widget.LinearLayoutManager
import com.google.gson.Gson
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import isfaaghyth.app.elen.data.Course
import isfaaghyth.app.elen.data.Task
import kotlinx.android.synthetic.main.activity_course_detail.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class CourseDetailActivity: BaseActivity(), CourseDetailView {

    private lateinit var adapter: TaskAdapter
    private lateinit var courses: ArrayList<Task>

    override fun layoutView(): Int = R.layout.activity_course_detail

    override fun contentCreated() {
        txtTitle.text = intent.getStringExtra("course_name")
        showBackPassedButton(toolbar)
        taskListManager()
    }

    fun taskListManager() {
        courses = ArrayList()
        val res: Course = Gson().fromJson(intent.getStringExtra("data"), Course::class.java)
        adapter = TaskAdapter(res.tasks)
        lstTasks.layoutManager = LinearLayoutManager(this)
        lstTasks.adapter = adapter
    }

}