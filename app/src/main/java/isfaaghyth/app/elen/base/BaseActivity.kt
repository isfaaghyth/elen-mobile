package isfaaghyth.app.elen.base

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.MenuItem
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */
abstract class BaseActivity: AppCompatActivity(), BaseView {

    protected abstract fun layoutView(): Int
    protected abstract fun contentCreated()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contentView(layoutView())
    }

    private fun contentView(layout: Int) {
        setContentView(layout)
        contentCreated()
    }

    protected fun showBackPassedButton(toolbar: Toolbar?) {
        if (toolbar == null) return
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun attachBaseContext(newBase: Context?) =
            super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))

    override fun context(): Context = applicationContext

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(message: String) {
        Log.e("TAG", message)
    }

    override fun onError(resId: Int) {
        onError(getString(resId))
    }

    override fun isNetworkConnected(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideKeyboard() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun logout() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}