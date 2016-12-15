package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level4 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level4()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . Stal .. ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("ma",31,4));
        list_response.add(new Response("zebla",20,4));
        list_response.add(new Response("dohn",16,4));
        list_response.add(new Response("mas7an",11,4));
        list_response.add(new Response("ba8li",8,4));
        list_response.add(new Response("hendi",7,4));
        list_response.add(new Response("karmous",5,4));
        list_response.add(new Response("babouch",2,4));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i4);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response(1,"fil",40,4));
        list_response1.add(new Response(1,"8ouroub",23,4));
        list_response1.add(new Response(1,"dhel",16,4));
        list_response1.add(new Response(1,"nature",12,4));
        list_response1.add(new Response(1,"3ayla",9,4));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
