import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Basic_Calculator{
    int num1 = 0, num2 = 0, result = 0;
    String operator = "";
    String display1="";
    String display2="";
    boolean operatorclicked=true;
    int count=-1;

    Basic_Calculator() {
        JFrame f=new JFrame("Basic Calculator");

        JTextField scrn=new JTextField();
        scrn.setBounds(50,50,275,40);

        JButton b0=new JButton("0");
        b0.setBounds(125,260,50,30);
        

        JButton b1=new JButton("1");
        b1.setBounds(50,110,50,30);

        JButton b2=new JButton("2");
        b2.setBounds(125,110,50,30);

        JButton b3=new JButton("3");
        b3.setBounds(200,110,50,30);

        JButton b4=new JButton("4");
        b4.setBounds(50,160,50,30);

        JButton b5=new JButton("5");
        b5.setBounds(125,160,50,30);

        JButton b6=new JButton("6");
        b6.setBounds(200,160,50,30);

        JButton b7=new JButton("7");
        b7.setBounds(50,210,50,30);

        JButton b8=new JButton("8");
        b8.setBounds(125,210,50,30);

        JButton b9=new JButton("9");
        b9.setBounds(200,210,50,30);

        JButton add=new JButton("+");
        add.setBounds(275,110,50,30);

        JButton sub=new JButton("-");
        sub.setBounds(275,160,50,30);

        JButton mul=new JButton("*");
        mul.setBounds(275,210,50,30);

        JButton div=new JButton("/");
        div.setBounds(275,260,50,30);

        JButton eq=new JButton("=");
        eq.setBounds(200,260,50,30);

        JButton clr=new JButton("C");
        clr.setBounds(50,260,50,30);

        ActionListener numListener=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(b0==e.getSource()){
                    display1+="0";
                    display2+="0";
                    count++;
                    scrn.setText(display2);
                }else if(b1==e.getSource()){
                    display1+="1";
                    display2+="1";
                    count++;
                    scrn.setText(display2); 
                }else if(b2==e.getSource()){
                    display1+="2";
                    display2+="2";
                    count++;
                    scrn.setText(display2);
                }else if(b3==e.getSource()){
                    display1+="3";
                    display2+="3";
                    count++;
                    scrn.setText(display2);
                }else if(b4==e.getSource()){
                    display1+="4";
                    display2+="4";
                    count++;
                    scrn.setText(display2);
                }else if(b5==e.getSource()){
                    display1+="5";
                    display2+="5";
                    count++;
                    scrn.setText(display2);
                }else if(b6==e.getSource()){
                    display1+="6";
                    display2+="6";
                    count++;
                    scrn.setText(display2);
                }else if(b7==e.getSource()){
                    display1+="7";
                    display2+="7";
                    count++;
                    scrn.setText(display2);
                }else if(b8==e.getSource()){
                    display1+="8";
                    display2+="8";
                    count++;
                    scrn.setText(display2);
                }else if(b9==e.getSource()){
                    display1+="9";
                    display2+="9";
                    count++;
                    scrn.setText(display2);
                }
            }
        };

        ActionListener operatorListener=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(add==e.getSource()){
                    display2+="+";
                    operator="+";
                    num1=Integer.parseInt(display1);
                    display1="";
                    scrn.setText(display2);
                }else if(sub==e.getSource()){
                    display2+="-";
                    operator="-";
                    num1=Integer.parseInt(display1);
                    display1="";
                    scrn.setText(display2);
                }else if(mul==e.getSource()){
                    display2+="*";
                    operator="*";
                    num1=Integer.parseInt(display1);
                    display1="";
                    scrn.setText(display2);
                }else if(div==e.getSource()){
                    display2+="/";
                    operator="/";
                    num1=Integer.parseInt(display1);
                    display1="";
                    scrn.setText(display2);
                }else if(eq==e.getSource()){
                    display2="";
                    scrn.setText(display2);
                    num2=Integer.parseInt(display1);
                    switch(operator){
                        case "+":
                            result=num1+num2;
                            break;
                        case "-":
                            result=num1-num2;
                            break;
                        case "*":
                            result=num1*num2;
                            break;
                        case "/":
                            result=num1/num2;
                            break;
                    }
                    scrn.setText(String.valueOf(result));
                    result=0;
                    num1 = 0;
                    num2 = 0;
                    display1="";
                    display2="";
                    operator="";
                }
            }
        };

        ActionListener clearListener=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                scrn.setText("");
                num1 = 0;
                num2 = 0;
                result=0;
                display1="";
                display2="";
                operator="";
            }
        };

        b0.addActionListener(numListener);
        b1.addActionListener(numListener);  
        b2.addActionListener(numListener);
        b3.addActionListener(numListener);
        b4.addActionListener(numListener);
        b5.addActionListener(numListener);
        b6.addActionListener(numListener);
        b7.addActionListener(numListener);
        b8.addActionListener(numListener);
        b9.addActionListener(numListener);

        add.addActionListener(operatorListener);
        sub.addActionListener(operatorListener);
        mul.addActionListener(operatorListener);
        div.addActionListener(operatorListener);

        eq.addActionListener(operatorListener);
        clr.addActionListener(clearListener);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(eq);
        f.add(clr);

        f.add(scrn);

        f.setLayout(null);
        f.setSize(350,350);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public static void main(String[] args){
        new Basic_Calculator();
    }
}