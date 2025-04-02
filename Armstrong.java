
public class Armstrong {
    public static void main(String[] args) {
        int n=150;
        int temp=n;
        int sum=0,r;

        while(n>0){
            r=n%10;
            n=n/10;
            sum= sum+r*r*r;
        }
        if(sum==temp) {
            System.out.println("It is Armstrong number");
        }else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
