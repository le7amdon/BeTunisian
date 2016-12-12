package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau14 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau14()
    {
        questionTexte = new QuestionTexte("Chniya awel 7aja ya3malha etounsi doub ma y9oum menoum ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("stylo",31));
        list_response.add(new Response("9lam",20));
        list_response.add(new Response("feutre",16));
        list_response.add(new Response("tabachir",11));
        list_response.add(new Response("yajoura",8));
        list_response.add(new Response("fa7ma",7));
        list_response.add(new Response("jir",5));
        list_response.add(new Response("richa",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i14);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("besklet",40));
        list_response1.add(new Response("tfol",23));
        list_response1.add(new Response("rajel-kbir",16));
        list_response1.add(new Response("tasli7",12));
        list_response1.add(new Response("san3a",9));

        questionImage.setListe_responses(list_response1);
    }
}
