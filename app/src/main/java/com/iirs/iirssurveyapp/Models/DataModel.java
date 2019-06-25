package com.iirs.iirssurveyapp.Models;

public class DataModel {
    private String content_head;
    private String content_desc;

    public DataModel(String content_head, String content_desc) {
        this.content_desc = content_desc;
        this.content_head = content_head;
    }

    public void setContent_head(String content_head) {
        this.content_head = content_head;
    }

    public String getContent_head() {
        return content_head;
    }

    public void setContent_desc(String content_desc) {
        this.content_desc = content_desc;
    }

    public String getContent_desc() {
        return content_desc;
    }
}