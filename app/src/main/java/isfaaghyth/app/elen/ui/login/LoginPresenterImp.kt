package isfaaghyth.app.elen.ui.login

import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import isfaaghyth.app.elen.base.BasePresenterImp
import isfaaghyth.app.elen.network.Routes

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class LoginPresenterImp internal constructor(routes: Routes, disposable: CompositeDisposable, view: LoginView)
    : BasePresenterImp<LoginView>(service = routes, compositeDisposable = disposable), LoginPresenter {

    init {
        super.attachView(view)
    }

    override fun doLogin(username: String, password: String) = subscribe(
            service?.login(username, password)
                    ?.subscribeOn(Schedulers.io())
                    ?.observeOn(AndroidSchedulers.mainThread())
                    ?.subscribe(
                            { res -> view().success(res) },
                            { err -> reqError(err) }
                    )
    )

}