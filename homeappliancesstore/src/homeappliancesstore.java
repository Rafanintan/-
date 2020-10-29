public class homeappliancesstore
{
    static homeappliancesstore company = new homeappliancesstore();
    public static String name;         //Δήλωση μεταβλητών
    public static String address;
    public static int workers_num;
    public void setname(String newname)     //Setter gia name
    {
        name = newname;

    }
    public String getname()                //Getter gia name
    {
        return name;
    }
    public void setaddress(String newaddress)     //Setter gia address
    {
        address = newaddress;

    }
    public String getaddress()                //Getter gia address
    {
        return address;
    }
    public void setworkers(int newworkers)     //Setter gia workers
    {
        workers_num = newworkers;

    }
    public int getworkers()                //Getter gia workers
    {
        return workers_num;
    }
    public static void main(String args[])  //Εκτέλεση προγράμματος
    {


        try
        {
            company.setname(args[0]);
            System.out.println("Company Name:"+company.getname());
        }catch(Exception e)
        {
            System.out.println("Something Went Wrong");
        }
        try
        {
            company.setaddress(args[1]);
            System.out.println("Address:"+company.getaddress());
        }catch(Exception e)
        {
            System.out.println("Something Went Wrong");
        }
        try
        {
            company.setworkers(Integer.parseInt(args[2]));
            System.out.println("Number of workers:"+company.getworkers());
        }catch(Exception e)
        {
            System.out.println("Something Went Wrong");
        }

    }

}
