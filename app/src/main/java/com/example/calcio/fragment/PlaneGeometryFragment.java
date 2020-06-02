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
import com.example.calcio.adapter.planeAdapter;
import com.example.calcio.model.Plane;

import java.util.ArrayList;
import java.util.List;

public class PlaneGeometryFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Plane> lstPlane;

    public PlaneGeometryFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_plane_geometry, container, false );

        myrecyclerview = view.findViewById( R.id.recyclerViewPlane );
        myrecyclerview.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        planeAdapter planeAdapter = new planeAdapter(getContext(), lstPlane);
        myrecyclerview.setAdapter( planeAdapter );

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        lstPlane = new ArrayList<>();
        lstPlane.add( new Plane( "Segitiga", "Menghitung luas dan keliling segitiga", R.drawable.segitiga  ) );
        lstPlane.add( new Plane( "Persegi", "Menghitung luas dan keliling persegi", R.drawable.persegi ) );
        lstPlane.add( new Plane( "Persegi Panjang", "Menghitung luas dan persegit panjang", R.drawable.persegi_panjang ) );

    }
}
