package a7amdon.enis.tn.betunisien;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import a7amdon.enis.tn.betunisien.db.DatabaseHandler;
import a7amdon.enis.tn.betunisien.util.Niveau;
import a7amdon.enis.tn.betunisien.util.Reponse;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView=null;
    private NiveauxAdapter adapter=null;
    private List<Niveau> niveauxList=null;
    public enum  StatusLevel {blocked,zero,one,two};
    DatabaseHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_app);

        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        recyclerView = (RecyclerView) findViewById(R.id.recyle_view_levels);

        niveauxList = new ArrayList<>();
        adapter = new NiveauxAdapter(this, niveauxList);

        //RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        //recyclerView.addItemDecoration(new LinearLayoutManager.SavedState());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.n2).into((ImageView) findViewById(R.id.backdrop_app));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_app);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar_app);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

    /**
     * Adding few levels for testing
     */
    private void prepareAlbums() {
        int[] all_level_numbers = new int[]{
                R.drawable.n1,
                R.drawable.n2,
                R.drawable.n3,
                R.drawable.n4,
                R.drawable.n5,
                R.drawable.n6,
                R.drawable.n7,
                R.drawable.n8,
                R.drawable.n9,
                R.drawable.n10,
                R.drawable.n11,
                R.drawable.n12,
                R.drawable.n13,
                R.drawable.n14,
                R.drawable.n15};

        Niveau n = new Niveau(1,null,null,StatusLevel.blocked,all_level_numbers[0]);
        niveauxList.add(n);

        n = new Niveau(2,null,null,StatusLevel.blocked,all_level_numbers[1]);
        niveauxList.add(n);

        n = new Niveau(3,null,null,StatusLevel.two,all_level_numbers[2]);
        niveauxList.add(n);

        n = new Niveau(4,null,null,StatusLevel.zero,all_level_numbers[3]);
        niveauxList.add(n);

        n = new Niveau(5,null,null,StatusLevel.one,all_level_numbers[4]);
        niveauxList.add(n);

        n = new Niveau(6,null,null,StatusLevel.two,all_level_numbers[5]);
        niveauxList.add(n);

        n = new Niveau(7,null,null,StatusLevel.blocked,all_level_numbers[6]);
        niveauxList.add(n);

        n = new Niveau(8,null,null,StatusLevel.blocked,all_level_numbers[7]);
        niveauxList.add(n);

        n = new Niveau(9,null,null,StatusLevel.blocked,all_level_numbers[8]);
        niveauxList.add(n);

        n = new Niveau(10,null,null,StatusLevel.blocked,all_level_numbers[9]);
        niveauxList.add(n);

        n = new Niveau(11,null,null,StatusLevel.blocked,all_level_numbers[10]);
        niveauxList.add(n);

        n = new Niveau(12,null,null,StatusLevel.blocked,all_level_numbers[11]);
        niveauxList.add(n);

        n = new Niveau(13,null,null,StatusLevel.blocked,all_level_numbers[12]);
        niveauxList.add(n);

        n = new Niveau(14,null,null,StatusLevel.blocked,all_level_numbers[13]);
        niveauxList.add(n);

        n = new Niveau(15,null,null,StatusLevel.blocked,all_level_numbers[14]);
        niveauxList.add(n);



        adapter.notifyDataSetChanged();
    }

    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
