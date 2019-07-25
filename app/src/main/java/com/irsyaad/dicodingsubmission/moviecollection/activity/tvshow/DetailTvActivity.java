package com.irsyaad.dicodingsubmission.moviecollection.activity.tvshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShow;

public class DetailTvActivity extends AppCompatActivity {

    ImageView imgPoster, imgBackground;
    TextView txtTitle, txtYear, txtRating, txtGenres, txtOverview, txtCreator, txtStar, txtLanguage,
            txtRuntime, txtOriginalName, txtStatus;

    public static final String EXTRA_TV = "extra_tv";
    TvShow tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv);

        tvShow = getIntent().getParcelableExtra(EXTRA_TV);

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
                    collapsingToolbarLayout.setTitle(tvShow.getTitle());
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
        txtYear = findViewById(R.id.txt_year);
        txtRating = findViewById(R.id.txt_rating);
        txtGenres = findViewById(R.id.txt_genres);
        txtCreator = findViewById(R.id.txt_creator);
        txtStar = findViewById(R.id.txt_star);
        txtOverview = findViewById(R.id.txt_overview);
        txtLanguage = findViewById(R.id.txt_language);
        txtRuntime = findViewById(R.id.txt_runtime);
        txtOriginalName = findViewById(R.id.txt_original_name);
        txtStatus = findViewById(R.id.txt_status);
    }

    private void setLayout(){
        Glide.with(this)
                .load(tvShow.getPoster())
                .centerCrop()
                .error(R.drawable.ic_error_24dp)
                .into(imgPoster);
        Glide.with(this)
                .load(tvShow.getPoster())
                .centerCrop()
                .error(R.drawable.ic_error_24dp)
                .into(imgBackground);

        txtTitle.setText(tvShow.getTitle());
        txtYear.setText(tvShow.getYear());
        txtRating.setText(tvShow.getRating());
        txtGenres.setText(tvShow.getGenres());
        txtCreator.setText(tvShow.getCreator());
        txtStar.setText(tvShow.getStar());
        txtOverview.setText(tvShow.getOverview());
        txtLanguage.setText(tvShow.getLanguage());
        txtRuntime.setText(tvShow.getRuntime());
        txtOriginalName.setText(tvShow.getOriginalName());
        txtStatus.setText(tvShow.getStatus());
    }
}
