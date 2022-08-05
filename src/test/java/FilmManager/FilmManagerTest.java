package FilmManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class FilmManagerTest {

    FilmRepository repo = Mockito.mock(FilmRepository.class);
    FilmManager manager = new FilmManager(repo);

    FilmItem film1 = new FilmItem(1, "Бладшот", "боевик");
    FilmItem film2 = new FilmItem(2, "Вперёд", "мультфильм");
    FilmItem film3 = new FilmItem(3, "Отель Белград", "комедия");
    FilmItem film4 = new FilmItem(4, "Джентльмены", "боевик");
    FilmItem film5 = new FilmItem(5, "Человек-невидимка", "ужасы");
    FilmItem film6 = new FilmItem(6, "Тролли. Мировой тур", "мультфильм");
    FilmItem film7 = new FilmItem(7, "Номер один", "комедия");
    FilmItem film8 = new FilmItem(8, "Славные парни", "боевик");
    FilmItem film9 = new FilmItem(9, "Пропавшая", "ужасы");
    FilmItem film10 = new FilmItem(10, "Рататуй", "мультфильм");
    FilmItem film11 = new FilmItem(11, "Армагеддон", "боевик");
    FilmItem film12 = new FilmItem(12, "Всё везде и сразу", "фантастика");

    @Test
    public void shouldShow() {
        FilmItem[] films = { film1, film2, film3 };
        doReturn(films).when(repo).getItems();

        FilmItem[] actual = { film1, film2, film3 };
        FilmItem[] expected = manager.findAll();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldAdd() {
        FilmItem[] films = { film1, film2, film3 };
        doReturn(films).when(repo).getItems();

        FilmItem[] actual = { film1, film2, film3, film4 };

        FilmRepository expected = manager.saveManager(film4);

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldDel() {
        FilmItem[] films = { film1, film2, film3 };
        doReturn(films).when(repo).getItems();

        FilmItem[] actual = { film1, film2 };
        FilmItem[] expected = manager.removeById(3);

        Assertions.assertArrayEquals(actual, expected);

    }

}
