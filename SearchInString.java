

public class SearchInString {
public static void main(String[] args) {
String name= "jaya";
char target='y';
System.out.print(seastring(name,target));
}

static boolean seastring(String str,char target) {
	
	for(int i=0;i<=str.length();i++) {
		if(target==str.charAt(i)) {
			return true;
		}
	}
	return false;
}
}
