package baseball;

public class Review3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam chunichi = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);


        tokyo.report();
        yokohama.report();
        hanshin.report();
        yomiuri.report();
        hiroshima.report();
        chunichi.report();

    }

}
