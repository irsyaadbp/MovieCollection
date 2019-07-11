package com.irsyaad.dicodingsubmission.moviecollection.presenter;

import com.irsyaad.dicodingsubmission.moviecollection.model.MainModel;
import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;
import com.irsyaad.dicodingsubmission.moviecollection.view.MainView;

import java.util.ArrayList;

public class MainPresenter {
    private MainView view;

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void getData(ArrayList<Film> film){
//        ArrayList<Film> data = film;
        MainModel model = new MainModel(film);
        view.getData(model);
    }
}
