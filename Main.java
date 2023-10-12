public class Main {
    public static void main(String[] args) {
        PriaTrukytnuk pt =new PriaTrukytnuk(1,1);
        PloPria pp =new PloPria(1,2);
        RekurSia rr=new RekurSia(1,2);
        PloPria size_pp;
        PloKva pk=new PloKva(3);
        System.out.println(pt.plo());
        System.out.println(pp.plo());
        size_pp=pp.size(5,1);
        System.out.println(size_pp.plo());
        pp.perev(size_pp);
        System.out.println(pk.plo());
        System.out.println(rr.aruf(10));

    }
}