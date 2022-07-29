package FilmManager;

public class FilmManager {

    private FilmRepository films;

    public FilmManager(FilmRepository films) {
        this.films = films;
    }

    public void saveManager (FilmItem film) {
        films.save(film);
    }

    public FilmItem[] findAllManager () {
        return films.findAll();
    }

}
