package com.example.table_viewpager_2_inter.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.table_viewpager_2_inter.R;

public class fragment1  extends Fragment {

    public fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout para este fragmento
        return inflater.inflate(R.layout.fragment1_layout, container, false);
    }
}
