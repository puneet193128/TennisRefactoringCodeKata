import java.util.HashMap;

public class DefaultScoreStrategy implements GiveScoreStrategy {

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
        String scorePlayer1 = defaultScoreMap.get(p1);
        String scorePlayer2 = defaultScoreMap.get(p2);
        return defaultScoreMap.get(p1) + "-" + defaultScoreMap.get(p2);
    }
}
