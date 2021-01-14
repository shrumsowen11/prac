/*
public class MoreThanNbyK {
     int[] arr;

    public  static int counter(int countI) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (countI == arr[i]){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int arrDivider = 3;
        //we can do like this also to access the instance variables.
 MoreThanNbyK moreThanNbyK = new MoreThanNbyK();
      int [] a = moreThanNbyK.arr;

        arr = new int[]{2, 2, 1, 1, 7, 7, 7, 4, 4, 5};
        int moreThan = arr.length / arrDivider;
        int totalI = 0, newValueI = 0, newTotalI = 0, valueI = 0;
        for (int i = 0; i < arr.length; i++) {
            valueI = arr[i];
            totalI = counter(valueI);
            if (totalI >= moreThan) {
                newValueI = valueI;
                newTotalI = totalI;
            }
        }
        System.out.println(newValueI+ " is "+newTotalI+" times in the give array.");
    }


}
*/
