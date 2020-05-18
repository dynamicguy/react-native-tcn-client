package org.tcncoalition.tcnclient

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

class TcnClientModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    private val reactContext: ReactApplicationContext

    @get:Override
    val name: String
        get() = "TcnClient"

    @ReactMethod
    fun sampleMethod(stringArgument: String, numberArgument: Int, callback: Callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: $numberArgument stringArgument: $stringArgument")
    }

    init {
        this.reactContext = reactContext
    }
}
