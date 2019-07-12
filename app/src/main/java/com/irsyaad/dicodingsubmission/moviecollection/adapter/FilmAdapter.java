package com.irsyaad.dicodingsubmission.moviecollection.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {

    Context context;
    ArrayList<Film> listFilm;

    public FilmAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Film> getListFilm() {
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
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.txtRating.setText(getListFilm().get(position).getRating());
        holder.txtTitle.setText(getListFilm().get(position).getTitle());
        holder.txtGenres.setText(getListFilm().get(position).getGenres());
        holder.txtOverview.setText(getListFilm().get(position).getOverview());

        Glide.with(context)
                .load(getListFilm().get(position).getPoster())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPoster);
    }

    @Override
    public int getItemCount() {
        return getListFilm().size();
    }

    public class FilmViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPoster;
        TextView txtRating, txtTitle, txtGenres, txtOverview;
        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPoster = itemView.findViewById(R.id.img_poster);
            txtRating = itemView.findViewById(R.id.text_rating);
            txtTitle = itemView.findViewById(R.id.text_title);
            txtGenres = itemView.findViewById(R.id.text_genres);
            txtOverview = itemView.findViewById(R.id.text_overview);

        }
    }
}
