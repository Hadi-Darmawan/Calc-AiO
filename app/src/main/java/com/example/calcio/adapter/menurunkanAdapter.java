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
import com.example.calcio.model.Menurunkan;

import java.util.List;

public class menurunkanAdapter extends RecyclerView.Adapter<menurunkanAdapter.MyViewHolder> {

    private Context mContext;
    private List<Menurunkan> mData;

    public menurunkanAdapter(Context mContext, List<Menurunkan> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, description1;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );
            title = (TextView) itemView.findViewById( R.id.myTextMenurunkan1 );
            description1 = (TextView) itemView.findViewById( R.id.myTextMenurunkan2 );
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext()).
                inflate( R.layout.my_menurunkan_row,parent,false );
        MyViewHolder myViewHolder = new MyViewHolder( v );
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Menurunkan menurunkan = mData.get( position );

        holder.title.setText( mData.get( position ).getTitle() );
        holder.description1.setText( mData.get( position ).getDescription1() );
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
