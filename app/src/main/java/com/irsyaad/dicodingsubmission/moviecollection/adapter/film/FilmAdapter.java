package com.irsyaad.dicodingsubmission.moviecollection.adapter.film;

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
import com.irsyaad.dicodingsubmission.moviecollection.activity.DetailFilmActivity;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {

    private Context context;
    private ArrayList<Film> listFilm;

    public FilmAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Film> getListFilm() {
        return listFilm;
    }

    public void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_layout, parent, false);
        return new FilmViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, final int position) {
        holder.txtRating.setText(getListFilm().get(position).getRating());
        holder.txtTitle.setText(getListFilm().get(position).getTitle());
        holder.txtGenres.setText(getListFilm().get(position).getGenres());
        holder.txtOverview.setText(getListFilm().get(position).getOverview());

        Glide.with(context)
                .load(getListFilm().get(position).getPoster())
                .centerCrop()
                .into(holder.imgPoster);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(context, DetailFilmActivity.class);
                move.putExtra(DetailFilmActivity.EXTRA_FILM, getListFilm().get(position));
                context.startActivity(move);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListFilm().size();
    }

    class FilmViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView txtRating, txtTitle, txtGenres, txtOverview;
        CardView cardView;
        FilmViewHolder(@NonNull View itemView) {
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
