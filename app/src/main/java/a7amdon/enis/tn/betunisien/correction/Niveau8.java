package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau8 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau8()
    {
        questionTexte = new QuestionTexte("7aja 5adhra");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("chajra",31));
        list_response.add(new Reponse("sabboura",20));
        list_response.add(new Reponse("jelbena",16));
        list_response.add(new Reponse("fa9ous",11));
        list_response.add(new Reponse("jrana",8));
        list_response.add(new Reponse("3alam-libya",7));
        list_response.add(new Reponse("gazon",5));
        list_response.add(new Reponse("tounes",2));

        questionTexte.setListe_reponses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i8);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("mra",40));
        list_response1.add(new Reponse("tofe7a",23));
        list_response1.add(new Reponse("equilibre",16));
        list_response1.add(new Reponse("tarkiz",12));
        list_response1.add(new Reponse("chijar",9));

        questionImage.setListe_reponses(list_response1);
    }
}
