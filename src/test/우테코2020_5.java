package test;

public class 우테코2020_5 {
    public String solution(String penter, String pexit, String pescape, String data) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        int len = penter.length();
        result.append(penter);
        for(int i = 0; i<data.length(); i+=len)
        {

            String checkData = data.substring(i,i+len);

            if (i + len == data.length())
                checkData = data.substring(i);
            if(i == data.length())
                checkData = data.substring(i);
            if (checkData.equals(penter) || checkData.equals(pexit) ||checkData.equals(pescape))
            {
                result.append(pescape);
                result.append(checkData);

            }
            else
                result.append(checkData);


        }

        result.append(pexit);
        answer = result.toString();
        return answer;
    }
}
