import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Marius on 20.03.2017.
 */

public class Test {
    private static void start() {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //exit nach Fenster schließen
        frame.setContentPane(Box.createVerticalBox());                  //von oben nach unten angeordnet

        frame.add(Box.createGlue());                                    //vertikale Zentrierung


        JLabel Label = new JLabel("text");
        Label.setAlignmentX(Component.CENTER_ALIGNMENT);              //horizontale Zentrierung
        frame.add(Label);


        frame.add(Box.createVerticalStrut(50));                 //vertikaler Zwischenraum
        Icon greenButton = new ImageIcon("green.png");
        JButton Knop = new JButton(greenButton);
        Knop.setAlignmentX(Component.CENTER_ALIGNMENT);
        Knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewFrame("Smiley gedrückt", "Smiley gedrückt!NICEIECNEI");
            }
        });
        Knop.setOpaque(false);
        Knop.setBorder(BorderFactory.createEmptyBorder());
        frame.add(Knop);
        frame.add(Box.createVerticalStrut(20));



        JButton Button = new JButton("Knopf");
        Button.setAlignmentX(Component.CENTER_ALIGNMENT);
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                for(int i = 0; i <= 1; i++ ) {
                    createNewFrame(Integer.toString(i+1) + ".tes Fenster", "TEST");
                }
            }
        });
        Button.setOpaque(false);
        Button.setBackground(Color.yellow);
        Button.setBorder(BorderFactory.createLineBorder(Color.blue, 3, false));
        frame.add(Button);

        frame.add(Box.createVerticalStrut(50));                  //vertikaler Zwischenraum

        Box box = Box.createHorizontalBox();
        {
            Icon green = new ImageIcon("green.png");
            Icon yellow = new ImageIcon("yellow.png");                         //von linnks nach rechts
            Icon red = new ImageIcon("red.png");                               //Icons mit "red.png"
            box.add(Box.createGlue());
            box.add(new JLabel(green));
            box.add(Box.createGlue());
            box.add(new JLabel(yellow));
            box.add(Box.createGlue());
            box.add(new JLabel(red));
            box.add(Box.createGlue());
        }
        frame.add(box);

        JMenuBar bar = new JMenuBar();
        {
            JMenu field1 = new JMenu("Menu");
            {
                JMenuItem item = new JMenuItem("New Game");
                field1.add(item);
            }
            {
                JMenuItem item = new JMenuItem("Quit");
                field1.add(item);
            }
            JMenuItem field2 = new JMenuItem("Sapperlott");
            {
                JMenuItem item = new JMenuItem("paste");
                field2.add(item);
            }

            bar.add(field1);
        }
        frame.setJMenuBar(bar);


        frame.add(Box.createGlue());                                    //Vertikale zentrierung


        frame.pack();
        frame.setVisible(true);
    }



    public static void createNewFrame(String FrameName, String Text){
        JFrame frame = new JFrame(FrameName);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //exit nach Fenster schließen
        frame.setContentPane(Box.createVerticalBox());                  //von oben nach unten angeordnet
        frame.add(Box.createGlue());                                    //vertikale Zentrierung
        JLabel Label = new JLabel(Text);
        Label.setAlignmentX(Component.CENTER_ALIGNMENT);              //horizontale Zentrierung
        frame.add(Label);
        frame.add(Box.createVerticalStrut(50));                  //vertikaler Zwischenraum
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    //start();
                    Spielfeld field = new Spielfeld(30,30);
                    field.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //field.pack();
                    //field.setVisible(true);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


