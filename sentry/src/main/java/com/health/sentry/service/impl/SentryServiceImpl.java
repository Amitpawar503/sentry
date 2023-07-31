package com.health.sentry.service.impl;

import com.health.sentry.config.SentryAPIClient;
import com.health.sentry.config.endpoint.SentryEndPoint;
import com.health.sentry.service.SentryService;
import jakarta.annotation.PostConstruct;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;

import java.io.IOException;

@Service
public class SentryServiceImpl implements SentryService {

    @Autowired
    private SentryAPIClient sentryAPIClient;

    @Override
    public void createExceptionLogs(String body) throws IOException {
        MediaType mediaType = MediaType.parse("application/x-sentry-envelope");
        RequestBody requestBody = RequestBody.create(body,mediaType);
        SentryEndPoint sentryEndPoint = sentryAPIClient.sentryClient().create(SentryEndPoint.class);
        Response response = sentryEndPoint.createExceptionLogs(requestBody).execute();
        if(response.body()!=null){
            System.out.print(response.body());
        }
    }
}