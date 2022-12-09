public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiair = new TransportasiAir(10, 70000);
        Sampan sampan = new Sampan(40, 100000, 2);
        Kapal kapal = new Kapal(50, 150000, "mesin Diesel");
        
        transportasiair.informasi();
        transportasiair.berlabuh();
        transportasiair.berlabuh();
        
        System.out.println();
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(7);
        
        System.out.println();
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(30);
        kapal.berlabuh();

    }

}