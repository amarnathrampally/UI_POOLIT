package collationsoftsolution.poolit.adapter;

import collationsoftsolution.poolit.fragment.ShopFragment;
import collationsoftsolution.poolit.fragment.MessageFieldFragment;
import collationsoftsolution.poolit.fragment.PoolFragment;
import collationsoftsolution.poolit.fragment.ContactsFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new ShopFragment();
            case 1:
                return new MessageFieldFragment();
            case 2:
                return new PoolFragment();
            case 3:
                return new ContactsFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
