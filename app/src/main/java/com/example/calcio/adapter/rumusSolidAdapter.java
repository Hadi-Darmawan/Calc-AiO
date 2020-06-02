package com.example.calcio.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calcio.R;
import com.example.calcio.model.RumusPlane;
import com.example.calcio.model.RumusSolid;

import java.util.List;

public class rumusSolidAdapter extends RecyclerView.Adapter<rumusSolidAdapter.MyViewHolder> {

    private Context mContext;
    private List<RumusSolid> mData;

    public rumusSolidAdapter(Context mContext, List<RumusSolid> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, description1, description2;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            title = (TextView) itemView.findViewById( R.id.myTextRumusSolid1 );
            description1 = (TextView) itemView.findViewById( R.id.myTextRumusSolid2 );
            description2 = (TextView) itemView.findViewById( R.id.myTextRumusSolid3 );
            image = (ImageView) itemView.findViewById( R.id.myImageRumusSolid );
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext()).
                inflate( R.layout.my_rumus_solid_row,parent,false );
        MyViewHolder myViewHolder = new MyViewHolder( v );
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        RumusSolid rumusSolid = mData.get( position );

        holder.title.setText( mData.get( position ).getTitle() );
        holder.description1.setText( mData.get( position ).getDescription1() );
        holder.description2.setText( mData.get( position ).getDescription2() );
        holder.image.setImageResource( mData.get( position ).getImage() );
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
