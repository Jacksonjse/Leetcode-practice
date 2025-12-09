class Solution {
    public int countPrimes(int n) {
         if(n<=1) return 0;
         boolean []primes = new boolean[n+1];
         primes[0] = primes[1] = true;
         for( int i = 2 ; i< n+1; i++)
         {
             if( primes[i] == true) continue;
             for( int j = i*2; j<=n ; j+=i)
               primes[j] = true;
         }
         
         int r = 0;
         for( int i = 0; i< n; i++)
            if( primes[i]==false) r++;
        
        return r;
     }
 
 }