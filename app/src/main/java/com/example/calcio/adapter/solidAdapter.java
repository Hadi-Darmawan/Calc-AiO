package com.example.calcio.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calcio.R;
import com.example.calcio.activity.BlockActivity;
import com.example.calcio.activity.CubeActivity;
import com.example.calcio.activity.CylinderActivity;
import com.example.calcio.model.Solid;

import java.util.List;

public class solidAdapter extends RecyclerView.Adapter<solidAdapter.MyViewHolder> {
    Context mContext;
    List<Solid> mData;

    public solidAdapter(Context mcontext, List<Solid> mdata) {
        this.mContext = mcontext;
        this.mData = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        View v;
        v = LayoutInflater.from( mContext ).inflate( R.layout.my_solid_row, parent, false );
        MyViewHolder vHolder = new MyViewHolder( v );

        vHolder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vHolder.getAdapterPosition()==0){
                    Intent intent = new Intent( mContext, CubeActivity.class );
                    mContext.startActivities( new Intent[]{intent} );;
                }else if (vHolder.getAdapterPosition()==1){
                    Intent intent = new Intent( mContext, BlockActivity.class );
                    mContext.startActivities( new Intent[]{intent} );
                }else if (vHolder.getAdapterPosition()==2){
                    Intent intent = new Intent( mContext, CylinderActivity.class );
                    mContext.startActivities( new Intent[]{intent} );
                }
            }
        } );

        return vHolder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position ) {
        holder.photo.setImageResource( mData.get( position ).getPhoto() );
        holder.tv_name.setText( mData.get( position ).getName() );
        holder.tv_description.setText( mData.get( position ).getDescription() );
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_description;
        private ImageView photo;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );

            photo = (ImageView) itemView.findViewById( R.id.myImageSolid );
            tv_name = (TextView) itemView.findViewById( R.id.myTextSolid1 );
            tv_description = (TextView) itemView.findViewById( R.id.myTextSolid2 );
        }
    }
}
