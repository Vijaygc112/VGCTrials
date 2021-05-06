public class testInt {

    public static void main(String[] args){

        int intNum[] = {5,78, 33, 99, 12};

        int largest=0;
        int secondLargest=0;
        int temp = 0;
        int temp2=0;

        for (int i=0;i < 5; i++){
            if(largest < intNum[i] ){
                temp = largest;
                largest = intNum[i];
                secondLargest = temp;
            }
            if(secondLargest > largest){
                temp2 = secondLargest;
                secondLargest = largest;
                largest = temp2;
            }

        }

        System.out.println("Largest is " + largest + "\n" + "Second Largest is " + secondLargest);

    }

}
