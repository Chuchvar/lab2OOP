 class RekurSia {
    private double start;
    private double risn;
    private double i=0;
    private double sum;
     RekurSia(double start, double risn) {
        this.start = start;
        this.risn = risn;
    }
     private double aruf(double kilki){
            if (i==kilki){
                return  sum;
            }
            double centr=start+i*risn;
            sum  =sum+centr;
            i++;
            return aruf(kilki);
    }
    double getaruf(double kil){
         return aruf(kil);
    }
     public double getStart() {
         return start;
     }

     public void setStart(double start) {
         this.start = start;
     }

     public double getRisn() {
         return risn;
     }

     public void setRisn(double risn) {
         this.risn = risn;
     }

     public double getI() {
         return i;
     }

     public void setI(double i) {
         this.i = i;
     }

     public double getSum() {
         return sum;
     }

     public void setSum(double sum) {
         this.sum = sum;
     }
 }
