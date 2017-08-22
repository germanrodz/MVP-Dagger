package com.blovvme.mvp_dagger.injection.mainactivity;

import com.blovvme.mvp_dagger.view.mainactivity.MainActivity;

import dagger.Component;
import dagger.Module;

/**
 * Created by Blovvme on 8/21/17.
 */


@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
