package nonNull;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mtumilowicz on 2018-06-27.
 */
class MethodParamTest {

    @Test
    void nonNullParam_null() {
        assertThrows(IllegalArgumentException.class, () -> MethodParam.nonNullParam(null));
    }

    @Test
    void nonNullParam_nonNull() {
        assertDoesNotThrow(() -> MethodParam.nonNullParam("a"));
    }
}