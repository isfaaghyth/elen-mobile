package isfaaghyth.app.elen.base

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by isfaaghyth on 5/23/18.
 * github: @isfaaghyth
 */

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(message: String)
    fun onError(@StringRes resId: Int)
    fun isNetworkConnected(): Boolean
    fun hideKeyboard()
    fun logout()
    fun context(): Context
}
