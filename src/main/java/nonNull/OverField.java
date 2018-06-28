package nonNull;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Created by mtumilowicz on 2018-06-27.
 */
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
class OverField {
    @NonNull
    String field;
}
