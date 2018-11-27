package ws.wolfsoft.feedme_productdetail;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class ProductDetail extends AppCompatActivity {


    Integer[] FoodImage_Id = {R.drawable.pexel,R.drawable.pexel,R.drawable.pexel,R.drawable.pexel,R.drawable.pexel};
    Integer[] Food_13_Image_Id={R.drawable.pexel,R.drawable.pexel,R.drawable.pexel,R.drawable.pexel,R.drawable.pexel};
    String[] Food5_RestaurantName_Id2 = {"Cocobolo Poolside Bar + Grill","The White Rabbit","Burlamacco Ristorante"};

    private RecyclerView recyclerView;
    private Food5_Detail_Adapter food5_detail_adapter;
    private ArrayList<Food5_Detail_Model> modelArrayList;
    private Food5_Detail_Adapter2 food5_detail_adapter2;
    private ArrayList<Food5_Detail_Model2> modelArrayList2;


//viewpager code

    private FoodPagerAdapter loginPagerAdapter;
    private ViewPager viewPager;
    private CircleIndicator indicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);



        recyclerView = findViewById(R.id.RecyclerView_Food5_Detail_Id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ProductDetail.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();


        for (int i=0;i<FoodImage_Id.length;i++){
            Food5_Detail_Model food5_detail_model = new Food5_Detail_Model(FoodImage_Id[i],Food_13_Image_Id[i]);

            modelArrayList.add(food5_detail_model);

        }
        food5_detail_adapter = new Food5_Detail_Adapter(ProductDetail.this,modelArrayList);
        recyclerView.setAdapter(food5_detail_adapter);

//Recycle 2

        recyclerView = findViewById(R.id.RecyclerView2_Food5_Detail_Id);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(ProductDetail.this);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList2 = new ArrayList<>();

        for (int i=0;i<Food5_RestaurantName_Id2.length;i++){
            Food5_Detail_Model2 food5_detail_model2 = new Food5_Detail_Model2(Food5_RestaurantName_Id2[i]);

            modelArrayList2.add(food5_detail_model2);

        }
        food5_detail_adapter2 = new Food5_Detail_Adapter2(ProductDetail.this,modelArrayList2);
        recyclerView.setAdapter(food5_detail_adapter2);








        viewPager = (ViewPager) findViewById(R.id.viewpager);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        loginPagerAdapter = new FoodPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(loginPagerAdapter);
        indicator.setViewPager(viewPager);
        loginPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());

    }
}
