package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level8 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level8()
    {
        questionTexte = new QuestionTexte("7aja 5adhra");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("chajra",31));
        list_response.add(new Response("sabboura",20));
        list_response.add(new Response("jelbena",16));
        list_response.add(new Response("fa9ous",11));
        list_response.add(new Response("jrana",8));
        list_response.add(new Response("3alam-libya",7));
        list_response.add(new Response("gazon",5));
        list_response.add(new Response("tounes",2));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i8);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("mra",40));
        list_response1.add(new Response("tofe7a",23));
        list_response1.add(new Response("equilibre",16));
        list_response1.add(new Response("tarkiz",12));
        list_response1.add(new Response("chijar",9));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
