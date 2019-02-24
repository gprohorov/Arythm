import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by george on 17.02.19.
 */
public class ArythmeticOperationTest {
    ArythmeticOperation operation = new ArythmeticOperation(2,3);
    @Test
    public void plus() throws Exception {
        assertEquals(5, operation.plus());
    }

}