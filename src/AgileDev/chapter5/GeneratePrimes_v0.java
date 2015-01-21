/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgileDev.chapter5;

/**
 *
 * @author suse
 */

/*
Im gonna refactoring this file.
 */

public class GeneratePrimes_v0 {
    
    public static  int[] generatePrimes(int maxValue){
        if (maxValue>=2) {
            int s = maxValue+1;
            boolean[] f = new boolean[s];

            for (int i = 0; i < s; i++) {
                f[i] = true;
                
            }
            
            f[0] = f[1] = false;
            
            for (int i = 2; i < Math.sqrt(s)+1; i++) {
                for (int j = 2*i; j < s; j+=i) {
                        f[j]= false;
                }
            }
            
            int count=0;
            for (int i = 0; i < s; i++) {
                if(f[i]){
                    count++;
                }
            }
            
            int[] primes= new int[count];
            for(int i = 0,j=0; i<s; i++){
                if(f[i]){
                    primes[j++]=i; // print prime numbers;
                }
            }
            
            return primes;
        }
        
        else{
            return new int[0];
        }
        
    }
    
}
