package dip;

public class MySQL implements Database {
    @Override
    public void insert(String data) {
        System.out.println("Data '" + data + "' berhasil disimpan ke MySQL Database.");
    }
}
