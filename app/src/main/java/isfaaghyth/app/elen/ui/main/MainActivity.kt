package isfaaghyth.app.elen.ui.main

import isfaaghyth.app.elen.R
import isfaaghyth.app.elen.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Created by isfaaghyth on 6/10/18.
 * github: @isfaaghyth
 */
class MainActivity: BaseActivity() {

    override fun layoutView(): Int = R.layout.activity_main

    override fun contentCreated() {
        txtTitle.text = "Your Task!"
    }

}