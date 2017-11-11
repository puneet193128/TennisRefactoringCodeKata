import java.util.HashMap;

public class TennisGame1 implements TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;
    private static HashMap<Integer, String> defaultScoreMap;

    static {

        defaultScoreMap = new HashMap<>();
        defaultScoreMap.put(0,"Love");
        defaultScoreMap.put(1,"Fifteen");
        defaultScoreMap.put(2,"Thirty");
        defaultScoreMap.put(3,"Forty");
    }

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        int scoreDifference = getScoreDifference();
        if (m_score1 == m_score2)
        {
            String scorePlayer1 = defaultScoreMap.get(m_score1);
            if(m_score1 >= 3) return "Deuce";
            return scorePlayer1 + "-All";
        }
        else if (m_score1 >= 4 || m_score2 >= 4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else if (minusResult == 0) score = "Deuce";
            else score ="Win for player2";
        }
        else
        {
            String scorePlayer1 = defaultScoreMap.get(m_score1);
            String scorePlayer2 = defaultScoreMap.get(m_score2);
            return defaultScoreMap.get(m_score1) + "-" + defaultScoreMap.get(m_score2);
        }
        return score;
    }

    private int getScoreDifference()
    {
        return m_score1 - m_score2;
    }
}
