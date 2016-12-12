package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau1 {
    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau1()
    {
        questionTexte = new QuestionTexte("Chniya awel 7aja ya3malha etounsi doub ma y9oum menoum ?");
        ArrayList<Response> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Response("ya8sel-wejhou",31));
        list_response.add(new Response("ydawech",20));
        list_response.add(new Response("yekel",16));
        list_response.add(new Response("sport",11));
        list_response.add(new Response("ysali",8));
        list_response.add(new Response("y7ok-sennih",7));
        list_response.add(new Response("y7el-talifoun",5));
        list_response.add(new Response("y7el-chobek",2));

        questionTexte.setListe_responses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i1);
        ArrayList<Response> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Response("medecine",40));
        list_response1.add(new Response("9alb",23));
        list_response1.add(new Response("a7mer",16));
        list_response1.add(new Response("stylo",12));
        list_response1.add(new Response("signal",9));

        questionImage.setListe_responses(list_response1);
    }
}
