package com.company.homework.m2_8.task6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DataBase implements Serializable{
    private static final long serialVersionUID = -7371978919520053907L;
    private long unicID = 0;
    private Map<Integer, Person> map = new HashMap<>();
    private static String path = "C:\\Users\\unknown\\Desktop\\Java ООП\\otherFiles\\db\\db.out";

    private DataBase() { }

    public void add(Person person) {
        map.put((int) unicID++, person);
        System.out.println("Person added in DB.");
        save();
    }

    public void delete(int id) {
        if (map.containsKey(id)){
            map.remove(id);
            System.out.println("The person with id " + id + " was deleted.");
            save();
        }else {
            System.out.println("The person with id " + id + " does not exist in this DB.");
        }
    }

    public void search(int id) {
        if (map.containsKey(id)) {
            System.out.println("id =  " + id + ", " + map.get(id));
        } else {
            System.out.println("The person with id " + id + " does not exist in this DB.");
        }
    }

    public void showAll() {
        Set<Map.Entry<Integer, Person>> set = map.entrySet();
        for(Map.Entry<Integer, Person> entry : set) {
            System.out.println("id = " + entry.getKey() + ", " + entry.getValue());
        }
    }

    public static DataBase getDb() throws Exception{
        File file = new File(path);
        if (!file.exists())
            return new DataBase();

        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return (DataBase) ois.readObject();

        }
    }

    private void save() {
        try(FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
