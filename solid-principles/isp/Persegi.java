package isp;

public class Persegi implements Shape2Dimension {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void calculateArea() {
        double area = sisi * sisi;
        System.out.println("Luas Persegi = " + area);
    }
}
