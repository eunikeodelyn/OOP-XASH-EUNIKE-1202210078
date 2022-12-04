public class MainApp {

    public static void main(String[] args) {
        Perangkat device = new Perangkat("SCSI", 16, 3.10);
        Laptop myLaptop = new Laptop("SSD", 8, 5.40, true);
        Handphone myHandphone = new Handphone("Sandisk", 8, 3.1, false);

        device.information();

        myLaptop.information();
        myLaptop.openGame("Homescapes");
        myLaptop.sendEmail("eunike@gmail.com");
        myLaptop.sendEmail("eunike@gmail.com", "odelyn@gmail.com");

        myHandphone.information();
        myHandphone.call(123987456);
        myHandphone.sendMessage(321498765);
        myHandphone.sendMessage(321498765, 123987456);

    }
}
