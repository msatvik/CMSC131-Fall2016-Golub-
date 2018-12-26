package bbtCode;

import studentCode.*;

//NOTE: You probably shouldn't be looking at this code.
//NOTE: Since you are looking at it, make sure not to alter it at all!


public class Hallway extends javax.swing.JFrame {
	private static final long serialVersionUID = 16080001L;
	                     
    private javax.swing.JButton buttonKnock;
    private javax.swing.JButton buttonPenny;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    
	private final javax.swing.JLabel[] labels;

	private final String errorKnock = 
			"Can't knock again yet.  You need to say Penny.";
	private final String errorPenny = 
			"Can't say Penny.  Need to knock.";
	
	
	
	
    public Hallway() {
        initComponents();

        Utilities.initCount();
        Utilities.initPenny();

        labels = new javax.swing.JLabel[3];
        labels[0] = label1;
        labels[1] = label2;
        labels[2] = label3;

        buttonKnock.setEnabled(true);
        buttonPenny.setEnabled(true);
    }

    
    
    private int getIteration() {
        return (Utilities.getCount() - 1) / 3;
    }
    
    private int getKnockCount() {
         return Utilities.getCount() % 3;
    }
    
    private void buttonKnockActionPerformed(java.awt.event.ActionEvent evt) {                                            

        if (!Utilities.getPennyStatus()) {
        	Utilities.knockHappened();

            int iterationNumber = getIteration();
            int knockNumber = getKnockCount();
            
            String messageText = labels[iterationNumber].getText();
            switch (knockNumber) {
                case 1: messageText += "Knock, "; break;
                case 2: messageText += "knock, "; break;
                case 0: messageText += "knock.    "; Utilities.togglePenny(); break;
            }
            labels[iterationNumber].setText(messageText);
        } else {
            System.err.println(errorKnock);
        	javax.swing.JOptionPane.showMessageDialog(this, errorKnock);
            label4.grabFocus();
        }
    }                                           

    private void buttonPennyActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (Utilities.getPennyStatus()) {
            int iterationNumber = getIteration();
            
            String messageText = labels[iterationNumber].getText();
            messageText += "Penny.";
            labels[iterationNumber].setText(messageText);
            Utilities.togglePenny();
            
            if (iterationNumber==2) {
                label4.grabFocus();
                label4.setText("What do you want " + Utilities.getName() + "?");
                buttonKnock.setEnabled(false);
                buttonPenny.setEnabled(false);
            }
        } else {
        	System.err.println(errorPenny);
        	javax.swing.JOptionPane.showMessageDialog(this, errorPenny);
            label4.grabFocus();
        }

    }                                           

    
    
    

    private void initComponents() {

        buttonKnock = new javax.swing.JButton();
        buttonKnock.setEnabled(false);
        buttonPenny = new javax.swing.JButton();
        buttonPenny.setEnabled(false);
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apartment 4B");
        setBackground(new java.awt.Color(204, 255, 255));
        setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        buttonKnock.setText("Knock");
        buttonKnock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKnockActionPerformed(evt);
            }
        });
        

        buttonPenny.setText("Penny");
        buttonPenny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPennyActionPerformed(evt);
            }
        });

        
        label4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setAlignmentY(0.0F);

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonKnock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPenny))
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKnock)
                    .addComponent(buttonPenny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        
        label4.grabFocus();
    }                      

    
                
}

