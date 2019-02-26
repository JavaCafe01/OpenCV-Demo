package com.gsnathan.opencvdemo;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

import androidx.fragment.app.Fragment;

public class MainIntroActivity extends AppIntro {

    int bg = Color.parseColor("#008577");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getSupportActionBar() != null)
            getSupportActionBar().hide();

        SliderPage first = new SliderPage();
        first.setTitle(getString(R.string.title_intro));
        first.setDescription(getString(R.string.description__intro));
        first.setImageDrawable(R.mipmap.ic_launcher);
        first.setBgColor(bg);
        addSlide(AppIntroFragment.newInstance(first));

        SliderPage second = new SliderPage();
        second.setTitle(getString(R.string.title_orient));
        second.setDescription(getString(R.string.description_orient));
        second.setImageDrawable(R.mipmap.ic_launcher);
        second.setBgColor(bg);
        addSlide(AppIntroFragment.newInstance(second));

        showSkipButton(false);
        askForPermissions(new String[]{Manifest.permission.CAMERA}, 1);
        showStatusBar(false);
        setNavBarColor("#008577");
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
