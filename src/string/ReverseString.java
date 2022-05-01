package string;

public class ReverseString {
    public void reverseString(char[] s) {
       //two pointer approch
        twoPointer(s);

    }
    public void twoPointer(char[] s){
        int l=0;
        int r=s.length-1;
        while (l<r){
            s[l] ^= s[r];
            s[l] ^= s[r];
            s[l] ^= s[r];
            l++;
            r--;
        }
        for (char c: s) {
          //  System.out.print(c);
        }
    }
    //tc:O(n/2)
    /*

 ABCD  for(               )
 BCDA
 ABCDABCD
 DABC
 ABCD




    */
}
