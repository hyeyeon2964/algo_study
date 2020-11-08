package test;

public class 우테코2020 {
    public int solution(String[] grades, int[] weights, int threshold) {
        int answer = 0;

        for(int i = 0; i<grades.length; i++)
        {
            switch (grades[i]) {
                case "A+" : {
                    answer = answer + (10 * weights[i]);
                    break;
                }
                case "A0" : {
                    answer = answer + (9 * weights[i]);
                    break;
                }
                case "B+" : {
                    answer = answer + (8 * weights[i]);
                    break;
                }
                case "B0" : {
                    answer = answer + (7 * weights[i]);
                    break;
                }
                case "C+" : {
                    answer = answer + (6 * weights[i]);
                    break;
                }
                case "C0" : {
                    answer = answer + (5 * weights[i]);
                    break;
                }
                case "D+" : {
                    answer = answer + (4 * weights[i]);
                    break;
                }
                case "D0" : {
                    answer = answer + (3 * weights[i]);
                    break;
                }
                case "F" : {
                    answer = answer + (0 * weights[i]);
                    break;
                }

            }

        }
        return answer-threshold;
    }

}
