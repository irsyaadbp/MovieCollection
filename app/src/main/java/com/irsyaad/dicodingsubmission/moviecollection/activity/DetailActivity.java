package com.irsyaad.dicodingsubmission.moviecollection.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_FILM = "extra_film";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Film film = getIntent().getParcelableExtra(EXTRA_FILM);
        Toast.makeText(this, "kamu klik "+film.getTitle(), Toast.LENGTH_SHORT).show();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbar);
        collapsingToolbarLayout.setTitle(film.getTitle());

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.colorWhite));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.colorPrimary));
    }
}
