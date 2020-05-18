package org.tcncoalition.tcnclient

import java.util.Arrays
import java.util.Collections
import java.util.List
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.bridge.JavaScriptModule

class TcnClientPackage : ReactPackage {
    @Override
    fun createNativeModules(reactContext: ReactApplicationContext?): List<NativeModule> {
        return Arrays.< NativeModule > asList < NativeModule ? > TcnClientModule(reactContext)
    }

    @Override
    fun createViewManagers(reactContext: ReactApplicationContext?): List<ViewManager> {
        return Collections.emptyList()
    }
}
