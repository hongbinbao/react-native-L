# react-native-L
    env
        nodejs >= 4.0 Current: > 5.0 
        watchman
        flow
        android device or emulator
        JDK
        android SDK (https://developer.android.com/sdk/installing/index.html)
        Configure your SDK 
            Android SDK Build-tools version 23.0.1
            Android 6.0 (API 23)
            Local Maven repository for Support Libraries (this is called Android Support Repository in older versions)
        Genymotion: fast android emulator (Alternative Google andorid emilator)

    note:
        1: linux
            nvm
            npm
            brew 
                ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Linuxbrew/linuxbrew/go/install)"
        2: SDK config
            Android SDK Build-tools version 23.0.1
            Android 6.0 (API 23)
            Local Maven repository for Support Libraries (this is called Android Support Repository in older versions)
        3: ddmlib error
           adb reverse --list
           adb reverse tcp:8081 tcp:8081
        4: package server
           $ react-native start
               Running packager on port 8081

