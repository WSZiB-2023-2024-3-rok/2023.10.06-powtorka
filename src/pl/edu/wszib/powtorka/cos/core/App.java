package pl.edu.wszib.powtorka.cos.core;

public class App {
    public static void main(String[] args) {
        int a = 10;
        if(a == 5) {
            System.out.println("to jest 5 !!");
        } else if(a == 6) {
            System.out.println("to jest 6 !!");
        } else if(a == 7) {
            System.out.println("to jest 7 !!");
        } else {
            System.out.println("to jest cos innego");
        }

        String x = "B";
        switch(x) {
            case "A":
                System.out.println("to jest A !!");
                break;
            case "B":
                System.out.println("to jest B !!");
                break;
            case "C":
                System.out.println("to jest C !!");
                break;
            default:
                System.out.println("to jest cos innego !!");
                break;
        }
    }
}
