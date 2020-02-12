package control;

public class Pelicula {
    String Prioritat, Titol, Situacio, Cartell, Original, Direccio, Interprets, Sinopsi, Versio, IDIOMA_x0020_ORIGINAL, QUALIFICACIO, TRAILER, WEB, Estrena;
    int ID, Any;

    Pelicula(String Prioritat, String Titol, String Situacio, String Cartell, String Original, String Direccio, String Interprets, String Sinopsi, String Versio, String IDIOMA_x0020_ORIGINAL, String QUALIFICACIO, String TRAILER, String WEB, int ID, int Any, String Estrena) {
        this.Prioritat = Prioritat;
        this.Titol = Titol;
        this.Situacio = Situacio;
        this.Cartell = Cartell;
        this.Original = Original;
        this.Direccio = Direccio;
        this.Interprets = Interprets;
        this.Sinopsi = Sinopsi;
        this.Versio = Versio;
        this.IDIOMA_x0020_ORIGINAL = IDIOMA_x0020_ORIGINAL;
        this.QUALIFICACIO = QUALIFICACIO;
        this.TRAILER = TRAILER;
        this.WEB = WEB;
        this.ID = ID;
        this.Any = Any;
        this.Estrena = Estrena;
    }

    @Override
    public String toString() {
        return "PELICULA{" +
                "Prioritat='" + Prioritat + '\'' +
                ", Titol='" + Titol + '\'' +
                ", Situacio='" + Situacio + '\'' +
                ", Cartell='" + Cartell + '\'' +
                ", Original='" + Original + '\'' +
                ", Direccio='" + Direccio + '\'' +
                ", Interprets='" + Interprets + '\'' +
                ", Sinopsi='" + Sinopsi + '\'' +
                ", Versio='" + Versio + '\'' +
                ", IDIOMA_x0020_ORIGINAL='" + IDIOMA_x0020_ORIGINAL + '\'' +
                ", QUALIFICACIO='" + QUALIFICACIO + '\'' +
                ", TRAILER='" + TRAILER + '\'' +
                ", WEB='" + WEB + '\'' +
                ", Estrena='" + Estrena + '\'' +
                ", ID=" + ID +
                ", Any=" + Any +
                '}';
    }
}
