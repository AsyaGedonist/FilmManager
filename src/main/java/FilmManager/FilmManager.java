package FilmManager;

public class FilmManager {

    private FilmRepository films;

    public FilmManager(FilmRepository films) {
        this.films = films;
    }

    public FilmItem[] findAll () {
        return films.getItems();
    }

    public FilmRepository saveManager (FilmItem film) {
        films.save(film);
        return films;
    }

    public FilmItem[] findById (int filmId) {
        return films.findById(filmId);
    }

    public FilmItem[] removeById (int filmId) {
        return films.removeByFilmId(filmId);
    }

    public FilmItem[] removeAll () {
        return films.removeAll();
    }

}
