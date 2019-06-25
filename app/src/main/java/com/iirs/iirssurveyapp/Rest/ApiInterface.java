package com.iirs.iirssurveyapp.Rest;

import com.iirs.iirssurveyapp.Models.DataModel;
import com.iirs.iirssurveyapp.Models.LayersModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("layers")
    Call<List<LayersModel>> getLayers();
}
