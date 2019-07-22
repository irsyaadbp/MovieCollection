package com.irsyaad.dicodingsubmission.moviecollection.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;

public class DetailActivity extends AppCompatActivity {
    ImageView imgPoster, imgBackground;
    TextView txtTitle, txtRating, txtGenres, txtOverview, txtDirector, txtStar;
    public static final String EXTRA_FILM = "extra_film";
    Film film;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        film = getIntent().getParcelableExtra(EXTRA_FILM);

        Toast.makeText(this, "kamu klik "+film.getTitle(), Toast.LENGTH_SHORT).show();

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbar);

        AppBarLayout appBarLayout = findViewById(R.id.appBar);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (i > -500){
                    collapsingToolbarLayout.setTitle("");
                    toolbar.setNavigationIcon(R.drawable.ic_back_white_24dp);

                }else{
                    collapsingToolbarLayout.setTitle(film.getTitle());
                    toolbar.setNavigationIcon(R.drawable.ic_back_black_24dp);
                }
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        init();
        setLayout();
    }

    private void init(){
        imgPoster = findViewById(R.id.img_poster);
        imgBackground = findViewById(R.id.img_background);

        txtTitle = findViewById(R.id.txt_title);
        txtRating = findViewById(R.id.txt_rating);
        txtGenres = findViewById(R.id.txt_genres);
        txtDirector = findViewById(R.id.txt_director);
        txtStar = findViewById(R.id.txt_star);
        txtOverview = findViewById(R.id.txt_overview);
    }

    private void setLayout(){

        Glide.with(this)
                .load(film.getPoster())
                .centerCrop()
                .into(imgPoster);
        Glide.with(this)
                .load(film.getPoster())
                .centerCrop()
                .into(imgBackground);

        txtTitle.setText(film.getTitle());
        txtRating.setText(film.getRating());
        txtGenres.setText(film.getGenres());
        txtDirector.setText(film.getDirector());
        txtStar.setText(film.getStar());
        txtOverview.setText(film.getOverview());
    }
}
