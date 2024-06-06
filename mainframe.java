import javax.swing.*;
import java.awt.*;

public class mainframe extends JFrame{

    public void initialize(User user) {

        // info panel


        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(0,2,5,5));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(30,50,30,50));

        infoPanel.add(new JLabel("Name"));
        infoPanel.add(new JLabel(user.getName()));
        infoPanel.add(new JLabel("Email"));
        infoPanel.add(new JLabel(user.getEmail()));
        infoPanel.add(new JLabel("Phone"));
        infoPanel.add(new JLabel(user.getPhone()));
        infoPanel.add(new JLabel("Address"));
        infoPanel.add(new JLabel(user.getAddress()));

        add(infoPanel,BorderLayout.NORTH);


       








     






        setTitle("Dashboard");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true); // Usually, you set this outside the initialize method
    }

}


    

