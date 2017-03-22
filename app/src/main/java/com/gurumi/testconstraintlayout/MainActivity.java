package com.gurumi.testconstraintlayout;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.Log;
import android.view.View;

import com.gurumi.testconstraintlayout.Bean.UserVo;
import com.gurumi.testconstraintlayout.databinding.ActivityMainBinding;

import java.util.Random;

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

        mBinding.btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setConstraintlayoutStateChange();
                UserVo user = new UserVo();
                user.name = "User Name : " + new Random().nextInt(100);
                user.phone = "Phone : " + new Random().nextInt();
                user.memo = "memo : " + user.name + " // " + user.phone;

                mBinding.setUser(user);
            }
        });
    }

    public void setConstraintlayoutStateChange(){
        if (mBinding.constraintLayout.getVisibility() == View.VISIBLE) {
            mBinding.constraintLayout.setVisibility(View.GONE);
        } else {
            mBinding.constraintLayout.setVisibility(View.VISIBLE);
        }
    }
}
