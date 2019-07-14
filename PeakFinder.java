import java.lang.*;

class PeakFinder {
    public static void main(String[] args) {

        int[] numbersCollection = {1,1,2,1};
        int arrayLength = numbersCollection.length;
        int lastIndex = arrayLength - 1;
        int firstIndex = 0;
        if (numbersCollection.length < 1) {
            System.out.println("WHAT YOU WANT TO CHECK LOL");
        } else if (numbersCollection.length < 2) {
            System.out.println("Peak is:" + numbersCollection[firstIndex]);
            return;
        } else if (numbersCollection[firstIndex] > numbersCollection[firstIndex + 1]) {
            System.out.println("Peak is:" + numbersCollection[firstIndex]);
            return;
        } else if (numbersCollection[lastIndex] > numbersCollection[lastIndex - 1]) {
            System.out.println("Peak is:" + numbersCollection[lastIndex]);
            return;
        }
        for (int i = 1; i < arrayLength - 1; i++) {
            if (numbersCollection[i] > numbersCollection[i - 1] && numbersCollection[i] > numbersCollection[i + 1]) {
                System.out.println("Peak is:" + numbersCollection[i]);
                return;
            }
        }
    }
}


