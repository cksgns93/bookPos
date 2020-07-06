

package book;

 

import java.awt.event.*;

/**

 *

 * @author kimzerovirus

 */

import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BookMainPage extends javax.swing.JFrame {
	


	DefaultTableModel bookModel;
	
	
	String colHeader[]= {"바코드","상품","가격"};
	int total;
    public BookMainPage() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      }
   
    @SuppressWarnings("unchecked")

    java.awt.CardLayout card =  new java.awt.CardLayout();

    private void initComponents() {

    	
        jPanel1 = new javax.swing.JPanel();

        loginPage = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();

        jPanel2 = new javax.swing.JPanel();

        jLabel2 = new javax.swing.JLabel();

        jLabel3 = new javax.swing.JLabel();

        id = new javax.swing.JTextField();

        pwd = new javax.swing.JPasswordField();

        logIn = new javax.swing.JButton();

        bookMainPage = new javax.swing.JPanel();

        barcode = new javax.swing.JTextField();

        jLabel5 = new javax.swing.JLabel();

        bookSearch = new javax.swing.JButton();

        books = new javax.swing.JButton();

        advertise = new javax.swing.JButton();

        jPanel3 = new javax.swing.JPanel();

        jScrollPane = new javax.swing.JScrollPane();

        jTable1 = new javax.swing.JTable();

        memberCash = new javax.swing.JButton();

        normalCash = new javax.swing.JButton();

        updateMember = new javax.swing.JButton();

        members = new javax.swing.JButton();

        jButton13 = new javax.swing.JButton();

        recipt = new javax.swing.JButton();

        bookRv = new javax.swing.JButton();

        logOut = new javax.swing.JButton();

        jPanel4 = new javax.swing.JPanel();

        jLabel9 = new javax.swing.JLabel();

        jLabel10 = new javax.swing.JLabel();

        jLabel11 = new javax.swing.JLabel();

        plus = new javax.swing.JLabel();

        sum = new javax.swing.JLabel();

        sale = new javax.swing.JLabel();

 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setUndecorated(true);

        

        jPanel1.setLayout(card);

 

        loginPage.setBackground(new java.awt.Color(153, 153, 0));

 

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginlogo.png"))); // NOI18N

 

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setText("Username");

 

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setText("Password");

 

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        id.setText("id");
       id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });

        
        
        pwd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        pwd.setText("jPasswordField1");

        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        pwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pwdMouseClicked(evt);
            }
        });
 

        logIn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        logIn.setText("log in");

        logIn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                logInActionPerformed(evt);

            }

        });

 

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);

        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(

            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel2Layout.createSequentialGroup()

                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()

                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(logIn))

                    .addGroup(jPanel2Layout.createSequentialGroup()

                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(jPanel2Layout.createSequentialGroup()

                                .addGap(28, 28, 28)

                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                    .addComponent(jLabel2)

                                    .addComponent(jLabel3)))

                            .addGroup(jPanel2Layout.createSequentialGroup()

                                .addGap(21, 21, 21)

                                .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(jPanel2Layout.createSequentialGroup()

                                .addGap(21, 21, 21)

                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addGap(0, 12, Short.MAX_VALUE)))

                .addContainerGap())

        );

        jPanel2Layout.setVerticalGroup(

            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel2Layout.createSequentialGroup()

                .addGap(29, 29, 29)

                .addComponent(jLabel2)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(15, 15, 15)

                .addComponent(jLabel3)

                .addGap(18, 18, 18)

                .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(18, 18, 18)

                .addComponent(logIn)

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );

 

        javax.swing.GroupLayout loginPageLayout = new javax.swing.GroupLayout(loginPage);

        loginPage.setLayout(loginPageLayout);

        loginPageLayout.setHorizontalGroup(

            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(loginPageLayout.createSequentialGroup()

                .addContainerGap(317, Short.MAX_VALUE)

                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPageLayout.createSequentialGroup()

                        .addComponent(jLabel1)

                        .addGap(297, 297, 297))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPageLayout.createSequentialGroup()

                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(307, 307, 307))))

        );

        loginPageLayout.setVerticalGroup(

            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(loginPageLayout.createSequentialGroup()

                .addGap(88, 88, 88)

                .addComponent(jLabel1)

                .addGap(18, 18, 18)

                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addContainerGap(164, Short.MAX_VALUE))

        );

 

        jPanel1.add(loginPage, "card2");

 

        bookMainPage.setBackground(new java.awt.Color(255, 255, 255));

 

        barcode.setBackground(new java.awt.Color(255, 255, 255));

        barcode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        barcode.setText("barcode");
barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeActionPerformed(evt);
            }
        });
