package com.medavox.util.ui;

import java.io.PrintStream;

public class PrintStreamAdapter extends PrintStream
{
    public PrintStreamAdapter()
    {
        super(new NullOutputStream());
    }
}
