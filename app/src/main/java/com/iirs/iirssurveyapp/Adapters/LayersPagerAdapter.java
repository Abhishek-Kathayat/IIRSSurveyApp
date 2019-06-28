package com.iirs.iirssurveyapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.iirs.iirssurveyapp.Fragments.LayersFragment;
import com.iirs.iirssurveyapp.Models.LayersModel;

import java.util.List;

public class LayersPagerAdapter extends FragmentStatePagerAdapter {

    private List<LayersModel> layerslist;
    private String datajson;

    public LayersPagerAdapter(FragmentManager fm, List<LayersModel> layerslist, String datajson) {
        super(fm);
        this.layerslist = layerslist;
        this.datajson = datajson;
    }

    @Override
    public Fragment getItem(int position) {
        return LayersFragment.newInstance(layerslist.get(position).getLayerName(), datajson);
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
