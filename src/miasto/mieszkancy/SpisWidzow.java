package miasto.mieszkancy;

public class SpisWidzow {
    private static Widz[] widzowie;

    private SpisWidzow(Widz[] widzowie){this.widzowie = widzowie;}

    public static Widz[] getWidzowie(){return widzowie;}

    public static SpisWidzow stworz(int iluWidzow){
        int iluKoneserow = iluWidzow/25;
        int iluKinomanow = iluWidzow/10;
        int iluOkazjonalnych = iluWidzow - iluKoneserow - iluKinomanow;
        Widz[] widzowie = new Widz[iluWidzow];
        int n=0;
        for(int i=0; i<iluKoneserow; i++){
            widzowie[n] = new Koneser("Koneser"+(i+1));
            n++;
        }
        for(int i=0; i<iluKinomanow; i++){
            widzowie[n] = new Kinoman("Kinoman"+(i+1));
            n++;
        }
        for(int i=0; i<iluOkazjonalnych; i++){
            widzowie[n] = new Okazjonalny("Okazjonalny"+(i+1));
            n++;
        }
        return new SpisWidzow(widzowie);
    }
}
