package model;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int n=1000;
        while (true){
            if (checkPrime(n)) System.out.println(n);
            n++;
        }

    }
    public boolean checkPrime(int n){
        if (n<2)return false;
        else if (n==2)return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0)return false;
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
