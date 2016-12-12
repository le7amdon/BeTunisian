package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level3 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level3()
    {
        questionTexte = new QuestionTexte("Chnowa nejmou nal9aw fi trous etounsi ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°3
        list_response.add(new Response("stilouwet",31));
        list_response.add(new Response("9lam-rsas",20));
        list_response.add(new Response("gomme",16));
        list_response.add(new Response("bareya",11));
        list_response.add(new Response("compas",8));
        list_response.add(new Response("mastra",7));
        list_response.add(new Response("feutre",5));
        list_response.add(new Response("m9as",2));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i3);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("mra",40));
        list_response1.add(new Response("7abs",23));
        list_response1.add(new Response("we7da",16));
        list_response1.add(new Response("7ozn",12));
        list_response1.add(new Response("7did",9));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
