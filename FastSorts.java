

public class FastSorts {

    // MERGE
    /* TODO state the best/worst/avergae time complexity AND EXPLAIN WHY
       TODO state the pre- and post-conditions for this method */

    public static int[] merge(int[] left, int[] right) {
        // TODO implement the merge algorithm
        int[] result = new int[left.length+right.length];

        int pos1 = 0, pos2 = 0;

        for(int i = 0; i < result.length; i++) {
            if(left[pos1] >= right[pos2]) {
                result[i] = right[pos2];
                if(pos2 < right.length) {
                    pos2++;
                }
            }
            else if(left[pos1] < right[pos2]) {
                result[i] = left[pos1];
                if(pos1 < left.length) {
                    pos1++;
                }
            }
        }

        if(left[0] > right[0]) {
        }

        return new int[]{};
    }

    // TOP DOWN MERGE SORT
    /* TODO state the best/worst/avergae time complexity AND EXPLAIN WHY
       TODO state the pre- and post-conditions for this method */

    public static void tdMergeSort(int[] array, int start, int end) {
        // TODO implement top-down merge sort
        int len1 = 0
    }

    // BOTTOM UP MERGE SORT
    /* TODO state the best/worst/avergae time complexity AND EXPLAIN WHY
       TODO state the pre- and post-conditions for this method */

    public static void buMergeSort(int[] array) {
        // TODO implement bottom-up merge sort
    }

    // QUICKSORT
    /* TODO state the best/worst/avergae time complexity AND EXPLAIN WHY
       TODO state the pre- and post-conditions for this method */

    public static void quicksort(int[] array, int start, int end) {
        // TODO implement quicksort
    }


    public static void main(String[] args) {
        // TODO write test cases for each method
    }

}