package me.rk.andses12ass3;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by airodyra on 7/14/2016.
 */
public class Fragment_Layout1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_layout1,container,false);
        return view;
    }
}
