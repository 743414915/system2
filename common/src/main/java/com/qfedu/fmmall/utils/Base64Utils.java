package com.qfedu.fmmall.utils;

import java.util.Base64;

public class Base64Utils {


    /**
     * @Author LZP
     * @Date 2021/8/5 10:55
     * @Version 1.0
     * <p>
     * 对称加密
     * base64 加密 解密 激活邮件的时候 为邮箱地址 code验证码 进行加密
     * 当回传回来后 进行邮箱地址 和 code 的解密
     */

    // 加密
    public static String encode(String msg) {
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }

    // 解密
    public static String decode(String msg) {
        return new String(Base64.getDecoder().decode(msg));
    }
}