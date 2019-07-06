package com.iirs.iirssurveyapp.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iirs.iirssurveyapp.Adapters.DataAdapter;
import com.iirs.iirssurveyapp.MainActivity;
import com.iirs.iirssurveyapp.Models.DataModel;
import com.iirs.iirssurveyapp.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;


public class LayersFragment extends Fragment {

    public String datajson;
    public String tabName;
    RecyclerView recyclerView;
    public TextView textView_null;
    ArrayList<DataModel> datalist = new ArrayList<>();
    private static String TAG = MainActivity.class.getSimpleName();

    public static LayersFragment newInstance(String tabName, String datajson) {
        Bundle bundle = new Bundle();
        bundle.putString("tabName", tabName);
        bundle.putString("datajson", datajson);
        LayersFragment layersFragment = new LayersFragment();
        layersFragment.setArguments(bundle);
        return layersFragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {
        View view = layoutInflater.inflate(R.layout.bottomsheet_contenthandler, container, false);

        textView_null = view.findViewById(R.id.error_textbox);

        recyclerView = view.findViewById(R.id.bottomsheet_contentholder);
        recyclerView.setNestedScrollingEnabled(true);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        if (getArguments() != null) {
            datajson = getArguments().getString("datajson");
            tabName = getArguments().getString("tabName");

            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            RecyclerView.Adapter adapter = new DataAdapter(datalist);
            recyclerView.setAdapter(adapter);
            getDataList();
        }
    }

    private void getDataList() {
        if(datajson != null) {
            try {
                final JSONObject jsonObject = new JSONObject(datajson);
                try {
                    JSONObject data = jsonObject.getJSONObject(tabName);
                    if(!data.toString().equals("{}")) {
                        Iterator<String> iterator = data.keys();
                        DataModel dataModel;
                        while (iterator.hasNext()) {
                            try {
                                String key = iterator.next();
                                dataModel = new DataModel(key, data.get(key).toString());
                                datalist.add(dataModel);
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                    }
                    else {
                        textView_null.setVisibility(View.VISIBLE);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error :" + e.getMessage());
                }
            } catch (final JSONException e) {
                Log.e(TAG, "Json parsing error :" + e.getMessage());
            }
        }
        else {
            Log.e(TAG, "Couldn't get json from server");
        }
    }
}