barcode.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        barcodeMouseClicked(evt);
    }
});

 

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N

        jLabel5.setText("당산점");

 

        bookSearch.setText("책 검색");

        bookSearch.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                bookSearchActionPerformed(evt);

            }

        });

 

        books.setText("재고 관리");

        books.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                booksActionPerformed(evt);

            }

        });

 

        advertise.setText("광고 전송");

        advertise.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                advertiseActionPerformed(evt);

            }

        });

        

        jScrollPane.setFont(new java.awt.Font("맑은 고딕", 0, 12)); // NOI18N

 

        jTable1.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(

            new Object [][] {

            },

            new String [] {
                "상품코드", "상품명", "수량", "할인", "금액"
            }

        ) {

            boolean[] canEdit = new boolean [] {

                false, false, false, false, false

            };

 

            public boolean isCellEditable(int rowIndex, int columnIndex) {

                return canEdit [columnIndex];

            }

        });

        jScrollPane.setViewportView(jTable1);

 

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);

        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(

            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jScrollPane)

        );

        jPanel3Layout.setVerticalGroup(

            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)

        );

 

        memberCash.setText("회원 결제");

        memberCash.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                memberCashActionPerformed(evt);

            }

        });

 

        normalCash.setText("일반 결제");

        normalCash.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                normalCashActionPerformed(evt);

            }

        });

 

        updateMember.setText("회원 등록");

        updateMember.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                updateMemberActionPerformed(evt);

            }

        });

 

        members.setText("회원 관리");

        members.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                membersActionPerformed(evt);

            }

        });

 

        jButton13.setText("꿀 빨기");

        jButton13.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton13ActionPerformed(evt);

            }

        });

 

        recipt.setText("결제 내역");

        recipt.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                reciptActionPerformed(evt);

            }

        });

 

        bookRv.setText("책 예약");

        bookRv.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                bookRvActionPerformed(evt);

            }

        });

 

        logOut.setText("로그 아웃");

        logOut.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                logOutActionPerformed(evt);

            }

        });

 

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel9.setText("합 계");

 

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N

        jLabel10.setText("총 계");

 

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        jLabel11.setText("할 인");

 

        plus.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        plus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        plus.setText(0+"");

 

        sum.setFont(new java.awt.Font("맑은 고딕", 1, 16)); // NOI18N

        sum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        sum.setText("합계");

 

        sale.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N

        sale.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        sale.setText(0+"");

 

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);

        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(

            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel4Layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel11)

                    .addComponent(jLabel9)

                    .addComponent(jLabel10))

                .addGap(20, 20, 20)

                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(sale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addContainerGap())

        );

        jPanel4Layout.setVerticalGroup(

            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(jPanel4Layout.createSequentialGroup()

                .addContainerGap()

                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addContainerGap())

        );

 

        javax.swing.GroupLayout bookMainPageLayout = new javax.swing.GroupLayout(bookMainPage);

        bookMainPage.setLayout(bookMainPageLayout);

        bookMainPageLayout.setHorizontalGroup(

            bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(bookMainPageLayout.createSequentialGroup()

                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(bookMainPageLayout.createSequentialGroup()

                        .addGap(42, 42, 42)

                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(43, 43, 43)

                        .addComponent(barcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                    .addGroup(bookMainPageLayout.createSequentialGroup()

                        .addContainerGap()

                        .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                            .addGroup(bookMainPageLayout.createSequentialGroup()

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(bookSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)

                                        .addComponent(books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                                    .addComponent(advertise, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(updateMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(members, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))

                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(recipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(bookRv, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                    .addGroup(bookMainPageLayout.createSequentialGroup()

                                        .addComponent(memberCash, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                        .addComponent(normalCash, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))

                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))

                .addContainerGap())

        );

        bookMainPageLayout.setVerticalGroup(

            bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(bookMainPageLayout.createSequentialGroup()

                .addGap(23, 23, 23)

                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(barcode)

                    .addComponent(jLabel5))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addGroup(bookMainPageLayout.createSequentialGroup()

                        .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                            .addGroup(bookMainPageLayout.createSequentialGroup()

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(bookSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(updateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(books, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(members, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))

                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                        .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(bookMainPageLayout.createSequentialGroup()

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addComponent(advertise, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addContainerGap(22, Short.MAX_VALUE))

                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookMainPageLayout.createSequentialGroup()

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(memberCash, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(normalCash, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(24, 24, 24))))

                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookMainPageLayout.createSequentialGroup()

                        .addComponent(recipt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(bookRv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addGroup(bookMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addContainerGap())))

        );

     
        

        jPanel1.add(bookMainPage, "card3");

 

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
               
        pack();

        setLocationRelativeTo(null);

    }// </editor-fold>//GEN-END:initComponents

 
    public void showMsg(String Msg) {
    	JOptionPane.showMessageDialog(this, Msg);
    }
    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
    		
        	boolean chk = false;
        	String nid = id.getText();
        	String npwd ="";
        	char arr[] = pwd.getPassword();
        	for(int i=0;i<arr.length;i++) {
        		npwd+=arr[i];
        	}
        	if(nid==null||nid.trim().isEmpty()||npwd==null||npwd.trim().isEmpty()) {
        		showMsg("아이디 비밀번호를 입력하세요");
        		return;
        	}
        	
        	ManagerDAO mdao = new ManagerDAO();
        	List<ManagerVO> re = mdao.chkManager(nid);
        	if(re==null||re.size()==0) {
        		showMsg("아이디가 없습니다.");
        		return;
        	}
        	String chkPw = re.get(0).getPwd();
        	if(npwd.equals(chkPw)) {
        		chk=true;
        	}else {
        		showMsg("비밀번호가 틀렸습니다.");
        		return;
        	}
        	if(chk) {
        		card.show(jPanel1,"card3");
        	}else {
        		showMsg("아이디 비밀번호를 확인하세요");
        	}
        }//GEN-LAST:event_logInActionPerformed



 

    private void bookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSearchActionPerformed

      BookLoc bookloc=new BookLoc();
      bookloc.setVisible(true);

    }//GEN-LAST:event_bookSearchActionPerformed

 

    private void booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksActionPerformed

        ManageBookPage bookmanagement = new ManageBookPage();
        bookmanagement.setVisible(true);

    }//GEN-LAST:event_booksActionPerformed

 

    private void advertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advertiseActionPerformed

    	BookAd book= new BookAd();
    	book.setVisible(true);

    }//GEN-LAST:event_advertiseActionPerformed

 

    private void memberCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberCashActionPerformed
    	
    }//GEN-LAST:event_memberCashActionPerformed

 
    
    private void normalCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalCashActionPerformed
    	int res = total;
    	Success success= new Success(res, bookModel);
    	success.setVisible(true);
    	//1.Table 값없는걸로 바꿔주고
    	DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
    	model.setNumRows(0);
    	//2.textfield 빈공간으로 set
    	barcode.setText("");
    	sum.setText("");
    }//GEN-LAST:event_normalCashActionPerformed

 

    private void updateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_updateMemberActionPerformed

 

    private void membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersActionPerformed

    	new ManageMember().setVisible(true); 
    	
    }//GEN-LAST:event_membersActionPerformed

 

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jButton13ActionPerformed

 

    private void reciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciptActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_reciptActionPerformed

 

    private void bookRvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRvActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_bookRvActionPerformed

 

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed

    	card.show(jPanel1,"card2");
    	id.setText("");
    	pwd.setText("");
    	//pCode.setText("");
       //System.exit(0);

    }//GEN-LAST:event_logOutActionPerformed

 

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed

    }//GEN-LAST:event_pwdActionPerformed
    
    private void barcodeActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	String str = barcode.getText();
    	BookDAO bdao = new BookDAO();
    	try {
    		bookModel=(DefaultTableModel)jTable1.getModel();
    		List<BookVO> temp = bdao.selectByBarcode(str);
    		if(temp.size()==0) {
	    		JOptionPane.showMessageDialog(this, "코드를 다시 입력해주세요!");
	    		return;
	    	}
			BookVO book = temp.get(0);
			String data[] = {book.getCode(),book.getName()," "," ",book.getPrice()+""};
			bookModel.addRow(data);
			total+=book.getPrice();
			sum.setText(total+"");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    private void barcodeMouseClicked(java.awt.event.MouseEvent evt) {                                     
        barcode.setText("");
    } 
    private void idMouseClicked(java.awt.event.MouseEvent evt) {                                     
        id.setText("");
    }
    private void pwdMouseClicked(java.awt.event.MouseEvent evt) {                                     
        pwd.setText("");
    }

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.

         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 

         */

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());

                    break;

                }

            }

        } catch (ClassNotFoundException ex) {

            java.util.logging.Logger.getLogger(BookMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(BookMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(BookMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(BookMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>

 

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new BookMainPage().setVisible(true);

            }

        });

    }

 

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton advertise;

    private javax.swing.JTextField barcode;

    private javax.swing.JPanel bookMainPage;

    private javax.swing.JButton bookRv;

    private javax.swing.JButton bookSearch;

    private javax.swing.JButton books;

    private javax.swing.JTextField id;

    private javax.swing.JButton jButton13;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JPanel jPanel1;

    private javax.swing.JPanel jPanel2;

    private javax.swing.JPanel jPanel3;

    private javax.swing.JPanel jPanel4;

    private javax.swing.JScrollPane jScrollPane;

    private javax.swing.JTable jTable1;

    private javax.swing.JButton logIn;

    private javax.swing.JButton logOut;

    private javax.swing.JPanel loginPage;

    private javax.swing.JButton memberCash;

    private javax.swing.JButton members;

    private javax.swing.JButton normalCash;

    private javax.swing.JLabel plus;

    private javax.swing.JPasswordField pwd;

    private javax.swing.JButton recipt;

    private javax.swing.JLabel sale;

    private javax.swing.JLabel sum;

    private javax.swing.JButton updateMember;

    // End of variables declaration//GEN-END:variables

}

