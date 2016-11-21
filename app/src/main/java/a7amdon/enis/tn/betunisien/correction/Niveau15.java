package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau15 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau15()
    {
        questionTexte = new QuestionTexte("Chnowa yji lbelek ki n9olek \"China\" ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("madhara7",31));
        list_response.add(new Reponse("3inin-mjabda",20));
        list_response.add(new Reponse("5edma",16));
        list_response.add(new Reponse("barcha-3bed",11));
        list_response.add(new Reponse("asia",8));
        list_response.add(new Reponse("sour-essin",7));
        list_response.add(new Reponse("jackie-chan",5));
        list_response.add(new Reponse("kung-fu",2));

        questionTexte.setListe_reponses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i15);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("masyed",40));
        list_response1.add(new Reponse("sonara",23));
        list_response1.add(new Reponse("tfol",16));
        list_response1.add(new Reponse("rajel",12));
        list_response1.add(new Reponse("b7ar",9));

        questionImage.setListe_reponses(list_response1);
    }
}
