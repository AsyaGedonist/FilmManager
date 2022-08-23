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


    @Test
    public void shouldShow() {
        FilmItem[] films = { film1, film2, film3 };
        doReturn(films).when(repo).findAll();

        FilmItem[] expected = { film1, film2, film3 };
        FilmItem[] actual = manager.findAllManager();

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldShowLast() {
        FilmItem[] films = { film1, film2, film3 };
        doReturn(films).when(repo).findAll();

        FilmItem[] expected = {film3, film2, film1};
        FilmItem[] actual = manager.findLast(10);

        Assertions.assertArrayEquals(actual, expected);

    }
}
