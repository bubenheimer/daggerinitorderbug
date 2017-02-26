package org.bubenheimer.dagger.fragment;

import android.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainFragmentComponent.class)
public abstract class MainFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(MainFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindFactory(MainFragmentComponent.Builder builder);
}
