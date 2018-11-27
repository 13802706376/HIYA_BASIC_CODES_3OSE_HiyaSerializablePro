package com.hiya.se.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableContext
{
    public void serializablePerson(String path)
    {
        Person person = new Person(1, "wade", "M", 33);
        ObjectOutputStream oo = null;
        try
        {
            oo = new ObjectOutputStream(new FileOutputStream(new File(path)));
            oo.writeObject(person);
            System.out.println("Person对象序列化成功！");
        } catch (IOException e)
        {
            System.err.println("Person对象序列化失败！" + e.getMessage());
        } finally
        {
            if (null != oo)
            {
                try
                {
                    oo.close();
                } catch (IOException e)
                {
                    System.err.println("Person对象序列化失败！" + e.getMessage());
                }
            }
        }
    }

    public Person deserializablePerson(String path)
    {
        ObjectInputStream ois = null;
        Person person = null;
        try
        {
            ois = new ObjectInputStream(new FileInputStream(new File(path)));
            person = (Person) ois.readObject();
            System.out.println("Person对象反序列化成功！");

        } catch (IOException | ClassNotFoundException e)
        {
            System.err.println("Person对象反序列化失败！" + e.getMessage());
        } finally
        {
            try
            {
                ois.close();
            } catch (IOException e)
            {
                System.err.println("Person对象反序列化失败！" + e.getMessage());
            }
        }
        return person;
    }
    
    public enum SigleInstance
    {
        INSTANCE;
        public SerializableContext sc = null;
        SigleInstance()
        {
            sc = new SerializableContext();
        }
    }
}

