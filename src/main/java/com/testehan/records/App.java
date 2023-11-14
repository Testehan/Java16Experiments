package com.testehan.records;

public class App {

    public static void main(String[] args) {

        Before b = new Before(1,2);
        System.out.println(b.x());
        System.out.println(b);

        After a = new After(1,2);
        System.out.println(a.x());
        System.out.println(a);


    }
}
