package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;

public class SquareActivity extends AppCompatActivity {

    Button btn_lSquare, btn_kllSquare;
    EditText inputSquare1;
    TextView viewSquare;
    Integer sisi, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_square );

        btn_lSquare = (Button) findViewById( R.id.btn_lSquare );
        btn_kllSquare = (Button) findViewById( R.id.btn_kllSquare );
        inputSquare1 = (EditText) findViewById( R.id.inputSquare1 );
        viewSquare = (TextView) findViewById( R.id.viewSquare );

        btn_lSquare.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sisi = Integer.parseInt( inputSquare1.getText().toString() );
                result = sisi*sisi;
                viewSquare.setText( "Luas Persegi : " + result );
            }
        } );

        btn_kllSquare.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sisi = Integer.parseInt( inputSquare1.getText().toString() );
                result = sisi * 4;
                viewSquare.setText( "Keliling Persegi : " + result );
            }
        } );

    }
}
