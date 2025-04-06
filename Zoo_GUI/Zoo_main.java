package Zoo_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Zoo_main extends JFrame
{
    private static ArrayList<Zoo> zoos = new ArrayList<>();
    private static int number;
    Container window = this.getContentPane();
    

    public Zoo_main()
    {
        setSize(1000, 750);
        setTitle("Zoomania");
        setResizable(false);
        window.setLayout(new FlowLayout());

        zoos.add(new Zoo("Kami", 19.99));
        zoos.add(new Zoo("Tenshi", 9.99));
        zoos.add(new Zoo("Blank", 0.99));

        zoos.get(0).putAnimalInZoo(new Animal("Lion", "Mavis", "Female", 4));
        zoos.get(0).putAnimalInZoo(new Animal("Deer", "Ellie", "Female", 6));
        zoos.get(0).putAnimalInZoo(new Animal("Fox", "Sakura", "Female", 1));
        zoos.get(0).putAnimalInZoo(new Animal("Goat", "Shido", "Male", 8));

        zoos.get(1).putAnimalInZoo(new Animal("Lion", "Neko", "Female", 9));
        zoos.get(1).putAnimalInZoo(new Animal("Goat", "Shin", "Male", 3));
        zoos.get(1).putAnimalInZoo(new Animal("Duck", "Kotori", "Female", 11));
    }

    public static void main(String[] args)
    {
        Zoo_main window = new Zoo_main();
        window.createMainMenu();
        window.setVisible(true);
    }

    private void createMainMenu()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel windowMain = new JPanel();
        JLabel question = new JLabel("What do you want to do ");
        JButton choose = new JButton("Choose");
        DefaultListModel<String> mainMenuE = new DefaultListModel<>();
        JList<String> mainMenu = new JList<>(mainMenuE);
        {
            mainMenuE.addElement("Enter");
            mainMenuE.addElement("Show");
            mainMenuE.addElement("Leave");
        };

        windowMain.add(question);
        windowMain.add(mainMenu);
        windowMain.add(choose);
        windowMain.add(mainMenu);
    
        choose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String option = mainMenu.getSelectedValue().toLowerCase();
                windowMain.setVisible(false);
                switch (option)
                {
                    case "enter":
                    createZoo();
                    break;
                    case "show":
                    createShow();
                    break;
                    case "leave":
                    createLeave();
                    break;
                }
            }
        });
        window.add(windowMain);
    }

        private void createZoo()
        {
            
        }

        private void createShow()
        {
            JPanel windowShow = new JPanel();
            JButton back = new JButton("Return");
            JLabel show = new  JLabel();
            String data = "*****";
            // for (int i = 0 ; i < zoos.size() ; i++)
            // {
            //     data += zoos.get(i);
            //     data += zoos.get(i).showAnimals();
            // }
            show.setText(data);
            windowShow.add(show);
            windowShow.add(back);
            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                {
                    windowShow.setVisible(false);
                    createMainMenu();
                }
            });
            windowShow.setBounds(500, 375, 500, 300);
            windowShow.setVisible(true);
            window.add(windowShow);
        }

        private void createLeave()
        {
            JPanel windowLeave = new JPanel();
            JLabel end = new JLabel("Thank you for visiting");
            windowLeave.add(end);
            windowLeave.setVisible(true);
            window.add(windowLeave);
        }


    private int nameToInt(ArrayList<Zoo> zoos, String zooName)
    {
        int i;
        String zooNameTLC = zooName.toLowerCase();
        for (i = 0 ; i < zoos.size() ; i++)
        {
            if (zoos.get(i).getName().toLowerCase().equals(zooNameTLC)) return i;
        }
        return i;
    }
}