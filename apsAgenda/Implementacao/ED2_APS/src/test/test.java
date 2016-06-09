/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Convidado
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.text.AttributedCharacterIterator;

/**
 * Created by Thiago on 03/06/2016.
 */
public class test extends JFrame{
    String thiagoPath = "C:\\Users\\Lucas\\Pictures\\0MENES\\Coleçao\\wpp\\viadesune\\2558AF45543751CC261860.jpg";
    String jilhermePath = "C:\\Users\\Lucas\\Pictures\\0MENES\\Coleçao\\wpp\\viadesune\\225F3D45543751CB1E32A5.jpg";
    private JPanel panel;
    private JLabel back = new JLabel(new ImageIcon(jilhermePath));
    private JButton button1 = new JButton("OK");
    private JButton cancel = new JButton("Cancel");
    private JTextField loginT = new JTextField("Login");
    private JPasswordField passvord = new JPasswordField("passaword");
    private JLabel login = new JLabel("LOGIN");
    private JLabel senha = new JLabel("PASSWORD");
    private JLabel tuite = new JLabel("Last Twitts");
    private JLabel status = new JLabel("Status");
    
    private JButton b1 = new JButton("S");


    private BufferedImage backlist;
    private JList lixta1 = new JList();
    private JList listTuite = new JList();
    private JList listStatus = new JList();
    private JScrollPane scroll1 = new JScrollPane(lixta1);
    private JScrollPane tuitescroll = new JScrollPane(listTuite);
    private JScrollPane statusScroll = new JScrollPane(listStatus);
    public JLabel cred = new JLabel("MADE BY - LITTLE JAO- JILHERME && PANTENE");
    
    
    private JLabel lStatus = new JLabel("Must be logged ");
    private JLabel lTuites = new JLabel("Must be logged");
    boolean loggedStatus = false;

    public test(){

        super("My Personal Stump");
        try{
            backlist = ImageIO.read(new File(jilhermePath));

        }catch (Exception e){
            e.printStackTrace();
        }
        add(lTuites);
        add(lStatus);
        
        add(status);
        add(tuite);
        add(senha);
        add(login);
        add(cred);
        add(scroll1);
        add(tuitescroll);
        add(statusScroll);
        add(tuitescroll);
        add(statusScroll);
        add(passvord);
        add(cancel);
        add(loginT);
        
        add(b1);
        add(back);
        add(button1);
        
          /*
        ---------------------------------------------------------------------------------------------------------
            This section of code is purely a place holder until the next section that is put
            all in a TabPanel tab will be happening further in the project
         */


        
        b1.addActionListener(e -> {
            SecondTela a = new SecondTela();
            a.setVisible(true);
            setVisible(false);
        });
        b1.setSize(75,30);
        b1.setLocation(560,120);
        
       // b1.setFont(new Font("Arial",Font.TRUETYPE_FONT,8));
        b1.setToolTipText("go to scrept");
        
        

        button1.addActionListener(e -> {

            //aqui deve aconter uma checagem de login e password
            loggedStatus = true;
            lStatus.setText("Status here");
            lTuites.setText("Last tuites");
        });
        /*
        ---------------------------------------------------------------------------------------------------------
         */


        login.setSize(200,70);
        login.setLocation(200,140);
        login.setToolTipText(" Login");

        loginT.setSize(200,30);
        loginT.setLocation(300,160);
        loginT.setToolTipText("login");
        loginT.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                loginT.setText("");
            }
        });

        button1.setSize(75,30);
        button1.setLocation(520,160);
        button1.setToolTipText("Ok");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass = passvord.getText();
                String login = loginT.getText();

                System.out.println("Login: " + login);
                System.out.println("Password: " + pass);
            }
        });
        
        

        cancel.setSize(75,30);
        cancel.setLocation(520,220);
        cancel.setToolTipText("cancel");
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginT.setText("");
                passvord.setText("");
            }
        });

        senha.setSize(100,30);
        senha.setLocation(200,220);
        senha.setToolTipText("Password");

        passvord.setSize(200,30);
        passvord.setLocation(300,220);
        passvord.setToolTipText("password");
        passvord.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                passvord.setText("");
            }
        });

        scroll1.setLocation(780,100);
        scroll1.setSize(200,450);
        lixta1.setToolTipText("bots");

        tuitescroll.setLocation(450,400);
        tuitescroll.setSize(300,250);
        listTuite.setToolTipText("Last Tuites");
        tuite.setSize(100,80);
        tuite.setLocation(560,370);
        lTuites.setSize(300,250);
        lTuites.setLocation(560,370);

        statusScroll.setLocation(80,400);
        statusScroll.setSize(300,250);
        listStatus.setToolTipText("Status");
        status.setLocation(200,370);
        status.setSize(100,80);
        lStatus.setLocation(200,470);
        lStatus.setSize(100,80);

        cred.setLocation(350,1);
        cred.setSize(500,60);
        cred.setToolTipText("hhuehuehuehuhehueh");

        setSize(1000,700);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

}
