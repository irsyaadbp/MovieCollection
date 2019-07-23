package com.irsyaad.dicodingsubmission.moviecollection.model.film;

import java.util.ArrayList;

public class FilmModel {
    private ArrayList<Film> film;

    public FilmModel(ArrayList<Film> film){
        this.film = film;
    }

    public ArrayList<Film> getDataFilm(){
        return film;
    }
}
