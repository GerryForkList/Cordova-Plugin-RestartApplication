/*
 * Android Data Roaming Setting
 * Cordova 2.2.0
 * Email: rodrigo[dot]gontijo[at]hotmail[dot]com
 * Author: Rodrigo Augusto Gontijo
 * Date: 05/23/2016
 */

var exec = require('cordova/exec');

var RestartAplication = {
  restartAplication: function(successCallback, failureCallback){
		return exec(
			successCallback,
			failureCallback,
			'RestartAplication',
			'restartAplication',
			[]);
	}
};

module.exports = RestartAplication;