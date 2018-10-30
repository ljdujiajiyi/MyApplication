package soexample.umeng.com.myapplication;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/*
 * 作者：秦永聪
 *日期：2018/10/30
 * */public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
