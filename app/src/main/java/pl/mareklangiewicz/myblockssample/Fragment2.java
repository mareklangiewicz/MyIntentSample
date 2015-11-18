package pl.mareklangiewicz.myblockssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.mareklangiewicz.myfragments.MyFragment;

public class Fragment2 extends MyFragment {

    @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflateMenu(R.menu.local_menu2);
        return inflater.inflate(R.layout.fragment2, container, false);
    }
}

