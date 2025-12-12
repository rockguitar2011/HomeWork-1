package animals;

public enum Color {
    UNKNOWN("Неизвестный"),
    WHITE("белый"),
    BLACK("черный"),
    BROWN("коричневый"),
    GRAY("серый");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
