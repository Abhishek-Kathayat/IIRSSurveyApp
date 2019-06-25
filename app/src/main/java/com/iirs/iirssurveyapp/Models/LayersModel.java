package com.iirs.iirssurveyapp.Models;

import com.google.gson.annotations.SerializedName;

public class LayersModel {

    @SerializedName("layer")
    private String layerName;

    public LayersModel(String layerName) {
        this.layerName = layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    public String getLayerName() {
        return layerName;
    }
}
