package com.iirs.iirssurveyapp.Fragments;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iirs.iirssurveyapp.Adapters.DataAdapter;
import com.iirs.iirssurveyapp.Models.DataModel;
import com.iirs.iirssurveyapp.R;

import java.util.ArrayList;

public class LayersFragment extends Fragment {

    ArrayList<DataModel> datalist = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottomsheet_contenthandler, container, false);

        if (getArguments() != null) {
            datalist = getArguments().getParcelableArrayList("datalist");
            for(int i = 0; i < datalist.size(); ++i) {
                System.out.println(datalist.get(i).getContent_head() + " with the value " + datalist.get(i).getContent_desc());
            }
            RecyclerView recyclerView = view.findViewById(R.id.bottomsheet_contentholder);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);
            RecyclerView.Adapter adapter = new DataAdapter(datalist);
            recyclerView.setAdapter(adapter);

            return view;
        }
        else {
            System.out.println("Null Returned");
        }

        return view;
    }
}
