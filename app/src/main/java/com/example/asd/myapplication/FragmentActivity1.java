package com.example.asd.myapplication;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.asd.myapplication.MainActivity.data;


public class FragmentActivity1 extends Fragment {

    static final String ARG_PARAM1 = "param1";

   /*     ArrayList<MyItem> myItems;

    public static FragmentActivity1 newInstance(ArrayList<MyItem> data5){
        FragmentActivity1 fragment = new FragmentActivity1();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("list", (ArrayList<? extends Parcelable>) data5);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() !=  null){

            myItems =getArguments().getParcelableArrayList("list");
        }
    }
*/
    static String hamburgerName;
    static int hamburgerPrice;
    static int hamburgerImage;

    public FragmentActivity1(){

    }
    @Nullable

    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_fragment1,container,false);
        ListView listview = (ListView)v.findViewById(R.id.listview355);

        ListviewAdapter adapter = new ListviewAdapter(getActivity(),R.layout.activity_itemlist,data);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                hamburgerName =  data.get(position).name;
                hamburgerPrice = data.get(position).price;
                hamburgerImage = data.get(position).image;

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.framelayout,new FragmentActivity3());
                ft.commit();
            }
        });
       /* Toast.makeText(getContext(),"asd", Toast.LENGTH_LONG).show();*/


        return v;

        }
}
