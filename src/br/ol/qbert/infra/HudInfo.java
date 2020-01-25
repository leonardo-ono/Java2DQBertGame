package br.ol.qbert.infra;

/**
 * HudInfo class.
 * 
 * Keep information about the number of lives, etc.
 * 
 * Reference:
 * https://strategywiki.org/wiki/Q*bert/Walkthrough
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class HudInfo {
    
    public static int lives;
    public static int score;
    public static int hiscore;
    
    public static void reset() {
        lives = 4;
        score = 0;
        LevelInfo.level = 1;
        LevelInfo.round = 1;
    }
    
    public static void addScore(int point) {
        score += point;
        if (score > hiscore) {
            hiscore = score;
        }
    }
    
    public static String getScoreStr() {
        String scoreStr = "0000000" + score;
        scoreStr = scoreStr.substring(scoreStr.length() - 7, scoreStr.length());
        return scoreStr;
    }

    public static String getHiscoreStr() {
        String hiscoreStr = "0000000" + hiscore;
        hiscoreStr = hiscoreStr.substring(
            hiscoreStr.length() - 7, hiscoreStr.length());
        
        return hiscoreStr;
    }    
}