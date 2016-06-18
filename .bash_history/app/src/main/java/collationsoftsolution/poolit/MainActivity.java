package collationsoftsolution.poolit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import collationsoftsolution.poolit.adapter.TabsPagerAdapter;
import collationsoftsolution.poolit.menuactions.AccountInfo;
import collationsoftsolution.poolit.menuactions.NewGroup;
import collationsoftsolution.poolit.menuactions.NewPool;
import collationsoftsolution.poolit.menuactions.UploadProofs;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private android.app.ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        assert tabLayout != null;
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
        assert viewPager != null;
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
                Intent ai = new Intent(MainActivity.this, AccountInfo.class);
                startActivity(ai);
                return true;
            case R.id.New_Group:
                Intent ng = new Intent(MainActivity.this, NewGroup.class);
                startActivity(ng);
                return true;
            case R.id.New_Pool:
                Intent np = new Intent(MainActivity.this, NewPool.class);
                startActivity(np);
                return true;
            case R.id.Bank_details:
                Intent up = new Intent(MainActivity.this, UploadProofs.class);
                startActivity(up);
                return true;
            case R.id.Settings_status:
                Toast.makeText(this, getString(R.string.menu_settings_status),
                        Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_Logout:
                Toast.makeText(this, "Succesfully Logged out", Toast.LENGTH_LONG).show();
                finish();
                return true;
        }
        return false;
    }




}