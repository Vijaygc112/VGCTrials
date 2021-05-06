//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year
//     */
//
//
//
//    public static void findDay(int month, int day, int year) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year, month, day);
//        System.out.println(calendar.DAY_OF_WEEK);
//        System.out.println(calendar.get(calendar.DAY_OF_WEEK));
//        String day2 = getDayofWeek(calendar.get(calendar.DAY_OF_WEEK));
//        System.out.println(day2.toUpperCase());
//    }
//
//    private static String getDayofWeek(int i) {
//        String day = "";
//        StringBuilder str = new StringBuilder("Test");
//        str.
//        switch (i){
//            case 1:
//                day = "Sunday";
//                break;
//            case 2  :
//                day = "Monday";
//                break;
//            case 3:
//                day = "Tuesday";
//                break;
//            case 4:
//                day = "Wednesday";
//                break;
//            case 5:
//                day = "Thursday";
//                break;
//            case 6:
//                day = "Friday";
//                break;
//            case 7  :
//                day = "Saturday";
//                break;
//        }
//            return day;
//    }
//
//}
//
//public class CalendarClassExample {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        //String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int day = Integer.parseInt(bufferedReader.readLine());
//
//        int month = Integer.parseInt(bufferedReader.readLine());
//
//        int year = Integer.parseInt(bufferedReader.readLine());
//
//        Result.findDay(month, day, year);
//
//        //System.out.println();
//
//        //bufferedWriter.write(res);
//
//
//        bufferedReader.close();
//    }
//}
