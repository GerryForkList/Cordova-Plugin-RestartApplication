/*
 * Phonegap VolumeMax Plugin for Android
 * Cordova 2.2.0
 * Email: rodrigo[dot]gontijo[at]hotmail[dot]com
 * Author: Rodrigo Augusto Gontijo
 * Date: 05/23/2016
 */

package com.rodrigo.plugins.restartAplication;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Intent;
import android.provider.Settings;


import android.content.Context;
import android.media.*;

public class RestartAplication extends CordovaPlugin {

    public static final String SET = "restartAplication";
    private static final String TAG = "RestartAplication";

    private Context context;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        boolean actionState = true;
        context = cordova.getActivity().getApplicationContext();
        if (SET.equals(action)) {
            try {
                //Intent to restart aplication
                Intent intent = context.getPackageManager()
                        .getLaunchIntentForPackage( context.getPackageName() );
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                cordova.getActivity().finish();
                this.cordova.startActivityForResult(this,intent,0);
                
            } catch (Exception e) {
                LOG.d(TAG, "Error go to settings " + e);
                actionState = false;
            }
        } else {
            actionState = false;
        }
        return actionState;
    }

}