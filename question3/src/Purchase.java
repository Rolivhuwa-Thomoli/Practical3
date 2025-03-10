public class Purchase {
    private int invoice_num;
    private double ammount_of_sale;
    private double ammount_of_sales_tax;
    public Purchase(){
        invoice_num = 999;
        ammount_of_sale = 0;
        ammount_of_sales_tax = 0;
    }
    public Purchase(int invoice_num, double ammount_of_sale, double ammount_of_sales_tax){
        this.invoice_num = invoice_num;
        this.ammount_of_sale = ammount_of_sale;
        this.ammount_of_sales_tax = ammount_of_sales_tax;
    }

    public void setInvoice_num(int invoice_num) {
        this.invoice_num = invoice_num;
    }

    public void setAmmount_of_sale(double ammount_of_sale) {
        this.ammount_of_sale = ammount_of_sale;
        this.ammount_of_sales_tax = 0.05* ammount_of_sale;
    }
    public void display(){
        System.out.println("Invoice number : " + invoice_num + " Sale Ammount : R" + ammount_of_sale+ "Sales Tax: R" + ammount_of_sales_tax);
    }
}
