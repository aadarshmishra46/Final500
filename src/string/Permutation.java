package string;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public void permutation(String str) {
        List<String> list = new ArrayList<>();
        solve(list , str,0);
        for(String st: list) {
            System.out.print(st + " ");
        }
    }
    public void solve( List<String> list , String str,int start ) {
        if(start >= str.length()-1) {
            list.add(str);
            return;
        }
            for( int i =  start  ;i<str.length();i++) {
                String per = swap(str , start , i);
                solve(list, per , start + 1);
            }

    }
    public String swap( String str , int i , int j) {
        char [] arr = str.toCharArray();
        char temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
       return String.valueOf(arr);
    }
}
