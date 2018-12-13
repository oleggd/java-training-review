package review;

import java.util.ArrayList;

public class SortMergeArray {

    public ArrayList<Integer> sortMergeJoin(ArrayList<Integer> arrayOne, ArrayList<Integer> arrayTwo) {

        int i = 0;
        int j = 0;
        Integer valueOne = 0;
        Integer valueTwo = 0;
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        while (i < arrayOne.size() || j < arrayTwo.size()) {

            if (i < arrayOne.size()) {
                valueOne = arrayOne.get(i);
            }
            if (j < arrayTwo.size()) {
                valueTwo = arrayTwo.get(j);
            }

            if ( i < arrayOne.size() && ((valueOne.compareTo(valueTwo)) < 0)) {
                resultArray.add(valueOne);
                i++;
            } else if ((valueOne.compareTo(valueTwo) == 0)) {
                resultArray.add(valueTwo);
                i++;
                j++;
            }
            else if (j < arrayTwo.size() ) {
                resultArray.add(valueTwo);
                j++;
            } else {
                resultArray.add(valueOne);
                i++;
            }
        }
        return resultArray;
    }

    public static int[] merge(int[] a, int[] b) {
        int[] answer = new int[a.length + b.length];
        int i = a.length - 1, j = b.length - 1, k = answer.length;

        while (k > 0)
            answer[--k] = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];

        return answer;
    }
}
