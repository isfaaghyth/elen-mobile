package isfaaghyth.app.elen.ui.login

import isfaaghyth.app.elen.base.BasePresenterImp

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class LoginPresenterImp(view: LoginView): BasePresenterImp<LoginView>() {
    init {
        super.attachView(view)
    }
}