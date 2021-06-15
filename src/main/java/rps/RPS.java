package rps;

import static rps.Result.*;
import static rps.Throw.*;

public class RPS {
    static Result play(Throw p1, Throw p2) {
        if (p1 == p2) {
            return TIE;
        }

        if (p1 == ROCK && p2 == SCISSORS ||
                p1 == PAPER && p2 == ROCK ||
                p1 == SCISSORS && p2 == PAPER) {
            return P1_WINS;
        }

        return P2_WINS;
    }
}
