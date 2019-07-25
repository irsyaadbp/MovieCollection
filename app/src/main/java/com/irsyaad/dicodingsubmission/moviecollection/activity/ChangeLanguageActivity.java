package com.irsyaad.dicodingsubmission.moviecollection.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.irsyaad.dicodingsubmission.moviecollection.R;

import java.util.Locale;
import java.util.Objects;

public class ChangeLanguageActivity extends AppCompatActivity {
    RadioButton radioEnglish, radioIndonesian;
    RadioGroup radioGroup;

    SharedPreferences languagePref;

    String defaultLanguage;

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

        radioGroup = findViewById(R.id.radio_group);
        radioEnglish= findViewById(R.id.radio_english);
        radioIndonesian= findViewById(R.id.radio_indonesian);

        languagePref = getSharedPreferences("CURRENT_LANGUAGE", 0);
        defaultLanguage = Locale.getDefault().getDisplayLanguage();
        String language =languagePref.getString("language", ""+defaultLanguage);

        assert language != null;
        if (language.equals("en") || language.equals("English")){
            radioEnglish.setChecked(true);
        }else {
            radioIndonesian.setChecked(true);
        }

        onRadioButtonClicked();
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
        finish();
    }

    private void onRadioButtonClicked(){

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String lang = "";
                switch (checkedId){
                    case R.id.radio_english :
                        lang = "en";
                        break;
                    case R.id.radio_indonesian :
                        lang = "in";
                        break;
                }

                SharedPreferences.Editor editor = languagePref.edit();
                editor.putString("language", lang);
                editor.apply();

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
    }
}
