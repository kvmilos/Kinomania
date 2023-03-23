package miasto.mieszkancy;

import miasto.filmy.Film;
import miasto.kina.Kino;
import miasto.kina.SpisKin;

public class Okazjonalny extends Widz{

    public Okazjonalny(String imie){super(imie);}

    public boolean czyKupujeBilet(int dzien){return Math.random()<0.05;}
    public int ileBiletow(){return 1;}

    public void kupBilety(){
        Kino kino = SpisKin.getLosoweKino();
        Film film = kino.getLosowyFilmKina();
        int t = 0;
        for(int i=0; i<kino.getSeanseKina().length;i++){
            if(kino.getSeanseKina()[i].getFilm()==film & kino.getSeanseKina()[i].getIleWolnych()>0 & t==0){
                kino.getSeanseKina()[i].kupBilety(1);
                t++;
                this.poSeansie(1);
            }
        }
    }
}
