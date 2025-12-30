package Array;
    public class RangeSum {
        public static void main(String[] args) {
            int arr[] = {2, 4, 6, 8, 10};
            //       {0 ,0, 0, 0, 0, 0 }
            int rangeSumArr[] = new int[arr.length+1];


            //Range sum Logic
            for(int i=0; i<arr.length; i++)
            {
                rangeSumArr[i+1] = rangeSumArr[i] + arr[i];
            }

            //Printing Both Array
            for (int x : arr) {
                System.err.print(x + " ");
            }
            System.out.println();
            for (int x : rangeSumArr) 
            {
                System.out.print(x + " ");
            }
            System.out.println();
            System.out.println("Sum from 1 to 3 = " + (rangeSumArr[3+1]-rangeSumArr[1]));
            System.out.println("Sum from 0 to 2 = " + (rangeSumArr[2+1]-rangeSumArr[0]));
            System.out.println("Sum from 2 to 4 = " + (rangeSumArr[4+1]-rangeSumArr[2]));
        }
        
    }
