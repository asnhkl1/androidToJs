package demo.lee.com.androidtojs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webImage = (WebView)findViewById(R.id.webImage);
        webImage.getSettings().setSupportZoom(true);//缩放
        webImage.getSettings().setBuiltInZoomControls(true);
        webImage.getSettings().setDisplayZoomControls(false);//不显示控制器
        webImage.getSettings().setUseWideViewPort(true);
        webImage.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webImage.getSettings().setLoadWithOverviewMode(true);
        webImage.getSettings().setBlockNetworkImage(false);
        webImage.getSettings().setUseWideViewPort(true);
        webImage.getSettings().setLoadWithOverviewMode(true);
        webImage.getSettings().setJavaScriptEnabled(true);
        webImage.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webImage.getSettings().setAllowFileAccess(true);
        webImage.getSettings().setAllowFileAccessFromFileURLs(true);
        String assetPath = "file:///android_asset/webview.html";
        webImage.loadUrl(assetPath);
    }

    public void button(View view) {
        String path = "file:///storage/emulated/0/mts/product/images/797df4c8-83f7-4190-8774-6173d8430eec.jpg";
//        String path = "dsdsdsdsds";
        String initPic = "javascript:initPic('"+path+"')";
        webImage.loadUrl(initPic);
    }
}
