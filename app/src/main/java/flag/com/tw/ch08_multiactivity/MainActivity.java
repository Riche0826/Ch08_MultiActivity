package flag.com.tw.ch08_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void gotoSecondActivity(View v){
        /*Intent it2 = new Intent(this, SecondActivity.class);
        startActivity(it2);*/
        startActivity(new Intent(this, SecondActivity.class));
    }
}
