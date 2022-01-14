package day08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 65, weeklyHours = 40;

        double stateTaxRate = 0, federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double toatalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - toatalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("toatalTax = " + toatalTax);
        System.out.println("Net Income = $" + salaryAfterTax);

    }
}
