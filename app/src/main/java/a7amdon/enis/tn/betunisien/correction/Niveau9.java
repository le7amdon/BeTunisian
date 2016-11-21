package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau9 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau9()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . mefte7 .. ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("dar",31));
        list_response.add(new Reponse("karhba",20));
        list_response.add(new Reponse("kadna",16));
        list_response.add(new Reponse("9jar",11));
        list_response.add(new Reponse("5zena",8));
        list_response.add(new Reponse("moutour",7));
        list_response.add(new Reponse("salsla",5));
        list_response.add(new Reponse("coffre",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i9);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("korsi",40));
        list_response1.add(new Reponse("A",23));
        list_response1.add(new Reponse("tour-eiffel",16));
        list_response1.add(new Reponse("lou7",12));
        list_response1.add(new Reponse("bit",9));

        questionImage.setListe_reponses(list_response1);
    }
}
