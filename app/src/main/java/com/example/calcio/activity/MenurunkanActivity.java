package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.calcio.R;
import com.example.calcio.adapter.menaikanAdapter;
import com.example.calcio.adapter.menurunkanAdapter;
import com.example.calcio.model.Menaikan;
import com.example.calcio.model.Menurunkan;

import java.util.ArrayList;
import java.util.List;

public class MenurunkanActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Menurunkan> menurunkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menurunkan );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerViewMenurunkan );
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager( layoutManager );
        menurunkan = new ArrayList<Menurunkan>();

        menurunkan.add( new Menurunkan( "Kurangi Asupan Kalori",
                "Langkah yang paling umum untuk menurunkan bedat badan adalah dengan cara makan lebih sedikit") );
        menurunkan.add( new Menurunkan( "Berhenti Makan Gula",
                "Berhenti untuk mengkonsumsi makanan ringan yang mengandung banyak gula sehingga dapat membantu menurunkan berat badan" ) );
        menurunkan.add( new Menurunkan( "Olahraga 30 Menit Sehari",
                "Dengan melakukan olaharaga 30 menit setiap hari akan membantu tubuh untuk memproduksi keringat yang dapat membantu membakar kalori berlebih dalam tubuh") );
        menurunkan.add( new Menurunkan( "Minum Air 2 Liter Sehari",
                "Air dalam tubuh bekerja sebagai sistem pembilas intenal sehingga dapat membantu untuk mengurangi penumpukan lemat yang tidak diperlukan") );
        menurunkan.add( new Menurunkan( "Cukup Tidur",
                "Dengan tidur yang cukup dapat memberikan waktu pada tubuh untuk melakukan metabolisme termasuk mengurangi lemak berlebih") );
        menurunkan.add( new Menurunkan( "Mencoba Puasa Intermiten",
                "Dengan melakukan puasa jenis ini dapat membantu melatih tubuh untuk menggunakan cadangan lemak sebagai energi") );
        menurunkan.add( new Menurunkan( "Latihan Kardio",
                "Langkah yang paling umum untuk menurunkan bedat badan adalah dengan cara makan lebih sedikit") );

        mAdapter = new menurunkanAdapter(this, menurunkan);
        recyclerView.setAdapter( mAdapter );
    }
}
