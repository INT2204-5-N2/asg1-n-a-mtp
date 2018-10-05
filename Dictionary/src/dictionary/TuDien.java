/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import xuly.IOFile;
import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import java.util.Set;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JFrame;
import java.io.*;
import com.sun.speech.freetts.*;
import java.awt.Container;
import java.awt.FlowLayout;
import static java.awt.Frame.NORMAL;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author THE TESSEN Hoàng Phi
 */
public class TuDien extends javax.swing.JFrame {

    /**
     * Creates new form TuDien
     */
    private TreeMap<String ,String> listW;
    private IOFile file;
    DefaultListModel<String> model = new DefaultListModel<>();   
    public TuDien() {
        file= new IOFile();
        listW =  file.docTu();     
        setLocation(370,150);
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextField1 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btModify = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btspeak = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T-P Dictionary");
        setBackground(new java.awt.Color(51, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(TuDien.class.getResource("/photo/logo.png")));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 358));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setForeground(new java.awt.Color(0, 204, 204));

        btSearch.setBackground(new java.awt.Color(255, 255, 0));
        btSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btSearch.setForeground(new java.awt.Color(153, 0, 153));
        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/tìm.png"))); // NOI18N
        btSearch.setMnemonic('S');
        btSearch.setText("Search");
        btSearch.setToolTipText("Tìm kiếm một từ và các từ gần giống trong từ điển");
        btSearch.setName(""); // NOI18N
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(0, 153, 255));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setToolTipText("");
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setDropMode(javax.swing.DropMode.ON);
        jList1.setRequestFocusEnabled(false);
        jList1.setSelectedIndices(new int[] {0});

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jList1, org.jdesktop.beansbinding.ObjectProperty.create(), jList1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btModify.setBackground(new java.awt.Color(255, 255, 0));
        btModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btModify.setForeground(new java.awt.Color(153, 0, 153));
        btModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/sửa.png"))); // NOI18N
        btModify.setMnemonic('M');
        btModify.setText("Modify");
        btModify.setToolTipText("Sửa một từ đã có trong từ điển");
        btModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifyActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(255, 255, 0));
        btDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDelete.setForeground(new java.awt.Color(153, 0, 153));
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/xóa.png"))); // NOI18N
        btDelete.setMnemonic('D');
        btDelete.setText("Delete");
        btDelete.setToolTipText("Xóa một từ đã có trong từ điển");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btAdd.setBackground(new java.awt.Color(255, 255, 0));
        btAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(153, 0, 153));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/thêm.png"))); // NOI18N
        btAdd.setMnemonic('A');
        btAdd.setText("   Add");
        btAdd.setToolTipText("Thêm một từ mới vào từ điển");
        btAdd.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                btAddInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btExit.setBackground(new java.awt.Color(255, 255, 0));
        btExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(153, 0, 153));
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/thoát.png"))); // NOI18N
        btExit.setMnemonic('E');
        btExit.setText("  Exit");
        btExit.setToolTipText("Thoát khỏi ứng dụng");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSearchMouseClicked(evt);
            }
        });
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSearchKeyTyped(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 255, 233));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btspeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/loa.png"))); // NOI18N
        btspeak.setToolTipText("Phát âm");
        btspeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btspeakActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btModify, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btspeak, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btspeak, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btspeak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btModify)
                        .addGap(44, 44, 44)
                        .addComponent(btAdd)
                        .addGap(40, 40, 40)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btExit))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
        if(!tfSearch.getText().trim().equals(""))
        {
            jTextArea1.setText("");
           if(listW.get(tfSearch.getText().trim().toLowerCase())==null)
               JOptionPane.showMessageDialog(null, "Xin lỗi, không tìm thấy từ bạn vừa nhập");
           else jTextArea1.setText(listW.get(tfSearch.getText().trim().toLowerCase())); 
        } 
        else  JOptionPane.showMessageDialog(null, "Bạn phải nhập từ vào ô tìm kiếm","Error",NORMAL);     
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        int click=JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát", "Exit", JOptionPane.YES_NO_OPTION);
        if(click==JOptionPane.YES_OPTION)   
            System.exit(1);
    }//GEN-LAST:event_btExitActionPerformed
    
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        model.removeAllElements();
        if(!tfSearch.getText().equals("")){
            jTextArea1.setText("");
            Set<String> keySet = listW.keySet();
            for(String i:keySet){
                if(i.contains(tfSearch.getText().toLowerCase())){
                    model.addElement(i);
                //   jList1.setModel(model);
                    check = true;
                }                      
            } 
            JScrollBar sb = jScrollPane1.getVerticalScrollBar(); 
                sb.setValue(0);
           if(!check)JOptionPane.showMessageDialog(null, "Không tìm thấy từ bạn vừa nhập");
        } 
        else  JOptionPane.showMessageDialog(null, "Bạn phải nhập từ vào ô tìm kiếm","Error",NORMAL);
        
    }//GEN-LAST:event_btSearchActionPerformed

    private void btModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifyActionPerformed
        // TODO add your handling code here:
        String fix_Word = null;
        String meaning = null;
        try {
            do{
                fix_Word = JOptionPane.showInputDialog(null, "Nhập từ cần sửa", "Modify", WIDTH);
                if(fix_Word.equals(""))JOptionPane.showMessageDialog(null,"Bạn chưa nhập từ","Error",NORMAL);
            }
            while(fix_Word.equals(""));
            if(listW.get(fix_Word.toLowerCase().trim())==null) 
                JOptionPane.showMessageDialog(null, "Từ điển không có từ bạn vừa nhập","Error",NORMAL);
            else{
                do{
                meaning = JOptionPane.showInputDialog(null, "Nhập nghĩa mới", "Modify", WIDTH);
                if(meaning.equals(""))JOptionPane.showMessageDialog(null,"Bạn chưa nhập nghĩa","Error",NORMAL);
                }
                while(meaning.equals(""));
                listW.replace(fix_Word.trim().toLowerCase(), meaning);
                file.ghiTu(listW);
                JOptionPane.showMessageDialog(null,"Bàn đã sửa từ thành công!","Message",JOptionPane.YES_OPTION);                
            }
        }
        catch (Exception e) {
        }         
    }//GEN-LAST:event_btModifyActionPerformed
    public void  a(String a){
        
    }
    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
       // Them them = new Them();
       JFrame frame = new JFrame("Add Word");
       frame.setSize(300, 200);
       frame.setLocationRelativeTo(this);
       frame.setLayout(new GridLayout(3, 1));
       frame.setVisible(true);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       JPanel pnEnglishWord = new JPanel();
       frame.add(pnEnglishWord);
       pnEnglishWord.setLayout(new FlowLayout(FlowLayout.LEFT));
       JLabel lbEngWord = new JLabel("English Word");
       JTextField txtEngWord = new JTextField(20);
       pnEnglishWord.add(lbEngWord);
       pnEnglishWord.add(txtEngWord);
       
       JPanel pnMeanWord = new JPanel();
       frame.add(pnMeanWord);
       pnMeanWord.setLayout(new FlowLayout(FlowLayout.LEFT));
       JLabel lbMeanWord = new JLabel("Mean Word");
       JTextField txtMeanWord = new JTextField(20);
       lbMeanWord.setPreferredSize(lbEngWord.getPreferredSize());
       pnMeanWord.add(lbMeanWord);
       pnMeanWord.add(txtMeanWord);
       
       JPanel pnButton = new JPanel();
       frame.add(pnButton);
       JButton btnOK = new JButton("OK");
       JButton btnCancel = new JButton("Cancel");
       btnOK.setBounds(80, 80, 80, 80);
       pnButton.add(btnOK);
       pnButton.add(btnCancel);
       btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                      if(txtEngWord.getText().trim().equals("") || txtMeanWord.getText().trim().equals(""))
                              JOptionPane.showMessageDialog(null,"Bạn phải nhập từ và nghĩa","Error",NORMAL);             
               // }
            //   while(txtEngWord.getText().trim().equals("") && txtMeanWord.getText().trim().equals(""));
                if(listW.get(txtEngWord.getText().toLowerCase().trim())!=null)
                JOptionPane.showMessageDialog(null, "Từ điển đã có từ bạn vừa nhập","Error",NORMAL);
                else if(!txtEngWord.getText().trim().equals("") && !txtMeanWord.getText().trim().equals("")){
                    listW.put(txtEngWord.getText().toLowerCase().trim(),txtMeanWord.getText().toLowerCase().trim());
                    file.ghiTu(listW);             
                    JOptionPane.showMessageDialog(null,"Bàn đã thêm từ thành công!","Message",JOptionPane.YES_OPTION);
                    docList(listW);
                    JScrollBar sb = jScrollPane1.getVerticalScrollBar(); 
                    sb.setValue(0);
                    frame.setVisible(false);
//<<<<<<< HEAD
                //listW.put(lbEngWord.getText(), lbMeanWord.getText());
                //file.ghiTu(listW);
              //  model.addElement(lbEngWord.getText());
                
//=======
                }              

            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);           
            }
        }); 
       
    }//GEN-LAST:event_btAddActionPerformed

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        // TODO add your handling code here:
        tfSearch.setText(""); 
        jTextArea1.setText("");
       model.removeAllElements();
      Set<String> keySet = listW.keySet();
           for(String i:keySet){               
                   model.addElement(i);
                  jList1.setModel(model);
               }
            JScrollBar sb = jScrollPane1.getVerticalScrollBar(); 
            sb.setValue(0);
    }//GEN-LAST:event_tfSearchMouseClicked

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        // TODO add your handling code here:
        String word=null;
        try {
             if(evt.getKeyCode()==KeyEvent.VK_UP)         
                    word = model.getElementAt(jList1.getSelectedIndex()-1);
            else if(evt.getKeyCode()==KeyEvent.VK_DOWN)
                    word = model.getElementAt(jList1.getSelectedIndex()+1); 
                    jTextArea1.setText("");
                    jTextArea1.setText(listW.get(word));                                           
        } catch (Exception e) {
        }              
    }//GEN-LAST:event_jList1KeyPressed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        String delete_Word=null;
        try {
            do{
            delete_Word = JOptionPane.showInputDialog(null, "Nhập từ cần xóa", "Delete", WIDTH);
            if(delete_Word.equals(""))JOptionPane.showMessageDialog(null,"Bạn chưa nhập từ","Error",NORMAL);
            }
            while(delete_Word.equals(""));
            if(listW.get(delete_Word.toLowerCase().trim())==null)
                JOptionPane.showMessageDialog(null, "Từ điển không có từ bạn vừa nhập","Error",NORMAL);
            else{
                listW.remove(delete_Word.trim().toLowerCase());                                                  
                file.ghiTu(listW);             
                JOptionPane.showMessageDialog(null,"Bàn đã xóa từ thành công!","Message",JOptionPane.YES_OPTION);
                model.removeElement(delete_Word);
                JScrollBar sb = jScrollPane1.getVerticalScrollBar(); 
                sb.setValue(0);
            }         
        } catch (Exception e) {          
        }      
    }//GEN-LAST:event_btDeleteActionPerformed
    private static final String VOICENAME="kevin16";//Sử dụng tiếng của tác giả
    private void btspeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btspeakActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
            voice.speak(tfSearch.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btspeakActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        if(!jList1.isSelectionEmpty()) { 
            String tu;
            tu = jList1.getSelectedValue();
            //jTextArea1.setText(listW.get(tu)); 
            if(!tfSearch.getText().equals(tu)) {
                tfSearch.setText(tu);  
                jTextArea1.setText(listW.get(tu));
            }      
        }
    }//GEN-LAST:event_jList1ValueChanged
     private void docList(TreeMap<String, String> listW) {
        model.removeAllElements();
        jList1.setModel(model);
        Set<String> keySet = listW.keySet();
        for(String i:keySet){
            model.addElement(i);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here: đưa từ vào list
        docList(listW);
        //jList1.setSelectedIndex(0);  
    }//GEN-LAST:event_formWindowOpened

    private void tfSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyTyped
        // TODO add your handling code here:
        String text = tfSearch.getText().trim();
        text += evt.getKeyChar(); // đọc kí tự sự kiện nhập
        text = text.trim().toLowerCase();
        
        for(int i = 0; i < model.size(); i++) {
            String val = "" + model.getElementAt(i);
            val = val.toLowerCase();
            if(val.startsWith(text)) { // startWith kiểm tra tiền tố ví dụ java swing có ja => true, jav => true..
              //  jList1.setSelectedIndex(i);
                JScrollBar sb = jScrollPane1.getVerticalScrollBar(); // chạy scrollpane xuống từ chữ cái đầu
                sb.setValue(i * 20);
                return;
            }
        }
       // jTextArea1.setText("Không tìm thấy từ bạn nhập !!!");
        /* detail : https://www.youtube.com/watch?v=UR76LaV4wRA */
           //  jList1.clearSelection(); 
    }//GEN-LAST:event_tfSearchKeyTyped

    private void btAddInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_btAddInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddInputMethodTextChanged
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
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuDien().setVisible(true);       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btModify;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btspeak;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfSearch;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    //@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
