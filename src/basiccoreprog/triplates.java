package basiccoreprog;

public class triplates {
    public static void main(String[] args) {

        int [] arr = {3 ,-1,-7,-4,-5,9,10};

        for (int i = 0; i < arr.length; i++) {
            int first_number = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second_number = arr[j];
                for (int k = j + 1; j < arr.length; j++) {
                    int third_number = arr[k];

                    int sum = first_number + second_number + third_number;
                    if (sum == 0) {
                        System.out.println( + first_number + "," + second_number + "," + third_number + "");
                    }
                }
            }
        }

    }
}


