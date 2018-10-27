package com.example.asd.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import static com.example.asd.myapplication.MainActivity.data;

public class FragmentActivity1 extends Fragment {
    static String hamburgerName;
    static int hamburgerPrice;
    static int hamburgerImage;

    public FragmentActivity1(){

    }
    @Nullable
    @Override
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

        return v;

        }
}
