package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau13 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau13()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . teskra mta3 .. ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("car",31));
        list_response.add(new Reponse("metro",20));
        list_response.add(new Reponse("tayara",16));
        list_response.add(new Reponse("stade",11));
        list_response.add(new Reponse("peage",8));
        list_response.add(new Reponse("cinema",7));
        list_response.add(new Reponse("bousta",5));
        list_response.add(new Reponse("light",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i13);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("koura-ardhiya",40));
        list_response1.add(new Reponse("tofla",23));
        list_response1.add(new Reponse("mou3alma",16));
        list_response1.add(new Reponse("9raya",12));
        list_response1.add(new Reponse("jo8rafia",9));

        questionImage.setListe_reponses(list_response1);
    }
}
