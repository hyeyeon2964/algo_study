package test;

public class WinterCoding1 {
    public String solution(int n, int[][] delivery) {
        String answer = "";
        String[] result = new String[n];

        for(int i = 0; i<result.length; i++)
        {
            result[i] = ".";
        }

        for(int i = 0; i<delivery.length; i++)
        {
            int[] deliveryInfo = delivery[i];

            if (deliveryInfo[2] == 1)
            {
               result[deliveryInfo[0]-1] = "O";
               result[deliveryInfo[1]-1] = "O";
            }
            else
            {
                if (result[deliveryInfo[0]-1] == "O")
                {
                    result[deliveryInfo[1]-1] = "X";
                }
                else if (result[deliveryInfo[1]-1] == "O")
                {
                    result[deliveryInfo[0]-1] = "X";
                }
                else if (result[deliveryInfo[0]-1] == "X" && result[deliveryInfo[1]-1] == "X")
                {
                    continue;
                }
                else if (result[deliveryInfo[0]-1] == "X")
                {
                    result[deliveryInfo[1] - 1] = "?";
                }
                else if(result[deliveryInfo[1]-1] == "X")
                {
                    result[deliveryInfo[0]-1] = "?";
                }
                else
                {
                    result[deliveryInfo[0]-1] = "?";
                    result[deliveryInfo[1]-1] = "?";
                }
            }

        }

        for(int i = 0; i<delivery.length; i++)
        {
            int[] deliveryInfo = delivery[i];

            if (deliveryInfo[2] == 1)
            {
                result[deliveryInfo[0]-1] = "O";
                result[deliveryInfo[1]-1] = "O";
            }
            else
            {
                if (result[deliveryInfo[0]-1] == "O")
                {
                    result[deliveryInfo[1]-1] = "X";
                }
                else if (result[deliveryInfo[1]-1] == "O")
                {
                    result[deliveryInfo[0]-1] = "X";
                }
                else if (result[deliveryInfo[0]-1] == "X" && result[deliveryInfo[1]-1] == "X")
                {
                    continue;
                }
                else if (result[deliveryInfo[0]-1] == "X")
                {
                    result[deliveryInfo[1] - 1] = "?";
                }
                else if(result[deliveryInfo[1]-1] == "X")
                {
                    result[deliveryInfo[0]-1] = "?";
                }
                else
                {
                    result[deliveryInfo[0]-1] = "?";
                    result[deliveryInfo[1]-1] = "?";
                }
            }

        }

        for(String s : result)
        {
            if(s != ".")
            {
                answer += s;
            }
            else
                answer += "?";
        }
        return answer;
    }
}
