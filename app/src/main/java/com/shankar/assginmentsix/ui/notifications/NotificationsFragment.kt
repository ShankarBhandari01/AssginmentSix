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


class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private lateinit var  mywebView: WebView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)
        mywebView = root.findViewById(R.id.webview2) as WebView
        mywebView.webViewClient = WebViewClient()
        mywebView.loadUrl("https://softwarica.edu.np/")
        val webSettings = mywebView.settings
        webSettings.javaScriptEnabled = true

        return root





    }



}