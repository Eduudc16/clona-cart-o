public class car2 {
    
 public static void main(String[] args) {
        
        int [] [] cars  = { {1,2,3,4,}, // linha 0
                            {5,6,7,8 }, // linha 1
                            {9,10,11,12}}; // linha 2

        
        for (int i = 0; i < cars.length; ++ i) {
        for( int j = 0; j < cars [i].length; ++j) {
        cars [i] [j] = cars [i] [j] * 5;
        System.out.print(" " + cars [i] [j] + " ");

        }
        System.out.println(" ");

        }
    }
}

