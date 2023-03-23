package miasto.filmy;

import java.util.Random;

public class SpisFilmow {
    private static Film[] filmy;
    static Random liczba = new Random();
    public SpisFilmow(int ileFilmow){
        filmy = new Film[ileFilmow];
        for(int i=0; i<ileFilmow; i++){filmy[i] = new Film("Film nr "+(i+1),liczba.nextInt(11));}
    }
    public static Film[] getFilmy(){return filmy;}
    public static Film getLosowyFilm(){return filmy[liczba.nextInt(filmy.length)];}
}
