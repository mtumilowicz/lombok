package nonNull;

import lombok.NonNull;

/**
 * Created by mtumilowicz on 2018-06-27.
 */
class MethodReturn {
    @NonNull
    static String nonNullReturn(String param) {
        return param;
    }
}
