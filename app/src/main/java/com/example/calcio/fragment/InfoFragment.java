package com.example.calcio.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calcio.model.Info;
import com.example.calcio.R;
import com.example.calcio.adapter.infoAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Info> lstInfo;

    public InfoFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_info, container, false );

        myrecyclerview = view.findViewById( R.id.recyclerViewInfo );
        myrecyclerview.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        infoAdapter infoAdapter = new infoAdapter( getContext(), lstInfo );
        myrecyclerview.setAdapter( infoAdapter );

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        lstInfo = new ArrayList<>();
        lstInfo.add( new Info( "Rumus Bangun Datar", "Berikut ini merupakan rumus-rumus pada bangun datar", R.drawable.flat_g ) );
        lstInfo.add( new Info( "Rumus Bangun Ruang", "Berikut ini merupakan rumus-rumus pada bangun ruang", R.drawable.space_g ) );
        lstInfo.add( new Info( "Tips Menaikan Berat Badan", "Berikut ini merupakan tips untuk menaikan berat badan", R.drawable.i_weight ) );
        lstInfo.add( new Info( "Tips Menurunkan Berat Badan", "Berikut ini merupakan tips untuk menurunkan berat badan", R.drawable.d_weight ) );

    }
}
