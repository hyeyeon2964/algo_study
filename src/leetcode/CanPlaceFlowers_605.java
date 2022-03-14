package leetcode;

public class CanPlaceFlowers_605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean answer = false;

        if(n == 0)
            return true;

        for(int i = 0; i<flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (flowerbed.length-1 == i || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                i++;
            }
        }

        if(n <= 0)
            answer = true;

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(canPlaceFlowers (new int[] {0}, 1));
    }
}
