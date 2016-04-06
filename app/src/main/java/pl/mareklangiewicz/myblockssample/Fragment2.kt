package pl.mareklangiewicz.myblockssample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import pl.mareklangiewicz.myfragments.MyFragment

class Fragment2 : MyFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        manager?.lnav?.menuId = R.menu.local_menu2
        return inflater.inflate(R.layout.fragment2, container, false)
    }
}

