package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level5 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level5()
    {
        questionTexte = new QuestionTexte("8ala bel 9loub");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("dele3",31));
        list_response.add(new Response("3neb",20));
        list_response.add(new Response("hendi",16));
        list_response.add(new Response("madalina",11));
        list_response.add(new Response("bati5",8));
        list_response.add(new Response("tofe7",7));
        list_response.add(new Response("bousa3",5));
        list_response.add(new Response("anjas",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i5);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("rajel",40));
        list_response1.add(new Response("sid",23));
        list_response1.add(new Response("so7ba",16));
        list_response1.add(new Response("dho7k",12));
        list_response1.add(new Response("nature",9));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
