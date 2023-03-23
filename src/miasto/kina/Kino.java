package miasto.kina;

import miasto.filmy.Film;
import miasto.filmy.SpisFilmow;

import java.util.Random;

public class Kino {
    public final String nazwa;
    public final String adres;
    public final Sala[] sale;
    static Random x = new Random();

    public Kino(String nazwa, String adres, int ileSal) {
        this.nazwa = nazwa;
        this.adres = adres;
        sale = new Sala[ileSal];
        for (int i = 0; i < sale.length; i++) {
            Random liczba = new Random();
            int ileMiejsc = (liczba.nextInt(4) + 4) * 10;
            sale[i] = new Sala(this, (i+1), ileMiejsc);
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public Sala[] getSale() {
        return sale;
    }

    public Seans[] getSeanseKina() {
        Sala[] sale = this.getSale();
        Seans[] seanseTegoKina = new Seans[sale.length];
        int a = 0;
        for (int i = 0; i < SpisSeansow.getSeanse().length; i++) {
            if (SpisSeansow.getSeanse()[i].getSala().getKino() == this) {
                seanseTegoKina[a] = SpisSeansow.getSeanse()[i];
                a++;
            }
        }
        return seanseTegoKina;
    }

    public int getIleFilmowWKinie() {
        Seans[] seanse = this.getSeanseKina();
        Film[] filmy = new Film[seanse.length];
        int b = 0;
        for (int i = 0; i < seanse.length; i++) {
            int t = 0;
            for(int j = 0; j<i; j++){
                if(seanse[i].getFilm()==filmy[j]){t++;}
            }
            if(t==0){
                filmy[b]=seanse[i].getFilm();
                b++;
            }
        }
        return b+1;
    }

    public Film[] getFilmyKina(){
        Film[] repertuar = new Film[this.getIleFilmowWKinie()];
        int c = 0;
        for (int i = 0; i< SpisFilmow.getFilmy().length; i++){
            int t=0;
            for(int j=0; j< getSeanseKina().length; j++){
                if(SpisFilmow.getFilmy()[i]==getSeanseKina()[j].getFilm()){t++;}
            }
            if(t>0){
                repertuar[c] = SpisFilmow.getFilmy()[i];
                c++;
            }
        }
        return repertuar;
    }

    public Film getLosowyFilmKina(){return this.getFilmyKina()[x.nextInt(getFilmyKina().length)];}
}
