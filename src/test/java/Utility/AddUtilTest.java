package Utility;

import com.example.utility.AddUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddUtilTest {
    @Test
    public void testAdd() {
        int result = AddUtil.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAddWithNegativeNumbers() {
        int result = AddUtil.add(-2, 3);
        Assertions.assertEquals(1, result);
    }
}
