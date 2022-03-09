/*
 * 0013
 *
 * */

import java.util.HashMap;
import java.util.Map;

public class RomanToIntSolution {

    public int romanToInt(String s) {
        Map<Character,Integer> single = new HashMap<Character, Integer>(7);
        single.put('I',1);
        single.put('V',5);
        single.put('X',10);
        single.put('L',50);
        single.put('C',100);
        single.put('D',500);
        single.put('M',1000);

        int answer = 0;
        char[] array = s.toCharArray();
        for (int i =0;i<array.length;i++) {
            //IV或IX
            if ( array[i]=='I' && i+1<array.length && (array[i+1]=='V'||array[i+1]=='X')) {
                answer = answer + single.get(array[i+1]) - 1;
                i++;
                continue;
            }
            //XL或XC
            else if (array[i]=='X' && i+1<array.length && (array[i+1]=='L'||array[i+1]=='C')) {
                answer = answer + single.get(array[i+1]) - 10;
                i++;
                continue;
            }
            //CD或CM
            else if (array[i]=='C' && i+1<array.length && (array[i+1]=='D'||array[i+1]=='M')) {
                answer = answer + single.get(array[i+1]) - 100;
                i++;
                continue;
            }

            answer = answer + single.get(array[i]);
        }

        return answer;
    }
}
