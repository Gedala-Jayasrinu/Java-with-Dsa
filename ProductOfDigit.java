// Product Of A Digit
// EX:- 256 = 2*5*6=60

public class ProductOfDigit {
    public static void main(String[] args) {
        int ans=prod(256);
        System.out.println(ans);
    }

    static int prod(int n){
        if (n%10==n){
            return n;
        }
return (n%10) * prod(n/10);
    }
}
