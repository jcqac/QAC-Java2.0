/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class PrimeSieve { 
    private int n;
    boolean[] primeNo;
    
    /**
     * Constructor
     * x+1 used so that the last value of the array could be used.
     * @param x
     */
    public PrimeSieve (int x){
        n=x;
        primeNo = new boolean[n+1];
    }
    
    /**
     * Uses Sieve of Eratosthenes algorithm
     * Method that starts to mark non-prime numbers as false
     * Starts at 2 as 1 is not a prime number
     * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     */
    private void nonPrimes(){
        for (int i = 2; i*i <= n; i++) {
           //Initally Multiples of n (2) are marked as false, then multiples of n+1
            // e.g multiples of 2 then 3 ....
            if(!primeNo[i]){
                for (int x = i; i*x <=n; x++) {
                    primeNo[i*x] = true;
                }
            }
        }
    }
    
    /**
     * Public method to calculate prime numbers
     * @return 
     */
    public int calPrime()
    {
        nonPrimes();
        for(int i = 2; i<=n; i++)
        {
            if (!primeNo[i]){
                return i;
            }
        }
        return 0;
    }   
    
    public void test()
    {
        nonPrimes();
        for(int i = 2; i<=n; i++){
            if (!primeNo[i])
            {
                System.out.println(i);
            }
        }
    }
}

