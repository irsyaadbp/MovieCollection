package com.irsyaad.dicodingsubmission.moviecollection.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
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
    private FilmAdapter listFilmAdapter;

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_film, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listFilmAdapter = new FilmAdapter(getContext());
        Log.d("halo", "ini oncreateview");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final MainPresenter presenter = new MainPresenter(this);
        presenter.getDataFilm();
        Log.d("halo", "ini onviewcreated");


    }

    @Override
    public void getData(MainModel model) {
        listFilmAdapter.setListFilm(model.getFilm());
        recyclerView.setAdapter(listFilmAdapter);
        Log.d("halo", "ini getdata");

    }
}
