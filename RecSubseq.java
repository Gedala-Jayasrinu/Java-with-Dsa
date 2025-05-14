public class RecSubseq {
    public static void main(String[] args) {
     Subseq("", "abc");
    }

     static void Subseq(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);
        Subseq(p+ch, up.substring(1));
        Subseq(p, up.substring(1));
     }
}
