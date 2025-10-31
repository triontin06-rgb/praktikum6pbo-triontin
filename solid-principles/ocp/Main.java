package ocp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== SISTEM PEMBAYARAN CUSTOMER =====");
        System.out.print("Masukkan nama customer: ");
        String nama = input.nextLine();

        System.out.print("Masukkan total belanja: ");
        double total = input.nextDouble();

        PembayaranCustomer customer = new PembayaranCustomer(nama, total);

        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Cash");
        System.out.println("2. Debit");
        System.out.println("3. Kredit");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jumlah uang: ");
                double uang = input.nextDouble();
                customer.setTipePembayaran(new Cash(uang));
                break;

            case 2:
                input.nextLine(); // membersihkan buffer
                System.out.print("Masukkan nama bank: ");
                String bankDebit = input.nextLine();
                System.out.print("Masukkan nomor kartu: ");
                String noKartuDebit = input.nextLine();
                customer.setTipePembayaran(new Debit(bankDebit, noKartuDebit));
                break;

            case 3:
                input.nextLine(); // membersihkan buffer
                System.out.print("Masukkan nama bank: ");
                String bankKredit = input.nextLine();
                System.out.print("Masukkan nomor kartu: ");
                String noKartuKredit = input.nextLine();
                System.out.print("Masukkan lama cicilan (bulan): ");
                int cicilan = input.nextInt();
                customer.setTipePembayaran(new Kredit(bankKredit, noKartuKredit, cicilan));
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                input.close();
                return;
        }

        customer.lakukanPembayaran();
        input.close();
    }
}