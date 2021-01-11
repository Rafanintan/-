import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;

public class homeappliancestoregui extends JFrame{
    private JPanel mainpanel;
    private JTextField fridgenumber;
    private JLabel fridgequestion;
    private JButton apotelesmata;
    private JLabel washingmachinequestion;
    private JTextField washingmachinenumber;
    private JLabel ovenquestion;
    private JTextField ovennumber;
    private JLabel airconditionquestion;
    private JTextField airconditionnumber;
    private JTextArea Conclusion;

    public homeappliancestoregui(String title)
    {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        apotelesmata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberfridge = (int)((Double.parseDouble(fridgenumber.getText())));
                int numberwash = (int)((Double.parseDouble(washingmachinenumber.getText())));
                int numberoven = (int)((Double.parseDouble(ovennumber.getText())));
                int numberair = (int)((Double.parseDouble(airconditionnumber.getText())));
                Conclusion.setText("Fridges created:"+numberfridge +"\n"+"Washing Machines created:"
                +numberwash+"\n"+"Ovens creted:"+numberoven+"\n"+"Air Conditions created:"+numberair);
                Fridge createfridge[] = new Fridge[numberfridge];
                washingmachine createwashing[] = new washingmachine[numberwash];
                oven createoven [] = new oven[numberoven];
                aircondition createair[] = new aircondition[numberair];

            }
        });
    }
    public class Fridge                //Class Fridge
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
    public class washingmachine        //Class Plintirio
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
    public class oven                  //Class Oven
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
    public class aircondition          //Class AirCondition
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

    public static void main(String[] args) {
        JFrame frame = new homeappliancestoregui("Home Appliance Store");
        frame.setVisible(true);
    }
}
