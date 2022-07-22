//public class ReverseArray {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6};
//
//        reverseArray(arr);
//
//        for(int i : arr){
//            System.out.println(i + " ");
//        }
//    }
//
//    /**
//     * Reversing array using swap
//     * Time Complexity O(n)
//     * Space Complexity O(1)
//     * @param arr
//     */
//    static void reverseArray(int[] arr){
//        for(int i=0, j=arr.length-1;i<arr.length / 2;i++,j--){
//            int t = arr[i];
//            arr[i] = arr[j];
//            arr[j] = t;
//        }
//    }
//
//    /**
//     * Finding min and max value in an array
//     * Time Complexity: O(n)
//     * Space Complexity: O(1)
//     * @param arr
//     * @return
//     */
//    static int[] minMaxElementsInArray(int[] arr){
//        if(arr.length == 0){
//            return new int[]{-1, -1};
//        }
//
//        int min = arr[0];
//        int max = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            else if(arr[i] < min) {
//                min = arr[i];
//            }
//        }
//
//        return new int[]{min, max};
//    }
//
//
//    static int[] kthSmallest(int[] arr){
//
//        int arr2[] = {2, 1, 3, 25, 6, 17};
//        // sl: 1 sm 2
//
//        int k = 2;
//        int arr2[] = new int [2];
//
//        // sort array
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] < s){
//                s= arr[i];
//                ss = s;
//            }
//        }
//
//    }
//}
