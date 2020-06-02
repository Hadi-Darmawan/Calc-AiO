package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;

public class CubeActivity extends AppCompatActivity {

    Button btn_lpCube, btn_vCube;
    EditText inputCube1;
    TextView viewCube;
    Integer sisi, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cube );

        btn_lpCube = (Button) findViewById( R.id.btn_lpCube );
        btn_vCube = (Button) findViewById( R.id.btn_vCube );
        inputCube1 = (EditText) findViewById( R.id.inputCube1 );
        viewCube = (TextView) findViewById( R.id.viewCube );

        btn_lpCube.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sisi= Integer.parseInt( inputCube1.getText().toString() );
                result = 6 * (sisi * sisi);
                viewCube.setText( "Luas Permukaan Kubus : " + result );
            }
        } );

        btn_vCube.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sisi = Integer.parseInt( inputCube1.getText().toString() );
                result = sisi * sisi * sisi;
                viewCube.setText( "Volume Kubus : " + result );
            }
        } );

    }
}
