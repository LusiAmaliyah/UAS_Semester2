package nomer2;
public class ngantriapp {
    public static void main(String[] args) {
        queue ngantri = new queue(10);
        ngantri.enqueue(23);
        ngantri.show();
        ngantri.enqueue(60);
        ngantri.show();
        System.out.println("Nilai yang paling depan = "+ngantri.peek());
        ngantri.enqueue(70);
        System.out.println("nama saya adalah Lusi Amaliyahtul Hidayah");
        System.out.println();
        ngantri.show();
        System.out.println("Nilai yang diambil dari antrian = "+ngantri.dequeue());
        ngantri.show();
        System.out.println("Nilai yang paling depan = "+ngantri.peek());
    }
}