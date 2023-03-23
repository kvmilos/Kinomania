package miasto.mieszkancy;

import miasto.filmy.Film;
import miasto.kina.Kino;
import miasto.kina.SpisKin;

import java.util.Random;

public class Kinoman extends Widz{

    private final Random liczba = new Random();
    private final int kiedyZaczynaChodzic;

    public Kinoman(String imie){
        super(imie);
        Random liczba = new Random();
        kiedyZaczynaChodzic = liczba.nextInt(3);
    }

    public boolean czyKupujeBilet(int dzien){return (dzien%3==kiedyZaczynaChodzic);}

    public int ileBiletow(){return liczba.nextInt(5)+1;}
    public void kupBilety() {
        Kino kino = SpisKin.getLosoweKino();
        Film film = kino.getLosowyFilmKina();
        int ileKupi = this.ileBiletow();
        int t=0;
        for (int i = 0; i < kino.getSeanseKina().length; i++) {
            if (kino.getSeanseKina()[i].getFilm() == film & kino.getSeanseKina()[i].getIleWolnych() >= ileKupi & t == 0) {
                kino.getSeanseKina()[i].kupBilety(ileKupi);
                t++;
                this.poSeansie(ileKupi);
            }
        }
    }
}
