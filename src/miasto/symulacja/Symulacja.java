package miasto.symulacja;

import miasto.filmy.SpisFilmow;
import miasto.kina.SpisKin;
import miasto.kina.SpisSeansow;
import miasto.mieszkancy.SpisWidzow;

public class Symulacja {
    private static final int ileDni = 25;
    private static final int ileFilmow = 12;
    private static final int ileWidzow = 1000;
    private static final int ileKin = 4;
    public static int dzien = 0;

    private static void symuluj(){
        SpisKin kina = new SpisKin(ileKin);
        SpisWidzow widzowie = SpisWidzow.stworz(ileWidzow);
        SpisFilmow filmy = new SpisFilmow(ileFilmow);
        System.out.println("~~~~~ STATYSTYKI DLA KIN: ~~~~~");
        for(int i=0; i<ileDni; i++){
            nastepnyDzien();
            for(int j=0; j<SpisWidzow.getWidzowie().length; j++){
                if(SpisWidzow.getWidzowie()[j].czyKupujeBilet(getDzien())){SpisWidzow.getWidzowie()[j].kupBilety();}
            }
            System.out.println("~~~ Dzień nr " + dzien + ": ~~~");
            Wypisywanie.wypiszKina();
        }
        System.out.println("~~~~~ ILE MIESZKAŃCY KUPILI BILETÓW: ~~~~~");
        Wypisywanie.wypiszKupioneBilety();

    }

    public static void nastepnyDzien(){
        dzien++;
        SpisSeansow[] spisSeansow = new SpisSeansow[ileDni];
        for(int i=0; i<ileDni; i++){
            spisSeansow[i]=SpisSeansow.stworz();
        }
    }

    public static int getDzien(){return dzien;}
    public static void nowaSymulacja(){symuluj();}
}
