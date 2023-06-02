// Consider an array with N number of multiple integers. Find below values - 
// The element with the Minimum value 
// The element with the Maximum value 
// Average of all array elements
// Total number of array elements (Count).
// Sample input : arrNum = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55}
// Output : The element with the Minimum value: 13
// The element with the Maximum value: 76
// Average of all array elements: 42
// Total number of array elements: 10

// Question 2:   Reverse the Array elements
// Question 3: Sort the Array elements in ascending order and descending order
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class assaignment1array {
    /**
     * @param args
     */
    public static void main(String[] args )
    {
        
            Integer[] arraNum = {31, 42, 25, 22, 56,  61, 13, 45, 76, 55};
            final List<Integer> listsorted=new ArrayList<>(Arrays.asList(arraNum));
            int total=0;
            int n=0;
            int min=Collections.min(listsorted);
            int max=Collections.max(listsorted);
        int avg=0;
            Collections.sort(listsorted);
        for(int i:listsorted)
        {
            total +=i;
            n +=1;
            
        }
        avg=total/n;
        System.out.println(listsorted);
        System.out.println("The element with the Minimum value:"+min);
        System.out.println("The element with the MAX value:"+max);
        System.out.println("The element with the Average:"+avg);
        System.out.println("The element with the total count:"+n);


Collections.reverse(listsorted);
    System.out.println("reverse order:"+listsorted);
    // 
}
}