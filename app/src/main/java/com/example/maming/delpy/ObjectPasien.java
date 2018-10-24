package com.example.maming.delpy;

public class ObjectPasien {
    private String id;
    private String nama;
    private String alamat;
    private String tgl_lahir;
    private String umur;
    private String gender;
    private String email;
    private String password;
    private String role;

    public ObjectPasien(String id, String nama, String alamat, String tgl_lahir, String umur, String gender, String email, String password, String role) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.tgl_lahir = tgl_lahir;
        this.umur = umur;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public String getUmur() {
        return umur;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}
