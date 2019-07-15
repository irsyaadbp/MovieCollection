package com.irsyaad.dicodingsubmission.moviecollection.model.film;

import java.util.ArrayList;

public class FilmData {
    private static String[][] data = new String[][]{
            {"Avengers: Infinity War","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg","ADVENTURE, ACTION, FANTASY","English","2h 29m","$300,000,000.00","$2,046,239,637.00","8.5","2018","Anthony Russo, Joe Russo","Robert Downey Jr., Chris Hemsworth"},
            {"Spider-Man: Into the Spider-Verse","Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg","ACTION, ADVENTURE, ANIMATION, SCIENCE FICTION, COMEDY","English","1h 57m","$90,000,000.00","$375,450,417.00","8.5","2018","Bob Persichetti, Peter Ramsey","Shameik Moore, Jake Johnson"},
            {"A Star Is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg","DRAMA, ROMANCE, MUSIC","English","2h 15m","$36,000,000.00","$433,888,866.00","7.7","2018","Bradley Cooper","Lady Gaga, Bradley Cooper"},
            {"Bohemian Rhapsody","Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/lHu1wtNaczFPGFDTrjCSzeLPTKN.jpg","DRAMA, MUSIC","English","2h 15m","$52,000,000.00","$835,137,710.00","8.0","2018","Bryan Singer","Rami Malek, Lucy Boynton"},
            {"Incredibles 2","Elastigirl springs into action to save the day, while Mr. Incredible faces his greatest challenge yet – taking care of the problems of his three children.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/9lFKBtaVIhP7E2Pk0IY1CwTKTMZ.jpg","ACTION, ADVENTURE, ANIMATION, FAMILY","English","1h 58m","$200,000,000.00","$1,241,891,456.00","7.7","2018","Brad Bird","Craig T. Nelson, Holly Hunter"},
            {"Spider-Man: Far from Home","Peter Parker and his friends go on a summer trip to Europe. However, they will hardly be able to rest - Peter will have to agree to help Nick Fury uncover the mystery of creatures that cause natural disasters and destruction throughout the continent.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/rjbNpRMoVvqHmhmksbokcyCr7wn.jpg","ACTION, ADVENTURE,SCIENCE FICTION","English","2h 9m","$160,000,000.00","$580,055,628.00","7.7","2019","Jon Watts","Tom Holland, Samuel L. Jackson"},
            {"Toy Story 4","Woody has always been confident about his place in the world and that his priority is taking care of his kid, whether that's Andy or Bonnie. But when Bonnie adds a reluctant new toy called \"Forky\" to her room, a road trip adventure alongside old and new friends will show Woody how big the world can be for a toy.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/w9kR8qbmQ01HwnvK4alvnQ2ca0L.jpg","ADVENTURE, ANIMATION, COMEDY","English","1h 40m","$175,000,000.00","$519,802,847.00","8.3","2019","Josh Cooley","Tom Hanks, Tim Allen"},
            {"John Wick: Chapter 3 – Parabellum","Super-assassin John Wick returns with a $14 million price tag on his head and an army of bounty-hunting killers on his trail. After killing a member of the shadowy international assassin’s guild, the High Table, John Wick is excommunicado, but the world’s most ruthless hit men and women await his every turn.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/ziEuG1essDuWuC5lpWUaw1uXY2O.jpg","CRIME, ACTION, THRILLER","English","2h 11m","$55,000,000.00","$293,061,998.00","8.0","2019","Chad Stahelski","Keanu Reeves, Halle Berry"},
            {"Aladdin","A kindhearted street urchin named Aladdin embarks on a magical adventure after finding a lamp that releases a wisecracking genie while a power-hungry Grand Vizier vies for the same lamp that has the power to make their deepest wishes come true.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/3iYQTLGoy7QnjcUYRJy4YrAgGvp.jpg","ADVENTURE, FANTASY, ROMANCE","English","2h 10m","$183,000,000.00","$735,831,017.00","7.4","2019","Guy Ritchie","Will Smith, Mena Massoud"}
    };

    public static ArrayList<Film> getListData(){
        ArrayList<Film> list = new ArrayList<>();

        for (String[] aData : data){
            Film film = new Film();

            film.setTitle(aData[0]);
            film.setOverview(aData[1]);
            film.setPoster(aData[2]);
            film.setGenres(aData[3]);
            film.setLanguage(aData[4]);
            film.setRuntime(aData[5]);
            film.setBudget(aData[6]);
            film.setRevenue(aData[7]);
            film.setRating(aData[8]);
            film.setYear(aData[9]);
            film.setDirector(aData[10]);
            film.setStar(aData[11]);

            list.add(film);
        }
        return list;
    }
}
