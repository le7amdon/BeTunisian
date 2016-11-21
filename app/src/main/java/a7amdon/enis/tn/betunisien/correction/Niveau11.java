package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau11 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau11()
    {
        questionTexte = new QuestionTexte("7ajet dima y9oulouhelek weldik ki kont s8ir ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("arka7",31));
        list_response.add(new Reponse("koul-mli7",20));
        list_response.add(new Reponse("3ayech-weldi",16));
        list_response.add(new Reponse("bara-a9ra",11));
        list_response.add(new Reponse("nadhem-bitek",8));
        list_response.add(new Reponse("bara-dawech",7));
        list_response.add(new Reponse("bara-or9od",5));
        list_response.add(new Reponse("het-commande",2));

        questionTexte.setListe_reponses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i11);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("moutal3a",40));
        list_response1.add(new Reponse("bnet",23));
        list_response1.add(new Reponse("s7ab",16));
        list_response1.add(new Reponse("coin",12));
        list_response1.add(new Reponse("9ahwa",9));

        questionImage.setListe_reponses(list_response1);
    }
}
