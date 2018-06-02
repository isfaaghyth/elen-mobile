package isfaaghyth.app.elen

import android.app.Application
import isfaaghyth.app.elen.di.component.ApplicationComponent
import isfaaghyth.app.elen.di.component.DaggerApplicationComponent
import isfaaghyth.app.elen.di.module.NetworkModule

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class App: Application() {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder()
                .networkModule(NetworkModule())
                .build()
    }

    fun getApplicationComponent() = applicationComponent

}