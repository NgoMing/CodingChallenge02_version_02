package com.minhnln.RoundTableGame.simulator;

import com.minhnln.RoundTableGame.model.RoundTable;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class RoundTableGameTest {

    private static final int VALID_NUMBER_OF_CHILDREN = 12;
    private static final int VALID_NUMBER_TO_SKIP = 5;

    @Test
    public void roundTableShouldBeCreatedCorrectly() {
        RoundTableGame roundTableGame = new RoundTableGame();
        RoundTable roundTable = mock(RoundTable.class);

        roundTableGame.create(roundTable, VALID_NUMBER_OF_CHILDREN, VALID_NUMBER_TO_SKIP);

        verify(roundTable).init(VALID_NUMBER_OF_CHILDREN, VALID_NUMBER_TO_SKIP);
    }

}
