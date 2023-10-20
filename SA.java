import javax.swing.*;

public class SA {

    public static void main(String[] args) {
        
        JFrame f = new JFrame();


        JLabel a = new JLabel("NOME:");

        JLabel b = new JLabel("CPF:");

        JLabel c = new JLabel("TELEFONE:");

        JLabel d = new JLabel("EMAIL:");

        JLabel e = new JLabel("ENDEREÇO:");
         

        JTextField g = new JTextField("");

        JTextField h = new JTextField("");

        JTextField i = new JTextField("");

        JTextField j = new JTextField("");

        JTextField k = new JTextField("");

        
        a.setBounds(5,200,200,40);

        b.setBounds(5,100,200,40);

        c.setBounds(5,300,200,40);

        d.setBounds(5,400,200,40);

        e.setBounds(5,500,200,40);

        g.setBounds(80,210,200,30);

        h.setBounds(80,110,200,30);

        i.setBounds(80,310,200,30);

        j.setBounds(80,410,200,30);

        k.setBounds(80,510,200,30);

        f.add(a);

        f.add(b);

        f.add(c);

        f.add(d);

        f.add(e);

        f.add(g);

        f.add(h);

        f.add(i);

        f.add(j);

        f.add(k);

        f.setLayout(null);
       
        f.setVisible(true);
         
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setUndecorated(true);
        
       
    }
    
}
