package a7amdon.enis.tn.betunisien.util;

import java.util.ArrayList;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Question {

     Boolean done;
    double pourcentage;

     ArrayList<Reponse> liste_reponses;

    public Question()
    {
        this.liste_reponses = new ArrayList<Reponse>();
        this.done = false;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public ArrayList<Reponse> getListe_reponses() {
        return liste_reponses;
    }

    public void setListe_reponses(ArrayList<Reponse> liste_reponses) {
        this.liste_reponses = liste_reponses;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void updatePourcentage() {
        double s=0;
        for (int i=0;i<liste_reponses.size();i++)
        {
            s+= liste_reponses.get(i).getPourcentage();
        }
        this.pourcentage  = s;
    }
}
