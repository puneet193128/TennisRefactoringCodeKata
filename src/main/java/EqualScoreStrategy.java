import java.util.HashMap;

public class EqualScoreStrategy implements GiveScoreStrategy {

    private static HashMap<Integer, String> defaultScoreMap;
    static {

        defaultScoreMap = new HashMap<>();
        defaultScoreMap.put(0,"Love");
        defaultScoreMap.put(1,"Fifteen");
        defaultScoreMap.put(2,"Thirty");
        defaultScoreMap.put(3,"Forty");
    }

    public String getScore(int p1, int p2)
    {
        if(p1>=3) return "Deuce";

        return defaultScoreMap.get(p1) + "-All";
    }
}
