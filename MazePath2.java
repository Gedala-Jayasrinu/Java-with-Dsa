import java.util.ArrayList;

public class MazePath2 {
    public static void main(String[] args) {
        // maze("", 3, 3);
        System.out.println(mazeRet("", 3, 3));
    }

    static void maze(String p,int r,int c){
        if(r==1 && c==1){
        System.out.println(p);
        return;
    }
    if(r>1){
        maze(p + "D", r-1, c);

    }
    if(c>1){
        maze(p + "R", r, c-1);
    }

}


   static ArrayList<String> mazeRet(String p,int r,int c){
       
    if(r==1 && c==1){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list = new ArrayList<>();
    if(r>1){
       list.addAll( mazeRet(p + "D", r-1, c));

    }
    if(c>1){
       list.addAll(mazeRet(p + "R", r, c-1));
    }
    return list;

}
}