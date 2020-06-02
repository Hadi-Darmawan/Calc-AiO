package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;

public class CylinderActivity extends AppCompatActivity {

    Button btn_lpCylinder, btn_vCylinder;
    EditText inputCylinder1, inputCylinder2;
    TextView viewCylinder;
    Integer r;
    Integer tinggi;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cylinder );

        btn_lpCylinder = (Button) findViewById( R.id.btn_lpCylinder );
        btn_vCylinder = (Button) findViewById( R.id.btn_vCylinder );
        inputCylinder1 = (EditText) findViewById( R.id.inputCylinder1 );
        inputCylinder2 = (EditText) findViewById( R.id.inputCylinder2 );
        viewCylinder = (TextView) findViewById( R.id.viewCylinder );

        btn_lpCylinder.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                r = Integer.parseInt( inputCylinder1.getText().toString() );
                tinggi = Integer.parseInt( inputCylinder2.getText().toString() );
                result = (2 * 3.14 * (r * r) + (2 * 3.14 * r));
                viewCylinder.setText( "Luas Permukaan Tabung : " + result );
            }
        } );

        btn_vCylinder.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                r = Integer.parseInt( inputCylinder1.getText().toString() );
                tinggi = Integer.parseInt( inputCylinder2.getText().toString() );
                result = 3.14 * (r * r) * tinggi;
                viewCylinder.setText( "Volume Tabung : " + result );
            }
        } );

    }
}
