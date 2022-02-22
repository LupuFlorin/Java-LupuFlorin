package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
    System.out.println("Hello World!");
    String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"} ;
    int n = (int) (Math.random() * 1_000_000);
    System.out.println(n);
    int result = n * 3 ;
    result = result + 0b10101 ;
    result = result + 0xFF ;
    result = result * 6 ;
    System.out.println(result);
    int s = 0;
    while(result > 9){
        while(result != 0){
            s = s + result % 10 ;
            result = result / 10 ;
        }
        result = s ;
        s = 0 ;
    }
    System.out.println(result);
    System.out.println("Willy-nilly, this semester I will learn " + languages[result]) ;
    }
}
