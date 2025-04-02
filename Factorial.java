import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    // for(int i=0;i<=n;i++){
        System.out.println(fact(n));
sc.close();
    }

static int fact(int n){
    if(n==0 || n==1){
        return 1;
    }
return n*fact(n-1);

}

}
// sc.close();