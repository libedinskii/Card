import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>(); // Создаем новый список карт
        // Создаем колоду карт
        for (Suit suit : Suit.values()) { // Перебираем все масти карт
            for (Rank rank : Rank.values()) { // Перебираем все достоинства карт
                cards.add(new Card(rank, suit)); // Создаем новую карту и добавляем ее в список
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards); // Перетасовываем список карт
    }

    public Card dealCard() {
        if (cards.isEmpty()) { // Проверяем, пуста ли колода
            throw new IllegalStateException("Колода пуста"); // Если колода пуста, выбрасываем исключение
        }
        return cards.remove(cards.size() - 1); // Возвращаем верхнюю карту из колоды и удаляем ее из списка
    }

    public void returnCard(Card card) {
        if (cards.contains(card)) { // Проверяем, содержится ли карта уже в колоде
            throw new IllegalArgumentException("Карта уже находится в колоде"); // Если карта уже в колоде, выбрасываем исключение
        }
        cards.add(card); // Добавляем карту в колоду
    }

    public int getSize() {
        return cards.size(); // Возвращаем количество карт в колоде
    }
}

enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES
}

enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
}
