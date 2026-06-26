import java.util.Scanner;

class main{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Cash Withdrawal");
            System.out.println("2.Cash Deposit");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Pin Update/Create");
            System.out.println("5.Exit");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("cash withdrawal");
                    break;
                case 2:
                    System.out.println("cash withdrawal");
                    break;
                case 3:
                    System.out.println("cash withdrawal");
                    break;
                case 4:
                    System.out.println("cash withdrawal");
                    break;
                case 5:
                    System.out.println("cash withdrawal");
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }while(choice<=5);
    }
}