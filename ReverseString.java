
public class ReverseString {
    public static void main(String[] args) {

        String str="JayaSrinu";
        String reversestr="";
        char ch ;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reversestr=ch+reversestr;

        }
        System.out.println(reversestr);
    }

}
