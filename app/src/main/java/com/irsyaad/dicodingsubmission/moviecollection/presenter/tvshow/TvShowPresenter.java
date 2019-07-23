package com.irsyaad.dicodingsubmission.moviecollection.presenter.tvshow;

import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShow;
import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShowModel;
import com.irsyaad.dicodingsubmission.moviecollection.view.tvshow.TvShowView;

import java.util.ArrayList;

public class TvShowPresenter {
    private TvShowView view;

    public TvShowPresenter(TvShowView view) {
        this.view = view;
    }

    public void getDataFilm(){
        ArrayList<TvShow> tvShows = new ArrayList<>();
        //TODO add list data if tvshow data has been added
//        tvShows.addAll(TvShow.getListData());

        TvShowModel model = new TvShowModel(tvShows);
        view.getDataTv(model);
    }
}
