package com.Big.O;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printItems(10);
        System.out.println(  addItems(12));
        printAll(3);
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("pink");
        cookieTwo.setColor("grey");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

    }

    //O(n)
    static void printItems(int n){
        for (int i = 0; i < n;i++){
            System.out.println(i);
        }
    }

    //0(n^2)
    static void printAll(int k){
        for (int i = 0; i < k;i++){
            for (int j = 0; j < k;j++) {
                for (int s = 0; s < k; s++) {
                    System.out.println(i + " " + j + " " + s);
                }
            }
        }
    }

    //0(1)
    static int addItems(int a){
        return a + a+ a;

    }
}