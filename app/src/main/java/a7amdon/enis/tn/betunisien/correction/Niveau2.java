package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau2 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau2()
    {
        questionTexte = new QuestionTexte("Etounsi fi restaurant chnowa yhabet ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("ma9loub",31));
        list_response.add(new Response("kaskrout-thon",20));
        list_response.add(new Response("kafteji",16));
        list_response.add(new Response("s7an-tounsi",11));
        list_response.add(new Response("lablebi",8));
        list_response.add(new Response("pizza",7));
        list_response.add(new Response("rbo3-djej",5));
        list_response.add(new Response("libanais",2));


        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i2);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("koura",40));
        list_response1.add(new Response("gazon",23));
        list_response1.add(new Response("takwir",16));
        list_response1.add(new Response("toufoula",12));
        list_response1.add(new Response("passion",9));

        questionImage.setListe_responses(list_response1);
    }
}
