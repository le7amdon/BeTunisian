package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau7 {
    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau7()
    {
        questionTexte = new QuestionTexte("Kamel ljomla. Saker .. ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("lbeb",31));
        list_response.add(new Response("sabela",20));
        list_response.add(new Response("dhaw",16));
        list_response.add(new Response("talvza",11));
        list_response.add(new Response("chobek",8));
        list_response.add(new Response("climatiseur",7));
        list_response.add(new Response("sac",5));
        list_response.add(new Response("fomek",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i7);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("sekka",40));
        list_response1.add(new Response("barriere",23));
        list_response1.add(new Response("9antra",16));
        list_response1.add(new Response("train",12));
        list_response1.add(new Response("korsi",9));

        questionImage.setListe_responses(list_response1);
    }
}
