package isfaaghyth.app.elen.ui.main

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import com.google.gson.Gson
import io.isfaaghyth.rak.Rak
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import isfaaghyth.app.elen.data.Course
import isfaaghyth.app.elen.data.Courses
import isfaaghyth.app.elen.ui.coursedetail.CourseDetailActivity
import isfaaghyth.app.elen.ui.main.adapter.CourseAdapter
import isfaaghyth.app.elen.ui.main.fragment.DialogMainMenuFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class MainActivity: BaseActivity(), MainView {

    private lateinit var adapter: CourseAdapter
    private lateinit var courses: ArrayList<Course>

    override fun layoutView(): Int = R.layout.activity_main

    override fun contentCreated() {
        txtTitle.text = getString(R.string.app_name)
        courseListManager()

        onClicked()
    }

    private fun onClicked() = btnModalMenu.setOnClickListener {
        val dialog = DialogMainMenuFragment()
        dialog.show(supportFragmentManager, "tag")
    }

    private fun courseListManager() {
        courses = ArrayList()
        val res: Courses = Gson().fromJson(Rak.grab<String>("res"), Courses::class.java)

        /**
         * untuk sementara, filtering course yang ada task nya
         * @TODO(filter dari firstLoad();)
         */
        res.data.filter { !it.tasks.isEmpty() }
                .forEach { courses.add(it) }

        adapter = CourseAdapter(courses, this)
        lstCourses.layoutManager = LinearLayoutManager(this)
        lstCourses.adapter = adapter
    }

    override fun onCourseClicked(course: Course) {
        val intent = Intent(this, CourseDetailActivity::class.java)
        intent.putExtra("course_name", course.course_name)
        intent.putExtra("data", Gson().toJson(course))
        startActivity(intent)
    }

}