package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;

public class RectangularActivity extends AppCompatActivity {

    Button btn_lRectangular, btn_kllRectangular;
    EditText inputRectangular1, inputRectangular2;
    TextView viewRectangular;
    Integer panjang, lebar, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rectangular );

        btn_lRectangular = (Button) findViewById( R.id.btn_lRectangular );
        btn_kllRectangular = (Button) findViewById( R.id.btn_kllRectangular );
        inputRectangular1 = (EditText) findViewById( R.id.inputRectangular1 );
        inputRectangular2 = (EditText) findViewById( R.id.inputRectangular2 );
        viewRectangular = (TextView) findViewById( R.id.viewRectangular );

        btn_lRectangular.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                panjang = Integer.parseInt( inputRectangular1.getText().toString() );
                lebar = Integer.parseInt( inputRectangular2.getText().toString() );
                result = panjang * lebar;
                viewRectangular.setText( "Luas Persegi Panjang : " + result );
            }
        } );

        btn_kllRectangular.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                panjang = Integer.parseInt( inputRectangular1.getText().toString() );
                lebar = Integer.parseInt( inputRectangular2.getText().toString() );
                result = 2*(panjang + lebar);
                viewRectangular.setText( "Keliling Persegi Panjang : " + result );
            }
        } );

    }
}
