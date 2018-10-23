package com.example.asd.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentActivity2 extends Fragment {

    String str1="qwe";
    String str2="zxc";
    public FragmentActivity2(){

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
    Bundle args=getArguments();
    if(args!=null){
        String sname = args.getString("Name");
        int nType = args.getInt("Type",-1);
    }
        return inflater.inflate(R.layout.activity_fragment2,container,false);

    }
}