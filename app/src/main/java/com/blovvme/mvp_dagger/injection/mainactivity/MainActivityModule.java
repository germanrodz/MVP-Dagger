package com.blovvme.mvp_dagger.injection.mainactivity;

import com.blovvme.mvp_dagger.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Blovvme on 8/21/17.
 */
@Module
public class MainActivityModule {

    @Provides
    MainActivityPresenter providesMainActivityPresenter(){

        return new MainActivityPresenter();
    }
}
