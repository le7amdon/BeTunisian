package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau15 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau15()
    {
        questionTexte = new QuestionTexte("Chnowa yji lbelek ki n9olek \"China\" ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("madhara7",31));
        list_response.add(new Response("3inin-mjabda",20));
        list_response.add(new Response("5edma",16));
        list_response.add(new Response("barcha-3bed",11));
        list_response.add(new Response("asia",8));
        list_response.add(new Response("sour-essin",7));
        list_response.add(new Response("jackie-chan",5));
        list_response.add(new Response("kung-fu",2));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i15);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("masyed",40));
        list_response1.add(new Response("sonara",23));
        list_response1.add(new Response("tfol",16));
        list_response1.add(new Response("rajel",12));
        list_response1.add(new Response("b7ar",9));

        questionImage.setListe_responses(list_response1);
    }
}
