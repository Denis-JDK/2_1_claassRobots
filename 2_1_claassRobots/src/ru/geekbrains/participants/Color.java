package ru.geekbrains.participants;

public enum Color {
    BLACK("Black", "Черный"),
    WHITE("White", "Белый"),
    BLUE("Blue", "Пурпурный"),
    RED("Orange", "Рыжий");

    private String englishColorName;
    private String russianColorName;

    Color(String englishColorName, String russianColorName) {
        this.englishColorName = englishColorName;
        this.russianColorName = russianColorName;
    }

    public String getEnglishColorName() {
        return englishColorName;
    }

    public String getRussianColorName() {
        return russianColorName;
    }
}
