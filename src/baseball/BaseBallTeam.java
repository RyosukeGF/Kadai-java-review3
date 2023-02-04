package baseball;

public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;
    //private double rate;

    //引数　なし　コンストラクタ
    public BaseBallTeam() {
    }

    //引数　あり　コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        //System.out.println("引数　あり　コンストラクタ発動");

        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //値を入れなおさないので、不要。
    public void setName(String name) {
        this.name = name;
    }

       public double getRate() {
        double rate = (double)win / (win + lose);
        return rate;
    }

    public void report() {
        System.out.println(name + "の2022年の成績は" +win+ "勝" +lose+ "敗" +draw+ "分、勝率は" + getRate() + "です。");
    }


}
