package dev.teamawesome.entities;

public class Doctor
{
    private int id;
    private String name;
    private String hospital;

    public Doctor()
    {
        super();
    }

    public Doctor(int id, String name, String hospital)
    {
        this.id = id;
        this.name = name;
        this.hospital = hospital;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
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

    public String getHospital()
    {
        return hospital;
    }

    public void setHospital(String hospital)
    {
        this.hospital = hospital;
    }

    @Override
    public String toString()
    {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
