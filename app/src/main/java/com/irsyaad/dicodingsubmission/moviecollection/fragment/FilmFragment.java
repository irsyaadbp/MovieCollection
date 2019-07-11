package com.irsyaad.dicodingsubmission.moviecollection.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.model.MainModel;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.FilmData;
import com.irsyaad.dicodingsubmission.moviecollection.presenter.MainPresenter;
import com.irsyaad.dicodingsubmission.moviecollection.view.MainView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment implements MainView {
    ArrayList<Film> list;

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_film, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final MainPresenter presenter = new MainPresenter(this);
        list = new ArrayList<>();
        list.addAll(FilmData.getListData());
        presenter.getData(list);
    }

    @Override
    public void getData(MainModel model) {
        Log.d("uye", ""+model.getFilm());
        Toast.makeText(getContext(), ""+model.getFilm(), Toast.LENGTH_SHORT).show();
    }
}
