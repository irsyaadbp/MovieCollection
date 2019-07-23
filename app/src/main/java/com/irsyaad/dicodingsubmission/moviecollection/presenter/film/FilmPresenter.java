package com.irsyaad.dicodingsubmission.moviecollection.presenter.film;

import com.irsyaad.dicodingsubmission.moviecollection.model.film.FilmModel;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.FilmData;
import com.irsyaad.dicodingsubmission.moviecollection.view.film.FilmView;

import java.util.ArrayList;

public class FilmPresenter {
    private FilmView view;

    public FilmPresenter(FilmView view) {
        this.view = view;
    }

    public void getDataFilm(){
        ArrayList<Film> film = new ArrayList<>();
        film.addAll(FilmData.getListData());

        FilmModel model = new FilmModel(film);
        view.getDataFilm(model);
    }
}
