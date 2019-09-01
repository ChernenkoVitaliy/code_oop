package com.company.examples.m2_9.sample2;

import com.company.examples.m2_5.threads.sample6.Data;

import java.io.*;

public class Message implements Serializable {
    private static final long serialVersionUID = -926957561340016688L;
    private Data data = new Data();
    private String from;
    private String to;
    private boolean isFile;
    private transient String text;
    private transient String path;

    @Override
    public String toString() {
        return new StringBuffer()
                .append("[")
                .append(data.toString())
                .append(", From: ")
                .append(from)
                .append(", To: ")
                .append(to)
                .append("]")
                .append(text)
                .toString();
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
}
