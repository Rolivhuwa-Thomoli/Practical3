//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Purchase obj1 = new Purchase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer type value between 1000 and 8000 :");
        int invoice = (int)sc.nextDouble();
        while (!(invoice>=1000 && invoice <= 8000)){
            System.out.println("Please enter an integer type value between 1000 and 8000 for Invoice number :");
            invoice = (int)sc.nextDouble();
        }
        obj1.setInvoice_num(invoice);

        System.out.println("Please enter a positive double type value for Sales Ammount :");
        double sales = sc.nextDouble();
        while (sales<0){
            System.out.println("Please enter a positive double type value for Sales Ammount :");
            sales = sc.nextDouble();
        }
        obj1.setAmmount_of_sale(sales);
        obj1.display();

    }
}