package a7amdon.enis.tn.betunisien.util;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class QuestionImage extends Question{

    private int img_src;

    public QuestionImage(int img_name) {
        this.img_src = img_name;
    }

    public int getImg_name() {
        return img_src;
    }

    public void setImg_name(int img_name) {
        this.img_src = img_name;
    }
}
