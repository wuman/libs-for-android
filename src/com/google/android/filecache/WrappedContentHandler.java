
package com.google.android.filecache;

import java.io.IOException;
import java.net.ContentHandler;
import java.net.URLConnection;

public abstract class WrappedContentHandler extends ContentHandler {

    private final ContentHandler mContentHandler;

    public WrappedContentHandler(ContentHandler contentHandler) {
        super();
        mContentHandler = contentHandler;
    }

    public final ContentHandler getContentHandler() {
        return mContentHandler;
    }

    /** {@inheritDoc} */
    @Override
    public Object getContent(URLConnection connection) throws IOException {
        return mContentHandler.getContent(connection);
    }

}
