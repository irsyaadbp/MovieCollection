package com.irsyaad.dicodingsubmission.moviecollection.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

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
    }
}
