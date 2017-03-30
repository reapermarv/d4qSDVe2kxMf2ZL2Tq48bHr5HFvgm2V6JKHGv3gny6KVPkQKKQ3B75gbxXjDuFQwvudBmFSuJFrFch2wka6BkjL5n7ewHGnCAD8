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
                final int h = i;
                JButton button = new JButton(Integer.toString(i));
                button.setForeground(new Color(255,255,255,0));
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Button nummer: " + h);
                        int t = Integer.parseInt(button.getText());
                        if(t == 899){
                            button.setBackground(Color.magenta);
                            System.out.println("FUCK YEAH");
                        }
                        else{
                            button.setBackground(Color.blue);
                        }
                    }
                });
                button.setPreferredSize(new Dimension(50,20));
                button.setMinimumSize(new Dimension(50, 9));
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
                button2.setPreferredSize(new Dimension(50,20));
                button2.setMinimumSize(new Dimension(50, 9));
                ownPane.add(button2);
            }
            lower.add(ownPane);

        }




        myFrame.add(upper);
        myFrame.add(Box.createGlue());
        //myFrame.add(Box.createVerticalStrut(50));
        myFrame.add(lower);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
