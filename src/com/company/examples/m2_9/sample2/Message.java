package com.company.examples.m2_9.sample2;

import com.company.examples.m2_5.threads.sample6.Data;

import java.io.*;
import java.util.Date;

public class Message implements Serializable {
    private static final long serialVersionUID = -926957561340016688L;
    private Date date = new Date();
    private String from;
    private String to;
    private boolean isFile;
    private transient String text;
    private transient String path;

    public static Message readFromStream(InputStream in) throws IOException, ClassNotFoundException {
        if (in.available() <= 0)
            return null;

        DataInputStream ds = new DataInputStream(in);
        int len = ds.readInt();
        byte[] packet = new byte[len];
        ds.read(packet);

        ByteArrayInputStream bs = new ByteArrayInputStream(packet);
        ObjectInputStream os = new ObjectInputStream(bs);

        try {
            Message msg = (Message) os.readObject();
            if (!msg.isFile) {
                msg.text = os.readUTF();
            }else {
                //read file content
            }

            return msg;
        }finally {
            os.close();
        }
    }

    public void writeToStream(OutputStream out) throws IOException {
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(bs);

        try {
            os.writeObject(this);

            if (!isFile) {
                os.writeUTF(text);
            }else {
                //write file
            }
        }finally {
            os.flush();
            os.close();
        }

        byte[] packet = bs.toByteArray();

        DataOutputStream ds = new DataOutputStream(out);
        ds.writeInt(packet.length);
        ds.write(packet);
        ds.flush();
    }

    @Override
    public String toString() {
        return new StringBuffer()
                .append("[")
                .append(date.toString())
                .append(", From: ")
                .append(from)
                .append(", To: ")
                .append(to)
                .append("]")
                .append(text)
                .toString();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
