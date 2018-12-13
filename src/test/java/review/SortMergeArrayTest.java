package review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortMergeArrayTest {

    @Test
    public void sortMergeJoinFull() {
        ArrayList arrayOne = new ArrayList();
        ArrayList arrayTwo = new ArrayList();
        SortMergeArray sortMergeArray = new SortMergeArray();

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
        SortMergeArray sortMergeArray = new SortMergeArray();

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
        SortMergeArray sortMergeArray = new SortMergeArray();

        arrayOne.addAll(Arrays.asList(1,3,5,6,8));
        arrayTwo.addAll(Arrays.asList(1,3,5,6,8));

        ArrayList resultArray = sortMergeArray.sortMergeJoin(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(5, resultArray.size());

    }

    @Test
    public void sortMergeFull() {
        int [] arrayOne = {1,2,3,4,5};
        int [] arrayTwo = {6,7,8,9,10};

        int[] resultArray = SortMergeArray.merge(arrayOne,arrayTwo);
        assertEquals(10, resultArray.length);
    }

    @Test
    public void sortMergeCrossed() {
        int [] arrayOne = {1,3,5,6,6,8};
        int [] arrayTwo = {5,6,7,7,9,11};

        int[] resultArray = SortMergeArray.merge(arrayOne,arrayTwo);
        assertEquals(12, resultArray.length);

        //--------------------------------------------
        arrayOne = new int[]{1, 3, 5, 6, 6, 8};
        arrayTwo = new int[]{5, 6, 7, 7, 9, 11};

        resultArray = SortMergeArray.merge(arrayOne,arrayTwo);
        assertEquals(12, resultArray.length);

        arrayOne = new int[]{1,2,5,7,10};
        arrayTwo = new int[]{3,5,8};

        resultArray = SortMergeArray.merge(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(8, resultArray.length);

        //--------------------------------------------
        arrayOne = new int[]{1,2,2,2,3};
        arrayTwo = new int[]{1,2,4};

        resultArray = SortMergeArray.merge(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(8, resultArray.length);

    }

    @Test
    public void sortMergeEquals() {
        int [] arrayOne = new int[]{1,3,5,6,8};
        int [] arrayTwo = new int[]{1,3,5,6,8};

        int[] resultArray = SortMergeArray.merge(arrayOne,arrayTwo);
        System.out.println(resultArray.toString());
        assertEquals(10, resultArray.length);

    }
}