package com.irsyaad.dicodingsubmission.moviecollection.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.fragment.FilmFragment;
import com.irsyaad.dicodingsubmission.moviecollection.fragment.TvShowFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    SharedPreferences languagePref;
    String currentLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        languagePref = getSharedPreferences("language",MODE_PRIVATE);
        currentLanguage = languagePref.getString("languageToLoad", Locale.getDefault().getDisplayLanguage());

        Toast.makeText(this, ""+currentLanguage, Toast.LENGTH_SHORT).show();

        setFragment();
    }

    private void setFragment(){
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add(getString(R.string.film_title), FilmFragment.class)
                .add(getString(R.string.tvshow_title), TvShowFragment.class)
                .create());

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ChangeLanguageActivity.class);
        startActivity(intent);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
