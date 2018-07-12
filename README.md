Cordova-Plugin-RestartApplication
==============================

Restart your Application.  Cordova / PhoneGap plugin.

Installation:
-------------
1. Install using Cordova CLI:
    `cordova plugin add https://github.com/RodrigoGontijo/Cordova-Plugin-RestartApplication.git`

__Example of usage ()__
           
           declare let cordova: any;
           cordova.plugins.RestartApplication.restartApplication(() => {
              }, () => {
                console.log("重启app ERROR");
              });
