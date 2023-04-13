package lesson3.champagne;

public enum Cru {
    AUTRE(80), PREMIER(90), GRAND(100);

    private int quality;

    Cru(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }
}



    // создать перечесление с тремя элементами
    // с каждым элементом связать качество
    // AUTRE (80)
    // PREMIER (90)
    // GRAND (100)

    // Добавить поле качество
    // Добавить getter

