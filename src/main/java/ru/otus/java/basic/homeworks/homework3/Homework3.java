package ru.otus.java.basic.homeworks.homework3;

public class Homework3 {
   public static void main(String[] args) {
        printWords();
    }
    public static void printWords(){
        System.out.println ("Hello");
        System.out.println ("World");
        System.out.println ("from");
        System.out.println ("Java");
    }
}
public class Homework3 {
  public static void main (String[] args){
    checkSign ();
}
 public static void checkSign (int a, int b, int c) {
    int sum = a+b+c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public class Homework3 {
 public static void main (String[] args){
     selectcolor ();
 }
 public static void selectColor() {
     int data = 19;
     if (data<=10) {
         System.out.println ("Красный");
         } else if (data<=20) {
         System.out.println("Желтый");
     } else {
         System.out.println("Зеленый");
     }
 }

        public class Homework3 {
            public static void main (String[] args){
                compareNumbers ();
            }
            public static void compareNumbers() {
                int a = 9;
                int b = 2;
                if (a>=b) {
                    System.out.println ("a >= b");
                } else  {
                    System.out.println("a < b");
                }
            }
