
package com.google.android.filecache;

import java.io.IOException;
import java.net.CacheResponse;

public interface CachedContentHandler {

    public Object getContent(CacheResponse cacheResponse) throws IOException;

}
