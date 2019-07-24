package com.irsyaad.dicodingsubmission.moviecollection.model.tvshow;

import java.util.ArrayList;

public class TvShowData {
    private static String[][] data = new String[][]{
            {"Money Heist","To carry out the biggest heist in history, a mysterious man called The Professor recruits a band of eight robbers who have a single characteristic: none of them has anything to lose. Five months of seclusion - memorizing every step, every detail, every probability - culminate in eleven days locked up in the National Coinage and Stamp Factory of Spain, surrounded by police forces and with dozens of hostages in their power, to find out whether their suicide wager will lead to everything or nothing.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/MoEKaPFHABtA1xKoOteirGaHl1.jpg","CRIME, DRAMA","Spanish; Castilian","70m, 47m","La casa de papel","Returning Series","8.6","2017","Úrsula Corberó, Itziar Ituño","Álex Pina"    },
            {"The Flash","After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only 'meta-human' who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/fki3kBlwJzFp8QohL43g9ReV455.jpg","DRAMA, SCIFI & FANTASY","English","44m","-","Returning Series","7.8","2014","Grant Gustin, Candice Patton","Greg Berlanti, Geoff Johns"},
            {"Legion","David Haller, AKA Legion, is a troubled young man who may be more than human. Diagnosed as schizophrenic, David has been in and out of psychiatric hospitals for years. But after a strange encounter with a fellow patient, he’s confronted with the possibility that the voices he hears and the visions he sees might be real.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/vT0Zsbm4GWd7llNjgWEtwY0CqOv.jpg","ACTION & ADVENTURE, SCIFI & FANTASY","English","50m","-","Returning Series","8.3","2017","Rachel Keller, Bill Irwin","Noah Hawley"    },
            {"Dragon Ball","Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku's home. Together, they set off to find all seven dragon balls in an adventure.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/3wx3EAMtqnbSLhGG8NrqXriCUIQ.jpg","ACTION & ADVENTURE, SCIFI & FANTASY, ANIMATION","Japanese","25m","ドラゴンボール","Ended","8.5","1986","Brice Armstrong, Steve Olson","Akira Toriyama"},
            {"One-Punch Man","Saitama is a hero who only became a hero for fun. After three years of “special” training, though, he’s become so strong that he’s practically invincible. In fact, he’s too strong—even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?","https://image.tmdb.org/t/p/w600_and_h900_bestv2/iE3s0lG5QVdEHOEZnoAxjmMtvne.jpg","ACTION & ADVENTURE, COMEDY , ANIMATION","Japanese","24m","ワンパンマン","Returning Series","8.9","2015","Makoto Furukawa, Kaito Ishikawa","Yuusuke Murata"},
            {"Family Guy","Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg","COMEDY , ANIMATION","English","22m","-","Returning Series","8.2","1999","Seth MacFarlane, Alex Borstein","Seth MacFarlane, David Zuckerman"},
            {"The 100","100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/wBzNjurA8ijJPF21Ggs9nbviIzi.jpg","DRAMA, SCIFI & FANTASY","English","43m","-","Returning Series","7.7","2014","Eliza Taylor, Bob Morley","Jason Rothenberg"},
            {"The Simpsons","Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/tPsvhL45f1AjES5rycFIxnbaH8v.jpg","ANIMATION, COMEDY","English","22m","-","Returning Series","8.7","1989","Dan Castellaneta, Nancy Cartwright","James L. Brooks, Matt Groening"}
    };

    public static ArrayList<TvShow> getListData(){
        ArrayList<TvShow> list = new ArrayList<>();

        for (String[] aData : data){
            TvShow tvShow = new TvShow();

            tvShow.setTitle(aData[0]);
            tvShow.setOverview(aData[1]);
            tvShow.setPoster(aData[2]);
            tvShow.setGenres(aData[3]);
            tvShow.setLanguage(aData[4]);
            tvShow.setRuntime(aData[5]);
            tvShow.setOriginalName(aData[6]);
            tvShow.setStatus(aData[7]);
            tvShow.setRating(aData[8]);
            tvShow.setYear(aData[9]);
            tvShow.setStar(aData[10]);
            tvShow.setCreator(aData[11]);

            list.add(tvShow);
        }
        return list;
    }
}
