package com.mobilebytes.andparty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;


/**
 * MainActivity uses a Handler set-up in onCreate to start the splash animation
 * as than we can use some logic to only trigger the splash when needed based on
 * the value mShowSplash and preferences.
 *
 * In a anti-activity dahsboard pattern this will allow us to than establish and
 * use another handler at the dashboard activity level to handle turning on and
 * off views as a user navigates the dashboard.
 * @author fredgrott
 *
 */
public class MainActivity extends Activity {





    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.main);






    }





}