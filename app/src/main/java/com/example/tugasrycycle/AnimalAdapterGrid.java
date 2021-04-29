package com.example.tugasrycycle;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapterGrid extends RecyclerView.Adapter<AnimalAdapterGrid.AnimalViewHolder> {

    private ArrayList<Animal> dataList;

    public AnimalAdapterGrid(ArrayList<Animal> data) {
        this.dataList = data;
    }

    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.layout_item_card, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
//        holder.tv_AnimalName.setText(dataList.get(position).getName());
//        holder.iv_AnimalPhoto.setImageResource(dataList.get(position).getImage());
        holder.tv_title.setText(dataList.get(position).getName());
        holder.iv_imageCard.setImageResource(dataList.get(position).getImage());

        holder.iv_imageCard.setTag(dataList.get(position).getImage());
        holder.tv_details.setTag(dataList.get(position).getDetail());

    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder{
//        TextView tv_AnimalName;
//        TextView tv_AnimalDetails;
//        ImageView iv_AnimalPhoto;
        TextView tv_title;
        TextView tv_details;
        ImageView iv_imageCard;

        public AnimalViewHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_details = itemView.findViewById(R.id.tv_details);
            iv_imageCard = itemView.findViewById(R.id.iv_imageCard);
//            tv_AnimalName = itemView.findViewById(R.id.tv_animalName);
//            tv_AnimalDetails = itemView.findViewById(R.id.tv_animalDetail);
//            iv_AnimalPhoto = itemView.findViewById(R.id.iv_animalPhoto);



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent a = new Intent(v.getContext(), SecondActivity.class);
                    a.putExtra("name", tv_title.getText());
                    a.putExtra("details",(String) tv_details.getTag());
                    a.putExtra("photos", (int) iv_imageCard.getTag());
                    v.getContext().startActivity(a);
                }
            });
        }
    }
}
