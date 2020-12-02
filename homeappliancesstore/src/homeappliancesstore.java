import java.io.*;

interface devicebasic           //interface askisis 5
{
    void poweron ();
    void powerof ();
    int periodicmantainance();
    boolean status();
}








public class homeappliancesstore
{
    static homeappliancesstore company = new homeappliancesstore();
    public static String name;         //Dilosi metabliton
    public static String address;
    public static int workers_num;
    Fridge fx550 = new Fridge();
    washingmachine GRU330 = new washingmachine();
    oven tritufx = new oven();
    aircondition mitsu110 = new aircondition();
    public static int totalobjects;
    public static int objectnumber =0;
    public static Fridge [] fridgearray;
    public static washingmachine [] washingarray;
    public static oven [] ovenarray;
    public static aircondition [] airarray;
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

    public class Fridge extends Device implements Serializable                //Class Fridge
    {
        float len;                      //Mhkos
        float height;                   //Ypsos
        float depth;                    //Bathos
        String manu_name;               //Name kataskeuasti
        String obj_name;                //Name antikeimenou
        String type;                    //Eidos antikeimenou
        int energy_con;                 //Katanalosi energy
        int capacity;                   //Xoritikotita
        int motor;                      //Motor
        String bottle_holder;           //Mpoukalothiki
        String ice_machine;             //Pagomixani
        String cooling_type;            //Type psiksis
    }
    public class washingmachine extends Device implements Serializable        //Class Plintirio
    {
        float len;                      //Mhkos
        float height;                   //Ypsos
        float depth;                    //Bathos
        String manu_name;               //name manufactorer
        String obj_name;                //object name
        String type;                    //Eidos Antikeimenou
        int energy_con;                 //Energy consumption
        int turns;                      //Turns
        int num_prog;                   //Total number of programms
        int wash_noise;                 //Wash noise
        int spin_noise;                 //Spin noise
        String spin_class;              //Spin class
    }
    public class oven extends Device  implements Serializable                  //Class Oven
    {
        float len;                      //Mhkos
        float height;                   //Ypsos
        float depth;                    //Bathos
        String manu_name;               //Manufacturer name
        String obj_name;                //Object name
        String type;                    //Eidos antikeimenou
        int energy_con;                 //Energy Consumption
        String catalytic_walls;         //Katalitika toixomata
        String hydrolysis;              //Ydrolisi
        String elec_programmer;         //Hlektronikos programmatismos
        int modes;                      //Modes
        String sec_lock;                //Security lock
    }
    public class aircondition extends Device implements Serializable          //Class AirCondition
    {
        float len;                      //Mhkos
        float height;                   //Ypsos
        float depth;                    //Bathos
        String manu_name;               //Manufacturer name
        String obj_name;                //Object name
        String type;                    //Eidos antikeimenou
        int energy_con;                 //Energy consumption
        int cooling_effi;               //Cooling efficiency
        int heating_effi;               //Heating efficiency
        int in_sound;                   //Inside noise
        int out_sound;                  //Outside noise
        int ex_air;                     //Exhaling air

    }
    public void setfridge(float newlen,float newheight,float newdepth, String newmanu_menu,String newobj_name,
                          String newtype,int newenergy_con,int newcapacity,int newmotor,String newbottle_holder,
                          String newice_machine,String newcooling_type)     //Setter gia to fridge
    {
       fx550.len  = newlen;
       fx550.height = newheight;
       fx550.depth = newdepth;
       fx550.manu_name = newmanu_menu;
       fx550.obj_name = newobj_name;
       fx550.type = newtype;
       fx550.energy_con = newenergy_con;
       fx550.capacity = newcapacity;
       fx550.motor = newmotor;
       fx550.bottle_holder = newbottle_holder;
       fx550.ice_machine = newice_machine;
       fx550.cooling_type = newcooling_type;
    }
    public void setwashingmachine(float newlen,float newheight,float newdepth, String newmanu_menu,String newobj_name,
                          String newtype,int newenergy_con,int newturns,int newnum_prog,int newwash_noise,
                          int newspin_noise,String spin_class)     //Setter gia to washingmachine
    {
        GRU330.len  = newlen;
        GRU330.height = newheight;
        GRU330.depth = newdepth;
        GRU330.manu_name = newmanu_menu;
        GRU330.obj_name = newobj_name;
        GRU330.type = newtype;
        GRU330.energy_con = newenergy_con;
        GRU330.turns = newturns;
        GRU330.num_prog = newnum_prog;
        GRU330.wash_noise = newwash_noise;
        GRU330.spin_noise = newspin_noise;
        GRU330.spin_class = spin_class;
    }
    public void setoven(float newlen,float newheight,float newdepth, String newmanu_menu,String newobj_name,
                                  String newtype,int newenergy_con,String newcatalytic_walls,String newhydrolysis,
                                  String newelec_programmer, int newmodes,String newsec_lock) //Setter gia to oven
    {
        tritufx.len  = newlen;
        tritufx.height = newheight;
        tritufx.depth = newdepth;
        tritufx.manu_name = newmanu_menu;
        tritufx.obj_name = newobj_name;
        tritufx.type = newtype;
        tritufx.energy_con = newenergy_con;
        tritufx.catalytic_walls = newcatalytic_walls;
        tritufx.hydrolysis = newhydrolysis;
        tritufx.elec_programmer = newelec_programmer;
        tritufx.modes = newmodes;
        tritufx.sec_lock = newsec_lock;
    }
    public void setaircondition(float newlen,float newheight,float newdepth, String newmanu_menu,String newobj_name,
                        String newtype,int newenergy_con,int newcooling_effi,int newheating_effi,
                        int newin_sound, int newout_sound,int newex_air) //Setter gia to aircondition
    {
        mitsu110.len  = newlen;
        mitsu110.height = newheight;
        mitsu110.depth = newdepth;
        mitsu110.manu_name = newmanu_menu;
        mitsu110.obj_name = newobj_name;
        mitsu110.type = newtype;
        mitsu110.energy_con = newenergy_con;
        mitsu110.cooling_effi = newcooling_effi;
        mitsu110.heating_effi = newheating_effi;
        mitsu110.in_sound = newin_sound;
        mitsu110.out_sound = newout_sound;
        mitsu110.ex_air = newex_air;
    }
    public float getfridgelen()                //Getter gia fridge len
    {
        return fx550.len;
    }
    public float getfridgeheight()                //Getter gia fridge height
    {
        return fx550.height;
    }
    public float getfridgedepth()                //Getter gia fridge depth
    {
        return fx550.depth;
    }
    public String getfridgemanu_menu()                //Getter gia fridge manufacturer menu
    {
        return fx550.manu_name;
    }
    public String getfridgeobj_name()                //Getter gia fridge object name
    {
        return fx550.obj_name;
    }
    public String getfridgetype()                //Getter gia fridge type
    {
        return fx550.type;
    }
    public float getfridgeenergy_con()                //Getter gia fridge consumption
    {
        return fx550.energy_con;
    }
    public float getfridgecapacity()                //Getter gia fridge capacity
    {
        return fx550.capacity;
    }
    public float getfridgemotor()                //Getter gia fridge motor
    {
        return fx550.motor;
    }
    public String getfridgebottleholder()                //Getter gia fridge bottle holder
    {
        return fx550.bottle_holder;
    }
    public String getfridgeicemachine()                //Getter gia fridge ice machine
    {
        return fx550.ice_machine;
    }

