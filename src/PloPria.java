class PloPria {
        private double stor1;
        private double stor2;

         PloPria(double stor1, double stor2) {
            this.stor1 = stor1;
            this.stor2 = stor2;
        }
        private double plo(){
            double plopt=stor1*stor2;
            return plopt;
        }
        private void perev (PloPria f){
            double vic=(f.plo()*100)/plo();
            System.out.println(vic);
        }
        PloPria size (double size_s1,double size_s2){
            PloPria temp =new PloPria( stor1*size_s1 ,stor2*size_s2);
            return  temp;
        }
    double getplo(){
             return plo();
    }
    void gerprev(PloPria f){
        perev(f);
    }
    public double getStor1() {
        return stor1;
    }

    public void setStor1(double stor1) {
        this.stor1 = stor1;
    }

    public double getStor2() {
        return stor2;
    }

    public void setStor2(double stor2) {
        this.stor2 = stor2;
    }
}
