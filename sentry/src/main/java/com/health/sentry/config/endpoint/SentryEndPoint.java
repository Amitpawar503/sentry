package com.health.sentry.config.endpoint;

import okhttp3.RequestBody;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Component
public interface SentryEndPoint {

        @Headers({"Content-Type:application/x-sentry-envelope",
                "User-Agent:sentry.java.android/6.17.0",
                "Host:o4505001302097920.ingest.sentry.io",
                "X-Sentry-Auth:Sentry sentry_version=7,sentry_client=sentry.java.android/6.17.0,sentry_key=a0b1368579f04f568d7f62516e506f46",
                "baggage: sentry-trace_id=o4505001302097920,sentry-public_key=a0b1368579f04f568d7f62516e506f46,sentry-user_segment=0f09df32-2fa4-4f21-932c-8bd02b898d95,sentry-sample_rate=1"})
        @POST("store/")
        Call<Object> createExceptionLogs(@Body RequestBody body);

        @Headers({"Content-Type:application/x-sentry-envelope",
                "User-Agent:sentry.java.android/6.17.0",
                "Host:o4505001302097920.ingest.sentry.io",
                "X-Sentry-Auth:Sentry sentry_version=7,sentry_client=sentry.java.android/6.17.0,sentry_key=a0b1368579f04f568d7f62516e506f46",
                "trace_id:o4505001302097920",
                "public_key:a0b1368579f04f568d7f62516e506f46",
                "user_segment:0f09df32-2fa4-4f21-932c-8bd02b898d95",
                "sample_rate:1"})
        @POST("envelope/")
        Call<Object> createExceptionLogsWithEnvelop(@Body RequestBody body);

}
