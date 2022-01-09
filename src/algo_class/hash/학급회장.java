package algo_class.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 학급회장 {
    public static void solution(int n, String str) {
        String[] vote = str.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++) {
            map.put(vote[i], map.getOrDefault(vote[i], 0)+1);
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list.get(map.size()-1).getKey());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        solution(n, str);

    }
}
