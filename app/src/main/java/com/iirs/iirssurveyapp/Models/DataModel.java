package com.iirs.iirssurveyapp.Models;

public class DataModel {

    private String content_head;
    private String content_desc;

    public DataModel(String content_head, String content_desc) {
        this.content_head = content_head;
        this.content_desc = content_desc;
    }

    public void setContent_desc(String content_desc) {
        this.content_desc = content_desc;
    }

    public void setContent_head(String content_head) {
        this.content_head = content_head;
    }

    public String getContent_head() {
        return content_head;
    }

    public String getContent_desc() {
        return content_desc;
    }
}
/*
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

    public DataModel(Parcel parcel) {
        super();
        readFromParcel(parcel);
    }

    public DataModel(String content_head, String content_desc) {
        this.content_head = content_head;
        this.content_desc = content_desc;
    }

    private void readFromParcel(Parcel parcel) {
        content_head = parcel.readString();
        content_desc = parcel.readString();
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
*/