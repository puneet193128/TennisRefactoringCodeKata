public class TennisFactory {

    public GiveScoreStrategy getStrategy(int p1Score, int p2Score)
    {
        if(p1Score == p2Score)
        {
            return new EqualScoreStrategy();
        }
        else if (p1Score >= 4 || p2Score >=4)
        {
            return new WinnerDeuceScoreStrategy();
        }
        else return new DefaultScoreStrategy();
    }
}
