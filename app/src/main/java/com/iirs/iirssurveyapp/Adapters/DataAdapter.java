package com.iirs.iirssurveyapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iirs.iirssurveyapp.Models.DataModel;
import com.iirs.iirssurveyapp.R;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MainViewHolder> {

    private ArrayList<DataModel> datalist;

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView content_head;
        private TextView content_desc;

        private MainViewHolder(View view) {
            super(view);
            content_head = view.findViewById(R.id.content_heading);
            content_desc = view.findViewById(R.id.content_desc);
        }
    }

    public DataAdapter(ArrayList<DataModel> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public DataAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View dataview = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottomsheet_content, parent, false);

        return new MainViewHolder(dataview);
    }

    @Override
    public void onBindViewHolder(@NonNull DataAdapter.MainViewHolder holder, int position) {
        DataModel data = datalist.get(position);
        holder.content_head.setText(data.getContent_head());
        System.out.println("The Heading is : " + data.getContent_head());
        holder.content_desc.setText(data.getContent_desc());
        System.out.print("The Description is : " + data.getContent_desc() + "\n");
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
}
