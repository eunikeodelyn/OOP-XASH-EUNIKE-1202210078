public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, double processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void information() {

        System.out.println("Laptop memiliki drive tipe " + drive + " dengan ram " + ram + " GB dan processor " + processor + " Hz");
        if (webcam == true) {
            System.out.println("Laptop ini mempunyai webcam");
        } else {
            System.out.println("Laptop ini tidak mempunyai webcam");
        }
    }

    public void openGame(String gameName) {
        System.out.println("Laptop sedang membuka game " + gameName);
    }

    public void sendEmail(String email) {
        System.out.println("Laptop berhasil mengirimkan email ke " + email);
    }

    public void sendEmail(String email_1, String email_2) {
        System.out.println("Laptop berhasil mengirimkan email ke " + email_1 + " dan " + email_2 + "\n");
    }   

}
