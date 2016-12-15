package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level12 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level12()
    {
        questionTexte = new QuestionTexte("7aja neklouha fi romdhane");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("m5ara9",31,12));
        list_response.add(new Response("zlebya",20,12));
        list_response.add(new Response("brik",16,12));
        list_response.add(new Response("chorba",11,12));
        list_response.add(new Response("masfouf",8,12));
        list_response.add(new Response("9tayef",7,12));
        list_response.add(new Response("wdhen-l9adhi",5,12));
        list_response.add(new Response("bouza",2,12));

        questionTexte.setListe_responses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i12);
        ArrayList<Response> list_response1 =new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response(1,"kwer",40,12));
        list_response1.add(new Response(1,"terrin",23,12));
        list_response1.add(new Response(1,"entrainement",16,12));
        list_response1.add(new Response(1,"ramasseur",12,12));
        list_response1.add(new Response(1,"jam3iya",9,12));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
