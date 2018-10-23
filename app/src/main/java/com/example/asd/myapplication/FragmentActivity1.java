package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentActivity1 extends Fragment {

    public FragmentActivity1(){

    }

    @Nullable
    @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            Bundle args=new Bundle();
            args.putString("Name","이름");
            args.putInt("Type",3);

            Fragment fragment = new FragmentActivity2();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fmt= fm.beginTransaction();
        fragment.setArguments(args);
        fmt.replace(R.id.framelayout,fragment).addToBackStack(null).commit();

            return inflater.inflate(R.layout.activity_fragment1,container,false);


        }
}
