package collationsoftsolution.poolit.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import collationsoftsolution.poolit.R;


public class ShopFragment extends Fragment {

    ListView item_listview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shop_fragment,container, false);

        item_listview = (ListView) view.findViewById(R.id.shop_listview);

        String[] values = new String[]{"CAKES","MOVIES/EVENTS","GIFTS","TRIPS","FOOD & RESTAURENT"};


        return view;
    }
}
