package tasks.filetypes;

import tasks.interfaces.ReadWrite;

public class TextDocument implements ReadWrite {
    public void read(){
        System.out.println("Reading text document...");
    }

    public void write(){
        System.out.println("Writing into text document...");
    }
}
