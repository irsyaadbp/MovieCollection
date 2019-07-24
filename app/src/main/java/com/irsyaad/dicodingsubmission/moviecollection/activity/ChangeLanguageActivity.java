package com.irsyaad.dicodingsubmission.moviecollection.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.irsyaad.dicodingsubmission.moviecollection.R;

import java.util.Locale;
import java.util.Objects;
//TODO TRANSLATOR
public class ChangeLanguageActivity extends AppCompatActivity {
    RadioButton radioEnglish, radioIndonesian;
    SharedPreferences languagePref;
    String CURRENT_LANGUAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_language);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(getString(R.string.choose_language));

        toolbar.setNavigationIcon(R.drawable.ic_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        languagePref = getSharedPreferences("CURRENT_LANGUAGE", MODE_PRIVATE);
        CURRENT_LANGUAGE = languagePref.getString("current_language", Locale.getDefault().getDisplayLanguage());

        Toast.makeText(this, "previous "+CURRENT_LANGUAGE, Toast.LENGTH_SHORT).show();

        onRadioButtonClicked();
    }

    private void onRadioButtonClicked(){
        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioEnglish= findViewById(R.id.radio_english);
        radioIndonesian= findViewById(R.id.radio_indonesian);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String lang = "";
                switch (checkedId){
                    case R.id.radio_english :
//                        Toast.makeText(ChangeLanguageActivity.this, "english", Toast.LENGTH_SHORT).show();
                        lang = "en";
                        break;
                    case R.id.radio_indonesian :
//                        Toast.makeText(ChangeLanguageActivity.this, "indonesian", Toast.LENGTH_SHORT).show();
                        lang = "in";
                        break;
                }

                changeLocale(lang);
            }
        });
    }

    private void changeLocale(String lang) {
        if (lang.equalsIgnoreCase(""))
            return;
        Locale myLocale = new Locale(lang);
        Locale.setDefault(myLocale);
        Configuration config = new Configuration();
        config.locale = myLocale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        updateText();
    }

    private void updateText(){
        Objects.requireNonNull(getSupportActionBar()).setTitle(getString(R.string.choose_language));
        radioEnglish.setText(getString(R.string.english));
        radioIndonesian.setText(getString(R.string.indonesian));

        CURRENT_LANGUAGE = languagePref.getString("current_language", Locale.getDefault().getDisplayLanguage());
        Toast.makeText(this, "after "+CURRENT_LANGUAGE, Toast.LENGTH_SHORT).show();

    }
}
