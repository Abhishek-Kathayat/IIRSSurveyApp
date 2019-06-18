package com.iirs.iirssurveyapp.Rest;

import com.iirs.iirssurveyapp.Models.PopulationModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("layer={layername}&latlong={latitude},{longitude}")
    Call<PopulationModel> getLocationDetails(@Path("layername") String layername, @Path("latitude") float latitude, @Path("longitude") float longitude);
}
