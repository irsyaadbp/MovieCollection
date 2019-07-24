package com.irsyaad.dicodingsubmission.moviecollection.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.adapter.tvshow.TvShowAdapter;
import com.irsyaad.dicodingsubmission.moviecollection.model.tvshow.TvShowModel;
import com.irsyaad.dicodingsubmission.moviecollection.presenter.tvshow.TvShowPresenter;
import com.irsyaad.dicodingsubmission.moviecollection.view.tvshow.TvShowView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment implements TvShowView {
    private RecyclerView recyclerView;
    private TvShowAdapter listTvAdapter;

    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_tv_show, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listTvAdapter = new TvShowAdapter(getContext());

        final TvShowPresenter presenter = new TvShowPresenter(this);
        presenter.getDataTv();

        return view;
    }

    @Override
    public void getDataTv(TvShowModel model) {
        listTvAdapter.setListTv(model.getDataTvShows());
        recyclerView.setAdapter(listTvAdapter);
    }
}
