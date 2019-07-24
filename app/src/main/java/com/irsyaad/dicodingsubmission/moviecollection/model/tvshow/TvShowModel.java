package com.irsyaad.dicodingsubmission.moviecollection.model.tvshow;

import java.util.ArrayList;

public class TvShowModel {
    private ArrayList<TvShow> tvShows;

    public TvShowModel(ArrayList<TvShow> tvShows) {
        this.tvShows = tvShows;
    }

    public ArrayList<TvShow> getDataTvShows() {
        return tvShows;
    }
}
