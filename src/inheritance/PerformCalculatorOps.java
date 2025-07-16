package inheritance;

public class PerformCalculatorOps extends Calculator{
    public static void main(String[] args) {
        PerformCalculatorOps performCalculatorOps=new PerformCalculatorOps();
        int val=performCalculatorOps.sum(2,5);
        int val2=performCalculatorOps.sub(56,7);
        int val3=performCalculatorOps.multiply(34,2);
        int val4=performCalculatorOps.divide(32,8);

        System.out.println("addition :"+val);
        System.out.println("subtraction :"+val2);
        System.out.println("multiplication :"+val3);
        System.out.println("divide : "+val4);


    }
}
