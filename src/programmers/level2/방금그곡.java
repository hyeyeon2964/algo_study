package programmers.level2;

public class 방금그곡 {
    public int getTime(String start, String end)
    {
        int result = 0;
        String[] startTime = start.split(":");
        String[] endTime = end.split(":");

        int time1 = Integer.parseInt(startTime[0]);
        int time2 = Integer.parseInt(endTime[0]);

        result += (time2 - time1) * 60;
        result += Integer.parseInt(endTime[1]) - Integer.parseInt(startTime[1]);

        return result;
    }
    public String playMusic(String music, int time)
    {
        String result = "";

        if(music.length() < time)
        {
            result += music;
            while(time > 0)
            {
                if(time >= music.length())
                {
                    result += music;
                    time -= music.length();
                }
                else
                {
                    result += music.substring(0, time-1);
                    break;
                }
            }
        }
        else
        {
            result += music.substring(0, time-1);
        }
        return result;
    }
    public String solution(String m, String[] musicinfos) {
        String answer = "`(None)`";
        int playTime = 0;
        int maxPlayTime = 0;
        for (int i = 0; i < musicinfos.length; i++)
        {
            String[] info = musicinfos[i].split(",");
            playTime = getTime(info[0], info[1]);
            String music = playMusic(info[3], playTime);
            if(music.contains(info[3]))
            {
                if(maxPlayTime < playTime)
                {
                    answer = info[2];
                    maxPlayTime = playTime;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    }
}
