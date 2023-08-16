package problems1;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(countChar("seongsookim", 's'));
    }
    static int countChar(String s, char c){
         int count = 0;
         for(int i =0;i<s.length();i++){
             if(s.toUpperCase().charAt(i) == Character.toUpperCase(c)) count++;
         }
        return count;
    }
}
