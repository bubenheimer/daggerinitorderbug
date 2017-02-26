package org.bubenheimer.dagger.activity;

import android.os.Bundle;

import org.bubenheimer.dagger.R;
import org.bubenheimer.dagger.fragment.MainFragment;

import dagger.android.DaggerActivity;

public final class MainActivity extends DaggerActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.fragment_container, new MainFragment()).commitNow();
        }
    }
}
