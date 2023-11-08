 class PloVpusvKvadrat {
    PloKva pk =new PloKva(3);
     private double plo(){
        double s =2*Math.PI*(2/pk.getStorn1());
        return s;
    }
    double getplo(){
         return plo();
    }
}
