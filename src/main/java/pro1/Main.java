package pro1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(Fraction.IsBigger());
    }
}

class Fraction {
    public static String IsBigger(){
        double first = 0.3;
        double second = 0.1+0.2;

        if(first < second){
            return "0.1 + 0.2 is bigger";
        }
        else if(first > second){
            return "0.3 is bigger";
        }
        else {
            return "Theyre the same";
        }
    }
}