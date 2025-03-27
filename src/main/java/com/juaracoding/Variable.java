package com.juaracoding;

public class Variable {
    public static void main(String[] args) {
        byte rating = 127;
        short stock = 1000;

        char a = 'A';
        char num = 115; // merupakan kode ascii untuk huruf s

        String path = "C:\\Users\\Document\\";

        System.out.println(path);

        String name = "Michael";
        String email = "michael@test.id";
        String phone = "+6281911111";
        String alamat = "Jalan Satu Dua Tiga Pagar ABC";
        boolean isLogin = true;

        int price = 1000000000;
        long total = 300000000000000000L + price;

        int intLevel = a;

        System.out.println(total);
        System.out.println(intLevel);

        long l = 989891273912739123L;
        int i = (int) l;

        System.out.println(i);
    }
}
