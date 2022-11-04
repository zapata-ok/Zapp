package com.zapata.zapp.algorithm;

import android.util.Base64;

public class Base64Utils {

    public static String EncodeByte2String(byte[] data){
        String result = Base64.encodeToString(data,0);
        return result;
    }

    public static byte[] DecodeString2Byte(String data){
        byte[] result = Base64.decode(data,0);
        return result;
    }
}
