package com.iirs.iirssurveyapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.iirs.iirssurveyapp.Fragments.LayersFragment;
import com.iirs.iirssurveyapp.Models.LayersModel;

import java.util.List;

public class LayersPagerAdapter extends FragmentStatePagerAdapter {

    private List<LayersModel> layerslist;

    public LayersPagerAdapter(FragmentManager fm, List<LayersModel> layerslist) {
        super(fm);
        this.layerslist = layerslist;
    }

    @Override
    public Fragment getItem(int position) {
        return new LayersFragment();
    }

    @Override
    public int getCount() {
        return layerslist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return layerslist.get(position).getLayerName();
    }
}
