package org.bubenheimer.dagger.activity;

import android.os.Bundle;

import org.bubenheimer.dagger.R;
import org.bubenheimer.dagger.fragment.MainFragment;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public final class MainActivity extends DaggerAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, new MainFragment()).commitNow();
        }
    }
}
