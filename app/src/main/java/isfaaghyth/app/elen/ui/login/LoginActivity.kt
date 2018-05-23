package isfaaghyth.app.elen.ui.login

import android.util.Log
import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class LoginActivity: BaseActivity() {

    override fun layoutView(): Int = R.layout.activity_login

    override fun contentCreated() {
        Log.d("TAG", "Test")
    }

}