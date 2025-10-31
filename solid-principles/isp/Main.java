package isp;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        persegi.calculateArea();

        System.out.println();

        Kubus kubus = new Kubus(4);
        kubus.calculateArea();
        kubus.calculateVolume();
    }
}
