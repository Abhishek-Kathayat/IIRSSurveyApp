package com.iirs.iirssurveyapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.iirs.iirssurveyapp.Models.DataModel;
import com.iirs.iirssurveyapp.R;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MainViewHolder> {

    private List<DataModel> datalist;

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        private TextView content_head;
        private TextView content_desc;
        private RelativeLayout relativeLayout;
        public MainViewHolder(View view) {
            super(view);
            content_head = view.findViewById(R.id.content_heading);
            content_desc = view.findViewById(R.id.content_desc);
            relativeLayout = view.findViewById(R.id.bottomsheet_layout);
        }
    }

    public DataAdapter(List<DataModel> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View dataview = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottomsheet_content, parent);
        return new MainViewHolder(dataview);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        DataModel data = datalist.get(position);
        holder.content_head.setText(data.getContent_head());
        holder.content_desc.setText(data.getContent_desc());
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }
}
