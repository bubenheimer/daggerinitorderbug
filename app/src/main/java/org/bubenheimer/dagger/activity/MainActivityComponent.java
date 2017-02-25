package org.bubenheimer.dagger.activity;

import org.bubenheimer.dagger.fragment.MainFragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = MainFragmentModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
