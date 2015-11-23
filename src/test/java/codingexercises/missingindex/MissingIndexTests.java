package codingexercises.missingindex;

import codingexercises.missingindex.MissingIndex;
import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIndexTests {

    @Test
    public void missingIndexTest() {
        int[] indexes = {1,2,3,0,5,6};
        assertEquals(4, MissingIndex.missingIndex(indexes));
    }
}