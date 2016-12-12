package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Level9 extends CorrectLevel{

    public  QuestionTexte questionTexte ;
    public  QuestionImage questionImage;

    public Level9()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . mefte7 .. ?");
        ArrayList<Response> list_response = new ArrayList<Response>(8);
        //les réponses de la question n°1
        list_response.add(new Response("dar",31));
        list_response.add(new Response("karhba",20));
        list_response.add(new Response("kadna",16));
        list_response.add(new Response("9jar",11));
        list_response.add(new Response("5zena",8));
        list_response.add(new Response("moutour",7));
        list_response.add(new Response("salsla",5));
        list_response.add(new Response("coffre",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i9);
        ArrayList<Response> list_response1 = new ArrayList<Response>(5);
        //les réponses de la question n°1
        list_response1.add(new Response("korsi",40));
        list_response1.add(new Response("A",23));
        list_response1.add(new Response("tour-eiffel",16));
        list_response1.add(new Response("lou7",12));
        list_response1.add(new Response("bit",9));

        questionImage.setListe_responses(list_response1);
    }
    public  QuestionTexte getQuestionTexte() {
        return questionTexte;
    }

    public  QuestionImage getQuestionImage() {
        return questionImage;
    }
}
