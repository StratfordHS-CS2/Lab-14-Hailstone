public class Hailstone
{
    // startingNum is your starting number.
    // returns the number of steps it took to get to 1.
    public static int doHailstone( int startingNum )
    {
        int num = startingNum;  // use num to hold the current number value.
        int steps = 0;       // used to keep track of the number of steps it has taken.
        
        // since we don't know how many steps it will take to get to 1 we should probably
        // use a while loop to loop until we get to 1.
            // inside the while loop you'll use if statments for even and odd
            // Think: should they be two if statements, if-else, if-elseif ???
        
        // output a final report, then return.
        return steps;
    }
    
    public static void main( String[] args )
    {
        // test various values here.  I want to see output like in the readme.
    }
}