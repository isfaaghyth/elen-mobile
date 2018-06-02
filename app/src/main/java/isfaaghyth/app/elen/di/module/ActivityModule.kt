package isfaaghyth.app.elen.di.module

import dagger.Module
import isfaaghyth.app.elen.ui.login.LoginPresenter
import isfaaghyth.app.elen.ui.login.LoginPresenterImp

/**
 * Created by isfaaghyth on 5/25/18.
 * github: @isfaaghyth
 */

@Module
class ActivityModule {

    fun provideLoginPresenter(loginPresenter: LoginPresenterImp): LoginPresenter = loginPresenter

}