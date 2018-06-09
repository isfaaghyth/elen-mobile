package isfaaghyth.app.elen

import android.app.Application
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

/**
 * Created by isfaaghyth on 5/24/18.
 * github: @isfaaghyth
 */
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/OpenSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build())
    }

}