package Arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(roman("MCMXCIV"));
    }

    public static int roman(String s){
        Map<Character,Integer> romanList = new HashMap<>();
        romanList.put('I',1);
        romanList.put('V',5);
        romanList.put('X',10);
        romanList.put('L',50);
        romanList.put('C',100);
        romanList.put('D',500);
        romanList.put('M',1000);

        int len = s.length();
        int num = romanList.get(s.charAt(len-1));
        for(int i=len-2;i>=0;i--){
            if(romanList.get(s.charAt(i))>=romanList.get(s.charAt(i+1))){
                num += romanList.get(s.charAt(i));
            }
            else{
                num -= romanList.get(s.charAt(i));
            }
        }

        return num;
    }
}