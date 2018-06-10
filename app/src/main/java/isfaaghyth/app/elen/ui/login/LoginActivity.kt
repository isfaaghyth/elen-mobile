package isfaaghyth.app.elen.ui.login

import android.content.Intent
import android.util.Log
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import isfaaghyth.app.elen.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class LoginActivity: BaseActivity() {

    override fun layoutView(): Int = R.layout.activity_login

    override fun contentCreated() {
        Log.d("TAG", "test")
        btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

}