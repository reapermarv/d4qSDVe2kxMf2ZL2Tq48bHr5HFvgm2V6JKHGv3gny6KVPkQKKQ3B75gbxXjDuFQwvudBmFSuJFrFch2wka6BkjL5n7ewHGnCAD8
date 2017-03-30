import com.sun.corba.se.impl.copyobject.FallbackObjectCopierImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Marius on 23.03.2017.
 */
public class Spielfeld extends JFrame{
    public static void createSpielfeld(){

        /*JFrame Spielfeld = new JFrame("Battle Ships");
        Spielfeld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //exit nach Fenster schließen
        Spielfeld.setContentPane(Box.createVerticalBox());                  //von oben nach unten angeordnet

        Spielfeld.pack();
        Spielfeld.setVisible(true);
        */
    }


    public Spielfeld(int rows, int cols){
        int AnzFelder = rows * cols;

        int test;


        JFrame myFrame = new JFrame();
        myFrame.setTitle("titel1");
        myFrame.setSize(8000, 8000);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setContentPane(Box.createVerticalBox());
        Box upper = Box.createHorizontalBox();
        {
            JPanel enemyPane = new JPanel();
            enemyPane.setLayout(new GridLayout(rows, cols));
            for(int i = 0; i < AnzFelder; i++) {
                JButton button = new JButton(Integer.toString(i));
                enemyPane.add(button);
            }
            upper.add(enemyPane);
        }

        Box lower = Box.createHorizontalBox();
        {
            JPanel ownPane = new JPanel();
            ownPane.setLayout(new GridLayout(rows, cols));
            for(int j = 0; j < AnzFelder; j++){
                JButton button2 = new JButton(Integer.toString(j));
                ownPane.add(button2);
            }
            lower.add(ownPane);

        }




        myFrame.add(upper);
        //myFrame.add(Box.createGlue());
        myFrame.add(Box.createVerticalStrut(50));
        //myFrame.add(lower);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
