package leetcode;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;

        for(int i = 0; i<triangle.size(); i++) {

            List<Integer> list = triangle.get(i);
            Integer min = list.stream().mapToInt(x -> x).min().orElseThrow(NoSuchElementException::new);
            if(min < 0) {
                for(int j = 0; j<list.size(); j++) {
                    Collections.sort(list);
                    if(min < 0 && min < list.get(j))
                        min = list.get(j);
                }
            }
            result += min;
        }
        return result;
    }
}
