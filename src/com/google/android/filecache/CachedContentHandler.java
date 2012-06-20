
package com.google.android.filecache;

import java.io.IOException;
import java.net.CacheResponse;
import java.net.URL;

public interface CachedContentHandler {

    public Object getContent(URL url, CacheResponse cacheResponse) throws IOException;

}
