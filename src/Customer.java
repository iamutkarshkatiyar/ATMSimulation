public class Customer {
   private String name;
    private int acountNo;
    private int balance;
    private String acountType;

    Customer(String name,int acountNo,int balance,String acountType){
        this.name=name;
        this.acountNo=acountNo;
        this.balance=balance;
        this.acountType=acountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcountNo() {
        return acountNo;
    }

    public void setAcountNo(int acountNo) {
        this.acountNo = acountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAcountType() {
        return acountType;
    }

    public void setAcountType(String acountType) {
        this.acountType = acountType;
    }
}

