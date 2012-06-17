
package com.google.android.filecache;

import java.io.IOException;
import java.net.CacheResponse;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface FullyCached {

    public CacheResponse getCached(URI uri, String requestMethod,
            Map<String, List<String>> requestHeaders) throws IOException;

}
