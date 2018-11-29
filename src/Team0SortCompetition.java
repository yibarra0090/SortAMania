public class Team0SortCompetition extends SortCompetition
{
    public int challengeOne(int[] arr)
    {

        boolean done=false;
        while(!done)
        {
            done=true;
            for(int i=0;i<arr.length-1;i++)
            {
                int a=arr[i];
                int b=arr[i+1];
                if(a>b)
                {
                    done=false;
                    arr[i]=b;
                    arr[i+1]=a;

                }
            }
        }
        int sum =arr[5000]+arr[4999];
        int a= sum/2;
        return a;
    }


    @Override
    /*
    challengeTwo: String sorting and searching
    Data Set - an array of 10,000 random strings (strings will be of length 5)
    Task: Sort the list and determine if it contains a given string, return the index of the first instance of that string, or -1 if not found

     */
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    /*
    Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
    Task: Sort the list and return the median

     */
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    /*
    Data Set - a mostly sorted array of 100,000 integers (>75% of elements are in the correct order)
    Task: Sort the list and return the median

     */
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    /*
    Data Set - an array of 10,000 objects that implement the comparable interface
    Task: Sort the array by the compareTo method, and determine if it contains the element given. Return the position of the object, or -1 if not found.
    Hint: You must use a stable sort for this challenge, equivalent objects should stay in the same order

     */
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
}
