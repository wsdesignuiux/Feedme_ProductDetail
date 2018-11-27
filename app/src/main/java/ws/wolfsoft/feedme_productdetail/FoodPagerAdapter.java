package ws.wolfsoft.feedme_productdetail;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



/**
 * Created by wolfsoft on 10/11/2015.
 */
public class FoodPagerAdapter extends FragmentStatePagerAdapter {



    public FoodPagerAdapter(FragmentManager fm) {
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FisrtFragment tab1 = new FisrtFragment();
                return tab1;

            case 1:
                FisrtFragment tab6 = new FisrtFragment();
                return tab6;


            case 2:
                FisrtFragment tab2 = new FisrtFragment();
                return tab2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}