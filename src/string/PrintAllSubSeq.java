package string;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSeq {
    public void printAllSubSeq(String str) {
        List<String> list = new ArrayList<>();
        solve(list , str,"",0, str.length());
        for(String st: list) {
            System.out.print(st + " ");
        }

    }//abc
    public void solve( List<String> list , String str,String subStr ,int start , int n) {

        if(start >= n) {
            if(subStr != "") list.add(subStr);
            return;
        }
        solve(list, str, subStr + String.valueOf(str.charAt(start)), start + 1, n);
        solve(list, str, subStr, start + 1, n);

    }
}
