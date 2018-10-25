package com.example.asd.myapplication;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.FrameMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class FragmentActivity1 extends Fragment {
    public FragmentActivity1(){

    }
    ArrayList<MyItem> data = new ArrayList<MyItem>();
    @Nullable
    @Override
        public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_fragment1,container,false);
        ListView listview=(ListView)v.findViewById(R.id.listview);

        data.add(new MyItem(R.drawable.image00,"트랙스버거세트","5600","원"));
        data.add(new MyItem(R.drawable.image01,"아재버거세트","8100","원"));
        data.add(new MyItem(R.drawable.image02,"와규오리지널세트","9500","원"));
        data.add(new MyItem(R.drawable.image03,"클래식치즈버거세트","6000","원"));
        data.add(new MyItem(R.drawable.image04,"한우연인팩","13300","원"));
        data.add(new MyItem(R.drawable.image05,"한우불고기콤보","7700","원"));
        data.add(new MyItem(R.drawable.image06,"한우불고기세트","8400","원"));
        data.add(new MyItem(R.drawable.image07,"한우명품팩","15100","원"));
        data.add(new MyItem(R.drawable.image08,"모짜렐라인더베이컨","7500","원"));
        data.add(new MyItem(R.drawable.image09,"모짜렐라더블팩","12500","원"));
        data.add(new MyItem(R.drawable.image10,"모짜렐라더블세트","7200","원"));
        data.add(new MyItem(R.drawable.image11,"모짜렐라해쉬세트","6400","원"));
        data.add(new MyItem(R.drawable.image12,"빅불세트","7000","원"));
        data.add(new MyItem(R.drawable.image13,"핫크리스피버거세트","6500","원"));
        data.add(new MyItem(R.drawable.image14,"데리버거세트","4700","원"));
        data.add(new MyItem(R.drawable.image15,"새우버거세트","5600","원"));
        data.add(new MyItem(R.drawable.image16,"불고기버거세트","5600","원"));
        data.add(new MyItem(R.drawable.image17,"패밀리팩3인분","13600","원"));
        data.add(new MyItem(R.drawable.image18,"치킨풀팩","18800","원"));
        data.add(new MyItem(R.drawable.image19,"치킨하프팩","9300","원"));
        data.add(new MyItem(R.drawable.image20,"순살치킨풀팩","15900","원"));
        data.add(new MyItem(R.drawable.image21,"술살치킨하프팩","8900","원"));
        data.add(new MyItem(R.drawable.image22,"베이컨롱치즈스틱1조각","1900","원"));
        data.add(new MyItem(R.drawable.image23,"롱치즈스틱1조각","1700","원"));
        data.add(new MyItem(R.drawable.image24,"토네이도초코쿠키","2200","원"));
        data.add(new MyItem(R.drawable.image25,"토네이도녹차","2200","원"));
        data.add(new MyItem(R.drawable.image26,"토네이도스트로베리","2300","원"));
        data.add(new MyItem(R.drawable.image27,"소프트콘","700","원"));
        data.add(new MyItem(R.drawable.image28,"마블소프트콘","800","원"));
        data.add(new MyItem(R.drawable.image29,"블루소다","2000","원"));
        data.add(new MyItem(R.drawable.image30,"아이스초코","2500","원"));





        ListviewAdapter adapter = new ListviewAdapter(getActivity(),R.layout.activity_itemlist,data);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle args = new Bundle();
                args.putString("name",data.get(position).getName());

                Fragment fragment = new FragmentActivity1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                fragment.setArguments(args);

                ft.replace(R.id.framelayout,new FragmentActivity3());
                ft.commit();
/*

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.framelayout,new FragmentActivity3());
                ft.commit();
*/

            }
        });
        return v;


        }
}
