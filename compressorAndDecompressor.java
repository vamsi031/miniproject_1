import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class compressorAndDecompressor extends JFrame implements ActionListener {
    JButton compressorButton;
    JButton decompressorButton;

    compressorAndDecompressor(){
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating a compressor button

        compressorButton = new JButton("select file to compress");
        compressorButton.setBounds(50, 50, 150, 30);
        compressorButton.addActionListener(this);

        //creating a decompressor button
        decompressorButton = new JButton("select file to decompress");
        decompressorButton.setBounds(300, 50, 150, 30);
        decompressorButton.addActionListener(this);



        this.add(compressorButton);
        this.add(decompressorButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressorButton){
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }

        }

        if(e.getSource()==decompressorButton){
            JFileChooser fileChooser = new JFileChooser();
            int response  = fileChooser.showSaveDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decompressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null,ee.toString());
                }
            }
        }
    }


    public static void main(String[] args) {
       compressorAndDecompressor abc =new compressorAndDecompressor();
    }
}
