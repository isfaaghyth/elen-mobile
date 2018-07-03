package isfaaghyth.app.elen.util

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import isfaaghyth.app.elen.R

/**
 * Created by isfaaghyth on 6/12/18.
 * github: @isfaaghyth
 */
class ProgressLoader(context: Context) {

    private val dialog: AlertDialog = AlertDialog.Builder(context).create()

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.view_progress_dialog, null)
        dialog.setView(view)
        dialog.setCancelable(false)
    }

    fun show(): ProgressLoader {
        dialog.show()
        return this
    }

    fun hide(): ProgressLoader {
        dialog.dismiss()
        return this
    }

}