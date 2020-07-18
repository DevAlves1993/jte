package org.jusecase.jte.output;

import org.jusecase.jte.TemplateOutput;

import java.io.Writer;

public class StringOutput extends Writer implements TemplateOutput {
    private final StringBuilder stringBuilder;

    public StringOutput() {
        this(8 * 1024);
    }

    public StringOutput(int capacity) {
        stringBuilder = new StringBuilder(capacity);
    }

    @Override
    public Writer getWriter() {
        return this;
    }

    @Override
    public void writeContent(String value) {
        if (value != null) {
            stringBuilder.append(value);
        }
    }

    @Override
    public void writeContent(boolean value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(byte value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(short value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(int value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(long value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(float value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(double value) {
        stringBuilder.append(value);
    }

    @Override
    public void writeContent(char value) {
        stringBuilder.append(value);
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public void reset() {
        stringBuilder.setLength(0);
    }

    // Writer interface

    @Override
    public void write(char[] buffer, int off, int len) {
        stringBuilder.append(buffer, off, len);
    }

    @Override
    public void write(int c) {
        stringBuilder.append((char)c);
    }

    @Override
    public void write(char[] cbuf) {
        stringBuilder.append(cbuf);
    }

    @Override
    public void write(String str) {
        if (str != null) {
            stringBuilder.append(str);
        }
    }

    @Override
    public void write(String str, int off, int len) {
        if (str != null) {
            stringBuilder.append(str, off, len);
        }
    }

    @Override
    public void flush() {
        // nothing to do
    }

    @Override
    public void close() {
        // nothing to do
    }
}