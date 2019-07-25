package com.irsyaad.dicodingsubmission.moviecollection.adapter.tvshow;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.activity.tvshow.DetailTvActivity;
import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShow;

import java.util.ArrayList;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder> {

    private Context context;
    private ArrayList<TvShow> listTv;

    public TvShowAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<TvShow> getListTv() {
        return listTv;
    }

    public void setListTv(ArrayList<TvShow> listTv) {
        this.listTv = listTv;
    }

    @NonNull
    @Override
    public TvShowAdapter.TvShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_layout, parent, false);
        return new TvShowViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull TvShowAdapter.TvShowViewHolder holder, final int position) {
        holder.txtRating.setText(getListTv().get(position).getRating());
        holder.txtTitle.setText(getListTv().get(position).getTitle());
        holder.txtGenres.setText(getListTv().get(position).getGenres());
        holder.txtOverview.setText(getListTv().get(position).getOverview());

        Glide.with(context)
                .load(getListTv().get(position).getPoster())
                .centerCrop()
                .error(R.drawable.ic_error_24dp)
                .into(holder.imgPoster);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(context, DetailTvActivity.class);
                move.putExtra(DetailTvActivity.EXTRA_TV, getListTv().get(position));
                context.startActivity(move);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListTv().size();
    }

    class TvShowViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPoster;
        TextView txtRating, txtTitle, txtGenres, txtOverview;
        CardView cardView;

        TvShowViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPoster = itemView.findViewById(R.id.img_poster);
            txtRating = itemView.findViewById(R.id.text_rating);
            txtTitle = itemView.findViewById(R.id.text_title);
            txtGenres = itemView.findViewById(R.id.text_genres);
            txtOverview = itemView.findViewById(R.id.text_overview);
            cardView = itemView.findViewById(R.id.cardview_wrapper);
        }
    }
}
