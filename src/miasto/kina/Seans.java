package miasto.kina;

import miasto.filmy.Film;

public class Seans {
    private final Film film;
    private final Sala sala;
    private int ileKupionych;

    public Seans(Film film, Sala sala){
        this.film = film;
        this.sala = sala;
        ileKupionych = 0;
    }

    public void kupBilety(int ileBiletow){ileKupionych += ileBiletow;}
    public Film getFilm(){return film;}
    public Sala getSala(){return sala;}
    public int getIleKupionych(){return ileKupionych;}
    public int getIleWolnych(){return sala.getIleMiejsc() - getIleKupionych();}

}
