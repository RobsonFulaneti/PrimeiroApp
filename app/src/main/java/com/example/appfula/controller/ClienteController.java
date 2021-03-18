package com.example.appfula.controller;

import android.util.Log;

import com.example.appfula.core.AppUtil;

public class ClienteController {

    String versaoApp;

    public ClienteController() {

        this.versaoApp = AppUtil.versaoDoApp();

        Log.i(AppUtil.TAG, "ClienteController: " + versaoApp);
    }
}
