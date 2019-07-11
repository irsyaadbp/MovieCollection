package com.irsyaad.dicodingsubmission.moviecollection.model;


import com.irsyaad.dicodingsubmission.moviecollection.model.film.Film;

import java.util.ArrayList;

public class MainModel {
    private ArrayList<Film> film;

    public MainModel(ArrayList<Film> film){
        this.film = film;
    }

    public ArrayList<Film> getFilm(){
        return film;
    }
}
