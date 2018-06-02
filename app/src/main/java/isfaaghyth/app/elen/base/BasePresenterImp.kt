package isfaaghyth.app.elen.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import isfaaghyth.app.elen.network.Routes
import retrofit2.HttpException

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */
open class BasePresenterImp<V: BaseView>
    internal constructor(protected var service: Routes?,
                         protected var compositeDisposable: CompositeDisposable?) : BasePresenter<V> {

    protected lateinit var view: V

    override fun attachView(view: V) {
        this.view = view
    }

    override fun dettachView() {
        compositeDisposable?.dispose()
    }

    override fun view(): V = this.view

    protected fun subscribe(disposable: Disposable?) {
        compositeDisposable?.add(disposable)
    }

    protected fun reqError(error: Throwable?) {
        if (error == null) view().onError("Gagal")

        if (error is HttpException) {
            when (error.code()) {
                408 -> view().onError("RTO")
                else -> view().onError("gagal@")
            }
        }
    }

}