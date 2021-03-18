package com.example.appfula.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import com.example.appfula.R;
import com.example.appfula.controller.ClienteController;
import com.example.appfula.core.AppUtil;
import com.example.appfula.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    int tempoTela = 1000 * 3;

    Cliente objCliente;
    ClienteController clienteController;
    TextView txtAppVersion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        Log.d(AppUtil.TAG, "onCreate: Tela Splash carregada...");

        clienteController = new ClienteController();

        txtAppVersion.findViewById(R.id.txtAppVersion);
        txtAppVersion.setText(AppUtil.versaoDoApp());


        trocarTela();
    }

    private void trocarTela() {

        Log.d(AppUtil.TAG, "trocarTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objCliente = new Cliente("Robson",
                        "robsonfulaneti@gmail.com",
                        "11981041939",
                        25,
                        true);

                Log.d(AppUtil.TAG, "Esperando um tempo...");

                Intent trocarDetela = new Intent(SplashActivity.this, MainActivity.class); //intent é a intenção

                Bundle bundle = new Bundle();
                bundle.putString("nome", objCliente.getNome());
                bundle.putString("email", objCliente.getEmail());

                trocarDetela.putExtras(bundle);

                startActivity(trocarDetela);
                finish();
            }
        }, tempoTela); //determina oque sera executado em segundo plano Handler


    }

}