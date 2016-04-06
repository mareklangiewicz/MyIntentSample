package pl.mareklangiewicz.myintentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import pl.mareklangiewicz.myfragments.MyFragment
import pl.mareklangiewicz.myutils.*

class Fragment1 : MyFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        manager!!.lnav!!.menuId = R.menu.local_menu1
        manager!!.lnav!!.items { log.w("[SNACK]Item: $it selected.") } // TODO: manage subscription
        return inflater.inflate(R.layout.fragment1, container, false)
    }
}

