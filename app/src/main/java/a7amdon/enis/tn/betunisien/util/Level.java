package a7amdon.enis.tn.betunisien.util;


import a7amdon.enis.tn.betunisien.HomeActivity;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level {
    //Attributs
    private int valeur;
    private QuestionTexte questionTexte;
    private QuestionImage questionImage;
    private int image;
    private HomeActivity.StatusLevel status;

    public Level(int valeur, QuestionTexte questionTexte, QuestionImage questionImage, HomeActivity.StatusLevel status, int image) {
        this.valeur = valeur;
        this.questionTexte = questionTexte;
        this.questionImage = questionImage;
        this.status = status;
        this.image = image;
    }

    //Méthodes
    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public void setQuestionTexte(QuestionTexte questionTexte) {
        this.questionTexte = questionTexte;
    }

    public QuestionImage getQuestionImage() {
        return questionImage;
    }

    public void setQuestionImage(QuestionImage questionImage) {
        this.questionImage = questionImage;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public HomeActivity.StatusLevel getStatus() {
        return status;
    }

    public void setStatus(HomeActivity.StatusLevel status) {
        this.status = status;
    }
}
