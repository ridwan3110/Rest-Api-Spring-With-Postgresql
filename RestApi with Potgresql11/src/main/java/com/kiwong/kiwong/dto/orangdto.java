/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiwong.kiwong.dto;

import java.util.Date;

/**
 *
 * @author kiwong
 */
public class orangdto {
    
    private int id;
    private String username;
    private String password;
    private String namalengkap;
    private String alamat;
    private int telepon;
    private Date tgl_masuk;
    private Date tanggal_keluar;

    public orangdto() {
    }
    
    public orangdto(int id, String username, String password, String namalengkap, String alamat, int telepon, Date tgl_masuk, Date tanggal_keluar) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.namalengkap = namalengkap;
        this.alamat = alamat;
        this.telepon = telepon;
        this.tgl_masuk = tgl_masuk;
        this.tanggal_keluar = tanggal_keluar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    public Date getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(Date tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public Date getTanggal_keluar() {
        return tanggal_keluar;
    }

    public void setTanggal_keluar(Date tanggal_keluar) {
        this.tanggal_keluar = tanggal_keluar;
    }
    
    
}
