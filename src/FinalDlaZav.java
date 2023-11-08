public class FinalDlaZav {
    final private double i =10;
    final private double j =10;
    final private double l =10;
    private double doda(){
        double dod=i+j+l;
        return dod;
    }
    private double dodopd(final double d ){
        double dil=(i+j+l)/d;
        return dil;
    }
    double getdoda(){
        return doda();
    }
    double getdodopd(final double f){
        return dodopd(f);
    }
}
