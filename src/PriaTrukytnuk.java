class PriaTrukytnuk {
    private int catet1;
    private int catet2;
    private double gipote;

    PriaTrukytnuk(int catet1, int catet2, int gipote) {
        this.catet1 = catet1;
        this.catet2 = catet2;
        this.gipote = gipote;
    }
    public PriaTrukytnuk(int catet1, int catet2){
        this.catet1=catet1;
        this.catet2=catet2;
    }
    public PriaTrukytnuk(int catet1, double gipote){
        this.catet1=catet1;
        this.gipote=gipote;
    }

    PriaTrukytnuk (){
      never();
   }
    private double plo(){
        double plopt=0.5*catet1*catet2;
        return plopt;
   }
    private double plo (int h){
        double plopt=0.5* gip()*(double) h;
        return plopt;
   }
    private double plo (double h){
        double plopt=0.5* gip()*h;
        return plopt;
    }
    private double height(){
        double h= plo()/(gip()/2);
        return h;
    }
    private double gip(){
        gipote=Math.pow (Math.pow(catet1,2)+Math.pow(catet2,2),1/2);
        return gipote;
   }

    private void never(){
        System.out.println("Не ведені дані");
    }
    double getplo(){
        return plo();
    }

}
