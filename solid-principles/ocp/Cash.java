package ocp;

// Implementasi interface TipePembayaran untuk pembayaran tunai
public class Cash implements TipePembayaran{
    private double jumlahUang;

    public Cash(double jumlahUang) {
        this.jumlahUang = jumlahUang;
    }

    @Override
    public void prosesPembayaran(double total) {
        System.out.println("Metode Pembayaran: CASH");
        System.out.println("Total Belanja: Rp " + total);
        System.out.println("Uang Diterima: Rp " + jumlahUang);

        if (jumlahUang >= total) {
            System.out.println("Kembalian: Rp " + (jumlahUang - total));
        } else {
            System.out.println("Uang tidak cukup!");
        }
    }
}