package com.greengrowapps.ggarest.streams;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface StreamConverter {
    void writeToOutputStream(String string, OutputStream outputStream) throws IOException;
    String readFromInputStream(InputStream inputStream) throws IOException;
}
