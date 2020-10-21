package cs1;
import java.util.*;
public class SortingUserInputtedArray {
	
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        //Step 1: Ask user for input for rows and columns for 2d array
        System.out.println("Enter the rows for the 2d array: ");
        int row = input.nextInt();
        System.out.println("Enter the columns for the 2d array: ");
        int coluumn = input.nextInt();

        //Step 2: Ask user to enter the values for 2d array and traverse thru array and store
        System.out.println("Enter the values for the 2d array: ");
        //declaring and initializing array
        int numbers[][]=new int[row][coluumn];
         //traversing thru array
         for(int a=0; a<row;a++){
             for(int b=0; b<coluumn;b++){
            	 numbers[a][b]=input.nextInt();
             }
          }

         //Step 3: Print unsorted array (Println + original unsorted user inputed array)
        System.out.println("Unsorted array:");
        printArray(numbers, row, coluumn);//method call for print array to print original unsorted array
        
        //Step 4b: Print sorted array (after sorting)
        System.out.println("              ");//println for spacing
        System.out.println("Sorted array: ");

        sort(numbers, row, coluumn);//method call for sort method with specified parameters to sort unsorted array 
        printArray(numbers, row, coluumn);//method call to print array after array has been sorted

    }

    // Step 4a: Method for Sorting the 2D Array using discussed sort technique
    //using selection sort to sort array
    //requires using a nested for loop to traverse
    //outer loop selects one element
    //inner loops compare that element to rest of elements
    public static void sort(int[][] numbers, int row, int coluumn) {
        int t=0;
		for(int a=0;a<row;a++){//outer for loop 
        
			for(int b=0;b<coluumn;b++){//outer for loop
            
                for(int c=0;c<row;c++){//inner for loop  
                
                    for(int d=0;d<coluumn;d++){//inner for loop 
                    
                        if(numbers[c][d]>numbers[a][b]){//comparison logic if statement 
                        
                            t = numbers[a][b];//setting the array equal to a variable
                            numbers[a][b] = numbers[c][d];//Swapping min element with 1st element in array
                            numbers[c][d] = t;
                        }
                    }
                }
            }
        }
    }
    
    //Method associated with steps 3 and 4b for printing array (unsorted first then sorted after sort method call)
   public static void printArray(int[][] numbers, int row, int coluumn){
	   //traversing thru array and printing array
	     for(int a=0;a<row;a++){
	               for(int b=0;b<coluumn;b++){
	                   System.out.print(numbers[a][b]+" ");//formatting array to look like grid 
	               }
	               System.out.println();//formatting array to look like grid 
	           }
	   }
}