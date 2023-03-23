package miasto.kina;

import miasto.filmy.Film;
import miasto.filmy.SpisFilmow;


public class SpisSeansow {
    private static Seans[] seanse;

    public SpisSeansow(Seans[] seanse){this.seanse = seanse;}

    public static SpisSeansow stworz(){
        Seans[] spisSeansow = new Seans[SpisKin.getWszystkieSale().length];
        Kino[] kina = SpisKin.getKina();
        int a = 0;
        for(int i=0; i<kina.length; i++){
            Sala[] sale = SpisKin.getKina()[i].getSale();
            for(int j=0; j<sale.length; j++){
                spisSeansow[a] = new Seans(SpisFilmow.getLosowyFilm(), SpisKin.getKina()[i].getSale()[j]);
                a++;
            }
        }
        return new SpisSeansow(spisSeansow);
    }
    public static Seans[] getSeanse(){return seanse;}

    public static int getIleFilmow() {
        Seans[] seanse = SpisSeansow.getSeanse();
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
    public static Film[] getRepertuarMiasta() {
        Film[] repertuar = new Film[getIleFilmow()];
        int c = 0;
        for (int i = 0; i < SpisFilmow.getFilmy().length; i++) {
            int t = 0;
            for (int j = 0; j < getSeanse().length; j++) {
                if (SpisFilmow.getFilmy()[i] == getSeanse()[j].getFilm()) {t++;}
            }
            if (t > 0) {
                repertuar[c] = SpisFilmow.getFilmy()[i];
                c++;
            }
        }
        Film[] repertuarNowy = new Film[c];
        for(int i=0; i<c; i++){
            repertuarNowy[i] = repertuar[i];
        }
        return repertuarNowy;
    }

    public static Film getFilmMaxOcena(){
        int max = 0;
        int najwyzsza = 0;
        for(int i=0; i<getRepertuarMiasta().length; i++){
            if(getRepertuarMiasta()[i].getOcena()>max){
                max = getRepertuarMiasta()[i].getOcena();
                najwyzsza = i;
            }
        }
        return getRepertuarMiasta()[najwyzsza];
    }
}
