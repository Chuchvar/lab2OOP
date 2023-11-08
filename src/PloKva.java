 class PloKva {
    private double storn1;

     PloKva(int storn1) {
        this.storn1 = storn1;
    }
     private double plo(){
        double plopt=Math.pow(storn1,2);
        return plopt;
    }

     public double getStorn1() {
         return storn1;
     }

     public void setStorn1(int storn1) {
         this.storn1 = 2*storn1;
     }
    double getplo(){
         return plo();
    }
 }
