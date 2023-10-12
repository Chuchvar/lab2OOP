public class RekurSia {
    double start;
    double risn;
    double i=0;
    double sum;

    public RekurSia(double start, double risn) {
        this.start = start;
        this.risn = risn;
    }
    double aruf(double kilki){
            if (i==kilki){
                return  sum;
            }
            double centr=start+i*risn;
            sum  =sum+centr;
            i++;
            return aruf(kilki);
    }
}
