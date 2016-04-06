package pl.mareklangiewicz.myblockssample

import android.os.Bundle

import pl.mareklangiewicz.myactivities.MyActivity

class MainActivity : MyActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gnav!!.headerId = R.layout.global_header
        gnav!!.menuId = R.menu.global_menu
        if (savedInstanceState == null) {
            gnav!!.setCheckedItem(R.id.fragment1, true)
        }
    }

}
