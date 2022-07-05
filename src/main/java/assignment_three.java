public class assignment_three {

    public static void main(String []args) {

        int balance = -1 ;

        int plusBalance = -2147483648;

        int fullBalance = addBal (balance,plusBalance) ;

    }

    public static int addBal(int balance, int plusBalance) {

        int result ;

        result = balance + plusBalance ;

        long balanceL ;
        long plusBalanceL ;
        long resultL ;
        balanceL = (long)balance ;
        plusBalanceL = (long)plusBalance ;
        resultL = balanceL + plusBalanceL ;
        int resultTwo ;
        resultTwo = (int)resultL ;

        if (resultL>2147483647){
            result = 0 ;
            System.out.println(result) ;
        }
        else if (resultL<-2147483648){
            result = 0 ;
            System.out.println(result);
        }
        else{
            System.out.println(resultTwo);
        }


        return result ;
    }
}
