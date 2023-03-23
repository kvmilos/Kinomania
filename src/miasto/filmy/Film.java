package miasto.filmy;

import miasto.kina.Kino;

public class Film {
    private final String tytul;
    private final int ocena;

    public Film(String tytul, int ocena){
        this.tytul = tytul;
        this.ocena = ocena;
    }

    public String getTytul(){return tytul;}
    public int getOcena(){return ocena;}

    public boolean czyKinoGraFilm(Kino kino){
        boolean t=false;
        for(int i = 0; i<kino.getFilmyKina().length; i++){
            if(kino.getFilmyKina()[i]==this){t=true;}
        }
        return t;
    }
}
