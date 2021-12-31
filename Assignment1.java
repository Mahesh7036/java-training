package Assignments;

public class Assignment1 {

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(add(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
        System.out.println(mod(a,b));

    }

    static int add(int n1, int n2){
        System.out.println("Addition");
        return n1 + n2;
    }
    static int sub(int n1, int n2){
        System.out.println("Subtraction");
        return n1 - n2;
    }
    static int mul(int n1, int n2){
        System.out.println("Multiplication");
        return n1 * n2;
    }
    static int div(int n1, int n2){
        System.out.println("Division");
        return n1 / n2;
    }
    static int mod(int n1, int n2){
        System.out.println("Modlus");
        return n1 % n2;
    }


    
}
    

