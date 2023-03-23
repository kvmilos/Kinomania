package miasto.symulacja;

import miasto.kina.SpisKin;
import miasto.kina.SpisSeansow;
import miasto.mieszkancy.SpisWidzow;

public class Wypisywanie {

    public static void wypiszKina(){
        int[] sprzedaneBilety = new int[SpisSeansow.getSeanse().length];
        for (int i = 0; i < SpisSeansow.getSeanse().length; i++) {
            sprzedaneBilety[i] = SpisSeansow.getSeanse()[i].getIleKupionych();
        }
        int a = 0;
        for (int i = 0; i < SpisKin.getKina().length; i++) {
            System.out.println("~ "+ SpisKin.getKina()[i].getNazwa() + ", " + SpisKin.getKina()[i].getAdres() + ": ~");
            for (int j = 0; j < SpisKin.getKina()[i].getSale().length; j++) {
                System.out.print("Sala nr " + SpisKin.getKina()[i].getSale()[j].getNumer() + " - " + sprzedaneBilety[a]+ " z " + SpisKin.getKina()[i].getSale()[j].getIleMiejsc() + " możliwych, grają tam: '");
                a++;
                for(int k=0; k < SpisKin.getKina()[i].getSeanseKina().length; k++){
                    if(SpisKin.getKina()[i].getSeanseKina()[k].getSala()==SpisKin.getKina()[i].getSale()[j]){
                        System.out.println(SpisKin.getKina()[i].getSeanseKina()[k].getFilm().getTytul() + "' o ocenie: " + SpisKin.getKina()[i].getSeanseKina()[k].getFilm().getOcena());
                    }
                }
            }
        }
    }

    public static void wypiszKupioneBilety(){
        int[] kupioneBilety = new int[SpisWidzow.getWidzowie().length];
            for(int i = 0; i < SpisWidzow.getWidzowie().length; i++) {
                kupioneBilety[i] = SpisWidzow.getWidzowie()[i].getIleSeansow();
                System.out.println(SpisWidzow.getWidzowie()[i].getImie() + " kupił łącznie " + kupioneBilety[i] + " biletów.");
            }
    }
}
