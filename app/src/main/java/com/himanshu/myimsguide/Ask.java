package com.himanshu.myimsguide;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.io.InputStream;
import java.util.Objects;


public class Ask extends Fragment {

    private String DEFAULT_ERROR_PAGE_PATH = "file:///android_asset/error3.html";
    private WebView mWebviewPop;
    private AlertDialog builder;
    private Context mContext;

    private void hideSomeSectionOfBlog(WebView view) {
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("javascript:(function() { " +
                "var elements= document.getElementsByClassName('css-1nj4pho-SSO e1ev778x6'); element = elements[ 0 ]; element.setAttribute( 'style', 'display : none !important' );" +
                "document.getElementsByClassName('css-1nj4pho-SSO e1ev778x6').style.display='none';" +
                "})()");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_ask,container,false);

            final ProgressBar progressBar = view.findViewById(R.id.Bar);



            final WebView webView;
            webView = view.findViewById(R.id.webView1);
            WebSettings webSettings= webView.getSettings();
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView.getSettings().setSupportMultipleWindows(true);
            webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
            webSettings.setDomStorageEnabled(true);
            webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            webSettings.setSavePassword(true);
            webSettings.setSaveFormData(true);
            webSettings.setSupportZoom(false);
        webView.setWebChromeClient(new UriChromeClient());
            webSettings.setBuiltInZoomControls(false);
            webSettings.setEnableSmoothTransition(true);


        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }



            webView.loadUrl(
                    "https://e.widgetbot.io/channels/749079658124804176/749079691373314119");



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            mContext= Objects.requireNonNull(this.getActivity()).getApplicationContext();
        }




        webView.setWebViewClient(new WebViewClient(){






                public boolean shouldOverrideUrlLoading(WebView view, String url){
                    view.loadUrl(url);
                    return true;
                }


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

                        public void onClick(DialogInterface dialog, int which) {
                            handler.proceed();
                        }
                    });
                    builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            handler.cancel();
                        }
                    });
                    final AlertDialog dialog = builder.create();
                    dialog.show();
                }


                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);

                    progressBar.setVisibility(View.VISIBLE);
                }

                @SuppressLint("NewApi")

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
                    hideSomeSectionOfBlog(view);
                    super.onPageFinished(view, url);
                    progressBar.setVisibility(View.GONE);
                }



            });



        return view;
    }





    class UriChromeClient extends WebChromeClient {

        @Override
        public boolean onCreateWindow(WebView view, boolean isDialog,
                                      boolean isUserGesture, Message resultMsg) {


            hideSomeSectionOfBlog(view);

            mWebviewPop = new WebView(mContext);

            mWebviewPop.setVerticalScrollBarEnabled(false);
            mWebviewPop.setHorizontalScrollBarEnabled(false);

            mWebviewPop.setWebChromeClient(new UriChromeClient());
            mWebviewPop.getSettings().setJavaScriptEnabled(true);
            mWebviewPop.getSettings().setSavePassword(true);
            mWebviewPop.getSettings().setSaveFormData(true);
            mWebviewPop.getSettings().setSupportMultipleWindows(true);

            WebView.WebViewTransport transport = (WebView.WebViewTransport) resultMsg.obj;
            transport.setWebView(mWebviewPop);
            resultMsg.sendToTarget();


            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                cookieManager.setAcceptThirdPartyCookies(mWebviewPop,true);
            }


            builder = new AlertDialog.Builder(view.getContext(), AlertDialog.THEME_DEVICE_DEFAULT_LIGHT).create();




            mWebviewPop.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    if (url.contains("/api")) {
                        mWebviewPop.loadUrl(url);

                        hideSomeSectionOfBlog(view);
                        return false;
                    }
                    else if (url.contains("/oauth2")) {
                        mWebviewPop.stopLoading();

                        FragmentTransaction transaction = getFragmentManager().beginTransaction();
                        transaction.replace(R.id.container_fragment, new Ask()); // give your fragment container id in first parameter
                        transaction.addToBackStack(null).commit();




                        Toast.makeText(getContext(), "Enter You Name & Click on Create", Toast.LENGTH_LONG).show();

                        return true;
                    }
                    else {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(url));
                        startActivity(intent);
                        return true;
                    }
                }




            });




            return true;
        }




    }


    }





