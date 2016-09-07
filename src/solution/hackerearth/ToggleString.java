package solution.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Problem description : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string
 */
public class ToggleString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(doToggle(line));

    }
    public static String doToggle(String line) {
        char[] charArray = line.toCharArray();
        ArrayList<Character> result = new ArrayList<>();
        for (char c : charArray) {
            if ( (c >= 65) && (c <= 90)){
                result.add((char) (c + 32));
            }
            else {
                result.add((char) (c - 32));
            }
        }
        StringBuilder resultString = new StringBuilder();
        for(Character c:result){
            resultString.append(c);
        }

        return resultString.toString();
    }
}
