package com.blovvme.mvp_dagger.view.mainactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Blovvme on 8/21/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private static final String TAG = "MainPresenterTAG";
    MainActivityContract.View view;
    Context context;

    @Override
    public void attachView(MainActivityContract.View view) {
        this.view = view;

    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void savePerson(String person) {
        Log.d(TAG, "savePerson: ");
        SharedPreferences sharedPreferences = context.getSharedPreferences("myPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("person",person);
        boolean isSaved = editor.commit();

        view.isSaved(isSaved);
    }

    @Override
    public String getPerson() {

        String person;
        SharedPreferences sharedPreferences = context.getSharedPreferences("myPref",Context.MODE_PRIVATE);
        person = sharedPreferences.getString("person","default");
        Log.d(TAG, "getPerson: " + person);
        return person;
    }

    @Override
    public void setContext(Context context) {
        this.context = context;
    }
}
