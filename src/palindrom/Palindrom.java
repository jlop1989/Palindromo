
package palindrom;

public class Palindrom {
    public static boolean isPalindrom(int number){
        String strNumber = String.valueOf(number);
        if(strNumber.length()==1) return true;
            for(int i=0,j=strNumber.length()-1;i<strNumber.length()/2 && j>=strNumber.length()/2;i++,j--){
                if(strNumber.charAt(i)!=strNumber.charAt(j))
                    return false;
            }
            return true;
        
        
    }

}
