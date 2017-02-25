package org.bubenheimer.dagger.fragment;

import org.bubenheimer.dagger.childfragment.ChildFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = ChildFragmentModule.class)
public interface MainFragmentComponent extends AndroidInjector<MainFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainFragment> {
    }
}
