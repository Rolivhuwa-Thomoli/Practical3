public class Main {
    public static int new_balance( customer object ){
        int new_bal = object.getBegin_balance() + object.getItems_charged() - object.getCredit();
        return new_bal;
    }
    public static void check_limit(customer object, int new_balance){
        if(new_balance > object.getCredit_limit())
            System.out.println("Credit limit exceeded");
    }
    public static void main(String[] args){
        customer obj1 = new customer(202358331,250,50,100,70222);
        int new_balance = new_balance(obj1);
        System.out.println("New balance: " + new_balance);
        check_limit(obj1,new_balance);
    }
}
