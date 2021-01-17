package com.shankar.assginmentsix.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.shankar.assginmentsix.R


class aboutUs : Fragment() {

    private lateinit var  mywebView: WebView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        mywebView = view.findViewById(R.id.webview2) as WebView
        mywebView.webViewClient = WebViewClient()
        mywebView.loadUrl("https://softwarica.edu.np/")
        val webSettings = mywebView.settings
        webSettings.javaScriptEnabled = true

        return view





    }



}