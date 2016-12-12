package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau13 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau13()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . teskra mta3 .. ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("car",31));
        list_response.add(new Response("metro",20));
        list_response.add(new Response("tayara",16));
        list_response.add(new Response("stade",11));
        list_response.add(new Response("peage",8));
        list_response.add(new Response("cinema",7));
        list_response.add(new Response("bousta",5));
        list_response.add(new Response("light",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i13);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("koura-ardhiya",40));
        list_response1.add(new Response("tofla",23));
        list_response1.add(new Response("mou3alma",16));
        list_response1.add(new Response("9raya",12));
        list_response1.add(new Response("jo8rafia",9));

        questionImage.setListe_responses(list_response1);
    }
}
