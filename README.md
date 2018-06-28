# lombok

## @NonNull
* with method param
    ```
    void nonNullParam(@NonNull String param) {}
    ```
    is compiled to:
    ```
    void nonNullParam(@NonNull String param) {
        if (param == null) {
            throw new IllegalArgumentException("param is marked @NonNull but is null");
        }
    }
    ```

* over fields (works only with generated methods / constructors by lombok)

    ```
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level=AccessLevel.PRIVATE)
    class OverField {
        @NonNull
        String field;
    }
    ```
    is compiled to:
    ```
    class OverField {
        @NonNull
        private String field;
    
        public void setField(@NonNull String field) {
            if (field == null) {
                throw new IllegalArgumentException("field is marked @NonNull but is null");
            } else {
                this.field = field;
            }
        }
    
        public OverField() {
        }
    
        public OverField(@NonNull String field) {
            if (field == null) {
                throw new IllegalArgumentException("field is marked @NonNull but is null");
            } else {
                this.field = field;
            }
        }
    }
    ```
    **Note** that no-arg constructor does not have validation.
     
    If we don't use lombok generated constructors / methods, there is no difference
    in the compiled class.
    
* over method / local variable

    Adding `@NonNull` over method / local variable do nothing apart of 
    marking.
    ```
    @NonNull
    String method() {
        return null;
    }
    ```
    ```
    void method() {
        @NonNull String string = null;
        return null;
    }
    ```
    cause no exceptions at runtime & makes no difference in compiled classes.