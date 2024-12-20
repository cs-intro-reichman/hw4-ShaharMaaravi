public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]); 
        boolean [] isPrime = new boolean[n + 1]; 
        System.out.println("Prime numbers up to " + n + ':');
       
        for(int i = 0; i < isPrime.length; i++) { 
            if(i > 1) { 
                isPrime[i] = true; 
            }
        }
        int p = 2; 
        while(p <= Math.sqrt(n)) { 
            for(int k = p * 2; k < isPrime.length; k = k + p) { 
                isPrime[k] = false; 
            }
            p++; 
        }
        int count = 0;
        for(int i = 2; i <= n; i++){ 
            if(isPrime[i]) { 
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int) (((double)count/n)*100) + "% are primes)");
        } 
    }