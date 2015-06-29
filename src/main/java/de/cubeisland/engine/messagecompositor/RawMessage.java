package de.cubeisland.engine.messagecompositor;

import java.util.Iterator;

public class RawMessage implements Iterator<Character>, Iterable<Character>
{
    private final char[] message;
    private int i = -1;

    public RawMessage(String message)
    {
        this.message = message.toCharArray();
    }

    public Iterator<Character> iterator()
    {
        return this;
    }

    public boolean hasNext()
    {
        return message.length > i + 1;
    }

    public Character next()
    {
        return message[++i];
    }

    public void prev()
    {
        i--;
    }

    public Character current()
    {
        return message[i];
    }
}
