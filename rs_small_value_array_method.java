public class rs_small_value_array_method {
    public static void main(String[] args){
        int []arr = {4,12,7,8,1,6,9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[index]){
            index = 1;
             }
          }
        return index;
    }
}