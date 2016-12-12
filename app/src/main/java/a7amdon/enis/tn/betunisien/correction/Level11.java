package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level11 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level11()
    {
        questionTexte = new QuestionTexte("7ajet dima y9oulouhelek weldik ki kont s8ir ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("arka7",31));
        list_response.add(new Response("koul-mli7",20));
        list_response.add(new Response("3ayech-weldi",16));
        list_response.add(new Response("bara-a9ra",11));
        list_response.add(new Response("nadhem-bitek",8));
        list_response.add(new Response("bara-dawech",7));
        list_response.add(new Response("bara-or9od",5));
        list_response.add(new Response("het-commande",2));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i11);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("moutal3a",40));
        list_response1.add(new Response("bnet",23));
        list_response1.add(new Response("s7ab",16));
        list_response1.add(new Response("coin",12));
        list_response1.add(new Response("9ahwa",9));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
