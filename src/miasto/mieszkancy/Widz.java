package miasto.mieszkancy;


public abstract class Widz {
    private final String imie;
    public int ileSeansow;
    protected Widz(String imie){
        this.imie = imie;
        ileSeansow = 0;
    }
    public String getImie(){return imie;}
    public int getIleSeansow(){return ileSeansow;}
    public abstract boolean czyKupujeBilet(int dzien);
    public abstract int ileBiletow();
    public abstract void kupBilety();
    public void poSeansie(int ile){ileSeansow+=ile;}
}