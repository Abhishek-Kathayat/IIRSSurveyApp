package com.iirs.iirssurveyapp.Models;


import android.os.Parcel;
import android.os.Parcelable;

public class DataModel implements Parcelable {

    private String content_head;
    private String content_desc;

    public static final Creator<DataModel> CREATOR = new Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel parcel) {
            return new DataModel(parcel);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };

    private DataModel(Parcel parcel) {
        content_head = parcel.readString();
        content_desc = parcel.readString();
    }

    public DataModel(String content_head, String content_desc) {
        this.content_head = content_head;
        this.content_desc = content_desc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(content_head);
        out.writeString(content_desc);
    }

    public String getContent_head() {
        return content_head;
    }

    public String getContent_desc() {
        return content_desc;
    }
}