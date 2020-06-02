package com.example.calcio.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calcio.R;
import com.example.calcio.model.Menaikan;
import com.example.calcio.model.RumusPlane;

import java.util.List;

public class menaikanAdapter extends RecyclerView.Adapter<menaikanAdapter.MyViewHolder> {

    private Context mContext;
    private List<Menaikan> mData;

    public menaikanAdapter(Context mContext, List<Menaikan> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, description1;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            title = (TextView) itemView.findViewById( R.id.myTextMenaikan1 );
            description1 = (TextView) itemView.findViewById( R.id.myTextMenaikan2 );
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext()).
                inflate( R.layout.my_menaikan_row,parent,false );
        MyViewHolder myViewHolder = new MyViewHolder( v );
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Menaikan menaikan = mData.get( position );

        holder.title.setText( mData.get( position ).getTitle() );
        holder.description1.setText( mData.get( position ).getDescription1() );
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
