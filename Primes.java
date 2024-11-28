public class Primes {
    public static void main(String[] args) {
        int [] processed = new int [args.length];
        boolean [] isPrime = new boolean[args.length + 1]; 
        for(int i = 0; i < args.length; i++) { 
            processed[i] = Integer.parseInt(args[i]); 
        }
        for(int i = 0; i < isPrime.length; i++) { 
            if(processed[i] > 1) { 
                isPrime[i] = true; 
            }
        }
        int p = 2; 
        while(p <= Math.sqrt(args.length)) { 
            for(int k = p * 2; k < isPrime.length; k = k + p) { 
                isPrime[k] = false; 
            }
            p++; 
        }
        for(int i = 2; i < isPrime.length; i++){ 
            if(isPrime[i]) { 
                System.out.println(i);
            }
        }
        } 
    }