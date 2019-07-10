package com.irsyaad.dicodingsubmission.moviecollection.model.film;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private String title, overview, poster, genres, language, runtime;
    private String budget, revenue, rating, director, star, year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.overview);
        dest.writeString(this.poster);
        dest.writeString(this.genres);
        dest.writeString(this.language);
        dest.writeString(this.runtime);
        dest.writeString(this.budget);
        dest.writeString(this.revenue);
        dest.writeString(this.rating);
        dest.writeString(this.director);
        dest.writeString(this.star);
        dest.writeString(this.year);
    }

    public Film() {
    }

    protected Film(Parcel in) {
        this.title = in.readString();
        this.overview = in.readString();
        this.poster = in.readString();
        this.genres = in.readString();
        this.language = in.readString();
        this.runtime = in.readString();
        this.budget = in.readString();
        this.revenue = in.readString();
        this.rating = in.readString();
        this.director = in.readString();
        this.star = in.readString();
        this.year = in.readString();
    }

    public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film(source);
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
