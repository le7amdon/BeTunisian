package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau12 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau12()
    {
        questionTexte = new QuestionTexte("7aja neklouha fi romdhane");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("m5ara9",31));
        list_response.add(new Response("zlebya",20));
        list_response.add(new Response("brik",16));
        list_response.add(new Response("chorba",11));
        list_response.add(new Response("masfouf",8));
        list_response.add(new Response("9tayef",7));
        list_response.add(new Response("wdhen-l9adhi",5));
        list_response.add(new Response("bouza",2));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i12);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("kwer",40));
        list_response1.add(new Response("terrin",23));
        list_response1.add(new Response("entrainement",16));
        list_response1.add(new Response("ramasseur",12));
        list_response1.add(new Response("jam3iya",9));

        questionImage.setListe_responses(list_response1);
    }
}
