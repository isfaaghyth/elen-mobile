package isfaaghyth.app.elen.ui.login

import isfaaghyth.app.elen.base.BaseView
import isfaaghyth.app.elen.data.Courses

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
interface LoginView: BaseView {
    fun success(courses: Courses)
    fun gotoMain()
}