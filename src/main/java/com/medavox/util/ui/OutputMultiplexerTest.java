package com.medavox.util.ui;

import java.awt.Color;
public class OutputMultiplexerTest
{
    public static void main(String[] args)
    {
        
        GraphicalPrintout[] streams = new GraphicalPrintout[2];
        streams[0] = new GraphicalPrintout("stdout");
        streams[1] = new GraphicalPrintout("stderr", Color.RED);
        OutputMultiplexer om = new OutputMultiplexer("OutputMultiplexer Test", streams[0], streams[1]);
        
        
        for(int i = 0; i < 300; i++)
        {
            streams[i%2].println("i: "+i);
        }
        //out.println("lol!");
        //err.println("OSHT");
    }
}
