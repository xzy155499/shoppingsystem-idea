package com.guigu.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String app_id = "2021000116658882";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDFNYLlrRjRa6OJR5pjddlgUDi85d5VpwkfBHhf91xPekgRf8+ZJwTve/YoL9Uel2DXFxpcH6tJjhLJ7vUh0/Ysc8fNZIcaCfW3vn3RX1Q9HE63e6+GnOVh3sZ2o5qrWS6V7DM5ez7KXk1qIGf7sFbzLeGI9DjOJPb250+Oejd6ugMg2zSvhTcA7JfnYC7GG3zYLYi08diz/Ocwm+1YfdmRyAVZvrCPLxiJCHtEQW/xcIwiblqZaxXG2ah2AGQFVh8MlH+MVjcRpW6nRiGvExpRf7HhkE3EnRdU5nVKPMQdWvWiOrk5H69f49mgODWAhy/dfAcNcf23wcd5uARQMQNzAgMBAAECggEAB4UR17YxAxNKqhpr3a0Ju+1zLGjLgJKc+2zNNkOVZoZwJxKrlNhzDLq6WS/xvXfiPnFoFOk0O9rKBp8xA7g0Y9+KV9+kcy68CuSdoZUz/hyNN9vkhoqHCKNZB/8XD7+X0imujluPumG8K/bOYD+KIT23ouRFIj8wl5ucYf9xDCHoZ5whkParUvJXjF13QD9iNGyiGq8qSVvIlP5YM91qntAO7CN6myDO3LX/2xA1pObP1sAfXMCw3YxnFO4HGHan703/xO5u5GiX5aYh7KyuI58j8ixzypfc1Vdplo2fp3Fm6K+eMizJ/LQyETyxn1mxsgImDP3JdtarJe2RPXBviQKBgQD9qYjO2chfR7xnRji+Fz2uOtiG4tIKnIlthSxt1SXjUy+Hu1nN2bWrI850Gq7RRthkZRUF62BqvlQpDbotvH6ZVGajFz6V69wBNXGvmvqKVfOSgxiJ3Di157jYt0F78Q4SqmK5qUBG14c95fr70PIAdKFOii4oYwage8r73De/xQKBgQDHBslqiZmS0eklzP9SmEOwhEAoTluH9+RfDs+RUPtON8PZsWgwmrHfkF5WI1EwoiXBV++z3Dyyy1Y1NLw4sVts7sl2IEAcmu33txOyBXzEz6yJxeR1bu68ENqKCS1Ae6+0whxWqHXGa6jZC5oNHpip22Y9Qw0VSuIUzHnfRWVx1wKBgQCtDAw1uSLVxVWFSsWJAMfmZWSz2GccMCAc4/4kS4XWaDiDq08ffIdP4lSEpnNed6tGCiNmb2XOTFuTyjaZ3v6q0YZXepMKqeXjuTb+aobC+tH4wJBr9B2IEzXqOlJlIFTObQh+yjT8Xyp3Er6/LZL6tpYYw3GrwaqSrwESAvDRVQKBgAL9xh80zDsZrpBj4V6DbVkE09YHP3busd7/4PzFI9HMIsRt1ywL1yqOB+zxgPHjLgAW60JfyAXD6prIHSAZAk/D0wFUgMItTfBQLxqY3IQ0vtofQEzHiw0Gj9JNSwHSGhT0aeqfg42k5pfEhd82m4LKCmJXVKYCRx2a6SYC7ABnAoGBAOTEWWb2nep8c+wQ4r2llX15UlRQQsmqI0fFLfQE7oaN7XmCNgOexbEVaDWhAQVasLfIR5CF6ZxfesJP0/Gc1tNKRWAxYBUlBJP64HXCtsvEvyL7Ih1E422XH1ZU1HpIQqLA+C63orRx7GCc08wIHkwtqZakPRr1pAAi246gohEH";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmBRevMuozDZYoys5KSgK5Sl8hwtQqoKGbFtn7L4Zgi8OdzrPrKVhiizx/sYglsQwV5Tlhmu9yUj7N2c1gl1evB9HAbo09+dIIXkLRGvht4xEoZ23ikVPFmSlNM6NdQ2qDkxp3pzi0296RjmP/K9bXQEZareu7Muq4r3fZKJCOqSeXAG384WD4lExCs10jfodj3aLuiibd/b6ew62lyv2dSsVRiIQ3jBrqGGViK1v4arkCDgGp8JxQLgHctnvehTtFt2+JcVjqG5P4rcsNaesv385R0phSfcr9DPLmyNxdypEQ44Da83H1AOWxd/zC6wSGf9Ut5XhNgebdiIxXm5f4QIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:9090/shoppingsystem/orderBuy?rr=1";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
