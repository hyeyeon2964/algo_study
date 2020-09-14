package programmers.level2;

public class 라인5 {
    public static String[] solution(String[][] dataSource, String[] tags){
        String[] answer;
        int[] arr = new int[dataSource.length];

        for(int i = 0; i<dataSource.length; i++){
            for(int j =1; j < dataSource.length; j++){
                int count = 0;
                for(int k = 0; k<tags.length; k++){
                    if(dataSource[i][j].equals(tags[k]))
                        count++;
                }

            }
        }


    }
}
