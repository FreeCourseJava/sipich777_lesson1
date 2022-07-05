public class assignment_two {
    public static void main(String []args) {

        int balance = 2147483647 ;

        int plusBalance = 2147483647 ;

        int fullBalance = addBal (balance,plusBalance) ;

    }

    public static int addBal(int balance, int plusBalance) {

        int result ;

        result = balance + plusBalance ;

        int overflow = 0 ;

        if (result < overflow) {

            System.out.println(overflow) ;

        } else {

            System.out.println(result) ;

        }

        return result ;
    }

}
