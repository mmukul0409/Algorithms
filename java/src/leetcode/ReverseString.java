package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        String s = "reverse";
        reverseString(s.toCharArray());
    }

    public static void reverseString(char[] s) {
        char temp = '\u0000';
        int j = s.length-1;
        
        for(int i=0;i<j ; i++){
            if(i>=j){
                break;
            }
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }

    public static void reverseStringWithoutTempVar(char[] s) {
        System.out.println("length: "+s.length/2);
        int d=0;
        if(s.length<2)
            return;
        // l 108 - e 101  d=7
        for(int i=0,j=s.length-1;i!=j&&i<=(s.length-1)/2;i++,j--){
            if(s[i]==s[j])
                continue;
            if(s[i]>s[j]){
                d=s[i]-s[j];
                s[j]=s[i];
                s[i]= (char) (s[i]-d);

            } else {
                d=s[j]-s[i];
                s[i]=s[j];
                s[j]= (char) (s[j]-d);
            }
        }
        System.out.println(s);

    }
}