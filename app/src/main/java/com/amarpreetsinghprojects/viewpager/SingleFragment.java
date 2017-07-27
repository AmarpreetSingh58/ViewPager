package com.amarpreetsinghprojects.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kulvi on 06/23/17.
 */

public class SingleFragment extends Fragment {

    public static SingleFragment newInstance(int pos) {

        Bundle args = new Bundle();
        args.putInt("position",pos);
        SingleFragment fragment = new SingleFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.single_fragment, container,false);

        TextView textview = (TextView)v.findViewById(R.id.fragment_text);
        textview.setText(""+getArguments().getInt("position"));
        return v;
    }
}
