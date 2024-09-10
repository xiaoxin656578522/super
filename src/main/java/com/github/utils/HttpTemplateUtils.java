package com.github.utils;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

/**
 * 文件名：  ${file_name}
 * 版权：    Copyright by ljm
 * 描述：
 * 修改人：  HuamingChen
 * 修改时间：2018/10/24
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
public class HttpTemplateUtils {

    public static String httpGet(String url){
        RestTemplate restTemplate=new RestTemplate();
        String result=restTemplate.exchange(url, HttpMethod.GET,null,String.class).getBody();
        return result;
    }

    public static String httpPost(String url,String name){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.postForEntity(url,name,String.class).getBody();
    }

    public static void main(String str[]){
        System.out.println(HttpTemplateUtils.httpGet("https://kx58j6x5me.execute-api.us-east-1.amazonaws.com/scroll/bridge-balances?walletAddress=0xa4E8c3eCB5c8cDCe0D8a5c11B85c887DF9E9C49B"));
//        System.out.println(HttpTemplateUtils.httpPost("http://localhost:8080/testPost1","ming"));
    }
}