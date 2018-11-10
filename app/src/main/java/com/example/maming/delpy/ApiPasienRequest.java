package com.example.maming.delpy;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiPasienRequest {
    @FormUrlEncoded
    @POST(APIPasien.URL_LOGIN_PASIEN)
    Call<ModelResponseLogin> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST(APIPasien.URL_REGISTER_PASIEN)
    Call<ModelResponseRegister> register(
            @Field("nama") String nama,
            @Field("tgl_lahir") String tgl_lahir,
            @Field("email") String email,
            @Field("password") String password
    );



}
