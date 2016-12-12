package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau10 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau10()
    {
        questionTexte = new QuestionTexte("Commande mta3 chniya ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("talvza",31));
        list_response.add(new Response("karhba",20));
        list_response.add(new Response("climatiseur",16));
        list_response.add(new Response("garage",11));
        list_response.add(new Response("recepteur",8));
        list_response.add(new Response("moutour",7));
        list_response.add(new Response("lo3ba",5));
        list_response.add(new Response("chaine-stereo",2));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i10);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("wejh",40));
        list_response1.add(new Response("ma3loumet",23));
        list_response1.add(new Response("mo5",16));
        list_response1.add(new Response("surmenage",12));
        list_response1.add(new Response("numerique",9));

        questionImage.setListe_responses(list_response1);
    }
}
