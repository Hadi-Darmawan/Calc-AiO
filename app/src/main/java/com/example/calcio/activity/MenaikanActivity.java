package com.example.calcio.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.calcio.R;
import com.example.calcio.adapter.menaikanAdapter;
import com.example.calcio.adapter.rumusPlaneAdapter;
import com.example.calcio.model.Menaikan;
import com.example.calcio.model.RumusPlane;

import java.util.ArrayList;
import java.util.List;

public class MenaikanActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Menaikan> menaikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menaikan );

        recyclerView = (RecyclerView) findViewById( R.id.recyclerViewMenaikan );
        recyclerView.setHasFixedSize( true );
        layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager( layoutManager );
        menaikan = new ArrayList<Menaikan>();

        menaikan.add( new Menaikan( "Makan Lebih Sering",
                "Berusahalah makan lebih sering namun dengan porsi yang tidak terlalu banyak sehingga dapat menambah jumlah kalori yang masuk ke tubuh") );
        menaikan.add( new Menaikan( "Pilih Makanan Kaya Nutrisi",
                "Pilihlah jenis makanan yang kaya akan nutrisi untuk memenuhi kebutuhan kalori harian" ) );
        menaikan.add( new Menaikan( "Pilih Makanan Padat Kalori",
                "Pilihlah makanan yang padat akan kalori seperti kacang-kacangan dan buah-buahan seperti mangga dan alpukat" ) );
        menaikan.add( new Menaikan( "Perbanyak Cemilan",
                "Perbanyaklah konsumsi cemilan ringan yang memiliki gizi yang baik pula seperti roti isi, susu dan kacang-kacangan" ) );
        menaikan.add( new Menaikan( "Konsumsi Jus",
                "Jus dan smoothie baik dikomsumsi untuk menambah berat badan dibandingkan teh dan kopi karena lebih kaya nutrisi" ) );
        menaikan.add( new Menaikan( "Jangan Minum Sebelum Makan",
                "Minum sebelum makan akan mengurangi nafsu makan sehingga tidak dianjurkan untuk menaikan berat badan" ) );
        menaikan.add( new Menaikan( "Konsumsi Makanan Lemak Baik dan Protein",
                "Makanan yang mengandung lemak tak jenuh dan juga protein sangatlah baik dikonsumsi untuk meningkatkan masa otot dan berat badan" ) );

        mAdapter = new menaikanAdapter(this, menaikan);
        recyclerView.setAdapter( mAdapter );
    }
}
