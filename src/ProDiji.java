class ProDiji {
    static private  double numdokubu;
    static private  double num=3;
    static {
        numdokubu=Math.pow(num,3);
    }
    static private double dijam(){
        double d=num*numdokubu;
        return d;
    }
    static private void dijad(){
        double i=dijam()/num;
    }
    static double getdijam(){
        return dijam();
    }
    static  void getdijad(){
        dijad();
    }
}
