/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Convidado
 */
public class SecondTela extends JFrame{
    private JLabel back = new JLabel(new ImageIcon("C:\\Users\\Lucas\\Pictures\\0MENES\\Coleçao\\wpp\\viadesune\\230F704C5426181018DCA9.jpg"));
    private JList scriptList = new JList();
    private JButton loginTela = new JButton("<");
    private JLabel sEdit = new JLabel(" Script edit");
    private JList scriList = new JList();







    public SecondTela(){
        super("Scrioptp");
        add(loginTela);
        add(back);


/*
------------------------------------------------------------------------------------------------------------------------
Again this is part of a place holder its just for visualization of the project it will be better, i hope.
 */
        loginTela.setSize(40,40);
        loginTela.setLocation(10,40);
        loginTela.setFont(new Font("Arial", Font.CENTER_BASELINE, 8));








        loginTela.addActionListener(e->{// lambida way os doing action listene/performer really weird btw
            back.setVisible(false);
            test a = new test();
            a.setVisible(true);

        });

        /*
        ----------------------------------------------------------------------------------------------------------------
         */

        setSize(1000,700);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}

