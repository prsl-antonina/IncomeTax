package app;

public class Main {
    static double percentage;
    static double incomeTax;
    static double incomeAmount;
    static double tempIncome;

    public static void main(String[] args) {
        incomeAmount = 8000;
        if (incomeAmount <= 10000) {
            percentage = 0.025;
            incomeTax = incomeAmount * percentage;
            System.out.println("Income Tax is :" + incomeTax);
        }

        if (incomeAmount < 25000) {
            percentage = 0.043;
            incomeAmount = 15000;
            incomeTax = incomeAmount * percentage;
            System.out.println("Income Tax is :" + incomeTax);
        }

        if (incomeAmount > 25000) {
            percentage = 0.067;
            incomeAmount = 30000;
            incomeTax = incomeAmount * percentage;
            System.out.println("Income Tax is:" + incomeTax);

        }

    }

}
