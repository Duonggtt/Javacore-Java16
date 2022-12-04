
package gamePlay;

import entity.Answer;
import entity.Price;
import entity.Question;
import entity.User;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import loginAndReg.SignUpForm;
import run.MainRun;
import javax.sound.sampled.*;
/**
 *
 * @author LENOVO
 */
public class GameDisplay extends javax.swing.JFrame {

    /**
     * Creates new form gameDisplay
     */
    
    
    ArrayList<Question> questions;
    ArrayList<Answer> answers;
    ArrayList<Price> prices;
    private static User user;
    
    public GameDisplay(User user) {
        this.user = user;
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        txtAns.setVisible(false);
        txtQuesId.setVisible(false);
        txtPriceId.setVisible(false);
                
        
        Question q1 = new Question(" Đảng cộng sản Việt Nam ra đời ?","history",1);
        Question q2 = new Question(" Nội dung nào sau đây không có trong\n hội nghị thành lập Đảng?","history",2);
        Question q3= new Question(" Thắng lợi quân sự nào của quân dân ta\n trong cuộc kháng chiến chống Pháp có ý nghĩa bước ngoặt mở đầu\n giai đoạn quân ta giành quyền chủ động chiến lược trên chiến trường chính?","history" ,3);
        Question q4= new Question(" Chọn từ phù hợp điền vào chỗ trống: \nNhằm giải quyết khó khăn về..............., chính phủ kêu gọi tinh thần\n tự nguyện đóng góp của nhân dân. Hưởng ứng “quỹ độc lập”,\nphong trào “Tuần lễ vàng” do chính phủ phát động.\n Đến ngày 23-11-1946, Quốc hội quyết định cho lưu hành tiền Việt Nam trong cả nước. ","history" ,4);
        Question q5= new Question(" Sự linh hoạt trong chính sách ngoại giao\n của Đảng giai đoạn 1945-1946 được thể hiện ở:","history" ,5);
        Question q6= new Question(" Sách lược của Đảng từ ngày 6/3/1946\n có điểm gì khác so với giai đoạn trước đó?","history" ,6);
        Question q7= new Question(" Sự kiện nào sau đây là  quan trọng nhất\n trong việc củng cố và kiện toàn chính quyền cách mạng","history" ,7);
        Question q8= new Question(" Yếu tố nào sau đây không nằm trong tác dụng\n của Hiệp định Sơ Bộ (6/3/1946) ","history" ,8);
        Question q9= new Question(" Thời gian thực dân Pháp tiến hành khai thác thuộc địa lần thứ nhất\n ở Việt Nam khi nào?","history",9);
        Question q10= new Question(" Việt Nam Quốc dân Đảng được thành lập vào thời gian nào?","history",10);
        Question q11= new Question(" Tổ chức cộng sản nào ra đời đầu tiên ở Việt Nam?","history",11);
        Question q12= new Question(" Chi bộ cộng sản đầu tiên gồm mấy đảng viên?\n Ai làm bí thư chi bộ?","history",12);
        Question q13= new Question(" Đông Dương Cộng sản Đảng và An nam Cộng sản Đảng\n được ra đời từ tổ chức tiền thân nào?","history",13);
        Question q14= new Question(" Tổ chức An Nam Cộng sản Đảng được thành lập vào thời gian nào?","history",14);
        Question q15= new Question(" Trong cuộc khai thác thuộc địa lần thứ hai ở Đông Dương\n thực dân Pháp đầu tư vốn nhiều nhất vào ngành \n kinh tế nào?","history",15);
        questions = new ArrayList<>(Arrays.asList(q1, q2, q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15));
        
        Answer a1 = new Answer(1,"Tại Cửu Long – Hương Cảng – Trung Quốc.");
        Answer a2 = new Answer(2,"Bầu Trần Phú là tổng bí thư.");
        Answer a3 = new Answer(3,"Chiến dịch Biên Giới 1950.");
        Answer a4 = new Answer(4,"Tài chính.");
        Answer a5 = new Answer(5,"Hiệp định Sơ bộ (6/3) và Tạm ước (14/9).");
        Answer a6 = new Answer(6,"Hoà với Pháp để đuổi Tưởng ra khỏi Miền Bắc.");
        Answer a7 = new Answer(7,"6-1-1946,bầu quốc hội trong cả nước.");
        Answer a8 = new Answer(8,"Dùng tay quân Tưởng để đẩy thực dân Pháp.");
        Answer a9 = new Answer(9,"1897-1914.");
        Answer a10 = new Answer(10,"12/1927.");
        Answer a11 = new Answer(11,"Đông Dương cộng sản Đảng.");
        Answer a12 = new Answer(12,"7 đảng viên - Bí thư Trần Văn Cung.");
        Answer a13 = new Answer(13,"Hội Việt Nam cách mạng Thanh niên");
        Answer a14 = new Answer(14,"8/1929");
        Answer a15 = new Answer(15,"Nông nghiệp.");
        answers = new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15));
       
       
        Price pr1 = new Price("200.000", 1);
        Price pr2 = new Price("400.000", 2);
        Price pr3 = new Price("600.000", 3);
        Price pr4 = new Price("800.000", 4);
        Price pr5 = new Price("1.000.000", 5);
        Price pr6 = new Price("2.000.000", 6);
        Price pr7 = new Price("3.000.000", 7);
        Price pr8 = new Price("6.000.000", 8);
        Price pr9 = new Price("10.000.000", 9);
        Price pr10 = new Price("14.000.000", 10);
        Price pr11 = new Price("22.000.000", 11);
        Price pr12 = new Price("30.00.000", 12);
        Price pr13 = new Price("40.00.000", 13);
        Price pr14 = new Price("85.000.000", 14);
        Price pr15 = new Price("150.000.000", 15);
        prices = new ArrayList<>(Arrays.asList(pr1,pr2,pr3,pr4,pr5,pr6,pr7,pr8,pr9,pr10,pr11,pr12,pr13,pr14,pr15));
       
        for(int i =0;i<questions.size();i++){
            txtQuesId.setText(questions.get(i).getId()+ "");
            txtQuess.setText(questions.get(i).getTitle());
            break;
        }
        
        for(int i =0;i<answers.size();i++){
            txtAns.setText(answers.get(i).getId()+"");
            txtOp1.setText("A. " + answers.get(i).getAnswwer());
            break;
        }
        
        
        txtUserName2.setText(user.getUserName());
        
            do{   
                Random random2 = new Random();
                int ranId2 = random2.nextInt(answers.size())+1;
                
                txtOp2.setText("B. " + getAnsById(ranId2));
            }while(txtOp2.getText().replace("B. ", "").equals(txtOp1.getText().replace("A. ", ""))); 
        
            do{   
                Random random3 = new Random();
                int ranId3 = random3.nextInt(answers.size())+1;
                txtOp3.setText("C. " + getAnsById(ranId3));
            }while(txtOp3.getText().replace("C. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp3.getText().replace("C. ", "").equals(txtOp2.getText().replace("B. ", "")));
            
            do{
                Random random4 = new Random();
                int ranId4 = random4.nextInt(answers.size())+1;
                txtOp4.setText("D. " + getAnsById(ranId4));
            }while(txtOp4.getText().replace("D. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp4.getText().replace("D. ", "").equals(txtOp2.getText().replace("B. ", "")) || txtOp4.getText().replace("D. ", "").equals(txtOp3.getText().replace("C. ", "")));
            
            txtUserMoney.setText("0");
            user.setMoneyBonus(txtUserMoney.getText());
            
        
        for(int i =0;i<prices.size();i++){
            txtPriceId.setText(prices.get(i).getId()+"");
            txtMoney2.setText(prices.get(i).getPrice());
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        num3 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num6 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        num8 = new javax.swing.JLabel();
        num12 = new javax.swing.JLabel();
        num7 = new javax.swing.JLabel();
        num9 = new javax.swing.JLabel();
        num11 = new javax.swing.JLabel();
        num13 = new javax.swing.JLabel();
        num14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        num5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        num10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        num15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuess = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        txtOp1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        txtOp3 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        txtOp2 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        txtOp4 = new javax.swing.JTextField();
        txtAns = new javax.swing.JTextField();
        txtQuesId = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        txtUserName2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        txtMoney2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        txtUserMoney = new javax.swing.JLabel();
        helpBtn1 = new javax.swing.JButton();
        helpBtn2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPriceId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(239, 495));

        num3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num3.setForeground(new java.awt.Color(255, 255, 0));
        num3.setText("3.             600.000");

        num2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num2.setForeground(new java.awt.Color(255, 255, 0));
        num2.setText("2.             400.000");

        num1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num1.setForeground(new java.awt.Color(255, 255, 0));
        num1.setText("1.             200.000");

        num6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num6.setForeground(new java.awt.Color(255, 255, 0));
        num6.setText("6.             2.000.000");

        num4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num4.setForeground(new java.awt.Color(255, 255, 0));
        num4.setText("4.             800.000");

        num8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num8.setForeground(new java.awt.Color(255, 255, 0));
        num8.setText("8.             6.000.000");

        num12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num12.setForeground(new java.awt.Color(255, 255, 0));
        num12.setText("12.           30.000.000");

        num7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num7.setForeground(new java.awt.Color(255, 255, 0));
        num7.setText("7.             3.000.000");

        num9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num9.setForeground(new java.awt.Color(255, 255, 0));
        num9.setText(" 9.            10.000.000");

        num11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num11.setForeground(new java.awt.Color(255, 255, 0));
        num11.setText("11.           22.000.000");

        num13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num13.setForeground(new java.awt.Color(255, 255, 0));
        num13.setText("13.           40.000.000");

        num14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num14.setForeground(new java.awt.Color(255, 255, 0));
        num14.setText("14.           85.000.000");

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));

        num5.setBackground(new java.awt.Color(51, 51, 51));
        num5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num5.setText("5 .           1.000.000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(num5)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 0));

        num10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num10.setForeground(new java.awt.Color(51, 51, 51));
        num10.setText("10.           14.000.000");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(num10)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 0));

        num15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        num15.setForeground(new java.awt.Color(51, 51, 51));
        num15.setText("15.          150.000.000");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(num15, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(num15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(num11, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(num12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(num13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        txtQuess.setBackground(new java.awt.Color(153, 153, 255));
        txtQuess.setColumns(20);
        txtQuess.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtQuess.setRows(5);
        txtQuess.setText("CAU HOI: ");
        txtQuess.setFocusable(false);
        jScrollPane1.setViewportView(txtQuess);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(102, 0, 102));

        txtOp1.setBackground(new java.awt.Color(153, 153, 255));
        txtOp1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtOp1.setText("A. ");
        txtOp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOp1.setFocusable(false);
        txtOp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOp1MouseClicked(evt);
            }
        });
        txtOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(102, 0, 102));

        txtOp3.setBackground(new java.awt.Color(153, 153, 255));
        txtOp3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtOp3.setText("C. ");
        txtOp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOp3.setFocusable(false);
        txtOp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOp3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp3, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(102, 0, 102));

        txtOp2.setBackground(new java.awt.Color(153, 153, 255));
        txtOp2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtOp2.setText("B. ");
        txtOp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOp2.setFocusable(false);
        txtOp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOp2MouseClicked(evt);
            }
        });
        txtOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOp2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(102, 0, 102));

        txtOp4.setBackground(new java.awt.Color(153, 153, 255));
        txtOp4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtOp4.setText("D. ");
        txtOp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOp4.setFocusable(false);
        txtOp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOp4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOp4)
                .addContainerGap())
        );

        txtAns.setText("Ansid");
        txtAns.setFocusable(false);

        txtQuesId.setText("QuestionId");
        txtQuesId.setFocusable(false);

        jPanel21.setBackground(new java.awt.Color(204, 0, 204));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel21.setFocusable(false);

        txtUserName2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel20.setBackground(new java.awt.Color(255, 255, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("CÂU HỎI TRỊ GIÁ:");

        jPanel18.setBackground(new java.awt.Color(255, 255, 0));

        txtMoney2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMoney2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMoney2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Trợ giúp:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tiền của bạn: ");

        jPanel19.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUserMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUserMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        helpBtn1.setBackground(new java.awt.Color(204, 255, 255));
        helpBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help-icon.png"))); // NOI18N
        helpBtn1.setText("50 / 50");
        helpBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpBtn1MouseEntered(evt);
            }
        });
        helpBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtn1ActionPerformed(evt);
            }
        });

        helpBtn2.setBackground(new java.awt.Color(204, 255, 255));
        helpBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phone-icon.png"))); // NOI18N
        helpBtn2.setText("CALL");
        helpBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(helpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(helpBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(helpBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/man-icon (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(txtUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtPriceId.setText("PriceId");
        txtPriceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(txtPriceId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtQuesId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 527, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAns, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtQuesId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPriceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameback.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceIdActionPerformed

    private void helpBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtn2ActionPerformed
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int ranId = random.nextInt(answers.size())+1;
        if(checkHelpAns(txtOp1.getText(), txtOp1)){
            sb.append("Người bạn gọi chọn : " + txtOp1.getText());
        }else if(checkHelpAns(txtOp2.getText(), txtOp2)){
            sb.append("Người bạn gọi chọn : " + txtOp2.getText());
        }else if(checkHelpAns(txtOp3.getText(), txtOp3)){
            sb.append("Người bạn gọi chọn : " + txtOp3.getText());
        }else if(checkHelpAns(txtOp4.getText(), txtOp4)){
            sb.append("Người bạn gọi chọn : " + txtOp4.getText());
        }else {
            sb.append("Người bạn gọi bảo bạn tự làm :V");
        }
        helpBtn2.setVisible(false);
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
    }//GEN-LAST:event_helpBtn2ActionPerformed

    private void helpBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtn1ActionPerformed

        StringBuilder sb = new StringBuilder();

        if(!checkHelpAns(txtOp1.getText(), txtOp1) && !checkHelpAns(txtOp2.getText(), txtOp2)){
            txtOp1.setText("");
            txtOp2.setText("");

        }else if(!checkHelpAns(txtOp1.getText(), txtOp1) && !checkHelpAns(txtOp3.getText(), txtOp3)){
            txtOp1.setText("");
            txtOp3.setText("");
        }else if(!checkHelpAns(txtOp1.getText(), txtOp1) && !checkHelpAns(txtOp4.getText(), txtOp4)){
            txtOp1.setText("");
            txtOp4.setText("");
        }else if(!checkHelpAns(txtOp2.getText(), txtOp2) && !checkHelpAns(txtOp3.getText(), txtOp3)){
            txtOp2.setText("");
            txtOp3.setText("");
        }else if(!checkHelpAns(txtOp2.getText(), txtOp2) && !checkHelpAns(txtOp4.getText(), txtOp4)){
            txtOp2.setText("");
            txtOp4.setText("");
        }else if(!checkHelpAns(txtOp3.getText(), txtOp3) && !checkHelpAns(txtOp4.getText(), txtOp4)){
            txtOp3.setText("");
            txtOp4.setText("");
        }
        helpBtn1.setVisible(false);
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
    }//GEN-LAST:event_helpBtn1ActionPerformed

    private void helpBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpBtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_helpBtn1MouseEntered

    private void helpBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_helpBtn1MouseClicked

    private void txtOp4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOp4MouseClicked
        String op4 = txtOp4.getText();
        StringBuilder sb = new StringBuilder();
        EndGameDisplay egd = new EndGameDisplay(user);
        boolean win =false;
            int id = Integer.parseInt(txtQuesId.getText())+1;
        if(checkAns(op4, txtOp4))
        {
            if(id >= 5 && id <10){
                
                int choice = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 1.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 1.000.000 - 10.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    System.out.println(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id >= 10 && id <15){
                
                int choice2 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 14.000.000 - 85.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice2 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id ==15){
                
                int choice3 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi 150.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice3 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }
            else if(id > 15){
                mp3Winner.play();
                user.setMoneyBonus(getPriceById(15));
                sb.append("XIN CHÚC MỪNG BẠN ĐÃ TRỞ THÀNH TRIỆU PHÚ!");
                this.setVisible(false);
                egd = new EndGameDisplay(user);
                egd.setVisible(true);
                this.dispose();
                if(sb.length()>0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                    return;
                }
                win = true;
            }
            if(!win){
                mp3Corect.play();
                Question question = questions.get(id-1);
                txtQuess.setText(question.getTitle());
                txtQuesId.setText(id+"");

                int ansId = Integer.parseInt(txtAns.getText())+1;
                txtAns.setText(ansId+"");
                txtOp3.setText("C. " + getAnsById(ansId));

                do{
                    Random random4 = new Random();
                    int ranId4 = random4.nextInt(answers.size())+1;
                    txtOp4.setText("D. " + getAnsById(ranId4));
                }while (txtOp4.getText().replace("D. ", "").equals(txtOp3.getText().replace("C. ", "")));

                do{
                    Random random2 = new Random();
                    int ranId2 = random2.nextInt(answers.size())+1;
                    txtOp2.setText("B. " + getAnsById(ranId2));
                }while(txtOp2.getText().replace("B. ", "").equals(txtOp3.getText().replace("C. ", "")) || txtOp2.getText().replace("B. ", "").equals(txtOp4.getText().replace("D. ", "")) );

                do{
                    Random random1 = new Random();
                    int ranId1 = random1.nextInt(answers.size())+1;
                    txtOp1.setText("A. " + getAnsById(ranId1));
                }while(txtOp1.getText().replace("A. ", "").equals(txtOp2.getText().replace("B. ", "")) || txtOp1.getText().replace("A. ", "").equals(txtOp3.getText().replace("C. ", "")) || txtOp1.getText().replace("A. ", "").equals(txtOp4.getText().replace("D. ", "")));

                txtOp1.setBackground(new Color(153,153,255));
                txtOp2.setBackground(new Color(153,153,255));
                txtOp3.setBackground(new Color(153,153,255));
                txtOp4.setBackground(new Color(153,153,255));

                int prId = Integer.parseInt(txtPriceId.getText())+1;
                txtPriceId.setText(prId+"");
                txtMoney2.setText(getPriceById(prId));

                int totalPrice = Integer.parseInt(txtPriceId.getText())-1;
                txtUserMoney.setText(getPriceById(totalPrice));
                user.setMoneyBonus(txtUserMoney.getText());
            }
            
        }else {
            mp3Incorrect.play();
            sb.append("Bạn đã trả lời sai mất rồi!\n Rất tiếc bạn phải dừng cuộc chơi ở đây!");
            if (id> 5 && id <=11) {
                user.setMoneyBonus("1.000.000");
            } else if (id> 11 && id <=16) {
                user.setMoneyBonus("14.000.000");
            }
            egd = new EndGameDisplay(user);
            this.setVisible(false);
            egd.setVisible(true);
            return;
            
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
    }//GEN-LAST:event_txtOp4MouseClicked

    private void txtOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOp2ActionPerformed

    }//GEN-LAST:event_txtOp2ActionPerformed

    private void txtOp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOp2MouseClicked
        String op2 = txtOp2.getText();
        StringBuilder sb = new StringBuilder();
        EndGameDisplay egd = new EndGameDisplay(user);
        boolean win =false;
            int id = Integer.parseInt(txtQuesId.getText())+1;
        if(checkAns(op2, txtOp2))
        {
            if(id >= 5 && id <10){
                int choice = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 1.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 1.000.000 - 10.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id >= 10 && id <15){
                int choice2 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 14.000.000 - 85.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice2 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id ==15){
                int choice3 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi 150.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice3 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }
            else if(id > 15){
                mp3Winner.play();
                user.setMoneyBonus(getPriceById(15));
                sb.append("XIN CHÚC MỪNG BẠN ĐÃ TRỞ THÀNH TRIỆU PHÚ!");
                this.setVisible(false);
                egd = new EndGameDisplay(user);
                egd.setVisible(true);
                this.dispose();
                if(sb.length()>0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                    return;
                }
                 win= true;
            }
            if(!win){
                mp3Corect.play();
                Question question = questions.get(id-1);
            txtQuess.setText(question.getTitle());
            txtQuesId.setText(id+"");

            int ansId = Integer.parseInt(txtAns.getText())+1;
            txtAns.setText(ansId+"");
            txtOp1.setText("A. " + getAnsById(ansId));

            do{
                Random random2 = new Random();
                int ranId2 = random2.nextInt(answers.size())+1;
                txtOp2.setText("B. " + getAnsById(ranId2));
            } while (txtOp2.getText().replace("B. ", "").equals(txtOp1.getText().replace("A. ", "")));

            do{
                Random random3 = new Random();
                int ranId3 = random3.nextInt(answers.size())+1;
                txtOp3.setText("C. " + getAnsById(ranId3));
            }while(txtOp3.getText().replace("C. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp3.getText().replace("C. ", "").equals(txtOp2.getText().replace("B. ", "")) );

            do{
                Random random4 = new Random();
                int ranId4 = random4.nextInt(answers.size())+1;
                txtOp4.setText("D. " + getAnsById(ranId4));
            }while(txtOp4.getText().replace("D. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp4.getText().replace("D. ", "").equals(txtOp2.getText().replace("B. ", "")) || txtOp4.getText().replace("D. ", "").equals(txtOp3.getText().replace("C. ", "")));

            txtOp1.setBackground(new Color(153,153,255));
            txtOp2.setBackground(new Color(153,153,255));
            txtOp3.setBackground(new Color(153,153,255));
            txtOp4.setBackground(new Color(153,153,255));

            int prId = Integer.parseInt(txtPriceId.getText())+1;
            txtPriceId.setText(prId+"");
            txtMoney2.setText(getPriceById(prId));

            int totalPrice = Integer.parseInt(txtPriceId.getText())-1;
            txtUserMoney.setText(getPriceById(totalPrice));
            user.setMoneyBonus(txtUserMoney.getText());
            }
            

        }else {
            mp3Incorrect.play();
            sb.append("Bạn đã trả lời sai mất rồi!\n Rất tiếc bạn phải dừng cuộc chơi ở đây!");
            if (id> 5 && id <=11) {
                user.setMoneyBonus("1.000.000");
            } else if (id> 11 && id <=16) {
                user.setMoneyBonus("14.000.000");
            }
            egd = new EndGameDisplay(user);
            this.setVisible(false);
            egd.setVisible(true);
            return;
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
    }//GEN-LAST:event_txtOp2MouseClicked

    private void txtOp3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOp3MouseClicked
        String op3 = txtOp3.getText();
        StringBuilder sb = new StringBuilder();
        EndGameDisplay egd = new EndGameDisplay(user);
            int id = Integer.parseInt(txtQuesId.getText())+1;
             boolean win =false;
        if(checkAns(op3, txtOp3))
        {
            if(id >= 5 && id <10){
                int choice = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 1.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 1.000.000 - 10.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id >= 10 && id <15){
                int choice2 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 14.000.000 - 85.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice2 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id ==15){
                int choice3 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi 150.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice3 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }
           
            else if(id > 15){
                mp3Winner.play();
                user.setMoneyBonus(getPriceById(15));
                sb.append("XIN CHÚC MỪNG BẠN ĐÃ TRỞ THÀNH TRIỆU PHÚ!");
                this.setVisible(false);
                egd = new EndGameDisplay(user);
                egd.setVisible(true);
                this.dispose();
                if(sb.length()>0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                    return;
                }
                win= true;
                
            }
            if(!win){
                mp3Corect.play();
                Question question = questions.get(id-1);
            txtQuess.setText(question.getTitle());
            txtQuesId.setText(id+"");

            int ansId = Integer.parseInt(txtAns.getText())+1;
            txtAns.setText(ansId+"");
            txtOp2.setText("B. " + getAnsById(ansId));

            do{
                Random random3 = new Random();
                int ranId3 = random3.nextInt(answers.size())+1;
                txtOp3.setText("C. " + getAnsById(ranId3));
            }while (txtOp3.getText().replace("C. ", "").equals(txtOp2.getText().replace("B. ", "")));

            do{
                Random random1 = new Random();
                int ranId1 = random1.nextInt(answers.size())+1;
                txtOp1.setText("A. " + getAnsById(ranId1));
            }while(txtOp1.getText().replace("A. ", "").equals(txtOp2.getText().replace("B. ", "")) || txtOp1.getText().replace("A. ", "").equals(txtOp3.getText().replace("C. ", "")) );

            do{
                Random random4= new Random();
                int ranId4 = random4.nextInt(answers.size())+1;
                txtOp4.setText("D. " + getAnsById(ranId4));
            }while(txtOp4.getText().replace("D. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp4.getText().replace("D. ", "").equals(txtOp2.getText().replace("B. ", "")) || txtOp4.getText().replace("D. ", "").equals(txtOp3.getText().replace("C. ", "")));

            txtOp1.setBackground(new Color(153,153,255));
            txtOp2.setBackground(new Color(153,153,255));
            txtOp3.setBackground(new Color(153,153,255));
            txtOp4.setBackground(new Color(153,153,255));

            int prId = Integer.parseInt(txtPriceId.getText())+1;
            txtPriceId.setText(prId+"");
            txtMoney2.setText(getPriceById(prId));

            int totalPrice = Integer.parseInt(txtPriceId.getText())-1;
            txtUserMoney.setText(getPriceById(totalPrice));
            user.setMoneyBonus(txtUserMoney.getText());
            }
            
        }
        else {
            mp3Incorrect.play();
            sb.append("Bạn đã trả lời sai mất rồi!\n Rất tiếc bạn phải dừng cuộc chơi ở đây!");
            if (id> 5 && id <=11) {
                user.setMoneyBonus("1.000.000");
            } else if (id> 11 && id <=16) {
                user.setMoneyBonus("14.000.000");
            }
            egd = new EndGameDisplay(user);
            this.setVisible(false);
            egd.setVisible(true);
            return;
        }

        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
    }//GEN-LAST:event_txtOp3MouseClicked

    private void txtOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOp1ActionPerformed

    private void txtOp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOp1MouseClicked
        String op1 = txtOp1.getText();
        StringBuilder sb = new StringBuilder();
        EndGameDisplay egd = new EndGameDisplay(user);
        boolean win =false;
        int id = Integer.parseInt(txtQuesId.getText())+1;
        if(checkAns(op1, txtOp1))
        {
            if(id >= 5 && id <10){
                int choice = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 1.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 1.000.000 - 10.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id >= 10 && id <15){
                int choice2 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi từ 14.000.000 - 85.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice2 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }else if(id ==15){
                int choice3 = JOptionPane.showConfirmDialog(this, "Nếu trả lời sai bạn sẽ phải ra về với 14.000.000 \n nếu bạn lựa chọn dừng cuộc chơi thì số tiền thưởng hiện tại bạn đang có sẽ là của bạn?\n bạn có muốn tiếp tục không", "Mốc câu hỏi 150.000.000!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(choice3 == JOptionPane.YES_OPTION){
                    
                }else{
                    mp3Incorrect.play();
                    win = true;
                    egd = new EndGameDisplay(user);
                    user.setMoneyBonus(txtMoney2.getText());
                    this.dispose();
                    egd.setVisible(true);
                }
            }
            else if(id > 15){
                mp3Winner.play();
                user.setMoneyBonus(getPriceById(15));
                sb.append("XIN CHÚC MỪNG BẠN ĐÃ TRỞ THÀNH TRIỆU PHÚ!");
                this.setVisible(false);
                egd = new EndGameDisplay(user);
                egd.setVisible(true);
                this.dispose();
                if(sb.length()>0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                    return;
                }
                win = true;
            }
            if(!win){
                mp3Corect.play();
                   Question question = questions.get(id-1);
                    txtQuess.setText(question.getTitle());
                    txtQuesId.setText(id+"");

                    int ansId = Integer.parseInt(txtAns.getText())+1;
                    txtAns.setText(ansId+"");
                    txtOp4.setText("D. " + getAnsById(ansId));

                    do{
                        Random random1 = new Random();
                        int ranId1 = random1.nextInt(answers.size())+1;
                        txtOp1.setText("A. " + getAnsById(ranId1));
                    }while (txtOp1.getText().replace("A. ", "").equals(txtOp4.getText().replace("D. ", "")));

                    do{
                        Random random2 = new Random();
                        int ranId2 = random2.nextInt(answers.size())+1;
                        txtOp2.setText("B. " + getAnsById(ranId2));
                    }while(txtOp2.getText().replace("B. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp2.getText().replace("B. ", "").equals(txtOp4.getText().replace("D. ", "")) );

                    do{
                        Random random3 = new Random();
                        int ranId3 = random3.nextInt(answers.size())+1;
                        txtOp3.setText("C. " + getAnsById(ranId3));
                    }while(txtOp3.getText().replace("C. ", "").equals(txtOp1.getText().replace("A. ", "")) || txtOp3.getText().replace("C. ", "").equals(txtOp2.getText().replace("B. ", "")) || txtOp3.getText().replace("C. ", "").equals(txtOp4.getText().replace("D. ", "")));

                    txtOp1.setBackground(new Color(153,153,255));
                    txtOp2.setBackground(new Color(153,153,255));
                    txtOp3.setBackground(new Color(153,153,255));
                    txtOp4.setBackground(new Color(153,153,255));

                    int prId = Integer.parseInt(txtPriceId.getText())+1;
                    txtPriceId.setText(prId+"");
                    txtMoney2.setText(getPriceById(prId));

                    int totalPrice = Integer.parseInt(txtPriceId.getText())-1;
                    txtUserMoney.setText(getPriceById(totalPrice));
                    user.setMoneyBonus(txtUserMoney.getText());
            }
            

        }else {
            mp3Incorrect.play();
            sb.append("Bạn đã trả lời sai mất rồi!\n Rất tiếc bạn phải dừng cuộc chơi ở đây!");
            if (id> 5 && id <=11) {
                user.setMoneyBonus("1.000.000");
            } else if (id> 11 && id <=16) {
                user.setMoneyBonus("14.000.000");
            }
            egd = new EndGameDisplay(user);
            this.setVisible(false);
            egd.setVisible(true);
            return;
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString());
            return;
        }
    }//GEN-LAST:event_txtOp1MouseClicked
    private boolean checkHelpAns(String ans, JTextField textField){
        ans=ans.replace("A. ", "").replace("B. ", "").replace("C. ", "").replace("D. ", "");
        
        if(ans.equals(getAnsById(Integer.parseInt(txtAns.getText())))){
            Question q = new Question();
            Answer a = new Answer();
            return true;
        }
        return false;
    }
    
    private String getAnsById(int id){
       
        for(Answer answer: answers){
            if(answer.getId() == id) 
                return answer.getAnswwer();
          
        }
        return "";
    }
    
    private String getPriceById(int id){
        for(Price price: prices){
            if(price.getId() == id) 
                return price.getPrice();
          
        }
        return "";
    }
    private boolean checkAns(String ans, JTextField textField){
        ans=ans.replace("A. ", "").replace("B. ", "").replace("C. ", "").replace("D. ", "");
        
        EndGameDisplay egd = new EndGameDisplay(user);
        if(ans.equals(getAnsById(Integer.parseInt(txtAns.getText())))){
            textField.setBackground(Color.BLUE);
            Question q = new Question();
            Answer a = new Answer();
            return true;
        }
        textField.setBackground(Color.red);
        return false;
    }
    private Question getNextQuestion(int id){
        return questions.get(id);
    }
    
    //audio
    public static final String CORRECT = "C:\\Users\\LENOVO\\Desktop\\github\\Javacore-Java16\\WhoIsMilionaireGame\\src\\Audio\\corectSound.mp3";
    public static final String INCORRECT ="C:\\Users\\LENOVO\\Desktop\\github\\Javacore-Java16\\WhoIsMilionaireGame\\src\\Audio\\failSound.mp3";
    public static final String WINNER ="C:\\Users\\LENOVO\\Desktop\\github\\Javacore-Java16\\WhoIsMilionaireGame\\src\\Audio\\victorySound.mp3";
    MP3Player mp3Corect = new MP3Player(new File(CORRECT));
    MP3Player mp3Incorrect = new MP3Player(new File(INCORRECT));
    MP3Player mp3Winner = new MP3Player(new File(WINNER));
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameDisplay(user).setVisible(true);
                GameDisplay gameDisplay = new GameDisplay(user);
                
                        
                    }

            
                });
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpBtn1;
    private javax.swing.JButton helpBtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num10;
    private javax.swing.JLabel num11;
    private javax.swing.JLabel num12;
    private javax.swing.JLabel num13;
    private javax.swing.JLabel num14;
    private javax.swing.JLabel num15;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel num6;
    private javax.swing.JLabel num7;
    private javax.swing.JLabel num8;
    private javax.swing.JLabel num9;
    private javax.swing.JTextField txtAns;
    private javax.swing.JLabel txtMoney2;
    private javax.swing.JTextField txtOp1;
    private javax.swing.JTextField txtOp2;
    private javax.swing.JTextField txtOp3;
    private javax.swing.JTextField txtOp4;
    private javax.swing.JTextField txtPriceId;
    private javax.swing.JTextField txtQuesId;
    private javax.swing.JTextArea txtQuess;
    private javax.swing.JLabel txtUserMoney;
    private javax.swing.JLabel txtUserName2;
    // End of variables declaration//GEN-END:variables
}
