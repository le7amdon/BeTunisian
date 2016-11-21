package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau2 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau2()
    {
        questionTexte = new QuestionTexte("Etounsi fi restaurant chnowa yhabet ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("ma9loub",31));
        list_response.add(new Reponse("kaskrout-thon",20));
        list_response.add(new Reponse("kafteji",16));
        list_response.add(new Reponse("s7an-tounsi",11));
        list_response.add(new Reponse("lablebi",8));
        list_response.add(new Reponse("pizza",7));
        list_response.add(new Reponse("rbo3-djej",5));
        list_response.add(new Reponse("libanais",2));


        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i2);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("koura",40));
        list_response1.add(new Reponse("gazon",23));
        list_response1.add(new Reponse("takwir",16));
        list_response1.add(new Reponse("toufoula",12));
        list_response1.add(new Reponse("passion",9));

        questionImage.setListe_reponses(list_response1);
    }
}
