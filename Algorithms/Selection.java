
public class Selection {
   public static void main(String[] args) {
       int arr[] = {10,6,3,7,1,4,9,5};
       int temp, aux = 0;
       Print(arr);
       for (int i=0; i<arr.length; i++) {
           temp = arr[i]; aux = i;
           for (int j=i+1; j<arr.length; j++) {
               if (temp > arr[j]) {
                   temp = arr[j];
                   aux = j;
                }
            }
            arr[aux] = arr[i];
            arr[i] = temp;
        }
        Print(arr);
    }
    private static void Print(int[] arr) {
      for(int i=0;i<arr.length;i++) {
          if ((i+1)%10 != 0) {
              System.out.print(arr[i]+"-");
          } else {System.out.println(arr[i]+"-");}
      }
      System.out.println("");
  }
}
