package com.felix.downloader.impl

import android.app.Application
import com.felix.combase.IAppInit
import com.felix.downloader.api.DownloaderDelegate
import com.liulishuo.filedownloader.FileDownloader

class DownloadAppInit : IAppInit {
    override fun initModule(app: Application) {
        AppDelegate = app
        FileDownloader.setup(app)
        DownloaderDelegate = DownloadImpl(app)
    }
}

internal lateinit var AppDelegate: Application