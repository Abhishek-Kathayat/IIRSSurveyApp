package com.iirs.iirssurveyapp.Rest;

import com.iirs.iirssurveyapp.Models.LayersModel;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("layers")
    Call<List<LayersModel>> getLayers();

    @GET("@latlong={latitude},{longitude}")
    Call<ResponseBody> getLocationData(@Path("latitude") float latitude, @Path("longitude") float longitude);
}
