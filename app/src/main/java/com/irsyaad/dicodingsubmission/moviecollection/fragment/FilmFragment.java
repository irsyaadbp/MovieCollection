package com.irsyaad.dicodingsubmission.moviecollection.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irsyaad.dicodingsubmission.moviecollection.R;
import com.irsyaad.dicodingsubmission.moviecollection.adapter.FilmAdapter;
import com.irsyaad.dicodingsubmission.moviecollection.model.MainModel;
import com.irsyaad.dicodingsubmission.moviecollection.presenter.MainPresenter;
import com.irsyaad.dicodingsubmission.moviecollection.view.MainView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment implements MainView {
    private RecyclerView recyclerView;
    private FilmAdapter listHeroAdapter;

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
        presenter.getDataFilm();

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listHeroAdapter = new FilmAdapter(getContext());

    }

    @Override
    public void getData(MainModel model) {
        listHeroAdapter.setListFilm(model.getFilm());
        recyclerView.setAdapter(listHeroAdapter);
    }
}
