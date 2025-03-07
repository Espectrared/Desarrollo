package modelo;

public class Directorio
{
    private String name;
    private String address;
    private String cel;
    private String email;

    public Directorio(String name, String address, String cel, String email)
    {
        this.name = name;
        this.address = address;
        this.cel = cel;
        this.email = email;
    }

    public String getname()
    {
        return name;
    }

    public String getaddress()
    {
        return address;
    }

    public String getcel()
    {
        return cel;
    }

    public String getemail()
    {
        return email;
    }
}
