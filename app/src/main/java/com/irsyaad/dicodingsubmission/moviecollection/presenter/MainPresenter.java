package com.irsyaad.dicodingsubmission.moviecollection.presenter;

import com.irsyaad.dicodingsubmission.moviecollection.model.MainModel;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.FilmData;
import com.irsyaad.dicodingsubmission.moviecollection.view.MainView;

import java.util.ArrayList;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void getDataFilm(){
        ArrayList<Film> film = new ArrayList<>();
        film.addAll(FilmData.getListData());

        MainModel model = new MainModel(film);
        view.getData(model);

    }
}
