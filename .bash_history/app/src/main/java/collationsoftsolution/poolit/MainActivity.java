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


public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private android.app.ActionBar actionBar;

    private String[] tabs = { "Shop", "Chat", "Pool", "Contacts" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener((android.app.ActionBar.TabListener) this));
        }

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
                        Toast.LENGTH_SHORT).show();
                finish(); // close the activity
                return true;
            case R.id.New_Group:
                Toast.makeText(this, getString(R.string.social_notifications),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.New_Pool:
                Toast.makeText(this, getString(R.string.social_notifications),
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
                Toast.makeText(this, getString(R.string.action_Logout),
                        Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }



    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}