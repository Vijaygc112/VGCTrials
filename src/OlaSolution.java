public class OlaSolution {


    public static void main(String[] args) {


        int a[] = {1,2,3,4};
        int b[] = {2, 5, 6};


        //VIJAY   JAYVI

        // VIJAY  JAYIV


        //1 2 3 4
        // 2 5 6
        // 1 3 4 5 6

        printUniqueelements(a, b);
    }

    private static void printUniqueelements(int[] a, int[] b) {
        int[] c = new int[10];
        int[] d = new int[10];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i ; j++) {
                if(a[i] != a[j]){
                    c[i] = a[i];
                }
            }

        }
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < i ; j++) {
//                if(b[i] != a[j]){
//                    d[i] = b[i];
//                }
//            }
//
//        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }



    }
}
