package collationsoftsolution.poolit.menuactions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import collationsoftsolution.poolit.R;


public class NotificationsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
                return true;
            case R.id.Account_Info:
                Intent ai = new Intent(NotificationsActivity.this, AccountInfo.class);
                startActivity(ai);
                return true;
            case R.id.New_Group:
                Intent ng = new Intent(NotificationsActivity.this, NewGroup.class);
                startActivity(ng);
                return true;
            case R.id.New_Pool:
                Intent np = new Intent(NotificationsActivity.this, NewPool.class);
                startActivity(np);
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
                Toast.makeText(this, "Succesfully Logged out", Toast.LENGTH_LONG).show();
                finish();
                return true;
        }
        return false;
    }


}