    public String getfridgecoolingtype()                //Getter gia fridge cooling type
    {
        return fx550.cooling_type;
    }
    public float getwashinglen()                //Getter gia washer len
    {
        return GRU330.len;
    }
    public float getwashingheight()                //Getter gia washer height
    {
        return GRU330.height;
    }
    public float getwashingdepth()                //Getter gia washer depth
    {
        return GRU330.depth;
    }
    public String getwashingmanu_menu()                //Getter gia washer manufacturer menu
    {
        return GRU330.manu_name;
    }
    public String getwashingobj_name()                //Getter gia washer object name
    {
        return GRU330.obj_name;
    }
    public String getwashingtype()                //Getter gia washer type
    {
        return GRU330.type;
    }
    public float getwashingenergy_con()                //Getter gia washer consumption
    {
        return GRU330.energy_con;
    }
    public float getwashingturns()                //Getter gia washer turns
    {
        return GRU330.turns;
    }
    public float getwashingnumprog()                //Getter gia washer number of programs
    {
        return GRU330.num_prog;
    }
    public float getwashingwashnoise()                //Getter gia washer wash noise
    {
        return GRU330.wash_noise;
    }
    public float getwashingspinnoise()                //Getter gia washer spin noise
    {
        return GRU330.spin_noise;
    }
    public String getwashingspinclass()                //Getter gia washer spin class
    {
        return GRU330.spin_class;
    }
    public float getovenlen()                //Getter gia oven len
    {
        return tritufx.len;
    }
    public float getovenheight()                //Getter gia oven height
    {
        return tritufx.height;
    }
    public float getovendepth()                //Getter gia oven depth
    {
        return tritufx.depth;
    }
    public String getovenmanu_menu()                //Getter gia oven manufacturer menu
    {
        return tritufx.manu_name;
    }
    public String getovenobj_name()                //Getter gia oven object name
    {
        return tritufx.obj_name;
    }
    public String getoventype()                //Getter gia oven type
    {
        return tritufx.type;
    }
    public float getovenenergy_con()                //Getter gia oven consumption
    {
        return tritufx.energy_con;
    }
    public String getovencatalystic()                //Getter gia oven catalystic walls
    {
        return tritufx.catalytic_walls;
    }
    public String getovenhydrolysis()                //Getter gia oven hydrolysis
    {
        return tritufx.hydrolysis;
    }
    public String getovenelecprogrammer()                //Getter gia oven electric programmer
    {
        return tritufx.elec_programmer;
    }
    public int getovenmodes()                //Getter gia oven modes
    {
        return tritufx.modes;
    }
    public String getovenseclock()                //Getter gia oven security lock
    {
        return tritufx.sec_lock;
    }
    public float getairlen()                //Getter gia air len
    {
        return mitsu110.len;
    }
    public float getairheight()                //Getter gia air height
    {
        return mitsu110.height;
    }
    public float getairdepth()                //Getter gia air depth
    {
        return mitsu110.depth;
    }
    public String getairmanu_menu()                //Getter gia air manufacturer menu
    {
        return mitsu110.manu_name;
    }
    public String getairobj_name()                //Getter gia air object name
    {
        return mitsu110.obj_name;
    }
    public String getairtype()                //Getter gia air type
    {
        return mitsu110.type;
    }
    public float getairergy_con()                //Getter gia air consumption
    {
        return mitsu110.energy_con;
    }
    public int getaircoolingef()                //Getter gia air cooling efficiency
    {
        return mitsu110.cooling_effi;
    }
    public int getairheatingef()                //Getter gia air heating efficiency
    {
        return mitsu110.heating_effi;
    }
    public int getairinsound()                //Getter gia air inside sound
    {
        return mitsu110.in_sound;
    }
    public int getairoutsound()                //Getter gia air outside sound
    {
        return mitsu110.out_sound;
    }
    public int getairexair()                //Getter gia air  exhale
    {
        return mitsu110.ex_air;
    }






