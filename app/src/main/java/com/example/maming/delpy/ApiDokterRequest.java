package com.example.maming.delpy;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface ApiDokterRequest {
    @POST("dokter.php?callapi=register")
    Call<ModelResponseRegister> getResponse(
            @Field("nama") String nama,
            @Field("npid") String npid,
            @Field("email") String email,
            @Field("password") String password
    );
}
