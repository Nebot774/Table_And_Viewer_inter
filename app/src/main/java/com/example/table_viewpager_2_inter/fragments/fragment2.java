package com.example.table_viewpager_2_inter.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.table_viewpager_2_inter.MyAdapter;
import com.example.table_viewpager_2_inter.MyModel;
import com.example.table_viewpager_2_inter.R;

import java.util.ArrayList;
import java.util.List;

public class fragment2  extends Fragment {

    public fragment2() {
    }

    //componentes recycled
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<MyModel> myModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla el layout para este fragmento
        return inflater.inflate(R.layout.fragment2_layout, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //componentes recycled
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Inicializa la lista de modelos
        myModelList = new ArrayList<>();
        // Añade elementos a la lista
        myModelList.add(new MyModel(R.drawable.fre1, "Forma Base"));
        myModelList.add(new MyModel(R.drawable.fre2, "Segunda Forma"));
        myModelList.add(new MyModel(R.drawable.fre3, "Tercera Forma"));
        myModelList.add(new MyModel(R.drawable.fre4, "Forma definitiva"));
        myModelList.add(new MyModel(R.drawable.fre5, "Golden Freezer"));


        // Configura el adaptador y lo asigna al RecyclerView
        adapter = new MyAdapter(myModelList);
        recyclerView.setAdapter(adapter);
    }

}