    public static void main(String args[])  //Ektelesi Programmatos
    {

        /*              //ASKHSH3
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
         */

                                  //ASKHSH 4
        company.setfridge(Float.parseFloat(args[3]),Float.parseFloat(args[4]),Float.parseFloat(args[5]),args[6],
                          args[7],args[8],Integer.parseInt(args[9]),Integer.parseInt(args[10]),
                          Integer.parseInt(args[11]),args[12],args[13], args[14]);
        company.setwashingmachine(Float.parseFloat(args[15]),Float.parseFloat(args[16]),Float.parseFloat(args[17]),
                                  args[18],args[19],args[20],Integer.parseInt(args[21]),Integer.parseInt(args[22]),
                                  Integer.parseInt(args[23]),Integer.parseInt(args[24]),Integer.parseInt(args[25]),
                                  args[26]);
        company.setoven(Float.parseFloat(args[27]),Float.parseFloat(args[28]),Float.parseFloat(args[29]),args[30],
                                         args[31],args[32],Integer.parseInt(args[33]),args[34], args[35],args[36],
                                         Integer.parseInt(args[37]), args[38]);
        company.setaircondition(Float.parseFloat(args[39]),Float.parseFloat(args[40]),Float.parseFloat(args[41]),
                                                 args[42],args[43],args[44],Integer.parseInt(args[45]),
                                                 Integer.parseInt(args[46]),Integer.parseInt(args[47]),
                                                 Integer.parseInt(args[48]),Integer.parseInt(args[49]),
                                                 Integer.parseInt(args[50]));



        /*          //ASKHSH 4
        System.out.println("Fridge length:"+company.getfridgelen());
        System.out.println("Fridge height:"+company.getfridgeheight());
        System.out.println("Fridge depth:"+company.getfridgedepth());
        System.out.println("Fridge manufacturer:"+company.getfridgemanu_menu());
        System.out.println("Fridge name:"+company.getfridgeobj_name());
        System.out.println("Fridge type:"+company.getfridgetype());
        System.out.println("Fridge energy consumption:"+company.getfridgeenergy_con());
        System.out.println("Fridge capacity:"+company.getfridgecapacity());
        System.out.println("Fridge motor:"+company.getfridgemotor());
        System.out.println("Fridge bottle holder:"+company.getfridgebottleholder());
        System.out.println("Fridge ice machine:"+company.getfridgeicemachine());
        System.out.println("Fridge cooling type:"+company.getfridgecoolingtype());

        System.out.println("Washer length:"+company.getwashinglen());
        System.out.println("Washer height:"+company.getwashingheight());
        System.out.println("Washer depth:"+company.getwashingdepth());
        System.out.println("Washer manufacturer:"+company.getwashingmanu_menu());
        System.out.println("Washer name:"+company.getwashingobj_name());
        System.out.println("Washer type:"+company.getwashingtype());
        System.out.println("Washer energy consumption:"+company.getwashingenergy_con());
        System.out.println("Washer turns:"+company.getwashingturns());
        System.out.println("Washer number of programs:"+company.getwashingnumprog());
        System.out.println("Washer wash noise:"+company.getwashingwashnoise());
        System.out.println("Washer spin noise"+company.getwashingspinnoise());
        System.out.println("Washer spin class:"+company.getwashingspinclass());

        System.out.println("Oven length:"+company.getovenlen());
        System.out.println("Oven height:"+company.getovenheight());
        System.out.println("Oven depth:"+company.getovendepth());
        System.out.println("Oven manufacturer:"+company.getovenmanu_menu());
        System.out.println("Oven name:"+company.getovenobj_name());
        System.out.println("Oven type:"+company.getoventype());
        System.out.println("Oven energy consumption:"+company.getovenenergy_con());
        System.out.println("Oven catalystic walls:"+company.getovencatalystic());
        System.out.println("Oven hydrolysis:"+company.getovenhydrolysis());
        System.out.println("Oven electric programmer:"+company.getovenelecprogrammer());
        System.out.println("Oven modes:"+company.getovenmodes());
        System.out.println("Oven security lock:"+company.getovenseclock());

        System.out.println("AirCondition length:"+company.getairlen());
        System.out.println("AirCondition height:"+company.getairheight());
        System.out.println("AirCondition depth:"+company.getairdepth());
        System.out.println("AirCondition manufacturer:"+company.getairmanu_menu());
        System.out.println("AirCondition name:"+company.getairobj_name());
        System.out.println("AirCondition type:"+company.getairtype());
        System.out.println("AirCondition energy consumption:"+company.getairergy_con());
        System.out.println("AirCondition cooling efficiency:"+company.getaircoolingef());
        System.out.println("AirCondition heating efficiency:"+company.getairheatingef());
        System.out.println("AirCondition inside sound:"+company.getairinsound());
        System.out.println("AirCondition outside sound:"+company.getairoutsound());
        System.out.println("AirCondition exhale air:"+company.getairexair());
        */
        /*
        company.fx550.poweron();            //ASKHSH 5
        company.tritufx.poweron();
        if(company.fx550 instanceof Fridge)
        {
            System.out.println("Fridge: " + company.fx550.status());
        }
        if(company.GRU330 instanceof washingmachine)
        {
            System.out.println("Washingmachine: " + company.GRU330.status());
        }
        if(company.tritufx instanceof oven)
        {
            System.out.println("Oven: " + company.tritufx.status());
        }
        if(company.mitsu110 instanceof aircondition)
        {
            System.out.println("Aircondition: " + company.mitsu110.status());
        }
         */
                                                //ASKHSH 6
        try                                                     //emfanizei ta stoixeia tou text
        {
            BufferedReader br = new BufferedReader(
                                new FileReader("C:\\Users\\rafnt\\Desktop\\Js\\homeappliancesstore\\Objects.txt"));
            String s;
            while((s = br.readLine()) !=null)
            {
                System.out.println(s);
            }
            br.close();



        }
        catch(Exception ex)
        {
            return;
        }


        try                                     //emfanizei to synolo ton objects kai ftiaxnei ta arrays
        {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\rafnt\\Desktop\\Js\\homeappliancesstore\\Objects.txt"));
            int value;
            char c;
            while((value = br.read()) != -1) {

                // converts int to character
                c = (char) value;

                if(Character.isDigit(c))
                {
                    totalobjects += Character.getNumericValue(c);
                    objectnumber +=1;
                    if(objectnumber == 1)
                    {
                        fridgearray = new Fridge[Character.getNumericValue(c)];
                    }
                    else if(objectnumber == 2)
                    {
                        washingarray = new washingmachine[Character.getNumericValue(c)];
                    }
                    else if(objectnumber == 3)
                    {
                        ovenarray = new oven[Character.getNumericValue(c)];
                    }
                    else if(objectnumber == 1)
                    {
                        airarray = new aircondition[Character.getNumericValue(c)];
                    }
                }


            }
            System.out.println("The total number of objects is: "+totalobjects);
        }
        catch(Exception ex)
        {
            return;
        }
        ObjectOutputStream out = null;
        try                                                     //Telos apothikeuei ta serialized stoixeia ton array
        {                                                       //Se enan text output
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("out.txt"))));
            
                out.writeObject(fridgearray);
                out.writeObject(washingarray);
                out.writeObject(ovenarray);
                out.writeObject(airarray);


            out.close();
        }
        catch (Exception ex)
        {
            return;
        }

    }

}
