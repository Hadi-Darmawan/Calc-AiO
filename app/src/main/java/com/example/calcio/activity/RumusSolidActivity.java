package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.calcio.R;
import com.example.calcio.adapter.rumusPlaneAdapter;
import com.example.calcio.adapter.rumusSolidAdapter;
import com.example.calcio.model.RumusPlane;
import com.example.calcio.model.RumusSolid;

import java.util.ArrayList;
import java.util.List;

public class RumusSolidActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<RumusSolid> rumusSolid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rumus_solid );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerViewRumusSolid );
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager( layoutManager );
        rumusSolid = new ArrayList<RumusSolid>();

        rumusSolid.add( new RumusSolid( "Kubus", "Luas Permukaan: 4 x Sisi" ,
                "Volume: Sisi x Sisi", R.drawable.kubus ) );
        rumusSolid.add( new RumusSolid( "Balok", "Luas Permukaan: 2 x (Panjang + Lebar)" ,
                "Volume: Panjang x Lebar", R.drawable.balok ) );
        rumusSolid.add( new RumusSolid( "Limas", "Luas Permukaan: Luas Sisi1 + Luas Sisi2 + Luas Sisi3 + Luas Sisi4 + Luas Sisi 5" ,
                "Volume: 1/3 * (Luas Alas * Tinggi)", R.drawable.limas ) );
        rumusSolid.add( new RumusSolid( "Prisma", "Luas Permukaan: Keliling Segitiga x Tinggi x (2 x Luas Segitiga)" ,
                "Volume: 1/2 * Luas Alas * Tinggi", R.drawable.prisma ) );
        rumusSolid.add( new RumusSolid( "Tabung", "Luas Permukaan: (2 x Phi * Jari-jari * Tinggi) + (2 x Phi x (Jari-jari x Jari-jari))" ,
                "Volume: Phi x (Jari-jari x Jari-jari) x Tinggi", R.drawable.tabung ) );
        rumusSolid.add( new RumusSolid( "Kerucut", "Luas Permukaan: (Phi x Jari-jari x Sisi) + ( Phi x (Jari-jari x Jari-jari))" ,
                "Volume: 1/3 x Phi x (Jari-jari x Jari-jari) x Tinggi", R.drawable.kerucut ) );
        rumusSolid.add( new RumusSolid( "Bola", "Luas Permukaan: 4 x Phi x (Jari-jari x Jari-jari)" ,
                "Volume: 4/3 x Phi x (Jari-jari x Jari-jari x Jari-jari)", R.drawable.bola ) );

        mAdapter = new rumusSolidAdapter(this, rumusSolid);
        recyclerView.setAdapter( mAdapter );
    }
}
