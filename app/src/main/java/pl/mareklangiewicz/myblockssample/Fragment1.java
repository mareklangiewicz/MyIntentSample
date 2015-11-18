package pl.mareklangiewicz.myblockssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import pl.mareklangiewicz.myfragments.MyFragment;
import pl.mareklangiewicz.myviews.IMyNavigation;

public class Fragment1 extends MyFragment {

    @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflateMenu(R.menu.local_menu1);
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override public boolean onItemSelected(IMyNavigation nav, MenuItem item) {
        log.w("[SNACK]Item: %s selected.", item.getTitle());
        return true;
    }
}

