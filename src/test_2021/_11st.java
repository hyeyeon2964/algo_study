package test_2021;

import java.util.HashMap;

public class _11st {
    public static String solution(String[] phone_numbers, String[] phone_owners, String number) {
        // write your code in Java SE 11

        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i<phone_numbers.length; i++) {
            map.put(phone_numbers[i], phone_owners[i]);
        }
        if(map.containsKey(number)) {
            return (map.get(number));
        }
        else {
            return number;
        }
    }
    public static void main(String[] args) {

    }
}
