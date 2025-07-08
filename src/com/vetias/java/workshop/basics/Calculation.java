package src.com.vetias.java.workshop.basics;
public class Calculation {

    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        try{
            if (b == 0){
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
        public static void main(String[] args){
            Calculation calci=new Calculation();
            System.out.println("Addition: " + calci.add(6, 3));
            System.out.println("Subtraction: "+ calci.subtract(10,7));
            System.out.println("Multiplication: "+ calci.multiply(9,9));
            System.out.println("Division: "+ calci.divide(10,5));
        }
    }