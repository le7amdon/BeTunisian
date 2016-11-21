package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau3 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau3()
    {
        questionTexte = new QuestionTexte("Chnowa nejmou nal9aw fi trous etounsi ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°3
        list_response.add(new Reponse("stilouwet",31));
        list_response.add(new Reponse("9lam-rsas",20));
        list_response.add(new Reponse("gomme",16));
        list_response.add(new Reponse("bareya",11));
        list_response.add(new Reponse("compas",8));
        list_response.add(new Reponse("mastra",7));
        list_response.add(new Reponse("feutre",5));
        list_response.add(new Reponse("m9as",2));

        questionTexte.setListe_reponses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i3);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("mra",40));
        list_response1.add(new Reponse("7abs",23));
        list_response1.add(new Reponse("we7da",16));
        list_response1.add(new Reponse("7ozn",12));
        list_response1.add(new Reponse("7did",9));

        questionImage.setListe_reponses(list_response1);
    }
}
