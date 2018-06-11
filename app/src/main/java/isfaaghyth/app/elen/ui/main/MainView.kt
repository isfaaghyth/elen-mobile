package isfaaghyth.app.elen.ui.main

import isfaaghyth.app.elen.base.BaseView
import isfaaghyth.app.elen.data.Course

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
interface MainView: BaseView {
    fun onCourseClicked(course: Course)
}