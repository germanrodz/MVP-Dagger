package com.blovvme.mvp_dagger;

/**
 * Created by Blovvme on 8/21/17.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);
    void removeView();

}
