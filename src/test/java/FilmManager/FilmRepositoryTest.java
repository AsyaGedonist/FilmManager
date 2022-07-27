package FilmManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmRepositoryTest {

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
    public void ShouldAddAll() {
        FilmRepository films = new FilmRepository(12);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);

        FilmItem[] actual = films.findAll();
        FilmItem[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddAllBaseReverse() {
        FilmRepository films = new FilmRepository();

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);

        FilmItem[] actual = films.findLastLimit();
        FilmItem[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddAllLessLimitReverse() {
        FilmRepository films = new FilmRepository(5);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);

        FilmItem[] actual = films.findLastLimit();
        FilmItem[] expected = {film12, film11, film10, film9, film8};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddAllMoreLimitReverse() {
        FilmRepository films = new FilmRepository(15);

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);
        films.save(film5);
        films.save(film6);
        films.save(film7);
        films.save(film8);
        films.save(film9);
        films.save(film10);
        films.save(film11);
        films.save(film12);

        FilmItem[] actual = films.findLastLimit();
        FilmItem[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldDelAll() {
        FilmRepository films = new FilmRepository();

        films.save(film1);
        films.save(film2);
        films.save(film3);
        films.save(film4);

        films.removeByFilmId(3);

        FilmItem[] actual = films.findAll();
        FilmItem[] expected = {film1, film2, film4};

        assertArrayEquals(expected, actual);
    }

}
