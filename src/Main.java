import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createObject("Laptop");
        createObject("Phone");
        createObject("Headphones");
    }
    public static void createObject(String object){
        switch (object){
            case "Laptop":
                Laptop laptop = new Laptop("GeForce GTX 1050",16);
                System.out.println(laptop);
                laptop.print();
                break;
            case "Phone":
                Phone phone = new Phone("Snapdragon 660","OLED");
                System.out.println(phone);
                phone.print();
                break;
            case "Headphones":
                Headphones headphones = new Headphones(true,110);
                System.out.println(headphones);
                headphones.print();
                break;
        }
    }
}