package com.calista.kogiscan;

import androidx.multidex.MultiDexApplication;

import com.rohitss.uceh.UCEHandler;

/**
 * Created by Eric on 10/8/2017.
 */

public class Application extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        new UCEHandler.Builder(this).setTrackActivitiesEnabled(true).addCommaSeparatedEmailAddresses("kogi@zalego.com,erickogi14@gmail.com").build();



    }

}
