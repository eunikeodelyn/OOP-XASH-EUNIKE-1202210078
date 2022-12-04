public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, double processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
    public void information() {
        System.out.println("Handphone memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + " Hz");
        if (fingerprint == true) {
            System.out.println("Handphone memiliki fingerprint");
        } else {
            System.out.println("Handphone tidak memiliki fingerprint");
        }
    }

    public void call(int noHp) {
        System.out.println("Handphone berhasil menyambungkan ke No " + noHp);

    }

    public void sendMessage(int noHp) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noHp);

    }

    public void sendMessage(int noHp1, int noHp2) {
        System.out.println("Handphone berhasil mengirim SMS ke No " + noHp1 + " dan No " + noHp2 + "\n");
    }
}
