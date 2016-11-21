package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau14 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau14()
    {
        questionTexte = new QuestionTexte("Chniya awel 7aja ya3malha etounsi doub ma y9oum menoum ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("stylo",31));
        list_response.add(new Reponse("9lam",20));
        list_response.add(new Reponse("feutre",16));
        list_response.add(new Reponse("tabachir",11));
        list_response.add(new Reponse("yajoura",8));
        list_response.add(new Reponse("fa7ma",7));
        list_response.add(new Reponse("jir",5));
        list_response.add(new Reponse("richa",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i14);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("besklet",40));
        list_response1.add(new Reponse("tfol",23));
        list_response1.add(new Reponse("rajel-kbir",16));
        list_response1.add(new Reponse("tasli7",12));
        list_response1.add(new Reponse("san3a",9));

        questionImage.setListe_reponses(list_response1);
    }
}
