package isfaaghyth.app.elen.ui.main.fragment

import android.app.Dialog
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.BottomSheetDialogFragment
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import isfaaghyth.app.elen.R
import kotlinx.android.synthetic.main.modal_mainmenu.*
import isfaaghyth.app.elen.data.MainMenu
import isfaaghyth.app.elen.ui.main.adapter.BottomMenuAdapter


/**
 * Created by isfaaghyth on 6/25/18.
 * github: @isfaaghyth
 */

class DialogMainMenuFragment : BottomSheetDialogFragment() {

    private lateinit var adapter: BottomMenuAdapter
    private lateinit var courses: ArrayList<MainMenu>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainMenuItem()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            View.inflate(context, R.layout.modal_mainmenu, container)

    override fun setupDialog(dialog: Dialog?, style: Int) {
        super.setupDialog(dialog, style)
        val contentView = view
        dialog?.setContentView(contentView)
        val layoutParams = ((contentView?.parent as View).layoutParams) as CoordinatorLayout.LayoutParams
        val behavior = layoutParams.behavior
        if (behavior != null && behavior is BottomSheetBehavior) {
            behavior.setBottomSheetCallback(mBottomSheetBehaviorCallback)
        }
    }

    fun mainMenuItem() {
        courses = ArrayList()
        courses.add(MainMenu(R.mipmap.ic_profile, "Profile"))
        courses.add(MainMenu(R.mipmap.ic_bop, "Virtual Account"))
        courses.add(MainMenu(R.mipmap.ic_chat, "Consultant"))
        courses.add(MainMenu(R.mipmap.ic_logout, "Logout"))
        adapter = BottomMenuAdapter(courses)
        lstMenu.layoutManager = LinearLayoutManager(context)
        lstMenu.adapter = adapter
    }

    private val mBottomSheetBehaviorCallback = object : BottomSheetBehavior.BottomSheetCallback() {
        override fun onStateChanged(bottomSheet: View, newState: Int) {
            if (newState == BottomSheetBehavior.STATE_HIDDEN) dismiss()
        }
        override fun onSlide(bottomSheet: View, slideOffset: Float) {}
    }

}
