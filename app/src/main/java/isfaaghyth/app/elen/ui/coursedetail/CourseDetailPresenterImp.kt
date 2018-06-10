package isfaaghyth.app.elen.ui.coursedetail

import io.reactivex.disposables.CompositeDisposable
import isfaaghyth.app.elen.base.BasePresenterImp
import isfaaghyth.app.elen.network.Routes

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class CourseDetailPresenterImp internal constructor(routes: Routes, disposable: CompositeDisposable, view: CourseDetailView)
    : BasePresenterImp<CourseDetailView>(service = routes, compositeDisposable = disposable), CourseDetailPresenter {

    init {
        super.attachView(view)
    }

}