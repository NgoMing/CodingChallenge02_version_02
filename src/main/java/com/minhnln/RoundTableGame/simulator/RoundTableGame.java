package com.minhnln.RoundTableGame.simulator;

import com.minhnln.RoundTableGame.model.RoundTable;

public class RoundTableGame {
    private RoundTable roundTable;

    public void create(RoundTable roundTable, int numberOfChildren, int numberToSkip) {
        this.roundTable = roundTable;
        roundTable.init(numberOfChildren, numberToSkip);
    }
}
