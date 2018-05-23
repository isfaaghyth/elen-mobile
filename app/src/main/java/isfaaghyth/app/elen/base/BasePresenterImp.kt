package isfaaghyth.app.elen.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import isfaaghyth.app.elen.network.Network
import isfaaghyth.app.elen.network.Routes
import retrofit2.HttpException

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */
open class BasePresenterImp<V: BaseView>: BasePresenter<V> {

    private lateinit var view: V
    private lateinit var service: Routes
    private lateinit var compositeDisposable: CompositeDisposable

    override fun attachView(view: V) {
        this.view = view
        service = Network.builder.create(Routes::class.java)
    }

    override fun dettachView() {
        compositeDisposable.clear()
    }

    override fun view(): V = this.view

    protected fun subscribe(disposable: Disposable?) {
        if (disposable == null) compositeDisposable = CompositeDisposable()
        compositeDisposable.add(disposable)
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