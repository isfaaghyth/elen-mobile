package isfaaghyth.app.elen.ui.login

import io.reactivex.disposables.CompositeDisposable
import isfaaghyth.app.elen.base.BasePresenterImp
import isfaaghyth.app.elen.network.Routes
import javax.inject.Inject

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class LoginPresenterImp @Inject internal constructor(routes: Routes, disposable: CompositeDisposable)
    : BasePresenterImp<LoginView>(service = routes, compositeDisposable = disposable), LoginPresenter {

    init {
        super.attachView(view())
    }

}