public class homework1 {

    public static void main(String []args) {

        int balance = 2147483647 ;

        int plusBalance = 2147483647 ;

        int fullBalance = addBal (balance,plusBalance) ;

        System.out.println(fullBalance) ;
    }


    public static int addBal(int balance, int plusBalance) {

        int result ;

        result = balance + plusBalance ;

        return result ;
    }
}