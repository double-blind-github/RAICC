# RAICC
Reveal Atypical Inter-Component Communication

FOR REVIEWERS: 
 * For the sake of the double-blind-review process, this source code is not compilable

## Definition

We define an atypical ICC method (AICC method) as a method allowing to perform an inter-component communication while it is not its primary purpose.

## Getting started

### Using the tool

<pre>
java -jar RAICC/target/RAICC-0.1-jar-with-dependencies.jar <i>options</i>
</pre>

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details


# List of AICC methods

```
<android.app.ActivityOptions: void requestUsageTimeReport(android.app.PendingIntent)>
<android.app.AlarmManager: void setAlarmClock(android.app.AlarmManager$AlarmClockInfo,android.app.PendingIntent)>
<android.app.AlarmManager: void setAndAllowWhileIdle(int,long,android.app.PendingIntent)>
<android.app.AlarmManager: void setExactAndAllowWhileIdle(int,long,android.app.PendingIntent)>
<android.app.AlarmManager: void setExact(int,long,android.app.PendingIntent)>
<android.app.AlarmManager: void setInexactRepeating(int,long,long,android.app.PendingIntent)>
<android.app.AlarmManager: void set(int,long,android.app.PendingIntent)>
<android.app.AlarmManager: void setRepeating(int,long,long,android.app.PendingIntent)>
<android.app.AlarmManager: void setWindow(int,long,long,android.app.PendingIntent)>
<android.app.Notification$Action$Builder: void <init>(android.graphics.drawable.Icon,java.lang.CharSequence,android.app.PendingIntent)>
<android.app.Notification$Action$Builder: void <init>(int,java.lang.CharSequence,android.app.PendingIntent)>
<android.app.Notification$BubbleMetadata$Builder: android.app.Notification$BubbleMetadata$Builder setDeleteIntent(android.app.PendingIntent)>
<android.app.Notification$BubbleMetadata$Builder: android.app.Notification$BubbleMetadata$Builder setIntent(android.app.PendingIntent)>
<android.app.Notification$Builder: android.app.Notification$Builder addAction(int,java.lang.CharSequence,android.app.PendingIntent)>
<android.app.Notification$Builder: android.app.Notification$Builder setDeleteIntent(android.app.PendingIntent)>
<android.app.Notification$Builder: android.app.Notification$Builder setFullScreenIntent(android.app.PendingIntent,boolean)>
<android.app.Notification$CarExtender$Builder: android.app.Notification$CarExtender$Builder setReadPendingIntent(android.app.PendingIntent)>
<android.app.Notification$CarExtender$Builder: android.app.Notification$CarExtender$Builder setReplyAction(android.app.PendingIntent,android.app.RemoteInput)>
<android.app.Notification$WearableExtender: android.app.Notification$WearableExtender setDisplayIntent(android.app.PendingIntent)>
<android.app.slice.Slice$Builder: android.app.slice.Slice$Builder addAction(android.app.PendingIntent,android.app.slice.Slice,java.lang.String)>
<android.bluetooth.le.BluetoothLeScanner: int startScan(java.util.List<android.bluetooth.le.ScanFilter>,android.bluetooth.le.ScanSettings,android.app.PendingIntent)>
<android.location.LocationManager: void addProximityAlert(double,double,float,long,android.app.PendingIntent)>
<android.location.LocationManager: void requestLocationUpdates(java.lang.String,long,float,android.app.PendingIntent)>
<android.location.LocationManager: void requestLocationUpdates(long,float,android.location.Criteria,android.app.PendingIntent)>
<android.location.LocationManager: void requestSingleUpdate(android.location.Criteria,android.app.PendingIntent)>
<android.location.LocationManager: void requestSingleUpdate(java.lang.String,android.app.PendingIntent)>
<android.media.AudioManager: void registerMediaButtonEventReceiver(android.app.PendingIntent)>
<android.media.session.MediaSession: void setMediaButtonReceiver(android.app.PendingIntent)>
<android.media.session.MediaSession: void setSessionActivity(android.app.PendingIntent)>
<android.net.ConnectivityManager: void registerNetworkCallback(android.net.NetworkRequest,android.app.PendingIntent)>
<android.net.ConnectivityManager: void requestNetwork(android.net.NetworkRequest,android.app.PendingIntent)>
<android.net.sip.sipmanager: void open(android.net.sip.SipProfile,android.app.PendingIntent,android.net.sip.SipRegistrationListener)>
<android.net.VpnService.Builder: android.net.VpnService.Builder setConfigureIntent(android.app.PendingIntent)>
<android.nfc.NfcAdapter: void enableForegroundDispatch(android.app.Activity,android.app.PendingIntent,android.content.IntentFilter[],java.lang.String[][])>
<android.print.PrinterInfo.Builder: android.print.PrinterInfo.Builder setInfoIntent(android.app.PendingIntent)>
<android.support.v4.app.ActivityOptionsCompat: void requestUsageTimeReport(android.app.PendingIntent)>
<android.support.v4.app.NotificationCompat$Action$Builder: void <init>(int,java.lang.CharSequence,android.app.PendingIntent)>
<android.support.v4.app.NotificationCompat$Action: void <init>(int,java.lang.CharSequence,android.app.PendingIntent)>
<android.support.v4.app.NotificationCompat$Builder: android.support.v4.app.NotificationCompat$Builder addAction(int,java.lang.CharSequence,android.app.PendingIntent)>
<android.support.v4.app.NotificationCompat$Builder: android.support.v4.app.NotificationCompat$Builder setFullScreenIntent(android.app.PendingIntent,boolean)>
<android.support.v4.media.app.NotificationCompat$MediaStyle: android.support.v4.media.app.NotificationCompat$MediaStyle setCancelButtonIntent(android.app.PendingIntent)>
<android.support.v4.media.session.MediaSessionCompat: void setMediaButtonReceiver(android.app.PendingIntent)>
<android.support.v4.media.session.MediaSessionCompat: void setSessionActivity(android.app.PendingIntent)>
<android.telephony.euicc.EuiccManager: void downloadSubscription(android.telephony.euicc.DownloadableSubscription,boolean,android.app.PendingIntent)>
<android.telephony.euicc.EuiccManager: void startResolutionActivity(android.app.Activity,int,android.content.Intent,android.app.PendingIntent)>
<android.telephony.euicc.EuiccManager: void switchToSubscription(int,android.app.PendingIntent)>
<android.telephony.euicc.EuiccManager: void updateSubscriptionNickname(int,java.lang.String,android.app.PendingIntent)>
<android.telephony.SmsManager: java.lang.String createAppSpecificSmsTokenWithPackageInfo(java.lang.String,android.app.PendingIntent)>
<android.telephony.SmsManager: void downloadMultimediaMessage(android.content.Context,java.lang.String,android.net.Uri,android.os.Bundle,android.app.PendingIntent)>
<android.telephony.SmsManager: void injectSmsPdu(byte[],java.lang.String,android.app.PendingIntent)>
<android.telephony.SmsManager: void sendDataMessage(java.lang.String,java.lang.String,short,byte[],android.app.PendingIntent,android.app.PendingIntent)>
<android.telephony.SmsManager: void sendMultimediaMessage(android.content.Context,android.net.Uri,java.lang.String,android.os.Bundle,android.app.PendingIntent)>
<android.telephony.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>
<android.telephony.SmsManager: void sendTextMessage(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>
<android.telephony.SmsManager: void sendTextMessageWithoutPersisting(java.lang.String,java.lang.String,java.lang.String,android.app.PendingIntent,android.app.PendingIntent)>
<android.widget.RemoteViews: void setOnClickPendingIntent(int,android.app.PendingIntent)>
<android.widget.RemoteViews: void setPendingIntentTemplate(int,android.app.PendingIntent)>
<androidx.browser.browseractions.BrowserActionItem: void <init>(java.lang.String,android.app.PendingIntent,int)>
<androidx.browser.browseractions.BrowserActionsIntent$Builder: androidx.browser.browseractions.BrowserActionsIntent$Builder setOnItemSelectedAction(android.app.PendingIntent)>
<androidx.core.app.AlarmManagerCompat: void setExact(android.app.AlarmManager,int,long,android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$Action$Builder: void <init>(androidx.core.graphics.drawable.IconCompat,java.lang.CharSequence,android.app.PendingIntent,android.os.Bundle,androidx.core.app.RemoteInput[],boolean,int,boolean,boolean)>
<androidx.core.app.NotificationCompat$Action$Builder: void <init>(int,java.lang.CharSequence,android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$Action$Builder: void <init>(int,java.lang.CharSequence,android.app.PendingIntent,android.os.Bundle,androidx.core.app.RemoteInput[],boolean,int,boolean)>
<androidx.core.app.NotificationCompat$Action$Builder: void <init>(int,java.lang.CharSequence,android.app.PendingIntent,android.os.Bundle,androidx.core.app.RemoteInput[],boolean,int,boolean,boolean)>
<androidx.core.app.NotificationCompat$Action: void <init>(androidx.core.graphics.drawable.IconCompat,java.lang.CharSequence,android.app.PendingIntent,android.os.Bundle,androidx.core.app.RemoteInput[],androidx.core.app.RemoteInput[],boolean,int,boolean,boolean)>
<androidx.core.app.NotificationCompat$Action: void <init>(int,java.lang.CharSequence,android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$Action: void <init>(int,java.lang.CharSequence,android.app.PendingIntent,android.os.Bundle,androidx.core.app.RemoteInput[],androidx.core.app.RemoteInput[],boolean,int,boolean)>
<androidx.core.app.NotificationCompat$Action: void <init>(int,java.lang.CharSequence,android.app.PendingIntent,android.os.Bundle,androidx.core.app.RemoteInput[],androidx.core.app.RemoteInput[],boolean,int,boolean,boolean)>
<androidx.core.app.NotificationCompat$BubbleMetadata$Builder: androidx.core.app.NotificationCompat$BubbleMetadata$Builder setDeleteIntent(android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$BubbleMetadata$Builder: androidx.core.app.NotificationCompat$BubbleMetadata$Builder setIntent(android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$BubbleMetadata: void <init>(android.app.PendingIntent,android.app.PendingIntent,androidx.core.graphics.drawable.IconCompat,int,int,int)>
<androidx.core.app.NotificationCompat$BubbleMetadata: void <init>(android.app.PendingIntent,android.app.PendingIntent,androidx.core.graphics.drawable.IconCompat,int,int,int,androidx.core.app.NotificationCompat$1)>
<androidx.core.app.NotificationCompat$Builder: androidx.core.app.NotificationCompat$Builder addAction(int,java.lang.CharSequence,android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$CarExtender$UnreadConversation: void <init>(java.lang.String[],androidx.core.app.RemoteInput,android.app.PendingIntent,android.app.PendingIntent,java.lang.String[],long)>
<android.app.Notification: void setLatestEventInfo(android.content.Context,java.lang.CharSequence,java.lang.CharSequence,android.app.PendingIntent)>
<com.google.android.gms.location.ActivityRecognitionApi: com.google.android.gms.common.api.PendingResult requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient,long,android.app.PendingIntent)>
<com.google.android.gms.location.FusedLocationProviderApi: com.google.android.gms.common.api.PendingResult requestLocationUpdates(com.google.android.gms.common.api.GoogleApiClient,com.google.android.gms.location.LocationRequest,android.app.PendingIntent)>
<com.google.android.gms.location.FusedLocationProviderClient: com.google.android.gms.tasks.Task requestLocationUpdates(com.google.android.gms.location.LocationRequest,android.app.PendingIntent)>
<com.google.android.gms.location.GeofencingApi: com.google.android.gms.common.api.PendingResult addGeofences(com.google.android.gms.common.api.GoogleApiClient,java.util.List,android.app.PendingIntent)>
<com.google.android.gms.location.LocationClient: void addGeofences(java.util.List,android.app.PendingIntent,com.google.android.gms.location.LocationClient$OnAddGeofencesResultListener)>
<com.google.android.vending.expansion.downloader.DownloaderClientMarshaller: int startDownloadServiceIfRequired(android.content.Context,android.app.PendingIntent,java.lang.Class)>
<com.google.vr.ndk.base.DaydreamApi: void launchInVr(android.app.Activity,android.app.PendingIntent)>
<com.google.vr.ndk.base.DaydreamApi: void launchInVrForResult(android.app.Activity,android.app.PendingIntent,int)>
<androidx.core.app.NotificationCompat$Builder: androidx.core.app.NotificationCompat$Builder setContentIntent(android.app.PendingIntent)>
<androidx.core.app.NotificationCompat$Builder: androidx.core.app.NotificationCompat$Builder setDeleteIntent(android.app.PendingIntent)>
<android.content.pm.PackageInstaller$Session: void commit(android.content.IntentSender)>
<android.content.pm.PackageInstaller: void installExistingPackage(java.lang.String,int,android.content.IntentSender)>
<android.companion.CompanionDeviceManager$Callback: void onDeviceFound(android.content.IntentSender)>
<android.content.IntentSender$OnFinished: void onSendFinished(android.content.IntentSender,android.content.Intent,int,java.lang.String,android.os.Bundle)>
<android.app.FragmentHostCallback: void onStartIntentSenderFromFragment(android.app.Fragment,android.content.IntentSender,int,android.content.Intent,int,int,int,android.os.Bundle)>
<android.service.autofill.SaveCallback: void onSuccess(android.content.IntentSender)>
<androidx.core.content.pm.ShortcutManagerCompat: boolean requestPinShortcut(android.content.pm.ShortcutInfo,android.content.IntentSender)>
<android.service.autofill.FillResponse$Builder: android.service.autofill.FillResponse$Builder setAuthentication(android.content.IntentSender)>
<android.service.autofill.FillResponse$Builder: android.service.autofill.FillResponse$Builder setAuthentication(android.view.autofill.AutofillId[],android.content.IntentSender,android.widget.RemoteViews)>
<android.content.Context: void startIntentSender(android.content.IntentSender,android.content.Intent,int,int,int)>
<android.content.Context: void startIntentSender(android.content.IntentSender,android.content.Intent,int,int,int,android.os.Bundle)>
<android.app.Activity: void startIntentSenderForResult(android.content.IntentSender,int,android.content.Intent,int,int,int)>
<android.app.Activity: void startIntentSenderForResult(android.content.IntentSender,int,android.content.Intent,int,int,int,android.os.Bundle)>
<android.app.Activity: void startIntentSenderFromChild(android.app.Activity,android.content.IntentSender,int,android.content.Intent,int,int,int)>
<android.app.Activity: void startIntentSenderFromChild(android.app.Activity,android.content.IntentSender,int,android.content.Intent,int,int,int,android.os.Bundle)>
<android.content.pm.PackageInstaller: void uninstall(android.content.pm.VersionedPackage,android.content.IntentSender)>
<android.content.pm.PackageInstaller: void uninstall(java.lang.String,android.content.IntentSender)>
<android.app.PendingIntent: void send(android.content.Context,int,android.content.Intent,android.app.PendingIntent$OnFinished,android.os.Handler,java.lang.String,android.os.Bundle)>
<android.app.PendingIntent: void send(android.content.Context,int,android.content.Intent,android.app.PendingIntent$OnFinished,android.os.Handler,java.lang.String)>
<android.app.PendingIntent: void send(android.content.Context,int,android.content.Intent,android.app.PendingIntent$OnFinished,android.os.Handler)>
<android.app.PendingIntent: void send(android.content.Context,int,android.content.Intent)>
<android.app.PendingIntent: void send(int,android.content.Intent,android.app.PendingIntent$OnFinished,android.os.Handler)>
<android.app.PendingIntent: void send()>
<android.app.PendingIntent: void send(int)>
<android.content.IntentSender: void sendIntent(android.content.Context,int,android.content.Intent,android.content.IntentSender$OnFinished,android.os.Handler)>
<android.content.IntentSender: void sendIntent(android.content.Context,int,android.content.Intent,android.content.IntentSender$OnFinished,android.os.Handler,java.lang.String)>
```
