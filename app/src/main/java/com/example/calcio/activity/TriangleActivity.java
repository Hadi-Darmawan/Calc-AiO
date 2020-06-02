package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;

public class TriangleActivity extends AppCompatActivity {

    Button btn_lTriangle, btn_kllTriangle;
    EditText inputTriangle1, inputTriangle2, inputTriangle3;
    TextView viewTriangle;
    Integer alas, tinggi, s1, s2, s3, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_triangle );

        btn_lTriangle = (Button) findViewById( R.id.btn_lTriangle );
        btn_kllTriangle = (Button) findViewById( R.id.btn_kllTriangle );
        inputTriangle1 = (EditText) findViewById( R.id.inputTriangle1 );
        inputTriangle2 = (EditText) findViewById( R.id.inputTriangle2 );
        inputTriangle3 = (EditText) findViewById( R.id.inputTriangle3 );
        viewTriangle = (TextView) findViewById( R.id.viewTriangle );

        btn_lTriangle.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                alas = Integer.parseInt( inputTriangle1.getText().toString() );
                tinggi = Integer.parseInt( inputTriangle2.getText().toString() );
                result = alas*tinggi;
                viewTriangle.setText( "Luas Segitiga : " + result );
            }
        } );

        btn_kllTriangle.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                s1 = Integer.parseInt( inputTriangle1.getText().toString() );
                s2 = Integer.parseInt( inputTriangle2.getText().toString() );
                s3 = Integer.parseInt( inputTriangle3.getText().toString() );
                result = s1 + s2 + s3;
                viewTriangle.setText( "Keliling Segitiga : " + result );
            }
        } );

    }
}
