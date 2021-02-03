package com.tejeet.tataclicq_clone.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tejeet.tataclicq_clone.DataNModels.ModelTopHeaderImages;
import com.tejeet.tataclicq_clone.R;
import com.tejeet.tataclicq_clone.ViewHolders.HomeScreenTitleViewHolder;

import java.util.ArrayList;

public class HomeScreenTitleAdapter extends RecyclerView.Adapter<HomeScreenTitleViewHolder> {

    private ArrayList mImagesList;
    private Context mContext;

    public HomeScreenTitleAdapter(ArrayList<ModelTopHeaderImages> mImagesList, Context mContext) {
        this.mImagesList = mImagesList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public HomeScreenTitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_title_images_items, parent, false);
        return new HomeScreenTitleViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HomeScreenTitleViewHolder holder, int position) {

        ModelTopHeaderImages data = (ModelTopHeaderImages) mImagesList.get(position);
        holder.setData(data);


    }

    @Override
    public int getItemCount() {
        return mImagesList.size();
    }
}
