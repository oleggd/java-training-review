package review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SorMergeArrayTest {

    @Test
    public void sortMergeJoinFull() {
        ArrayList arrayOne = new ArrayList();
        ArrayList arrayTwo = new ArrayList();
        SorMergeArray sortMergeArray = new SorMergeArray();

        arrayOne.addAll(Arrays.asList(1,2,3,4,5));
        //
        arrayTwo.addAll(Arrays.asList(6,7,8,9,10));

        ArrayList resultArray = sortMergeArray.sortMergeJoin(arrayOne,arrayTwo);
        assertEquals(10, resultArray.size());
    }

    @Test
    public void sortMergeJoinCrossed() {
        ArrayList arrayOne = new ArrayList();
        ArrayList arrayTwo = new ArrayList();
        int i = 0;
        SorMergeArray sortMergeArray = new SorMergeArray();

        arrayOne.addAll(Arrays.asList(1,3,5,6,6,8));
        arrayTwo.addAll(Arrays.asList(5,6,7,7,9,11));
        //
        ArrayList resultArray = sortMergeArray.sortMergeJoin(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(10, resultArray.size());
        //--------------------------------------------
        arrayOne.clear();
        arrayOne.addAll(Arrays.asList(1,2,5,7,10));
        //
        arrayTwo.clear();
        arrayTwo.addAll(Arrays.asList(3,5,8));

        resultArray = sortMergeArray.sortMergeJoin(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(7, resultArray.size());

        //--------------------------------------------
        arrayOne.clear();
        arrayOne.addAll(Arrays.asList(1,2,2,2,3));
        //
        arrayTwo.clear();
        arrayTwo.addAll(Arrays.asList(1,2,4));

        resultArray = sortMergeArray.sortMergeJoin(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(6, resultArray.size());

    }

    @Test
    public void sortMergeJoinEquals() {
        ArrayList arrayOne = new ArrayList();
        ArrayList arrayTwo = new ArrayList();
        SorMergeArray sortMergeArray = new SorMergeArray();

        arrayOne.addAll(Arrays.asList(1,3,5,6,8));
        arrayTwo.addAll(Arrays.asList(1,3,5,6,8));

        ArrayList resultArray = sortMergeArray.sortMergeJoin(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(5, resultArray.size());

    }
}