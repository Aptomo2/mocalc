package com.example.mocalc;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.BuildConfig;
import mehdi.sakout.aboutpage.Element;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Element adsElement = new Element();
        adsElement.setTitle("Advertise Here");

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.mipmap.ic_launcher)
                .setDescription(getString(R.string.description))
                .addItem(new Element("Version " + BuildConfig.VERSION_NAME, R.drawable.ic_info_24))
                .addGroup("Connect with us")
                .addEmail("apsky.ap09@gmail.com")
                .addWebsite(getString(R.string.bg))
                .addFacebook(getString(R.string.fb))
                .addTwitter(getString(R.string.tw))
                .addYoutube(getString(R.string.yt))
                .create();
        setContentView(aboutPage);
    }
}