
// Question 4:   Find the largest Prime number in given Array 

// Skill Mapping: Basic


// Description: WAP in Java to print the Largest Prime number from the given array of integer numbers.
public class largeprime {
    public static void main(String[] args) {
        int[] arrNum = {2,29,51,8,4,57};
        boolean val;
        int lprime=1;
        for (int num : arrNum) 
        {
         if(num <= 1)
            {
             val=false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0) 
                {
                    val=false;
                }

            }
            val=true;

         
         for (int n : arrNum) {
            if (val==true && n > lprime) {
                lprime = n;
            }
                       }

}
System.out.println(lprime);
    }
}
