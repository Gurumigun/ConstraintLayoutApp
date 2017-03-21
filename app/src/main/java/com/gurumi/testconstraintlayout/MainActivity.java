package com.gurumi.testconstraintlayout;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gurumi.testconstraintlayout.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Log.d("KIY" , "onCreate()");
        if (mBinding != null) {
            Log.d("KIY", "DataBinding OK! ") ;
        } else {
            Log.e("KIY", "DataBinding is NULL! ") ;
        }

    }
}
