package isfaaghyth.app.elen.ui.login

import android.content.Intent
import android.util.Log
import io.reactivex.disposables.CompositeDisposable
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import isfaaghyth.app.elen.data.Course
import isfaaghyth.app.elen.data.Courses
import isfaaghyth.app.elen.network.Network
import isfaaghyth.app.elen.network.Routes
import isfaaghyth.app.elen.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class LoginActivity: BaseActivity(), LoginView {

    override fun layoutView(): Int = R.layout.activity_login
    lateinit var presenter: LoginPresenter

    override fun contentCreated() {
        presenter = LoginPresenterImp(Network.builder.create(Routes::class.java), CompositeDisposable(), this)
        btnLogin.setOnClickListener {
            presenter.doLogin(edtNim.text.toString(), edtPassword.text.toString())
        }
    }

    override fun success(courses: Courses) {
        var test = ""
        for (i: Course in courses.data) {
            test = test + i.course_name + "\n"
        }
        txtTitle.text = test
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}