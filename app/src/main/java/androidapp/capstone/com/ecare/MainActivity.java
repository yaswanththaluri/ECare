package androidapp.capstone.com.ecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private CardView loginLay, signUpLay;
    private LinearLayout chToLogin, chToSignup;
    private TextView headTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginLay = findViewById(R.id.signindetails);
        signUpLay = findViewById(R.id.signupdetails);

        chToLogin = findViewById(R.id.changeToSignIn);
        chToSignup = findViewById(R.id.changeToSignUp);

        headTitle = findViewById(R.id.head);


        chToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signUpLay.setVisibility(View.INVISIBLE);
                loginLay.setVisibility(View.VISIBLE);
                chToLogin.setVisibility(View.INVISIBLE);
                chToSignup.setVisibility(View.VISIBLE);
                headTitle.setText("Verify It's You!");

            }
        });

        chToSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                signUpLay.setVisibility(View.VISIBLE);
                loginLay.setVisibility(View.INVISIBLE);
                chToLogin.setVisibility(View.VISIBLE);
                chToSignup.setVisibility(View.INVISIBLE);
                headTitle.setText("Join with US!");

            }
        });




    }
}
