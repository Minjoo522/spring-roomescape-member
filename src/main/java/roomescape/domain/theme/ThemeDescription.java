package roomescape.domain.theme;

import roomescape.domain.exception.InvalidValueException;

public class ThemeDescription {

    private final String value;

    private ThemeDescription(String value) {
        this.value = value;
    }

    public static ThemeDescription from(String value) {
        validateNull(value);
        return new ThemeDescription(value);
    }

    private static void validateNull(String value) {
        if (value == null || value.isBlank()) {
            throw new InvalidValueException("테마 설명은 공백일 수 없습니다.");
        }
    }

    public String getValue() {
        return value;
    }
}
