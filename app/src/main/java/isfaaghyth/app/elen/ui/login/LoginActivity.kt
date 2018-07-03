package isfaaghyth.app.elen.ui.login

import android.content.Intent
import android.util.Log
import com.google.gson.Gson
import io.isfaaghyth.rak.Rak
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

    private lateinit var presenter: LoginPresenter
    private var username = ""
    private var password = ""

    override fun layoutView(): Int = R.layout.activity_login

    override fun contentCreated() {
        presenter = LoginPresenterImp(
                Network.builder.create(Routes::class.java),
                CompositeDisposable(), this)

        presenter.isLogin()

        btnLogin.setOnClickListener {
            username = edtNim.text.toString()
            password = edtPassword.text.toString()
            if (!username.isEmpty()) {
                if (!password.isEmpty()) {
                    presenter.doLogin(username, password)
                } else {
                    onError("Password anda masih kosong.")
                }
            } else {
                onError("Username / NIM anda masih kosong.")
            }
        }
    }

    override fun success(courses: Courses) {
        Rak.entry("username", username)
        Rak.entry("password", password)
        Rak.entry("login", true)
        Rak.entry("res", Gson().toJson(courses))
        gotoMain()
    }

    override fun gotoMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

}