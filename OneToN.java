public class OneToN {
    public static void main(String[] args) {
        seq(5);
    }

    static void seq(int n){
        if(n==0){
            return;
        }
        seq(n-1);
        System.out.println(n);
    }
}
