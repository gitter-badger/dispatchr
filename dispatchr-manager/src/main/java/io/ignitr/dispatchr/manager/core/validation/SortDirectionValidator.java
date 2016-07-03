package io.ignitr.dispatchr.manager.core.validation;

public class SortDirectionValidator {

    public static boolean validate(String value) {
        if (value != null) {
            if (!value.equalsIgnoreCase("asc") || !value.equalsIgnoreCase("desc")) {
                throw new RuntimeException();
            }
        }

        return true;
    }
}
