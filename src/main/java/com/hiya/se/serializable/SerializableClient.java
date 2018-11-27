package com.hiya.se.serializable;

public class SerializableClient
{
    public static void main(String[] args)
    {
        SerializableContext sc = SerializableContext.SigleInstance.INSTANCE.sc;
        String path = "E:/Person.txt";
       // sc.serializablePerson(path);
        Person person = sc.deserializablePerson(path);
        System.out.println(person.toString());
    }
}
