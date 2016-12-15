package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level7 extends CorrectLevel{
    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level7()
    {
        questionTexte = new QuestionTexte("Kamel ljomla. Saker .. ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("lbeb",31,7));
        list_response.add(new Response("sabela",20,7));
        list_response.add(new Response("dhaw",16,7));
        list_response.add(new Response("talvza",11,7));
        list_response.add(new Response("chobek",8,7));
        list_response.add(new Response("climatiseur",7,7));
        list_response.add(new Response("sac",5,7));
        list_response.add(new Response("fomek",2,7));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i7);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response(1,"sekka",40,7));
        list_response1.add(new Response(1,"barriere",23,7));
        list_response1.add(new Response(1,"9antra",16,7));
        list_response1.add(new Response(1,"train",12,7));
        list_response1.add(new Response(1,"korsi",9,7));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
