package FilmManager;

public class FilmRepository {
    private FilmItem[] films = new FilmItem[0];

    private int limit = 10;

    public FilmRepository() {
    }

    public FilmRepository(int limit) {
        this.limit = limit;
    }

    public void save(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public void removeByFilmId(int filmId) {
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (film.getFilmId() != filmId) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public FilmItem[] findAll() {
        return films;
    }

    public FilmItem[] findLastLimit() {
        int resultLength;
        if (limit > films.length) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        FilmItem[] reversed = new FilmItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }

}
