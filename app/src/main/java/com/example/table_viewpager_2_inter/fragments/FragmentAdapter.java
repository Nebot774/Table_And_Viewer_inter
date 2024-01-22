package com.example.table_viewpager_2_inter.fragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

//adaptador para manejar los fragmentos en el ViewPager
public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new fragment1();
            case 1:
                return new fragment2();
            case 2:
                return new fragment3();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3; // total de 3 fragmentos
    }
}
