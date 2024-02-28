//print prime numbers 0-100

public class Main {
    public static void main(String[] args) {

        //for loop to parse through numbers 0-100
        for (int x=0;x<=100;x++){

            //variable check defaults at 0 for non-prime #, change to 1 for prime #
            int check =0;

            //check if the variable is greater than 1- if not, it can't be prime
            if (x > 1) {
                //for loop to parse through all factors of x and check if any fit in evenly
                for (int y=2; y<=Math.sqrt(x); y++) {
                    if (x%y == 0) {
                        //if there is a combination with no remainder, x is prime
                        check = 1;
                    }
                }}
            //if x is 1 or 0, it's not prime
            else {
                check =1;
            }
            //print x if it is prime
            if (check == 0){
                System.out.println(x);
            }






        }}}