package com.example.appfula.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appfula.R;
import com.example.appfula.core.AppUtil;
import com.example.appfula.model.Cliente;

public class MainActivity extends AppCompatActivity {

    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "Tela principal carregada...");

        Bundle bundle = getIntent().getExtras();

        Log.d(AppUtil.TAG, "Tela nome..." + bundle.getString("nome"));
        Log.d(AppUtil.TAG, "Tela email..." + bundle.getString("email"));

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText(bundle.getString("nome"));

    }

}
