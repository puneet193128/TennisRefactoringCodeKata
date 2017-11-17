import java.util.HashMap;

public class WinnerDeuceScoreStrategy implements GiveScoreStrategy {

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
        String score = "";
        int minusResult = p1-p2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
            //else if (minusResult == 0) score = "Deuce";
        else score ="Win for player2";
        return score;
    }
}
