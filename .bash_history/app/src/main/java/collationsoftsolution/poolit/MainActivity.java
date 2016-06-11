package collationsoftsolution.poolit;

import android.support.v4.app.FragmentTransaction;
import android.app.ActionBar.TabListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.app.ActionBar.Tab;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;


import collationsoftsolution.poolit.adapter.TabsPagerAdapter;
import collationsoftsolution.poolit.R;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private android.app.ActionBar actionBar;

    private String[] tabs = { "Shop", "Chat", "Pool", "Contacts" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("SHOP"));
        tabLayout.addTab(tabLayout.newTab().setText("CHAT"));
        tabLayout.addTab(tabLayout.newTab().setText("POOL"));
        tabLayout.addTab(tabLayout.newTab().setText("CONTACTS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final TabsPagerAdapter adapter = new TabsPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        if (viewPager != null) {
            viewPager.setAdapter(adapter);
        }
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_messages:
                Toast.makeText(this, getString(R.string.action_messages),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.social_notifications:
                Toast.makeText(this, getString(R.string.social_notifications),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.Account_Info:
                Toast.makeText(this, getString(R.string.menu_account_info),
                        Toast.LENGTH_SHORT).show();// close the activity
                return true;
            case R.id.New_Group:
                Toast.makeText(this, getString(R.string.social_notifications),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.New_Pool:
                Toast.makeText(this, getString(R.string.menu_new_pool),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.Bank_details:
                Toast.makeText(this, getString(R.string.menu_proofs_bankdetails),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.Settings_status:
                Toast.makeText(this, getString(R.string.menu_settings_status),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_Logout:
                Toast.makeText(this, "Succesfully Logged out",
                        Toast.LENGTH_LONG).show();
                finish();
                return true;
        }
        return false;
    }



}