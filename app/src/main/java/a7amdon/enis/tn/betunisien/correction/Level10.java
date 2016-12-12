package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level10 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level10()
    {
        questionTexte = new QuestionTexte("Commande mta3 chniya ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("talvza",31,10));
        list_response.add(new Response("karhba",20,10));
        list_response.add(new Response("climatiseur",16,10));
        list_response.add(new Response("garage",11,10));
        list_response.add(new Response("recepteur",8,10));
        list_response.add(new Response("moutour",7,10));
        list_response.add(new Response("lo3ba",5,10));
        list_response.add(new Response("chaine-stereo",2,10));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i10);
        ArrayList<Response> list_response1 =new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("wejh",40,10));
        list_response1.add(new Response("ma3loumet",23,10));
        list_response1.add(new Response("mo5",16,10));
        list_response1.add(new Response("surmenage",12,10));
        list_response1.add(new Response("numerique",9,10));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
