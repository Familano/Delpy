package com.example.maming.delpy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelResponseLogin {
    @SerializedName("error")
    @Expose
    private Boolean error;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("pasien")
    @Expose
    private ObjectPasien pasien;

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ObjectPasien getPasien() {
        return pasien;
    }

    public void setPasien(ObjectPasien pasien) {
        this.pasien = pasien;
    }
}
