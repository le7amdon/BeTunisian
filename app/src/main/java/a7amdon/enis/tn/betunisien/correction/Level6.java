package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level6 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level6()
    {
        questionTexte = new QuestionTexte("7aja 7lowa");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("3sal",31,6));
        list_response.add(new Response("7alwa",20,6));
        list_response.add(new Response("chocolat",16,6));
        list_response.add(new Response("gateau",11,6));
        list_response.add(new Response("glace",8,6));
        list_response.add(new Response("degla",7,6));
        list_response.add(new Response("sokor",5,6));
        list_response.add(new Response("7al9oum",2,6));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i6);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("tri9",40,6));
        list_response1.add(new Response("kamiouna",23,6));
        list_response1.add(new Response("vitesse",16,6));
        list_response1.add(new Response("mtar",12,6));
        list_response1.add(new Response("tableau",9,6));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
