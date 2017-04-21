package com.k3mshiro.finalproject.model.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.k3mshiro.finalproject.R;
import com.k3mshiro.finalproject.controller.fragment.MainFrg2;
import com.k3mshiro.finalproject.controller.fragment.MainFrg3;
import com.k3mshiro.finalproject.controller.fragment.SongByNameFrg;

import java.util.ArrayList;

/**
 * Created by k3mshiro on 4/17/17.
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> listMainFrg;
    private Fragment frg;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);

        listMainFrg = new ArrayList<>();
        frg = new SongByNameFrg();
        listMainFrg.add(frg);

        frg = new MainFrg2();
        listMainFrg.add(frg);

        frg = new MainFrg3();
        listMainFrg.add(frg);
    }

    @Override
    public Fragment getItem(int position) {
        return listMainFrg.get(position);
    }

    @Override
    public int getCount() {
        return listMainFrg.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Bài hát";
                break;
            case 1:
                title = String.valueOf(R.string.tab2_name);
                break;
            case 2:
                title = String.valueOf(R.string.tab3_name);
                break;
        }
        return title;
    }
}
