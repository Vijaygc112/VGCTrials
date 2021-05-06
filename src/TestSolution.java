import java.util.Locale;

public class TestSolution {

    public static void main(String[] args) {
        String string = "Vijay Chitragar is good at coding";
        String string1 = "ViJaY cHiTrAgAr Is GoOd At CoDiNg";

        covertString(string);
    }

    private static void covertString(String string) {
        boolean flag = true;
        //string = string.toLowerCase(Locale.ROOT);
        //String str = string.toUpperCase(Locale.ROOT);


        for (int i = 0; i < string.length(); i++) {

            if(string.charAt(i) != ' '){

                if(flag){
                    System.out.print(Character.toUpperCase(string.charAt(i)));
                    flag = false;
                } else {
                    System.out.print(Character.toLowerCase(string.charAt(i)));
                    flag = true;
                }

            } else {
                System.out.print(' ');
            }


        }


    }

}
