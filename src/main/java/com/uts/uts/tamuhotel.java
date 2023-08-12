package com.uts.uts;

public class tamuhotel {
    public static void main(String[] args) {
        var customer = new personP(); // Create an instance of CustomerHotel
        customer.name = "Rizky Nanda";
        customer.address = "Kendal";

        customer.infoTamu();
        customer.waktuCheckin("10:42 AM");
        customer.waktuCheckout("12:54 PM");
        customer.informasiPembayaran(570.000);
        customer.pesananMakanan("Ayam Goreng");

    }
}
