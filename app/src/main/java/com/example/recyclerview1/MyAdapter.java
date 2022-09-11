package com.example.recyclerview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    Context context;
    List<MyModel> userlist;

    public MyAdapter(Context context, List<MyModel> userlist) {
        this.context = context;
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        MyModel user=userlist.get(position);

        holder.image.setImageResource(user.getImage());
        holder.message.setText(user.getMessage());
        holder.name.setText(user.getName());
        holder.time.setText(user.getTime());

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView name,time,message;
        ImageView image;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);
            message=itemView.findViewById(R.id.message);
            image=itemView.findViewById(R.id.image);
        }
    }
}
