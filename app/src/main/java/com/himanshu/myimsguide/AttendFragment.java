package com.himanshu.myimsguide;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.ByteArrayInputStream;
import java.net.URISyntaxException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

import static com.google.firebase.inappmessaging.internal.Logging.TAG;


public class AttendFragment extends Fragment {
    private String DEFAULT_ERROR_PAGE_PATH = "file:///android_asset/error.html";


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attend, container, false);
        final ProgressBar progressBar = view.findViewById(R.id.Bar5);

        final WebView webView;
        webView = view.findViewById(R.id.webView5);
        WebSettings webSettings= webView.getSettings();



        webView.requestFocus();

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }



        webView.loadUrl(
                "https://imsnoida.page.link/attendance");



               webView.setWebViewClient(new WebViewClient(){


            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){



                if (url.startsWith("http") || url.startsWith("https")) {
                    return false;
                }
                if (url.startsWith("intent")) {


                    try {
                        Intent intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME);

                        String fallbackUrl = intent.getStringExtra("browser_fallback_url");
                        if (fallbackUrl != null) {
                            webView.loadUrl(fallbackUrl);
                            return true;
                        }
                    } catch (URISyntaxException e) {
                        //not an intent uri
                    }

                }
                    view.loadUrl(url);
                return true;



            }

                   @Override
                   public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
                       final AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                       String message = "SSL Certificate error.";
                       switch (error.getPrimaryError()) {
                           case SslError.SSL_UNTRUSTED:
                               message = "The certificate authority is not trusted.";
                               break;
                           case SslError.SSL_EXPIRED:
                               message = "The certificate has expired.";
                               break;
                           case SslError.SSL_IDMISMATCH:
                               message = "The certificate Hostname mismatch.";
                               break;
                           case SslError.SSL_NOTYETVALID:
                               message = "The certificate is not yet valid.";
                               break;
                       }
                       message += " Do you want to continue anyway?";

                       builder.setTitle("SSL Certificate Error");
                       builder.setMessage(message);
                       builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               handler.proceed();
                           }
                       });
                       builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               handler.cancel();
                           }
                       });
                       final AlertDialog dialog = builder.create();
                       dialog.show();
                   }
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }


                   @SuppressLint("NewApi")
                   @Override
                   public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                       if (request.isForMainFrame() && error != null) {
                           view.loadUrl(DEFAULT_ERROR_PAGE_PATH);
                       }
                   }

                   @Override
                   public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                       if (errorCode != WebViewClient.ERROR_UNSUPPORTED_SCHEME && errorCode != WebViewClient.ERROR_HOST_LOOKUP) {
                           view.loadUrl(DEFAULT_ERROR_PAGE_PATH);
                       }
                   }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }



        });



        return view;
    }

    }
