package nomer1;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan =new Tumpukan(10);
        tumpukan.push(10);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println(" ");
        long nilai = tumpukan.peek();
        System.out.println("nilai teratas = " + nilai);
        System.out.println("nama saya adalah (Lusi Amaliyahtul Hidayah)");
        tumpukan.pop();
        System.out.println("nilai yang dihapus = " + nilai);
        tumpukan.baca();
        tumpukan.push(40);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
    }
}
