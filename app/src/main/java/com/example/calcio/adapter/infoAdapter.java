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

import com.example.calcio.activity.MenaikanActivity;
import com.example.calcio.activity.MenurunkanActivity;
import com.example.calcio.activity.RectangularActivity;
import com.example.calcio.activity.RumusPlaneActivity;
import com.example.calcio.activity.RumusSolidActivity;
import com.example.calcio.activity.SquareActivity;
import com.example.calcio.activity.TriangleActivity;
import com.example.calcio.model.Info;
import com.example.calcio.R;

import java.util.List;

public class infoAdapter extends RecyclerView.Adapter<infoAdapter.MyViewHolder> {
    Context mContext;
    List<Info> mData;

    public infoAdapter(Context mcontext, List<Info> mdata) {
        this.mContext = mcontext;
        this.mData = mdata;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType ) {

        View v;
        v = LayoutInflater.from( mContext ).inflate( R.layout.my_info_row, parent, false );
        MyViewHolder vHolder = new MyViewHolder( v );

        vHolder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vHolder.getAdapterPosition()==0){
                    Intent intent = new Intent( mContext, RumusPlaneActivity.class );
                    mContext.startActivities( new Intent[]{intent} );;
                }else if (vHolder.getAdapterPosition()==1){
                    Intent intent = new Intent( mContext, RumusSolidActivity.class );
                    mContext.startActivities( new Intent[]{intent} );
                }else if (vHolder.getAdapterPosition()==2){
                    Intent intent = new Intent( mContext, MenaikanActivity.class );
                    mContext.startActivities( new Intent[]{intent} );
                }else if (vHolder.getAdapterPosition()==3){
                    Intent intent = new Intent( mContext, MenurunkanActivity.class );
                    mContext.startActivities( new  Intent[]{intent});
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

            photo = (ImageView) itemView.findViewById( R.id.myImageInfo );
            tv_name = (TextView) itemView.findViewById( R.id.myTextInfo1 );
            tv_description = (TextView) itemView.findViewById( R.id.myTextInfo2 );
        }
    }
}
