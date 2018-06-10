package isfaaghyth.app.elen.ui.main

import io.reactivex.disposables.CompositeDisposable
import isfaaghyth.app.elen.base.BasePresenterImp
import isfaaghyth.app.elen.network.Routes

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class MainPresenterImp internal constructor(routes: Routes, disposable: CompositeDisposable)
    : BasePresenterImp<MainView>(service = routes, compositeDisposable = disposable), MainPresenter {

    init {
        super.attachView(view())
    }

}