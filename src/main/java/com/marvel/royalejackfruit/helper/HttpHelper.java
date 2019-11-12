package com.marvel.royalejackfruit.helper;

import com.marvel.royalejackfruit.domain.dto.HttpResponseJson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Marvel on 2019/11/12.
 */
public class HttpHelper {

    private static final Logger logger = LoggerFactory.getLogger(HttpHelper.class);

    public static HttpResponseJson get(String url, String token) {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Content-Type", "application/json");
        httpGet.setHeader("Accept", "application/json");
        httpGet.setHeader("authorization", "Bearer " + token);

        logger.info("url: " + url);
        HttpResponseJson httpResponseJson = new HttpResponseJson();
        try {
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            logger.info("statusCode: " + statusCode);
            String responseJson = EntityUtils.toString(httpResponse.getEntity());
            logger.info("responseJson: " + responseJson);

            httpResponseJson.setStatusCode(statusCode);
            httpResponseJson.setResponseJson(responseJson);
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
            httpGet.releaseConnection();
        }
        return httpResponseJson;
    }

}
