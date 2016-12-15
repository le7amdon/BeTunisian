package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level2 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level2()
    {
        questionTexte = new QuestionTexte("Etounsi fi restaurant chnowa yhabet ?");
        ArrayList<Response> list_response =new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("ma9loub",31,2));
        list_response.add(new Response("kaskrout-thon",20,2));
        list_response.add(new Response("kafteji",16,2));
        list_response.add(new Response("s7an-tounsi",11,2));
        list_response.add(new Response("lablebi",8,2));
        list_response.add(new Response("pizza",7,2));
        list_response.add(new Response("rbo3-djej",5,2));
        list_response.add(new Response("libanais",2,2));


        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i2);
        ArrayList<Response> list_response1 =new ArrayList<Response>(5);
        list_response1.add(new Response(1,"koura",40,2));
        list_response1.add(new Response(1,"gazon",23,2));
        list_response1.add(new Response(1,"takwir",16,2));
        list_response1.add(new Response(1,"toufoula",12,2));
        list_response1.add(new Response(1,"passion",9,2));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
