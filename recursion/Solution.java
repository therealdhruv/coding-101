package recursion;

// importing statements
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;





public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        int skillLevelCount = Integer.parseInt(br.readLine().trim());

        List <Integer> skillLevel = IntStream.range(0, skillLevelCount).mapToObj(i -> {
                    try {
                        return br.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int minDiff = Integer.parseInt(br.readLine().trim());

        int result = Result.maxPairs(skillLevel, minDiff);

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();
    }
}



class Result {

    /*
     * Complete the 'maxPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY skillLevel
     *  2. INTEGER minDiff
     */

    public static int maxPairs(List<Integer> skillLevel, int minDiff) {
        // Write your code here
        skillLevel.sort(Comparator.naturalOrder());
        int n = skillLevel.size();
        int i = 0;
        List<Integer> x = new ArrayList<>();
        for (int j = 0; j < n / 2; j++) {
            while (i < n && skillLevel.get(i) - skillLevel.get(j) < minDiff) {
                i++;
            }
            if (i >= n) {
                break;
            }
            x.add(i);
        }
        x = x.subList(0, Math.min(n / 2, x.size()));
        int ans = 0;
        int k = n - 1;
        for (int y : x) {
            if (y <= k) {
                ans++;
                k--;
            }
        }
        return ans;
    }

}
