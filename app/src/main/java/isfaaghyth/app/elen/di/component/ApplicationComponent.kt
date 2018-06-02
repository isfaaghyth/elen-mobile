package isfaaghyth.app.elen.di.component

import dagger.Component
import isfaaghyth.app.elen.di.module.ActivityModule
import isfaaghyth.app.elen.di.module.NetworkModule
import isfaaghyth.app.elen.ui.login.LoginActivity

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */

@Component(modules = [NetworkModule::class, ActivityModule::class])
interface ApplicationComponent {
    fun inject(loginActivity: LoginActivity)
}