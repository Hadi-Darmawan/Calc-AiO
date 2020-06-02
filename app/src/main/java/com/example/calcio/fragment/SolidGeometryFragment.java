package com.example.calcio.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calcio.R;
import com.example.calcio.adapter.solidAdapter;
import com.example.calcio.model.Solid;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SolidGeometryFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Solid> lstSolid;

    public SolidGeometryFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_solid_geometry, container, false );

        myrecyclerview = view.findViewById( R.id.recyclerViewSolid );
        myrecyclerview.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        solidAdapter solidAdapter = new solidAdapter(getContext(), lstSolid);
        myrecyclerview.setAdapter( solidAdapter );

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        lstSolid = new ArrayList<>();
        lstSolid.add( new Solid( "Kubus", "Menghitung volume dan luas permukaan kubus", R.drawable.kubus  ) );
        lstSolid.add( new Solid( "Balok", "Menghitung volume dan luas permukaan balok", R.drawable.balok ) );
        lstSolid.add( new Solid( "Tabung", "Menghitung volume tabung", R.drawable.tabung ) );

    }

}

