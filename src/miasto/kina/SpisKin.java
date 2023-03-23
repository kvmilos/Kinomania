package miasto.kina;

import java.util.Random;

public class SpisKin {
    private static Kino[] kina;
    Random liczba = new Random();
    public SpisKin(int ileKin){
        kina = new Kino[ileKin];
        int ileMulti = liczba.nextInt(ileKin+1);
        int a=0;
        for(int i=1; i<=ileMulti; i++){
            kina[a] = new Multipleks("Multipleks " + i,"Ulica nr " + (a+1), liczba.nextInt(11)+2);
            a++;
        }
        for(int i=1; i<=ileKin-ileMulti;i++){
            kina[a] = new Male("Male Kino " + i, "Ulica nr " + (a+1));
            a++;
        }
    }
    public static Kino getLosoweKino(){
        Random liczba = new Random();
        return kina[liczba.nextInt(kina.length)];
    }

    public static Kino[] getKina(){return kina;}
    public static Sala[] getWszystkieSale(){
        int a = 0;
        for(int i=0; i<getKina().length; i++){
            for(int j=0; j<getKina()[i].getSale().length; j++){
                a++;
            }
        }
        Sala[] sale = new Sala[a];
        int b = 0;
        for(int i=0; i<getKina().length; i++) {
            for (int j = 0; j < getKina()[i].getSale().length; j++) {
                sale[b] = getKina()[i].getSale()[j];
                b++;
            }
        }
        return sale;
    }

}
