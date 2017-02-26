/*
 * Copyright (c) 2015-2017 Uli Bubenheimer. All rights reserved.
 */

package org.bubenheimer.dagger.app;

import org.bubenheimer.dagger.activity.MainActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        MainActivityModule.class
})
interface AppComponent {
    void inject(MainApplication application);
}
