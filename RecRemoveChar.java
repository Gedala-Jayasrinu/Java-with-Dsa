/*This program used to demonstrate the removal of a charcter from a string using recusrsive approach here the 'P'
signifies the processed string and up signifies the unprocessed string */


public class RecRemoveChar {
    public static void main(String[] args) {
        skip("", "JAiiiaaaaa");
    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt((0));
        if(ch=='a'|| ch=='A'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
}
