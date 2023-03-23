package miasto.mieszkancy;

import miasto.filmy.Film;
import miasto.kina.Kino;
import miasto.kina.SpisKin;
import miasto.kina.SpisSeansow;

public class Koneser extends Widz{
    public Koneser(String imie){super(imie);}

    public boolean czyKupujeBilet(int dzien){return true;}
    public int ileBiletow(){return 1;}
    public void kupBilety(){
        Film film = SpisSeansow.getFilmMaxOcena();
        Kino kino = null;
        int a=0;
        while(a==0){
            Kino kinoTest = SpisKin.getLosoweKino();
            if(film.czyKinoGraFilm(kinoTest)){
                a++;
                kino = kinoTest;
            }
        }

        int t = 0;
        for(int i=0; i<kino.getSeanseKina().length; i++){
            if(kino.getSeanseKina()[i].getFilm()==film & kino.getSeanseKina()[i].getIleWolnych()>0 & t==0){
                kino.getSeanseKina()[i].kupBilety(1);
                t++;
                this.poSeansie(1);
            }
        }

    }
}
