Cordova-Plugin-RestartAPlication
==============================

Restart your Aplication.  Cordova / PhoneGap plugin.

Installation:
-------------
1. Install using Cordova CLI:
    `cordova plugin add https://github.com/RodrigoGontijo/Cordova-Plugin-RestartAplication.git`

__Example of usage ()__

  	<!DOCTYPE html>
    <html>
      <head>
        <script type="text/javascript" charset="utf-8" src="cordova-X.X.X.js"></script>
        <script type="text/javascript" charset="utf-8" src="jquery.js"></script>
        <script type="text/javascript" charset="utf-8" src="RestartAplication.js"></script>
        <script type="text/javascript" charset="utf-8">
         
          $('#restartAplication').bind('click',function(){
              RestartAplication.restartAplication(onRestartSuccess, onRestartError);
          });
         
          //Callbacks
          function onRestartSuccess(){
              console.log("Works");
          }
          function onRestartError(){
              //Manage Error
          }
         
        </script>
      </head>
      <body>
        <input type="button" id="restartAplication" value="Restart your aplication"/>
      </body>
    </html>
