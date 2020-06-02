package com.example.calcio.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.calcio.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalcFragment extends Fragment {

    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9
            , btn_titik,btn_tambah, btn_kurang, btn_kali, btn_bagi, btn_samdeng, btn_negatif
            , btn_akar, btn_pangkat, btn_seru, btn_persen, btn_clear, btn_delete;

    TextView input_calc, input_calc2, output_calc;
    String process, prosess2, sign, specialFunction;
    double num1, num2, result;
    boolean titik, sp, clear;

    public CalcFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_calc, container, false );
        titik = false;
        sp = false;
        clear = false;

        btn_0 = view.findViewById( R.id.btn_0 );
        btn_1 = view.findViewById( R.id.btn_1 );
        btn_2 = view.findViewById( R.id.btn_2 );
        btn_3 = view.findViewById( R.id.btn_3 );
        btn_4 = view.findViewById( R.id.btn_4 );
        btn_5 = view.findViewById( R.id.btn_5 );
        btn_6 = view.findViewById( R.id.btn_6 );
        btn_7 = view.findViewById( R.id.btn_7 );
        btn_8 = view.findViewById( R.id.btn_8 );
        btn_9 = view.findViewById( R.id.btn_9 );
        btn_negatif = view.findViewById( R.id.btn_negatif );

        btn_titik = view.findViewById( R.id.btn_titik );
        btn_tambah = view.findViewById( R.id.btn_tambah );
        btn_kurang = view.findViewById( R.id.btn_kurang );
        btn_kali = view.findViewById( R.id.btn_kali );
        btn_bagi = view.findViewById( R.id.bnt_bagi );
        btn_persen = view.findViewById( R.id.btn_persen );
        btn_akar = view.findViewById( R.id.btn_akar );
        btn_pangkat = view.findViewById( R.id.btn_pangkat );
        btn_seru = view.findViewById( R.id.bnt_seru );
        btn_samdeng = view.findViewById( R.id.btn_samdeng );
        btn_clear = view.findViewById( R.id.btn_clear );
        btn_delete = view.findViewById( R.id.btn_delete );
        input_calc = view.findViewById( R.id.input_calc );
        output_calc = view.findViewById( R.id.output_calc );

        btn_delete.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                titik = false;
                if (input_calc.getText().equals( "" )){
//                    input_calc.setText( "" );
                    output_calc.setText( "" );
                } else if (input_calc.getText().equals( result + "" )){

                }
                else {
                    input_calc.setText( input_calc.getText().subSequence( 0,  input_calc.getText().length() - 1 ) );
                    output_calc.setText( output_calc.getText().subSequence( 0,  output_calc.getText().length() - 1 ) );
                }
            }
        } );

        btn_clear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_calc.setText( "" );
                output_calc.setText( "" );
                titik = false;
            }
        } );

        btn_samdeng.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((specialFunction == null && sign == null) || input_calc.getText().equals( "" )) {
                    output_calc.setText( "" );
                } else if (specialFunction != null){
                    switch (specialFunction){
                        default:
                            break;
                        case "^":
                            sp = false;
                            num1 = Double.parseDouble( process );
                            prosess2 = input_calc.getText().toString();
                            num2 = Double.parseDouble( prosess2 );
                            result = Math.pow( num1, num2 );
                            input_calc.setText( result + "" );
                            specialFunction = null;
                            output_calc.setText( process + "^" + prosess2 + "=" + result );
                            break;
                        case "√":
                            sp = false;
                            process = input_calc.getText().toString();
                            num1 = Integer.parseInt( process );
                            result = Math.sqrt(num1);
                            input_calc.setText( result + "" );
                            specialFunction = null;
                            output_calc.setText( "√" + process + "=" + result );
                            break;
                        case "!":
                            sp = false;
                            specialFunction = null;

                            prosess2 = output_calc.getText().toString();
                            num1 = Double.parseDouble( prosess2 );
                            int num2 = 1, i;
                                for (i=1; i<=num1; i++){
                                    num2 = num2*i;
                                }
                            input_calc.setText( num2 + "" );
                            output_calc.setText( prosess2 + "!" + "=" + num2 );
                            break;
                        case "%":
                            sp = false;
                            prosess2 = output_calc.getText().toString();
                            num1 = Double.parseDouble( prosess2 );
                            result = num1 / 100;
                            input_calc.setText( result + "" );
                            specialFunction = null;
                            output_calc.setText( prosess2 + "%" + "=" + result );
                            break;
                    }
                }else if (sign != null){
                    prosess2 =  input_calc.getText().toString();
                    num1 = Double.parseDouble( process );
                    num2 = Double.parseDouble( prosess2 );
                    input_calc.setText( null );
                    switch (sign){
                        default:
                            break;
                        case "+":
                            result = num1 + num2;
                            input_calc.setText( result + "" );
                            sign = null;
                            output_calc.setText( process + "+" + prosess2 + "=" + result );
                            break;
                        case "—":
                            result = num1 - num2;
                            input_calc.setText( result + "" );
                            sign = null;
                            output_calc.setText( process + "—" + prosess2 + "=" + result );
                            break;
                        case "×":
                            result = num1 * num2;
                            input_calc.setText( result + "" );
                            sign = null;
                            output_calc.setText( process + "×" + prosess2 + "=" + result );
                            break;
                        case "÷":
                            result = num1 / num2;
                            input_calc.setText( result + "" );
                            sign = null;
                            output_calc.setText( process + "÷" + prosess2 + "=" + result );
                            break;
                    }
                }
                else input_calc.setText( "" );
            }
        });

        btn_tambah.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sign = "+";
                titik = false;
                process = input_calc.getText().toString();
                prosess2 = output_calc.getText().toString();
                input_calc.setText( null );
                output_calc.setText( prosess2 + "+" );
            }
        });

        btn_kurang.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sign = "—";
                titik = false;
                process = input_calc.getText().toString();
                prosess2 = output_calc.getText().toString();
                input_calc.setText( null );
                output_calc.setText( prosess2 + "—" );
            }
        });

        btn_kali.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sign = "×";
                titik = false;
                process = input_calc.getText().toString();
                prosess2 = output_calc.getText().toString();
                input_calc.setText( null );
                output_calc.setText( prosess2 + "×" );
            }
        });

        btn_bagi.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                sign = "÷";
                titik = false;
                process = input_calc.getText().toString();
                prosess2 = output_calc.getText().toString();
                input_calc.setText( null );
                output_calc.setText( prosess2 + "÷" );
            }
        });

        btn_pangkat.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                specialFunction = "^";
                sp = true;
                titik = false;
                process = input_calc.getText().toString();
                prosess2 = output_calc.getText().toString();
                input_calc.setText( null );
                output_calc.setText( prosess2 + "^" );
            }
        });

        btn_akar.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                specialFunction = "√";
                sp = true;
                titik = false;
                prosess2 = output_calc.getText().toString();
                input_calc.setText( null );
                output_calc.setText( null );
                output_calc.setText( prosess2 + "√" );
            }
        });

        btn_seru.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                specialFunction = "!";
                sp = true;
                titik = false;
                process = input_calc.getText().toString();
                input_calc.setText( null );
                input_calc.setText( process + "!" );
            }
        });

        btn_persen.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                specialFunction = "%";
                sp = true;
                titik = false;
                process = input_calc.getText().toString();
                input_calc.setText( null );
                input_calc.setText( process + "%" );
            }
        });

        btn_titik.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!titik){
                    if (input_calc.getText().equals( "" )){
                        titik = true;
                    }else {
                        input_calc.setText( input_calc.getText() + "." );
                        output_calc.setText( output_calc.getText() + "." );
                        titik = false;
                    }
                    titik = true;
                }
            }
        });

        btn_negatif.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "-" );
                output_calc.setText( prosess2 + "-" );
            }
        });

        btn_0.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "0" );
                output_calc.setText( prosess2 + "0" );
            }
        });

        btn_1.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "1" );
                output_calc.setText( prosess2 + "1" );
            }
        });

        btn_2.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "2" );
                output_calc.setText( prosess2 + "2" );
            }
        });

        btn_3.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "3" );
                output_calc.setText( prosess2 + "3" );
            }
        });

        btn_4.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "4" );
                output_calc.setText( prosess2 + "4" );
            }
        });

        btn_5.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "5" );
                output_calc.setText( prosess2 + "5" );
            }
        });

        btn_6.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "6" );
                output_calc.setText( prosess2 + "6" );
            }
        });

        btn_7.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "7" );
                output_calc.setText( prosess2 + "7" );
            }
        });

        btn_8.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "8" );
                output_calc.setText( prosess2 + "8" );
            }
        });

        btn_9.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                prosess2 = output_calc.getText().toString();
                input_calc.setText( input_calc.getText() + "9" );
                output_calc.setText( prosess2 + "9" );
            }
        });



        return view;
    }
}
