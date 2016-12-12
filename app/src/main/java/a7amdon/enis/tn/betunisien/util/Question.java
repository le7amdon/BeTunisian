package a7amdon.enis.tn.betunisien.util;

import java.util.ArrayList;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Question {

     Boolean done;
    double pourcentage;

     ArrayList<Response> liste_responses;

    public Question()
    {
        this.liste_responses = new ArrayList<Response>();
        this.done = false;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public ArrayList<Response> getListe_responses() {
        return liste_responses;
    }

    public void setListe_responses(ArrayList<Response> liste_responses) {
        this.liste_responses = liste_responses;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void updatePourcentage() {
        double s=0;
        for (int i = 0; i< liste_responses.size(); i++)
        {
            s+= liste_responses.get(i).getPourcentage();
        }
        this.pourcentage  = s;
    }
}
