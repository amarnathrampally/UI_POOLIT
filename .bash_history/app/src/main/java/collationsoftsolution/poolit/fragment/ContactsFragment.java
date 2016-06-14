package collationsoftsolution.poolit.fragment;

import collationsoftsolution.poolit.R;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.widget.TextView;
import android.widget.ListView;


public class ContactsFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contacts_fragment,container, false);


        return view;
    }



}
