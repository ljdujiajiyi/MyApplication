package soexample.umeng.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleDraweeView ss= findViewById(R.id.img);
        ss.setImageURI("https://img.huxiucdn.com/article/cover/201810/29/153108448766.jpg");
    }
}
