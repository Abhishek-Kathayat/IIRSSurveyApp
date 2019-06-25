package com.iirs.iirssurveyapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iirs.iirssurveyapp.R;

public class LayersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottomsheet_content, container, false);
        /*
        RelativeLayout relativeLayout = view.findViewById(R.id.bottomsheet_layout);
        RelativeLayout layout = new RelativeLayout(getActivity());
        Serializable soilbundle = getArguments().getSerializable("soilhash");
        */
        return view;
    }
}
