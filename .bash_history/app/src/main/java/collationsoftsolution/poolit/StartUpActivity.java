package collationsoftsolution.poolit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StartUpActivity extends AppCompatActivity implements View.OnClickListener{

    private static Button login_button;
    private static EditText username;
    private static EditText password;
    private static TextView forgot_pwd;
    private static TextView reg_as_user;
    private static TextView reg_as_merchant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_start_up);

        username = (EditText) findViewById(R.id.loginName);
        password = (EditText) findViewById(R.id.loginPwd);
        forgot_pwd = (TextView) findViewById(R.id.forgot_pwd);
        reg_as_user = (TextView) findViewById(R.id.regUser);
        reg_as_merchant = (TextView) findViewById(R.id.regMerchant);
        login_button = (Button) findViewById(R.id.loginButton);

        login_button.setOnClickListener(this);
        forgot_pwd.setOnClickListener(this);
        reg_as_user.setOnClickListener(this);
        reg_as_merchant.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.loginButton:
                   break;

            case R.id.forgot_pwd:
                break;

            case R.id.regUser:
                startActivity(new Intent(this, UserRegisterActivity.class));
                break;

            case R.id.regMerchant:
                startActivity(new Intent(this, MerchantRegActivity.class));
                break;

            default:
                break;

        }
    }

}
