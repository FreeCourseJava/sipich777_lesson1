public class assignment_one {

    public static void main(String []args){

        long numberOfDays = 365L;
        long selectedDataTime = dataMillisec(numberOfDays);
        System.out.println(selectedDataTime);

    }

    public static long dataMillisec(long numberOfDays){
        long result;
        long selectedDataTimeMs = numberOfDays * 1000 * 60 * 60 * 24;
        long currentTime = System.currentTimeMillis();
        result = currentTime + selectedDataTimeMs;
        return result;
    }
}