public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(20);

        PenghitungPersegi penghitung = new PenghitungPersegi();
        System.out.println(penghitung.hitungLuas(persegi1));
    }
}
