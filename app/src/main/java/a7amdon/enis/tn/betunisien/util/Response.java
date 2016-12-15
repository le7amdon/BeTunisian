package a7amdon.enis.tn.betunisien.util;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Response {

        private String texte;
        private double pourcentage;
        private int id_level;
        private int type; // 0 = text ; 1=image
        private int id;
    private Boolean turned=false;

    public Response(String texte, double pourcentage, int id_level) {
        this.texte = texte;
        this.pourcentage = pourcentage;
        this.id_level = id_level;
    }

    public Response(int id, int type, String texte, double pourcentage, int id_level) {
        this.texte = texte;
        this.pourcentage = pourcentage;
        this.id_level = id_level;
        this.type = type;
        this.id = id;
    }
    public Response(int type, String texte, double pourcentage, int id_level) {
        this.texte = texte;
        this.pourcentage = pourcentage;
        this.id_level = id_level;
        this.type = type;

    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public int getId_level() {
        return id_level;
    }

    public void setId_level(int id_level) {
        this.id_level = id_level;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getTurned() {
        return turned;
    }

    public void setTurned(Boolean turned) {
        this.turned = turned;
    }
}
