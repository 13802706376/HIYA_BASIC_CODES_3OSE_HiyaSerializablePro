package com.hiya.se.serializable;

import java.io.Serializable;

public class Person implements Serializable
{
    private static final long serialVersionUID = -895000390549032906L;
    
    /*
     * 修改系列号，导致后面添加属性反序列化失败 
     * Person对象反序列化失败！com.hiya.se.serializable.Person; local class incompatible: stream classdesc serialVersionUID = -895000390549032906, local class serialVersionUID = -895000390549032999
      Exception in thread "main" java.lang.NullPointerException
    at com.hiya.se.serializable.SerializableClient.main(SerializableClient.java:11)
     */
    //private static final long serialVersionUID = -895000390549032999L;
    
    private Integer id;
    private String name;
    private String sex;
    private Integer age;

    private String country;
    
    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public Person(Integer id, String name, String sex, Integer age)
    {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person()
    {
        super();
    }
    
    @Override
    public String toString()
    {
        return "[id="+this.id+";name="+this.name+"]";
    }
}
