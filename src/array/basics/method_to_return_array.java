package array.basics;
 class method_to_return_array {
     public static int[] method()
     {
         return new int[] {1, 2, 3 };
     }
        public static void main(String args[])
        {
            int arr[] = method();
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }

    }
