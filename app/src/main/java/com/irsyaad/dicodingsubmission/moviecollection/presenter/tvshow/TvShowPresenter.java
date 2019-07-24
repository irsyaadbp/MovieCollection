package com.irsyaad.dicodingsubmission.moviecollection.presenter.tvshow;

import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShow;
import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShowData;
import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShowModel;
import com.irsyaad.dicodingsubmission.moviecollection.view.tvshow.TvShowView;

import java.util.ArrayList;

public class TvShowPresenter {
    private TvShowView view;

    public TvShowPresenter(TvShowView view) {
        this.view = view;
    }

    public void getDataTv(){
        ArrayList<TvShow> tvShows = new ArrayList<>(TvShowData.getListData());

        TvShowModel model = new TvShowModel(tvShows);
        view.getDataTv(model);
    }
}
