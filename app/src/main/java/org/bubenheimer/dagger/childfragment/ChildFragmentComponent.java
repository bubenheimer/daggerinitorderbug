package org.bubenheimer.dagger.childfragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface ChildFragmentComponent extends AndroidInjector<ChildFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ChildFragment> {
    }
}
