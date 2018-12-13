package review;

import java.util.ArrayList;

public class SorMergeArray {

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
}
