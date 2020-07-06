package book;

import java.sql.SQLException;
import java.util.List;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManageMember extends javax.swing.JFrame {
	
	DefaultTableModel mTableModel;
	String colHeader[]= {"성      함", "전 화 번 호", "주      소", "이 메 일", "포 인 트"};
    MemberDAO memDao;
	public ManageMember() {
        initComponents();
        showTable();
        
    }
    
    private void showTable() {
    	memDao = new MemberDAO();
    	mTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {}, colHeader));
    	mTableModel=(DefaultTableModel)mTable.getModel();
        try {
			List<MemberVO> mList = memDao.selectMembereAll();
			for(int i=0;i<mList.size();i++) {
				MemberVO member = mList.get(i);
	        	//해당 상품의 바코드로 수량찾기
				String eachInfo[] = {member.getName(),String.valueOf(member.getPhonNum()),member.getAddress(),member.getEmail(),String.valueOf(member.getMileage())};
				mTableModel.addRow(eachInfo);
	        }
		} catch (Exception e) {
			System.out.println("테이블 show에서 예외발생");
			e.printStackTrace();
		}
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tabPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mNum3 = new javax.swing.JTextField();
        mNum3.setDocument(new JTextFieldLimit());
        mName = new javax.swing.JTextField();
        btInsert = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        mAddress = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        mMail = new javax.swing.JTextField();
        mNum2 = new javax.swing.JTextField();
        mNum2.setDocument(new JTextFieldLimit());
        mNum1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        multiCheck = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        //adAgree = new javax.swing.JCheckBox();
        adAgree = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 102, 0)));

        jLabel12.setText("성        함");

        jLabel14.setText("전 화 번 호");

        mNum3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mNum3FocusLost(evt);
            }
        });
        mNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNum3ActionPerformed(evt);
            }
        });

        mName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNameActionPerformed(evt);
            }
        });

        btInsert.setText("등  록");
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });

        btSearch.setText("검  색");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jLabel15.setText("주        소 ");

        mAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAddressActionPerformed(evt);
            }
        });

        jLabel16.setText("이   메   일");

        mMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMailActionPerformed(evt);
            }
        });

        mNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNum2ActionPerformed(evt);
            }
        });

        mNum1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "선택", "02", "010", "011", "016", "019", " ", " " }));
        mNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNum1ActionPerformed(evt);
            }
        });

        jLabel1.setText("-");

        jLabel2.setText("-");

        multiCheck.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        multiCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        multiCheck.setText("jLabel3");

        jLabel3.setText("광고수신동의");

        //adAgree.setText("수신 동의");

        adAgree.setText("수신 동의");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        //.addComponent(adAgree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adAgree)
                        .addGap(20, 20, 20))
                    .addComponent(multiCheck, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mMail, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(mNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(mNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    //.addComponent(adAgree)
                    .addComponent(adAgree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(multiCheck)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
           
            },
            colHeader
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(mTable);

        btUpdate.setText("수  정");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setText("삭  제");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btOut.setText("취  소");
        btOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)
                    .addComponent(btOut))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        tabPane.addTab("회원 관리", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void mTableMouseClicked(java.awt.event.MouseEvent evt) {                                    
    	int index = mTable.getSelectedRow();
    	String name = mTableModel.getValueAt(index,0).toString();
    	String phone = mTableModel.getValueAt(index,1).toString();
    	char phonechar[] = phone.toCharArray();
    	
    	String address = mTableModel.getValueAt(index,2).toString();
    	String email = mTableModel.getValueAt(index,3).toString();
    	
    	if(phonechar[1] == '2') {
    		mNum1.setSelectedItem("02");
    	} else if(phonechar.length == 10) {
    		mNum2.setText(""+phonechar[3]+phonechar[4]+phonechar[5]);
    		mNum3.setText(""+phonechar[6]+phonechar[7]+phonechar[8]+phonechar[9]);
    	} else {
	    	mNum1.setSelectedItem(""+phonechar[0]+phonechar[1]+phonechar[2]);
	    	mNum2.setText(""+phonechar[3]+phonechar[4]+phonechar[5]+phonechar[6]);
	    	mNum3.setText(""+phonechar[7]+phonechar[8]+phonechar[9]+phonechar[10]);
    	}
    	mName.setText(name);
        
        mAddress.setText(address);
        mMail.setText(email);
        
        //check박스 계속 선택하게
        
    }                                   

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	try {//전화번호 변경 하고 싶다
    	String phoneNum1 = mNum1.getSelectedItem().toString();
    	if(phoneNum1.equals("선택")) {
    		showTable();
    		return;
    	}
    	memDao = new MemberDAO();
    	
    	String name = mName.getText();
    	
    	String phoneNum2 = mNum2.getText();
    	String phoneNum3 = mNum3.getText();
    	
    	String phone = phoneNum1 + phoneNum2 + phoneNum3;
    	String address = mAddress.getText();
    	String email = mMail.getText();
    	int ad = adAgree.isSelected()? 1:0;
    	MemberVO member = new MemberVO(name, phone, address, email, ad, 0);
    	if(memDao.updateMember(member)) {
    		JOptionPane.showMessageDialog(this, "수정됨");
    	}
    	}
    	finally {
    		showTable();
		}
    	
    }                                        

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	try {
    	String phoneNum1 = mNum1.getSelectedItem().toString();
    	memDao = new MemberDAO();
    	if(phoneNum1.equals("선택")) {
    		showTable();
    		return;
    	}
    	String phoneNum2 = mNum2.getText();
    	String phoneNum3 = mNum3.getText();
    	String phone = phoneNum1 + phoneNum2 + phoneNum3;
    	if(memDao.deleteByPhon(phone)) {
    		mNum1.setSelectedItem("선택");
	    	mNum2.setText("");
	    	mNum3.setText("");
    		mAddress.setText("");
    	    mMail.setText("");
    	    mName.setText("");
    		JOptionPane.showMessageDialog(this, "해당 테이블 삭제되었습니다");
    		
    	}
    	}finally {
    		
			showTable();
		}
    }                                        

    private void btOutActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	this.setVisible(false);
    	this.dispose();
    }                                     

    private void mNameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void mNum1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void mNum2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void mMailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void mAddressActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	String phoneNum1 = mNum1.getSelectedItem().toString();
    	if(phoneNum1.equals("선택")) {
    		showTable();
    		return;
    	}
    	memDao = new MemberDAO();
    	String name = mName.getText();
    	
    	String phoneNum2 = mNum2.getText();
    	String phoneNum3 = mNum3.getText();
    	
    	String phone = phoneNum1 + phoneNum2 + phoneNum3;
    	System.out.println(phone);
    	List<MemberVO> list = memDao.selectByPhon(phone);
    	
    	System.out.println(list);
    	if(list.size() == 0) {
    		mAddress.setText("");
    	    mMail.setText("");
    	    mName.setText("");
    	    JOptionPane.showMessageDialog(this, "검색된 회원 없음");
    		return;
    	}
    	MemberVO member = list.get(0);
    	mAddress.setText(member.getAddress());
	    mMail.setText(member.getEmail());
	    mName.setText(member.getName());
    	multiCheck.setText(member.getPhonNum()+": 있는 번호");
		multiCheck.setForeground(new Color(255,0,0));
    }                                        

    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {  
    	try {
    	String phoneNum1 = mNum1.getSelectedItem().toString();
    	if(phoneNum1.equals("선택")) {
    		showTable();
    		return;
    	}
    	memDao = new MemberDAO();
    	
    	String name = mName.getText();
    	
    	String phoneNum2 = mNum2.getText();
    	String phoneNum3 = mNum3.getText();
    	
    	String phone = phoneNum1 + phoneNum2 + phoneNum3;
    	String address = mAddress.getText();
    	String email = mMail.getText();
    	int ad = adAgree.isSelected()? 1:0;
    	MemberVO member = new MemberVO(name, phone, address, email, ad, 0);
    	memDao.insertMember(member);
    	
    	} catch (Exception e) {
    		System.out.println("asdfasdf");
    	}
    	
    	finally {
    		showTable();
		}
    	
    }                                        

    private void mNum3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void mNum3FocusLost(java.awt.event.FocusEvent evt) {                                
    	
    	String phoneNum1 = mNum1.getSelectedItem().toString();
    	if(phoneNum1.equals("선택")) {
    		showTable();
    		return;
    	}
    	memDao = new MemberDAO();
    	String name = mName.getText();
    	
    	String phoneNum2 = mNum2.getText();
    	String phoneNum3 = mNum3.getText();
    	
    	String phone = phoneNum1 + phoneNum2 + phoneNum3;
    	System.out.println(phone);
    	List<MemberVO> list = memDao.selectByPhon(phone);
    	
    	System.out.println(list);
    	if(list.size() == 0) {
    		multiCheck.setText(phone +": 사용할수 있는 번호입니다");
    		multiCheck.setForeground(new Color(0,0,0));
    		return;
    	}
    	MemberVO member = list.get(0);
    	multiCheck.setText(member.getPhonNum()+": 이미 있는 번호");
		multiCheck.setForeground(new Color(255,0,0));                 
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ManageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    //private javax.swing.JCheckBox adAgree;
    private javax.swing.JCheckBox adAgree;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btOut;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mAddress;
    private javax.swing.JTextField mMail;
    private javax.swing.JTextField mName;
    private javax.swing.JTextField mName1;
    private javax.swing.JComboBox mNum1;
    private javax.swing.JTextField mNum2;
    private javax.swing.JTextField mNum3;
    private javax.swing.JTable mTable;
    private javax.swing.JLabel multiCheck;
    private javax.swing.JTabbedPane tabPane;
    // End of variables declaration                   
}
