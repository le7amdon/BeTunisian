package a7amdon.enis.tn.betunisien.util;


import a7amdon.enis.tn.betunisien.home;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau {
    //Attributs
    private int valeur;
    private QuestionTexte questionTexte;
    private QuestionImage questionImage;
    private int image;
    private home.StatusLevel status;

    public Niveau(int valeur, QuestionTexte questionTexte, QuestionImage questionImage,home.StatusLevel status,int image) {
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

    public home.StatusLevel getStatus() {
        return status;
    }

    public void setStatus(home.StatusLevel status) {
        this.status = status;
    }
}
