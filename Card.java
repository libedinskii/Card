class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank; // Устанавливаем достоинство карты
        this.suit = suit; // Устанавливаем масть карты
    }

    public Rank getRank() {
        return rank; // Возвращаем достоинство карты
    }

    public Suit getSuit() {
        return suit; // Возвращаем масть карты
    }

    @Override
    public String toString() {
        return rank + " of " + suit; // Возвращаем строковое представление карты
    }
}
