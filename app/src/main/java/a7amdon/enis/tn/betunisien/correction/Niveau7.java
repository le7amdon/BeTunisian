package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau7 {
    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau7()
    {
        questionTexte = new QuestionTexte("Kamel ljomla. Saker .. ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("lbeb",31));
        list_response.add(new Reponse("sabela",20));
        list_response.add(new Reponse("dhaw",16));
        list_response.add(new Reponse("talvza",11));
        list_response.add(new Reponse("chobek",8));
        list_response.add(new Reponse("climatiseur",7));
        list_response.add(new Reponse("sac",5));
        list_response.add(new Reponse("fomek",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i7);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("sekka",40));
        list_response1.add(new Reponse("barriere",23));
        list_response1.add(new Reponse("9antra",16));
        list_response1.add(new Reponse("train",12));
        list_response1.add(new Reponse("korsi",9));

        questionImage.setListe_reponses(list_response1);
    }
}
