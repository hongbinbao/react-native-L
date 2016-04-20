package com.bpro;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class MyCustomModule extends ReactContextBaseJavaModule {
// Available as NativeModules.MyCustomModule.processString
  public MyCustomModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }
  @ReactMethod
  public void processString(String input, Callback callback) {
    callback.invoke(input.replace("Goodbye", "Native module call!"));
  }
  @Override
  public String getName() {
    return "MyCustomModule";
  }

}