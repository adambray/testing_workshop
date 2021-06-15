package history;

import rps.Result;

public class Round {
    private Long id;
    private String player1;
    private String player2;
    private Result result;

    public Round(String player1, String player2, Result result) {
        this.player1 = player1;
        this.player2 = player2;
        this.result = result;
    }

    public Round(long id, String player1, String player2, Result result) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Result getResult() {
        return result;
    }
}
