
public class Fibonacci {

    public static void main(String[] args) {
        int n=20;
        for(int i=0;i<=n;i++){

        System.out.println(fibb(i)+" ");
    }
    }
    
    static int fibb(int n) {

        if(n<2) {
            return n;
        }
        return fibb(n-1)+ fibb(n-2);
    }
}



 /* public class Fibonacci {

    public static void main(String[] args) {
        
        System.out.print(fibb(6));
    }

    static int fibb(int n) {

        if(n<2) {
            return n;
        }
        return fibb(n-1)+ fibb(n-2);
    }
}*/