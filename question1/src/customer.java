public class customer {
    private int acc_number;
    private int begin_balance;
    private int items_charged;
    private int credit;
    private int credit_limit;
    public customer(int acc_number,int begin_balance, int items_charged,int credit,int credit_limit){
        this.acc_number = acc_number;
        this.begin_balance = begin_balance;
        this.items_charged = items_charged;
        this.credit = credit;
        this.credit_limit = credit_limit;
    }

    public int getAcc_number() {
        return acc_number;
    }

    public int getBegin_balance() {
        return begin_balance;
    }

    public int getCredit() {
        return credit;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public int getItems_charged() {
        return items_charged;
    }
}
