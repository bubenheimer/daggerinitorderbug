package org.bubenheimer.dagger.childfragment;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ChildFragmentComponent.class)
public abstract class ChildFragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(ChildFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment>
    bindFactory(ChildFragmentComponent.Builder builder);
}
