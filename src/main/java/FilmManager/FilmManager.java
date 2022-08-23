package FilmManager;

public class FilmManager {

    private FilmRepository films;

    public FilmManager(FilmRepository films) {
        this.films = films;
    }

    public FilmItem[] findAllManager () {
        return films.findAll();
    }

    public FilmRepository saveManager (FilmItem film) {
        films.save(film);
        return films;
    }

    public FilmItem[] findLast (int limit) {
        int resultLength;
        FilmItem[] all = films.findAll();
        if (limit > all.length) {
            resultLength = all.length;
        } else {
            resultLength = limit;
        }

        FilmItem[] reversed = new FilmItem[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
