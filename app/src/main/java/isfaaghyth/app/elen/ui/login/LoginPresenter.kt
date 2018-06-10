package isfaaghyth.app.elen.ui.login

import isfaaghyth.app.elen.base.BasePresenter

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
interface LoginPresenter: BasePresenter<LoginView> {
    fun doLogin(username: String, password: String)
    fun isLogin()
}