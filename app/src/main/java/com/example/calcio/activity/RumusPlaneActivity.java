package com.example.calcio.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.calcio.R;
import com.example.calcio.adapter.rumusPlaneAdapter;
import com.example.calcio.model.RumusPlane;

import java.util.ArrayList;
import java.util.List;

public class RumusPlaneActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<RumusPlane> rumusPlane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rumus_plane );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerViewRumusPlane );
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager( layoutManager );
        rumusPlane = new ArrayList<RumusPlane>();

        rumusPlane.add( new RumusPlane( "Segitiga", "Keliling: Sisi + Sisi + Sisi" ,
                "Luas: 1/3 x Alas x Tinggi", R.drawable.segitiga ) );
        rumusPlane.add( new RumusPlane( "Persegi", "Keliling: 4 x Sisi" ,
                "Luas: Sisi x Sisi", R.drawable.persegi ) );
        rumusPlane.add( new RumusPlane( "Persegi Panjang", "Keliling: 2 x (Panjang + Lebar)" ,
                "Luas: Panjang x Lebar", R.drawable.persegi_panjang ) );
        rumusPlane.add( new RumusPlane( "Jajar Genjang", "Keliling: 2 x (Alas + Sisi Miring)" ,
                "Luas: Alas x Tinggi", R.drawable.jajar_genjang ) );
        rumusPlane.add( new RumusPlane( "Layang-Layang", "Keliling: Sisi + Sisi + Sisi + Sisi" ,
                "Luas: 1/2 x (Diagonal1 + Diagonal2)", R.drawable.layang2 ) );
        rumusPlane.add( new RumusPlane( "Trapesium", "Keliling: Sisi + Sisi + Sisi + Sisi" ,
                "Luas: 1/2 x (Sisi Bawah + Sisi Atas) x Tinggi", R.drawable.trapesium ) );
        rumusPlane.add( new RumusPlane( "Lingkaran", "Keliling: Phi x 2 x Jari-jari" ,
                "Luas: Phi x (Jari-jari x Jari-jari)", R.drawable.lingkaran ) );

        mAdapter = new rumusPlaneAdapter(this, rumusPlane);
        recyclerView.setAdapter( mAdapter );
    }

}
