package isfaaghyth.app.elen.base

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */
interface BasePresenter<V> {
    fun logOut()
    fun attachView(view: V)
    fun dettachView()
    fun view(): V
}