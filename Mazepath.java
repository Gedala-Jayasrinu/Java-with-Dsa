//Possibilites of finding different ways


public class Mazepath {
    public static void main(String[] args) {
       System.out.println( maze(3, 3));
    }

    static int maze(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left=maze(r-1,c);
        int right=maze(r, c-1);
        int total= right+left;
        return total;
    }
}
