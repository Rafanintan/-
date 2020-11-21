public class Device implements devicebasic      //H abstract class Device Askhsh 5 pou dinei ta stixeia tis
{                                               //sta antikeimena Fridge,Oven etc
    float len;                      //Mhkos
    float height;                   //Ypsos
    float depth;                    //Bathos
    String manu_name;               //Manufacturer name
    String obj_name;                //Object name
    String type;                    //Eidos antikeimenou
    int energy_con;                 //Energy Consumption

    boolean stats;                  //Anoixti h klisti syskeui

    public void poweron()
    {
        stats = true;
    }


    public void powerof()
    {
        stats = false;
    }


    public int periodicmantainance()
    {
        return 0;
    }


    public boolean status()
    {
        return stats;
    }
}