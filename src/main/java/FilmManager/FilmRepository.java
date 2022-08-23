package FilmManager;

public class FilmRepository {
    private FilmItem[] films = new FilmItem[0];

    private int limit = 10;

    public FilmRepository() {
    }

    public FilmRepository(int limit) {
        this.limit = limit;
    }

    public FilmItem[] findAll () {
        return films;
    }

    public void save(FilmItem film) {
        FilmItem[] tmp = new FilmItem[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmItem[] findById(int filmId) {
        int resultLength = 0;
        for (FilmItem film : films) {
            if (film.getFilmId() == filmId) {
                resultLength++;
            }
        }
        FilmItem[] filmFound = new FilmItem[resultLength];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (film.getFilmId() == filmId) {
                filmFound[copyToIndex] = film;
                copyToIndex++;
            }
        }
        if (resultLength == 0) {
            return null;
        }
        return filmFound;
    }

    public FilmItem[] removeById(int filmId) {
        FilmItem[] tmp = new FilmItem[films.length - 1];
        int copyToIndex = 0;
        for (FilmItem film : films) {
            if (film.getFilmId() != filmId) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
        return films;
    }

    public FilmItem[] removeAll() {
        FilmItem[] tmp = new FilmItem[0];
        return tmp;
    }

}