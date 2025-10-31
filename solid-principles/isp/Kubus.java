package isp;

public class Kubus implements Shape2Dimension, Shape3Dimension {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void calculateArea() {
        double area = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus = " + area);
    }

    @Override
    public void calculateVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = " + volume);
    }
}
