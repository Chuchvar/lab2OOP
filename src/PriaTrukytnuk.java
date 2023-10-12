public class PriaTrukytnuk {
    int catet1;
    int catet2;
    double gipote;

    public PriaTrukytnuk(int catet1, int catet2, int gipote) {
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

   public PriaTrukytnuk (){
      never();
   }
   double plo(){
        double plopt=0.5*catet1*catet2;
        return plopt;
   }
   double plo (int h){
        double plopt=0.5* gip()*h;
        return plopt;
   }
    double plo (double h){
        double plopt=0.5* gip()*h;
        return plopt;
    }
    double height(){
        double h= plo()/(gip()/2);
        return h;
    }
   double gip(){
        gipote=Math.pow (Math.pow(catet1,2)+Math.pow(catet2,2),1/2);
        return gipote;
   }

    void never(){
        System.out.println("Не ведені дані");
    }
}
