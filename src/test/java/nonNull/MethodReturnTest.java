package nonNull;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mtumilowicz on 2018-06-27.
 */
class MethodReturnTest {
    @Test
    void nonNullReturn_null() {
        assertThrows(IllegalStateException.class, MethodReturn::nullReturn);
    }

    @Test
    void nonNullReturn_nonNull() {
        assertDoesNotThrow(MethodReturn::nonNullReturn);
    }
}