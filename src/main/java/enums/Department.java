package enums;

public enum Department {
    MANUFACTURING("1234"), RND("85465"), MAINTENANCE("52554"),
    SALES("85285"), PRODUCTION("852");

    private final String code;

    Department(final String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}

