package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau6 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau6()
    {
        questionTexte = new QuestionTexte("7aja 7lowa");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("3sal",31));
        list_response.add(new Response("7alwa",20));
        list_response.add(new Response("chocolat",16));
        list_response.add(new Response("gateau",11));
        list_response.add(new Response("glace",8));
        list_response.add(new Response("degla",7));
        list_response.add(new Response("sokor",5));
        list_response.add(new Response("7al9oum",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i6);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("tri9",40));
        list_response1.add(new Response("kamiouna",23));
        list_response1.add(new Response("vitesse",16));
        list_response1.add(new Response("mtar",12));
        list_response1.add(new Response("tableau",9));

        questionImage.setListe_responses(list_response1);
    }
}
