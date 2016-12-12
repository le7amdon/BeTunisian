package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau4 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau4()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . Stal .. ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("ma",31));
        list_response.add(new Response("zebla",20));
        list_response.add(new Response("dohn",16));
        list_response.add(new Response("mas7an",11));
        list_response.add(new Response("ba8li",8));
        list_response.add(new Response("hendi",7));
        list_response.add(new Response("karmous",5));
        list_response.add(new Response("babouch",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i4);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("fil",40));
        list_response1.add(new Response("8ouroub",23));
        list_response1.add(new Response("dhel",16));
        list_response1.add(new Response("nature",12));
        list_response1.add(new Response("3ayla",9));

        questionImage.setListe_responses(list_response1);
    }
}
