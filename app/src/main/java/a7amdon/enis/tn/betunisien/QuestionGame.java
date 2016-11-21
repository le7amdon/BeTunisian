package a7amdon.enis.tn.betunisien;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import a7amdon.enis.tn.betunisien.animations.CircleDisplay;
import a7amdon.enis.tn.betunisien.animations.FlipAnimation;

public class QuestionGame extends AppCompatActivity  {

    RelativeLayout cellule_response_locked = null;
    RelativeLayout cellule_response_unlocked=null;
    RelativeLayout one_cellule_response = null;

    ViewSwitcher vf=null;
    RelativeLayout request_panel = null;
    RelativeLayout response_panel = null;
    ImageButton btnImage_back=null;
    ImageButton btnImage_back_request=null;
    CircleDisplay progress=null;

    CircleDisplay percent31,percent20,percent16,percent11,percent8,percent5,percent2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_game);


        vf = (ViewSwitcher) findViewById(R.id.viewSwitcher);

        request_panel = (RelativeLayout) findViewById(R.id.request_panel);
        request_panel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    vf.showNext();
                }

                return true;
            }
        });
        response_panel = (RelativeLayout) findViewById(R.id.response_panel);
        response_panel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    vf.showPrevious();
                }

                return true;
            }
        });
        Bundle bundle3 = getIntent().getExtras();
        final String lvl_nbr = bundle3.getString("level_selected");

        btnImage_back = (ImageButton) findViewById(R.id.btnImage_back);
        btnImage_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NiveauxActivity.class);
                intent.putExtra("level_selected", "" + lvl_nbr);
                v.getContext().startActivity(intent);
            }
        });

        btnImage_back_request = (ImageButton) findViewById(R.id.btnImage_back_request);
        btnImage_back_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), NiveauxActivity.class);
                intent.putExtra("level_selected", "" + lvl_nbr);
                v.getContext().startActivity(intent);
            }
        });
        progress = (CircleDisplay) findViewById(R.id.progress);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(33f, 100f, true);


        cellule_response_locked =(RelativeLayout) findViewById(R.id.cellule_response_locked);
        cellule_response_unlocked =(RelativeLayout) findViewById(R.id.cellule_response_unlocked);
        one_cellule_response =(RelativeLayout) findViewById(R.id.one_cellule_response);

        initializeCellule(20,"Frigidère");

    }

    public void onCardClickNothing(){

    }
    public void onCardClick(View view)
    {
        flipCard();
    }
    private void flipCard()
    {
        View root = (View) findViewById(R.id.one_cellule_response);
        View locked = (View) findViewById(R.id.cellule_response_locked);
        View unlocked = (View) findViewById(R.id.cellule_response_unlocked);

        FlipAnimation flipAnimation = new FlipAnimation(locked, unlocked);

        if (locked.getVisibility() == View.GONE)
        {
            flipAnimation.reverse();
        }
        root.startAnimation(flipAnimation);
    }

    public void initializeCellule(int percent,String response_text){
        CircleDisplay progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked);
        progress2.setAnimDuration(3000);
        //progress2.setValueWidthPercent(55f);
        progress2.setTextSize(15f);
        progress2.setColor(Color.BLUE);
        progress2.setDrawText(true);
        progress2.setDrawInnerCircle(true);
        progress2.setFormatDigits(1);
        progress2.setTouchEnabled(false);
        //progress2.setSelectionListener(this);
        progress2.setUnit("");
        progress2.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress2.showValue(percent, 100f, true);
/***********************Top is to locked and Bottom is to unlocked*****************/
        CircleDisplay progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked);
        progress1.setAnimDuration(3000);
        //progress1.setValueWidthPercent(55f);
        progress1.setTextSize(12f);
        progress1.setColor(Color.RED);
        progress1.setDrawText(true);
        progress1.setDrawInnerCircle(true);
        progress1.setFormatDigits(1);
        progress1.setTouchEnabled(false);
        //progress1.setSelectionListener(this);
        progress1.setUnit("");
        progress1.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress1.showValue(percent, 100f, true);

        TextView label_ublocked = (TextView) findViewById(R.id.label_response_unlocked);
        label_ublocked.setText(response_text);
    }

/*
    public void initializeResponsePanel(){

        progress = (CircleDisplay) findViewById(R.id.percent2);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(2f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent5);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(5f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent7);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(7f, 100f, true);


        progress = (CircleDisplay) findViewById(R.id.percent8);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(8f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent11);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(11f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent16);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(16f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent20);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(20f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent31);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(31f, 100f, true);
        }
*/
}
