package isfaaghyth.app.elen.ui.main

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.google.gson.Gson
import io.isfaaghyth.rak.Rak
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import isfaaghyth.app.elen.data.Course
import isfaaghyth.app.elen.data.Courses
import isfaaghyth.app.elen.ui.coursedetail.CourseDetailActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class MainActivity: BaseActivity(), MainView {

    private lateinit var adapter: CourseAdapter

    override fun layoutView(): Int = R.layout.activity_main

    override fun contentCreated() {
        txtTitle.text = "Your Task!"
        courseListManager()
    }

    fun courseListManager() {
        val res: Courses = Gson().fromJson(Rak.grab<String>("res"), Courses::class.java)
        adapter = CourseAdapter(res.data, this)
        lstCourses.layoutManager = LinearLayoutManager(this)
        lstCourses.adapter = adapter
    }

    override fun onCourseClicked(course: Course) {
        val intent = Intent(this, CourseDetailActivity::class.java)
        intent.putExtra("data", Gson().toJson(course))
        startActivity(intent)
    }

}