package miasto.kina;

public class Sala {
    private final int numer;
    private final int ileMiejsc;
    private final Kino kino;

    public Sala(Kino kino, int numer, int ileMiejsc){
        this.kino = kino;
        this.numer = numer;
        this.ileMiejsc = ileMiejsc;
    }
    public int getNumer(){return numer;}
    public int getIleMiejsc(){return ileMiejsc;}
    public Kino getKino(){return kino;}
}
