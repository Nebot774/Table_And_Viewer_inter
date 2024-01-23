package com.example.table_viewpager_2_inter;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.table_viewpager_2_inter.fragments.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //definicion del viewPager
        viewPager = findViewById(R.id.view_pager);
        //definicion del tabLayout
        tabLayout = findViewById(R.id.appbartabs);

        // Configura el adaptador del ViewPager
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Configura el TabLayout con el ViewPager
        tabLayout.setupWithViewPager(viewPager);

        // Aquí puedes personalizar los títulos de los tabs, si es necesario
        tabLayout.getTabAt(0).setText("TAB 1");
        tabLayout.getTabAt(1).setText("TAB 2");
        tabLayout.getTabAt(2).setText("TAB 3");



        // Listener para cambios de página en el ViewPager
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Aquí puedes manejar eventos mientras se desliza entre páginas, si es necesario
            }

            @Override
            public void onPageSelected(int position) {
                // Cambia el tab seleccionado cuando se cambia la página
                tabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // Manejar cambios en el estado de desplazamiento, si es necesario
            }
        });

        //añadimos la animacion al viewPager
        viewPager.setPageTransformer(true, new DepthPageTransformer());

        // Listener para cambios de selección en el TabLayout
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Cambia la página del ViewPager cuando se selecciona un tab
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Manejar tab no seleccionado, si es necesario
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Manejar tab reseleccionado, si es necesario
            }
        });
    }
}