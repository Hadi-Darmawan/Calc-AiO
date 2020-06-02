package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;

public class BlockActivity extends AppCompatActivity {

    Button btn_lpBlock, btn_vBlock;
    EditText inputBlock1, inputBlock2, inputBlock3;
    TextView viewBlock;
    Integer panjang, tinggi, lebar, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_block );

        btn_lpBlock = (Button) findViewById( R.id.btn_lpBlock );
        btn_vBlock = (Button) findViewById( R.id.btn_vBlock );
        inputBlock1 = (EditText) findViewById( R.id.inputBlock1);
        inputBlock2 = (EditText) findViewById( R.id.inputBlock2 );
        inputBlock3 = (EditText) findViewById( R.id.inputBlock3 );
        viewBlock = (TextView) findViewById( R.id.viewBlock );

        btn_lpBlock.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                panjang = Integer.parseInt( inputBlock1.getText().toString() );
                tinggi = Integer.parseInt( inputBlock3.getText().toString() );
                lebar = Integer.parseInt( inputBlock2.getText().toString() );
                result = (2 * (panjang * lebar)) + (2 * (panjang * tinggi)) + (2 * (lebar * tinggi));
                viewBlock.setText( "Luas Permukaan Balok : " + result );
            }
        } );

        btn_vBlock.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                panjang = Integer.parseInt( inputBlock1.getText().toString() );
                lebar = Integer.parseInt( inputBlock2.getText().toString() );
                tinggi = Integer.parseInt( inputBlock2.getText().toString() );
                result = panjang * lebar * tinggi;
                viewBlock.setText( "Volume Balook : " + result );
            }
        } );

    }
}
