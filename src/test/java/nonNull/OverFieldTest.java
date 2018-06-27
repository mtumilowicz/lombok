package nonNull;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mtumilowicz on 2018-06-27.
 */
class OverFieldTest {

    @Test
    void setName_null() {
        assertThrows(IllegalArgumentException.class, () -> new OverField().setField(null));
    }

    @Test
    void constructor_null() {
        assertThrows(IllegalArgumentException.class, () -> new OverField(null));
    }
}