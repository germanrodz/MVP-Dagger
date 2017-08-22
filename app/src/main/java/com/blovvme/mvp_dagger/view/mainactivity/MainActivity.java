package com.blovvme.mvp_dagger.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.blovvme.mvp_dagger.R;
import com.blovvme.mvp_dagger.injection.mainactivity.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {



    @Inject
    MainActivityPresenter presenter;
    //MainActivityPresenter presenter;
    TextView tv1;
    public static final String TAG = "MainActivityTAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivityComponent.create().inject(this);

        tv1 = (TextView) findViewById(R.id.tv1);
        //presenter = new MainActivityPresenter();
        presenter.attachView(this);
        presenter.setContext(this);



    }

    public void doMagic(View view) {

        presenter.savePerson("John Doe");

    }


    @Override
    public void showerror(String s) {

    }

    @Override
    public void isSaved(boolean isSaved) {
        Log.d(TAG, "isSaved: " + isSaved);
    }

    @Override
    public void sendPerson(String person) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        presenter.removeView();
    }

    public void doShared(View view) {
       tv1 .setText(presenter.getPerson());
    }
}
