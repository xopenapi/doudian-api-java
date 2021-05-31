package io.github.xopenapi.doudian.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Secret {

    // md5 加密
    public static String stringToMD5(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        StringBuilder md5code = new StringBuilder(new BigInteger(1, secretBytes).toString(16));
        while (md5code.length() < 32) {
            md5code.insert(0, "0");
        }
        return md5code.toString();
    }

    // HmacSHA256 加密
    private static String crypto(String input) {
        try {
            String secret = "key";// 加密使用的key

            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256_HMAC.init(secret_key);

            return byteArrayToHexString(sha256_HMAC.doFinal(input.getBytes()));
        } catch (Exception e){
            System.out.println("Error");
            return "error";
        }
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b!=null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1)
                hs.append('0');
            hs.append(stmp);
        }
        return hs.toString().toLowerCase();
    }

    public static void main(String []args){
        String secret = "749698a6-fcb3-4358-b241-ec1d93cf9c1f";
        String str = secret+"app_key6844048284663924231"+"methodproduct.list"+
                "param_json{\"page\":\"0\",\"size\":\"20\"}"+"timestamp2020-07-05 22:33:59"+"v2"+secret;
        String res = stringToMD5(str);
        System.out.println(res);
    }
}
