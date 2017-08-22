package com.blovvme.mvp_dagger.view.mainactivity;

import android.content.ContentValues;
import android.content.Context;

import com.blovvme.mvp_dagger.BasePresenter;
import com.blovvme.mvp_dagger.BaseView;

/**
 * Created by Blovvme on 8/21/17.
 */

public interface MainActivityContract {



    interface View extends BaseView {

        void isSaved(boolean isSaved);
        void sendPerson(String person);
    }

    interface Presenter extends BasePresenter<View>{

        void savePerson(String person);
        String  getPerson();
        void setContext(Context context);

    }



}
