package isfaaghyth.app.elen.ui.coursedetail

import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import kotlinx.android.synthetic.main.activity_course_detail.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class CourseDetailActivity: BaseActivity(), CourseDetailView {

    override fun layoutView(): Int = R.layout.activity_course_detail

    override fun contentCreated() {
        showBackPassedButton(toolbar)
    }

}