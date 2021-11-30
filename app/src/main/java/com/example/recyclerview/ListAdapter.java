package com.example.recyclerview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    //Variables
    private List<List_Element> mData;
    private LayoutInflater layoutInflater;
    private Context context;

    //Constructor
    public ListAdapter(List<List_Element> mData, Context context){
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = mData;
    }

    //Se crea y retorna una lista en la vista
    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    //Para indicar las diversas posiciones de la lista
    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }

    //Retorna el tamaño de la lista
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  void setItems(List<List_Element> items) {mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Se declaran las variables del list_element
        ImageView icon;
        TextView name,city,status;

        ViewHolder(View view){
            super(view);
            icon = view.findViewById(R.id.img);
            name = view.findViewById(R.id.txt_name);
            city = view.findViewById(R.id.txt_dir);
            status = view.findViewById(R.id.txt_state);
        }

        void bindData(final List_Element item){
            //Se adapta a las propiedades de la lista
            icon.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCity());
            status.setText(item.getStatus());
        }
    }


}
