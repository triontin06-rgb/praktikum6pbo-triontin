package ocp;

// Implementasi interface TipePembayaran untuk kartu debit
public class Debit implements TipePembayaran {
    private String namaBank;
    private String noKartu;

    public Debit(String namaBank, String noKartu) {
        this.namaBank = namaBank;
        this.noKartu = noKartu;
    }

    @Override
    public void prosesPembayaran(double total) {
        System.out.println("Metode Pembayaran: DEBIT");
        System.out.println("Bank: " + namaBank);
        System.out.println("Nomor Kartu: " + noKartu);
        System.out.println("Total yang Didebet: Rp " + total);
        System.out.println("Transaksi Berhasil!");
    }
}