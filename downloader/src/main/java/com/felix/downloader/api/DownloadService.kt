package com.felix.downloader.api

import java.io.File

interface DownloadService {
    data class DownloadConfig(var url: String, var name: String)

    fun download(
        downloadConfig: DownloadConfig,
        onCompelete: (file: File) -> Unit,
        onError: (Throwable) -> Unit,
        onProgress: ((downloaded: Int, total: Int) -> Unit)? = null
    )
}

lateinit var DownloaderDelegate: DownloadService