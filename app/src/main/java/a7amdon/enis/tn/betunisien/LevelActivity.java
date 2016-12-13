package a7amdon.enis.tn.betunisien;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import a7amdon.enis.tn.betunisien.animations.CircleDisplay;
import a7amdon.enis.tn.betunisien.db.DatabaseHandler;
import a7amdon.enis.tn.betunisien.game.LevelSelector;

/**
 * Created by 7amdon on 20/10/2016.
 */

public class LevelActivity extends AppCompatActivity implements View.OnClickListener{
    public static final int DETAIL_REQUEST = 1;
    LevelSelector levelSelector;
    TextView textView_level_label_number=null;
    ImageButton btnImage_back=null;
    //ImageView imgView_level_question_progress=null;
    //ImageView imgView_level_image_progress=null;
    RelativeLayout question_panel=null;
    RelativeLayout image_panel=null;
    ImageView imgView_level_image_src=null;
    TextView textView_level_question_text=null;
    CircleDisplay cicrcleDisplay_level_question_progress=null;
    CircleDisplay cicrcleDisplay_level_image_progress=null;
    DatabaseHandler databaseHandler;

    int lvlNB = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);
        btnImage_back = (ImageButton) findViewById(R.id.btnImage_back);
        btnImage_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),HomeActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        databaseHandler = new DatabaseHandler(getApplicationContext());
        levelSelector = new LevelSelector();
        Bundle bundle = getIntent().getExtras();
        final String str = bundle.getString("level_selected");
        lvlNB = Integer.parseInt(str);

        textView_level_label_number = (TextView)findViewById(R.id.level_label_number);
        textView_level_question_text = (TextView)findViewById(R.id.level_question_text);
        textView_level_question_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),QuestionGame.class);
                intent.putExtra("level_selected",str );
                v.getContext().startActivity(intent);
            }
        });
        //imgView_level_question_progress = (ImageView)findViewById(R.id.level_question_progress);
        //imgView_level_image_progress = (ImageView)findViewById(R.id.level_image_progress);
        imgView_level_image_src = (ImageView)findViewById(R.id.level_image_src);
        imgView_level_image_src.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ImageGame.class);
                intent.putExtra("level_selected",str );
                v.getContext().startActivity(intent);
            }
        });


        //récpération du numero du niveau
        /*setting CircleDisplay of percentage*/
        cicrcleDisplay_level_question_progress= (CircleDisplay) findViewById(R.id.level_question_progress);
        cicrcleDisplay_level_question_progress.setAnimDuration(3000);
        //cicrcleDisplay_level_question_progress.setValueWidthPercent(55f);
        cicrcleDisplay_level_question_progress.setTextSize(13f);
        cicrcleDisplay_level_question_progress.setColor(Color.BLUE);
        cicrcleDisplay_level_question_progress.setDrawText(true);
        cicrcleDisplay_level_question_progress.setDrawInnerCircle(true);
        cicrcleDisplay_level_question_progress.setFormatDigits(1);
        cicrcleDisplay_level_question_progress.setTouchEnabled(false);
        //cicrcleDisplay_level_question_progress.setSelectionListener(this);
        cicrcleDisplay_level_question_progress.setUnit("");
        cicrcleDisplay_level_question_progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        //cicrcleDisplay_level_question_progress.showValue(75f, 100f, true);
        /*end setting */

        /*setting CircleDisplay of percentage for image*/
        cicrcleDisplay_level_image_progress= (CircleDisplay) findViewById(R.id.level_image_progress);
        cicrcleDisplay_level_image_progress.setAnimDuration(3000);
        //cicrcleDisplay_level_question_progress.setValueWidthPercent(55f);
        cicrcleDisplay_level_image_progress.setTextSize(13f);
        cicrcleDisplay_level_image_progress.setColor(Color.BLUE);
        cicrcleDisplay_level_image_progress.setDrawText(true);
        cicrcleDisplay_level_image_progress.setDrawInnerCircle(true);
        cicrcleDisplay_level_image_progress.setFormatDigits(1);
        cicrcleDisplay_level_image_progress.setTouchEnabled(false);
        //cicrcleDisplay_level_question_progress.setSelectionListener(this);
        cicrcleDisplay_level_image_progress.setUnit("");
        cicrcleDisplay_level_image_progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        //cicrcleDisplay_level_image_progress.showValue(31f, 100f, true);
        /*end setting */

        updateCircleProgress();
        textView_level_label_number.setText(str);


        switch (lvlNB){
            case 1 :
                textView_level_question_text.setText(R.string.niveau1_question);
                imgView_level_image_src.setImageResource(R.drawable.i1);
                break;
            case 2 :
                textView_level_question_text.setText(R.string.niveau2_question);
                imgView_level_image_src.setImageResource(R.drawable.i2);
                break;
            case 3 :
                textView_level_question_text.setText(R.string.niveau3_question);
                imgView_level_image_src.setImageResource(R.drawable.i3);
                break;
            case 4 :
                textView_level_question_text.setText(R.string.niveau4_question);
                imgView_level_image_src.setImageResource(R.drawable.i4);
                break;
            case 5 :
                textView_level_question_text.setText(R.string.niveau5_question);
                imgView_level_image_src.setImageResource(R.drawable.i5);
                break;
            case 6 :
                textView_level_question_text.setText(R.string.niveau6_question);
                imgView_level_image_src.setImageResource(R.drawable.i6);
                break;
            case 7 :
                textView_level_question_text.setText(R.string.niveau7_question);
                imgView_level_image_src.setImageResource(R.drawable.i7);
                break;
            case 8 :
                textView_level_question_text.setText(R.string.niveau8_question);
                imgView_level_image_src.setImageResource(R.drawable.i8);
                break;
            case 9 :
                textView_level_question_text.setText(R.string.niveau9_question);
                imgView_level_image_src.setImageResource(R.drawable.i9);
                break;
            case 10 :
                textView_level_question_text.setText(R.string.niveau10_question);
                imgView_level_image_src.setImageResource(R.drawable.i10);
                break;
            case 11 :
                textView_level_question_text.setText(R.string.niveau11_question);
                imgView_level_image_src.setImageResource(R.drawable.i11);
                break;
            case 12 :
                textView_level_question_text.setText(R.string.niveau12_question);
                imgView_level_image_src.setImageResource(R.drawable.i12);
                break;
            case 13 :
                textView_level_question_text.setText(R.string.niveau13_question);
                imgView_level_image_src.setImageResource(R.drawable.i13);
                break;
            case 14 :
                textView_level_question_text.setText(R.string.niveau14_question);
                imgView_level_image_src.setImageResource(R.drawable.i14);
                break;
            case 15 :
                textView_level_question_text.setText(R.string.niveau15_question);
                imgView_level_image_src.setImageResource(R.drawable.i15);
                break;
        }



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Toast.makeText(textView_level_label_number.getContext(),"here",Toast.LENGTH_SHORT).show();
        if(resultCode == RESULT_OK && requestCode == DETAIL_REQUEST){
            if (data.hasExtra("level_selected")){
                String selection = data.getExtras().get("level_selected").toString();
                Toast.makeText(textView_level_label_number.getContext(),selection  +"selected",Toast.LENGTH_SHORT).show();

                textView_level_label_number.setText("gggg");
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void updateCircleProgress(){
        double percent =levelSelector.getPercentTextByLevel(lvlNB,databaseHandler);
        float f = Float.parseFloat(percent+"");
        cicrcleDisplay_level_question_progress.showValue(f, 100f, true);
         percent =levelSelector.getPercentImageByLevel(lvlNB,databaseHandler);
         f = Float.parseFloat(percent+"");
        cicrcleDisplay_level_image_progress.showValue(f, 100f, true);
    }

    @Override
    public void onClick(View v) {
        if (v == cicrcleDisplay_level_question_progress || v == textView_level_question_text)
        {
            Intent intent = new Intent(v.getContext(),HomeActivity.class);
            //intent.putExtra("level_selected",""+level_number.getTag(level_number.getId()) );
            v.getContext().startActivity(intent);
        }
    }



}
