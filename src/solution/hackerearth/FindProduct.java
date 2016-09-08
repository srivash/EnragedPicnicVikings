package solution.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Srivashdev T C on 07/09/2016.
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
 */
public class FindProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] inputArray = new int[Integer.parseInt(line)];
        line = br.readLine();
        String[] numbers = line.split("\\s+");
        for(int i = 0; i < numbers.length; i++) {
            inputArray[i] = Integer.parseInt(numbers[i]);
        }
        System.out.print(doProduct(inputArray));
    }

    public static int doProduct(int[] numbers) {
        BigInteger result = new BigInteger("1");
        int tempNumber = (int) Math.pow(10,9);
        tempNumber = tempNumber + 7;
        BigInteger modVal = new BigInteger("" + tempNumber + "");
        for(int number : numbers){
            result = result.multiply(new BigInteger("" + number + ""));
            result = result.mod(modVal);
        }
        return  result.intValue();
    }
}
