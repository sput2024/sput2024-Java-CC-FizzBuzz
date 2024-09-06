
public class Lab {
    /**
     * Return "Fizz" if a number n is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.
     *
     * This is coding problem that will make use of the modulus (%) operator, which can help us calculate if a number
     * is perfectly divisible by another number.
     * The modulus operator returns the remainder after a division (eg 8%3=2).
     *
     * If you try to copy answers from the internet, you will probably get this challenge wrong. The premise is
     * slightly simpler than the classic fizzbuzz problem.
     *
     * @param n the number that will determine the fizzbuzz result.
     * @return if a number is divisible by 3, return 'Fizz'. if a number is divisible by 5, return 'Buzz'. If
     * divisible by both, return 'FizzBuzz'. If none of these are true, return a blank string "".
     */
    public String FizzBuzzGen(int n){
        int r = 0;
        //int k = 0;
        if (Math.abs(n)%5==0 && Math.abs(n)%3==0){
           
             return "FizzBuzz";
        }
        if (Math.abs(n)%3<1){
            return "Fizz";
            
        }
        if (Math.abs(n)%5<1){
            return "Buzz";
         
        }
       // if (Math.abs(n)%5==0 && Math.abs(n)%3==0){
      //   if (r=2){
       //  return "FizzBuzz";
       // }
        
        else
        return "";
}
}
