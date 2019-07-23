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
import com.irsyaad.dicodingsubmission.moviecollection.model.film.FilmModel;
import com.irsyaad.dicodingsubmission.moviecollection.presenter.film.FilmPresenter;
import com.irsyaad.dicodingsubmission.moviecollection.view.film.FilmView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment implements FilmView {
    private RecyclerView recyclerView;
    private FilmAdapter listFilmAdapter;

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_film, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listFilmAdapter = new FilmAdapter(getContext());

        final FilmPresenter presenter = new FilmPresenter(this);
        presenter.getDataFilm();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void getDataFilm(FilmModel model) {
        listFilmAdapter.setListFilm(model.getDataFilm());
        recyclerView.setAdapter(listFilmAdapter);

    }
}
