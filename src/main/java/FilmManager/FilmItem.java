package FilmManager;

public class FilmItem {
    private int filmId;
    private String filmName;
    private String filmGenre;

    public FilmItem(int filmId, String filmName, String filmGenre) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

}


