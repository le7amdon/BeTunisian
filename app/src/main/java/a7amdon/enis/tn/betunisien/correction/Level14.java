package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level14 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level14()
    {
        questionTexte = new QuestionTexte("Chniya awel 7aja ya3malha etounsi doub ma y9oum menoum ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("stylo",31,14));
        list_response.add(new Response("9lam",20,14));
        list_response.add(new Response("feutre",16,14));
        list_response.add(new Response("tabachir",11,14));
        list_response.add(new Response("yajoura",8,14));
        list_response.add(new Response("fa7ma",7,14));
        list_response.add(new Response("jir",5,14));
        list_response.add(new Response("richa",2,14));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i14);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response(1,"besklet",40,14));
        list_response1.add(new Response(1,"tfol",23,14));
        list_response1.add(new Response(1,"rajel-kbir",16,14));
        list_response1.add(new Response(1,"tasli7",12,14));
        list_response1.add(new Response(1,"san3a",9,14));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
