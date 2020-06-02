package com.example.calcio.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calcio.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HealthFragment extends Fragment {

    Button btn_weight, btn_height;
    EditText inputHealth1, inputHealth2;
    TextView viewHealth;
    Integer h, w;
    double result;

    public HealthFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_health, container, false );

        btn_weight = (Button) view.findViewById( R.id.btn_weight );
        btn_height = (Button) view.findViewById( R.id.btn_height );
        inputHealth1 = (EditText) view.findViewById( R.id.inputHealth1 );
        inputHealth2 = (EditText) view.findViewById( R.id.inputHealth2 );
        viewHealth = (TextView) view.findViewById( R.id.viewHealth );

        btn_height.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (inputHealth1.getText().toString().equals( "" )){
                    viewHealth.setText( "Masukan tinggi badan" );
                }else{
                h = Integer.parseInt( inputHealth1.getText().toString() );
                result = ((h-100) - ((1/10)*(h-100)) );
                viewHealth.setText( "Berat badan ideal anda : " + result );
                }
            }
        } );

        btn_weight.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (inputHealth2.getText().toString().equals( "" )){
                    viewHealth.setText( "Masukan berat badan" );
                }else{
                w = Integer.parseInt( inputHealth2.getText().toString() );
                result = ((w+100) + (0.1 * (w+100)));
                viewHealth.setText( "Tinggi badan ideal anda : " + result );
                }
            }
        } );

        return view;
    }

}
