package pl.mareklangiewicz.myblockssample;

import android.os.Bundle;

import pl.mareklangiewicz.myactivities.MyActivity;

public class MainActivity extends MyActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getGlobalNavigation().inflateHeader(R.layout.global_header);
        getGlobalNavigation().inflateMenu(R.menu.global_menu);
        if(savedInstanceState == null) {
            selectGlobalItem(R.id.fragment1);
        }
    }

}
