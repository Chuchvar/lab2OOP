public class PloPria {
        double stor1;
        double stor2;

        public PloPria(double stor1, double stor2) {
            this.stor1 = stor1;
            this.stor2 = stor2;
        }
        double plo(){
            double plopt=stor1*stor2;
            return plopt;
        }
        void perev (PloPria f){
            double vic=(f.plo()*100)/plo();
            System.out.println(vic);
        }
        PloPria size (double size_s1,double size_s2){
            PloPria temp =new PloPria( stor1*size_s1 ,stor2*size_s2);
            return  temp;
        }

}
