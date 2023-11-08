 class Main {
    public static void main( String[] args) {
        PriaTrukytnuk pt =new PriaTrukytnuk(1,1);
        PloPria pp =new PloPria(1,2);
        RekurSia rr=new RekurSia(1,2);
        PloVpusvKvadrat pkvk=new PloVpusvKvadrat();
        FinalDlaZav ff =new FinalDlaZav();
        PloPria size_pp;
        PloKva pk=new PloKva(3); //збільшене в 2 рази
        System.out.println(pt.getplo());
        System.out.println(pp.getplo());
        size_pp=pp.size(5,1);
        System.out.println(size_pp.getplo());
        pp.gerprev(size_pp);
        System.out.println(pk.getplo());
        System.out.println(rr.getaruf(10));
        System.out.println(pkvk.getplo());
        ProDiji.getdijad();
        ProDiji.getdijam();
        ff.getdoda();
        ff.getdodopd(3);
    }
}