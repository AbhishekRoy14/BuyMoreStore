
package gui;

import core.buyMoreCoord.*;
import core.parameters.*;
import core.sale.*;
import core.inventory.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author royab
 */
public class buyMoreGUI extends javax.swing.JFrame {

    //attributes
    
    private BuyMoreCoord buyMoreCoord;
    private Product product;
    private Parameters parameters;
    private SalesPerson salesPerson = SalesPerson.getSalesPerson();

    ArrayList<Parameters> groups;

    ArrayList<ProductName> productNameList;
    String header[] = new String[]{"Item Number", "Brand Name", "Product Type", "Measured Value", "Measured Unit", "Price", "Group", "Subgroup"};

    ArrayList<Item> itemList; // ArrayList itemList

    ArrayList<Product> productList; //ArrayList productList

    DefaultTableModel dtm; 
    int row, col;

    String blank = "";
    private boolean True;

    //constructor
    /**
     * Creates new form buyMoreGUI
     */
    public buyMoreGUI() {
        initComponents();
        buyMoreCoord = new BuyMoreCoord();
        Parameters.initialize();
        groups = new ArrayList<Parameters>();
        productNameList = new ArrayList<>();
        itemList = new ArrayList<>();
        productList = new ArrayList<>();
        dtm = new DefaultTableModel(header, 0);
        jTable2.setModel(dtm);
        this.setLocationRelativeTo(null);
        showDate();

    }
    
    //Method for Date
  
    public void showDate() {
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        jDate.setText("Date:" + sf.format(d));

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jItemNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBrandName = new javax.swing.JTextField();
        jProductType = new javax.swing.JTextField();
        jMeasuredValue = new javax.swing.JTextField();
        jPrice = new javax.swing.JTextField();
        jMeasuredUnit = new javax.swing.JComboBox<>();
        groupList = new javax.swing.JComboBox<>();
        subgroupList = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jItemNumber1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jBrandNameS = new javax.swing.JTextField();
        jProductTypeS = new javax.swing.JTextField();
        jMeasuredValueS = new javax.swing.JTextField();
        jPriceS = new javax.swing.JTextField();
        jMeasuredUnitS = new javax.swing.JComboBox<>();
        jGroupS = new javax.swing.JComboBox<>();
        jSubgroupS = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        bAddToSale = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jBillDetails = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTotalAmount = new javax.swing.JTextField();
        jDiscountAmount = new javax.swing.JTextField();
        jCompleteSale = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jSaleHistory = new javax.swing.JButton();
        jSalesHistory = new javax.swing.JTextField();
        jID = new javax.swing.JTextField();
        jGST = new javax.swing.JTextField();
        jDate = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jTAmount = new javax.swing.JTextField();
        jDiscount = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BuyMore");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BuyMore");

        jTextField1.setEditable(false);
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Session Selector");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Sale Person Details");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Name:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Save Name");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Discount Details");

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Total Amount Cut-Off ($):");

        jLabel7.setText("(Below) Discount Percentage (%):");

        jLabel8.setText("(Higher) Discount Percentage (%):");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Clear");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Save Discount Details");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5))))
                .addGap(74, 74, 74))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Search Item ID:");

        jLabel11.setText("Brand Name:");

        jLabel12.setText("Product Type:");

        jLabel13.setText("Measured Value:");

        jLabel14.setText("Measured Unit:");

        jLabel15.setText("Price:");

        jLabel16.setText("Group:");

        jLabel17.setText("Subgroup:");

        jMeasuredValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeasuredValueActionPerformed(evt);
            }
        });

        jMeasuredUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "g", "l", "ml", "cnt" }));
        jMeasuredUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeasuredUnitActionPerformed(evt);
            }
        });

        groupList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Bread/Bakery", "Canned/Jarred Goods", "Dairy", "Dry/Baking Goods", "Frozen Foods", "Meat", "Produce", "Cleaners", "Paper Goods", "Personal Care", "Other" }));
        groupList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                groupListItemStateChanged(evt);
            }
        });
        groupList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupListActionPerformed(evt);
            }
        });

        subgroupList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "coffee/tea" }));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Search");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Add Item");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Delete Item");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Clear");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBrandName)
                                    .addComponent(jProductType)
                                    .addComponent(jItemNumber)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jMeasuredValue)
                                    .addComponent(jPrice)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jMeasuredUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(groupList, 0, 306, Short.MAX_VALUE)
                                    .addComponent(subgroupList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jMeasuredValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jMeasuredUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(groupList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(subgroupList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Item Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Start of Business", jPanel2);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Seach Item ID:");

        jLabel19.setText("Brand Name:");

        jLabel20.setText("Product Type:");

        jLabel21.setText("Measured Value:");

        jLabel22.setText("Measured Unit:");

        jLabel23.setText("Price:");

        jLabel24.setText("Group:");

        jLabel25.setText("Subgroup:");

        jMeasuredValueS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeasuredValueSActionPerformed(evt);
            }
        });

        jMeasuredUnitS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg ", "g", "l", "ml", "cnt", " " }));

        jGroupS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverages", "Bread/Bakery", "Canned/Jarred Goods", "Dairy", "Dry/Baking Goods", "Frozen Foods", "Meat", "Produce", "Cleaners", "Paper Goods", "Personal Care", "Other" }));
        jGroupS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jGroupSItemStateChanged(evt);
            }
        });

        jSubgroupS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "coffee/tea" }));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Search");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        bAddToSale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bAddToSale.setText("Add to Sale");
        bAddToSale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAddToSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddToSaleActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("Clear");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBrandNameS)
                            .addComponent(jProductTypeS)
                            .addComponent(jItemNumber1)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPriceS)
                            .addComponent(jGroupS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSubgroupS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jMeasuredUnitS, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(bAddToSale, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jMeasuredValueS)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jItemNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jBrandNameS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jProductTypeS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jMeasuredValueS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jMeasuredUnitS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jPriceS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jGroupS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jSubgroupS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddToSale)
                    .addComponent(jButton11))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Item Details:");

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBillDetails.setEditable(false);
        jBillDetails.setOpaque(false);

        jLabel28.setText("Total Amount ($):");

        jLabel29.setText("Discount Amount ($):");

        jCompleteSale.setText("Complete Sale");
        jCompleteSale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCompleteSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCompleteSaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBillDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jDiscountAmount)))
                    .addComponent(jCompleteSale, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBillDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jDiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jCompleteSale, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Bill Details");

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setOpaque(false);

        jButton14.setText("Exit");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jSaleHistory.setText("View Sale History");
        jSaleHistory.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSaleHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaleHistoryActionPerformed(evt);
            }
        });

        jSalesHistory.setEditable(false);
        jSalesHistory.setBorder(null);
        jSalesHistory.setOpaque(false);

        jID.setEditable(false);
        jID.setBackground(new java.awt.Color(240, 240, 240));
        jID.setBorder(null);
        jID.setOpaque(false);

        jGST.setEditable(false);
        jGST.setBorder(null);
        jGST.setOpaque(false);

        jDate.setEditable(false);
        jDate.setBorder(null);
        jDate.setOpaque(false);

        jName.setEditable(false);
        jName.setBorder(null);
        jName.setOpaque(false);

        jTAmount.setEditable(false);
        jTAmount.setBorder(null);
        jTAmount.setOpaque(false);

        jDiscount.setEditable(false);
        jDiscount.setBorder(null);
        jDiscount.setOpaque(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSalesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(jID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDate)
                                .addComponent(jGST, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSaleHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTAmount)
                            .addComponent(jDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSaleHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSalesHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("During Sales", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMeasuredValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeasuredValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMeasuredValueActionPerformed

    private void jMeasuredValueSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeasuredValueSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMeasuredValueSActionPerformed

    // Applying Discount Parameters
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        if (jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please a vaild higher discount percentage", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            double CutOffSalesPrice = Double.parseDouble(jTextField3.getText());
            double belowDiscounPercentage = Double.parseDouble(jTextField4.getText());
            double higherDiscountPercentage = Double.parseDouble(jTextField5.getText());
            JOptionPane.showMessageDialog(this, "Discount parameters has been set successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            BuyMoreCoord.setDiscountParameters(CutOffSalesPrice, belowDiscounPercentage, higherDiscountPercentage);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    //Exit the System
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

        JOptionPane.showConfirmDialog(null, "Are you sure you want to shut BuyMore system down?", "Confirm Shutdown?", JOptionPane.YES_NO_OPTION);
        System.exit(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    // Entering Sales Person Name
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter vaild name", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            String name = jTextField2.getText().trim();
            salesPerson.setName(name);
            JOptionPane.showMessageDialog(jTextField2, "Your name has been saved", "Success", JOptionPane.INFORMATION_MESSAGE);
            jTextField1.setText(jTextField2.getText());

        }

    }//GEN-LAST:event_jButton1ActionPerformed


    private void groupListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupListActionPerformed


    }//GEN-LAST:event_groupListActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
//        SalesPerson "Alex" name input field

    }//GEN-LAST:event_jTextField1ActionPerformed

    //Clear  Discount field
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void groupListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_groupListItemStateChanged
        ArrayList<String> groups = new ArrayList<>();
        Iterator<String> iter;
        if (groupList.getSelectedItem().equals("Beverages")) {
            subgroupList.removeAllItems();
            groups.add("coffee/tea");
            groups.add("juice");
            groups.add("soda");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Bread/Bakery")) {
            subgroupList.removeAllItems();
            groups.add("sandwich loaves");
            groups.add("dinner rolls");
            groups.add("tortillas");
            groups.add("bagels");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Canned/Jarred Goods")) {
            subgroupList.removeAllItems();
            groups.add("vegetables");
            groups.add("spaghetti sauce");
            groups.add("ketchup");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Dairy")) {
            subgroupList.removeAllItems();
            groups.add("cheeses");
            groups.add("eggs");
            groups.add("milk");
            groups.add("yogurt");
            groups.add("butter");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Dry/Baking Goods")) {
            subgroupList.removeAllItems();
            groups.add("cereals");
            groups.add("flour");
            groups.add("sugar");
            groups.add("pasta");
            groups.add("mixes");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Frozen Foods")) {
            subgroupList.removeAllItems();
            groups.add("waffles");
            groups.add("vegetables");
            groups.add("individual meals");
            groups.add("ice cream");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Meat")) {
            subgroupList.removeAllItems();
            groups.add("lunch meat");
            groups.add("poultry");
            groups.add("beef");
            groups.add("pork");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Produce")) {
            subgroupList.removeAllItems();
            groups.add("fruits");
            groups.add("vegetables");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Cleaners")) {
            subgroupList.removeAllItems();
            groups.add("all- purpose");
            groups.add("laundry detergent");
            groups.add("dishwashing liquid/detergent");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Paper Goods")) {
            subgroupList.removeAllItems();
            groups.add("paper towels");
            groups.add("toilet paper");
            groups.add("aluminum foil");
            groups.add("sandwich bags");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Personal Care")) {
            subgroupList.removeAllItems();
            groups.add("shampoo");
            groups.add("soap");
            groups.add("hand soap");
            groups.add("shaving cream");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        } else if (groupList.getSelectedItem().equals("Other")) {
            subgroupList.removeAllItems();
            groups.add("baby items");
            groups.add("pet items");
            groups.add("batteries");
            groups.add("greeting cards");
            iter = groups.iterator();
            while (iter.hasNext()) {
                subgroupList.addItem(iter.next());
            }
        }

    }//GEN-LAST:event_groupListItemStateChanged

    //Search Item On Button Click
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String searchType = jItemNumber.getText();
        for (int i = 0; i < itemList.size(); i++) {
            if (searchType.equals(itemList.get(i).getItemNumber())) {

                TableModel dtm = jTable2.getModel();
                jBrandName.setText(dtm.getValueAt(i, 1).toString());
                jProductType.setText(dtm.getValueAt(i, 2).toString());
                jMeasuredValue.setText(dtm.getValueAt(i, 3).toString());
                jPrice.setText(dtm.getValueAt(i, 5).toString());

                String unit = dtm.getValueAt(i, 4).toString();
                switch (unit) {
                    case "kg":
                        jMeasuredUnit.setSelectedIndex(0);
                        break;
                    case "g":
                        jMeasuredUnit.setSelectedIndex(1);
                        break;
                    case "l":
                        jMeasuredUnit.setSelectedIndex(2);
                        break;
                    case "ml":
                        jMeasuredUnit.setSelectedIndex(3);
                        break;
                    case "cnt":
                        jMeasuredUnit.setSelectedIndex(4);
                        break;
                }

                String group = dtm.getValueAt(i, 6).toString();
                switch (group) {
                    case "Beverages":
                        groupList.setSelectedIndex(0);
                        break;
                    case "Bread/Bakery":
                        groupList.setSelectedIndex(1);
                        break;
                    case "Canned/Jarred Goods":
                        groupList.setSelectedIndex(2);
                        break;
                    case "Dairy":
                        groupList.setSelectedIndex(3);
                        break;
                    case "Dry/Baking Goods":
                        groupList.setSelectedIndex(4);
                        break;
                    case "Frozen Foods":
                        groupList.setSelectedIndex(5);
                        break;
                    case "Meat":
                        groupList.setSelectedIndex(6);
                        break;
                    case "Produce":
                        groupList.setSelectedIndex(7);
                        break;
                    case "Cleaners":
                        groupList.setSelectedIndex(8);
                        break;
                    case "Paper Goods":
                        groupList.setSelectedIndex(9);
                        break;
                    case "Personal Care":
                        groupList.setSelectedIndex(10);
                        break;
                    case "Other":
                        groupList.setSelectedIndex(11);
                        break;

                }

                String subgroup = dtm.getValueAt(i, 7).toString();
                switch (subgroup) {
                    case "coffee/tea":
                        subgroupList.setSelectedIndex(0);
                        break;
                    case "sandwich loaves":
                        subgroupList.setSelectedIndex(1);
                        break;
                    case "vegetables":
                        subgroupList.setSelectedIndex(2);
                        break;
                    case "cheeses":
                        subgroupList.setSelectedIndex(3);
                        break;
                    case "cereals":
                        subgroupList.setSelectedIndex(4);
                        break;
                    case "waffles":
                        subgroupList.setSelectedIndex(5);
                        break;
                    case "lunch meat":
                        subgroupList.setSelectedIndex(6);
                        break;
                    case "fruits":
                        subgroupList.setSelectedIndex(7);
                        break;
                    case "all- purpose":
                        subgroupList.setSelectedIndex(8);
                        break;
                    case "paper towels":
                        subgroupList.setSelectedIndex(9);
                        break;
                    case "shampoo":
                        subgroupList.setSelectedIndex(10);
                        break;
                    case "baby items":
                        subgroupList.setSelectedIndex(11);
                        break;
                }

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //Add Item on Button Click
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (jBrandName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a vaild brand name", "Error", JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(null, "Please enter a vaild brand name", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String brandName = jBrandName.getText();
            String productTypeName = jProductType.getText();
            double measuredValue = Double.parseDouble(jMeasuredValue.getText());
            String measuredUnit = jMeasuredUnit.getSelectedItem().toString();
            String itemNumber = jItemNumber.getText();
            String subgroup = subgroupList.getSelectedItem().toString();
            String group = groupList.getSelectedItem().toString();
            double price = Double.parseDouble(jPrice.getText());

            itemList.add(new Item(itemNumber, product, subgroup, group));
            productNameList.add(new ProductName(brandName, productTypeName, measuredValue, measuredUnit));
            productList.add(new Product(brandName, productTypeName, measuredValue, measuredUnit, price));

            for (int i = 0; i < itemList.size(); i++) {
                JOptionPane.showMessageDialog(null, "Are you sure that you want to add this item?" + "\n" + " Item Number: " + itemList.get(i).getItemNumber() + "\n Product Name: " + productList.get(i).getName() + "\n Price: " + productList.get(i).getPrice() + "\n Group: " + itemList.get(i).getGroup() + "\n Subgroup: " + itemList.get(i).getSubgroup());
                JOptionPane.showMessageDialog(null, "Your item has been added", "Success", JOptionPane.INFORMATION_MESSAGE);
                Object[] obj = {itemList.get(i).getItemNumber(), productNameList.get(i).getBrandName(), productNameList.get(i).getProductTypeName(), productNameList.get(i).getMeasuredValue(), productNameList.get(i).getMeasuredUnit(), productList.get(i).getPrice(), itemList.get(i).getGroup(), itemList.get(i).getSubgroup()};

                dtm.addRow(obj);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Clearing item details feilds
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jItemNumber.setText("");
        jBrandName.setText("");
        jProductType.setText("");
        jMeasuredValue.setText("");
        jPrice.setText("");
        jMeasuredUnit.setSelectedIndex(0);
        groupList.setSelectedIndex(0);
        subgroupList.setSelectedIndex(0);
    }//GEN-LAST:event_jButton7ActionPerformed

      // Delete Item on Button Click
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        JOptionPane.showConfirmDialog(null, "Are you sure that you want to delete the item?", "Confirm Shutdown?", JOptionPane.YES_NO_OPTION);
        String searchType = jItemNumber.getText();
        for (int i = 0; i < itemList.size(); i++) {
            if (searchType.equals(itemList.get(i).getItemNumber())) {
                dtm.removeRow(i);
                itemList.remove(i);
                Object[] obj = {itemList.get(i).getItemNumber(), productNameList.get(i).getBrandName(), productNameList.get(i).getProductTypeName(), productNameList.get(i).getMeasuredValue(), productNameList.get(i).getMeasuredUnit(), productList.get(i).getPrice(), itemList.get(i).getGroup(), itemList.get(i).getSubgroup()};
                dtm.addRow(obj);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    //Search Item to add to sale
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        String searchType = jItemNumber1.getText();
        for (int i = 0; i < itemList.size(); i++) {
            if (searchType.equals(itemList.get(i).getItemNumber())) {

                TableModel dtm = jTable2.getModel();
                jBrandNameS.setText(dtm.getValueAt(i, 1).toString());
                jProductTypeS.setText(dtm.getValueAt(i, 2).toString());
                jMeasuredValueS.setText(dtm.getValueAt(i, 3).toString());
                jPriceS.setText(dtm.getValueAt(i, 5).toString());

                String unit = dtm.getValueAt(i, 4).toString();
                switch (unit) {
                    case "kg":
                        jMeasuredUnitS.setSelectedIndex(0);
                        break;
                    case "g":
                        jMeasuredUnitS.setSelectedIndex(1);
                        break;
                    case "l":
                        jMeasuredUnitS.setSelectedIndex(2);
                        break;
                    case "ml":
                        jMeasuredUnitS.setSelectedIndex(3);
                        break;
                    case "cnt":
                        jMeasuredUnitS.setSelectedIndex(4);
                        break;
                }

                String group = dtm.getValueAt(i, 6).toString();
                switch (group) {
                    case "Beverages":
                        jGroupS.setSelectedIndex(0);
                        break;
                    case "Bread/Bakery":
                        jGroupS.setSelectedIndex(1);
                        break;
                    case "Canned/Jarred Goods":
                        jGroupS.setSelectedIndex(2);
                        break;
                    case "Dairy":
                        jGroupS.setSelectedIndex(3);
                        break;
                    case "Dry/Baking Goods":
                        jGroupS.setSelectedIndex(4);
                        break;
                    case "Frozen Foods":
                        jGroupS.setSelectedIndex(5);
                        break;
                    case "Meat":
                        jGroupS.setSelectedIndex(6);
                        break;
                    case "Produce":
                        jGroupS.setSelectedIndex(7);
                        break;
                    case "Cleaners":
                        jGroupS.setSelectedIndex(8);
                        break;
                    case "Paper Goods":
                        jGroupS.setSelectedIndex(9);
                        break;
                    case "Personal Care":
                        jGroupS.setSelectedIndex(10);
                        break;
                    case "Other":
                        jGroupS.setSelectedIndex(11);
                        break;

                }

                String subgroup = dtm.getValueAt(i, 7).toString();
                switch (subgroup) {
                    case "coffee/tea":
                        jSubgroupS.setSelectedIndex(0);
                        break;
                    case "sandwich loaves":
                        jSubgroupS.setSelectedIndex(1);
                        break;
                    case "vegetables":
                        jSubgroupS.setSelectedIndex(2);
                        break;
                    case "cheeses":
                        jSubgroupS.setSelectedIndex(3);
                        break;
                    case "cereals":
                        jSubgroupS.setSelectedIndex(4);
                        break;
                    case "waffles":
                        jSubgroupS.setSelectedIndex(5);
                        break;
                    case "lunch meat":
                        jSubgroupS.setSelectedIndex(6);
                        break;
                    case "fruits":
                        jSubgroupS.setSelectedIndex(7);
                        break;
                    case "all- purpose":
                        jSubgroupS.setSelectedIndex(8);
                        break;
                    case "paper towels":
                        jSubgroupS.setSelectedIndex(9);
                        break;
                    case "shampoo":
                        jSubgroupS.setSelectedIndex(10);
                        break;
                    case "baby items":
                        jSubgroupS.setSelectedIndex(11);
                        break;
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMeasuredUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeasuredUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMeasuredUnitActionPerformed

    private void jGroupSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jGroupSItemStateChanged
        
        ArrayList<String> groups = new ArrayList<>();
        Iterator<String> iter;
        if (jGroupS.getSelectedItem().equals("Beverages")) {
            jSubgroupS.removeAllItems();
            groups.add("coffee/tea");
            groups.add("juice");
            groups.add("soda");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Bread/Bakery")) {
            jSubgroupS.removeAllItems();
            groups.add("sandwich loaves");
            groups.add("dinner rolls");
            groups.add("tortillas");
            groups.add("bagels");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Canned/Jarred Goods")) {
            jSubgroupS.removeAllItems();
            groups.add("vegetables");
            groups.add("spaghetti sauce");
            groups.add("ketchup");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Dairy")) {
            jSubgroupS.removeAllItems();
            groups.add("cheeses");
            groups.add("eggs");
            groups.add("milk");
            groups.add("yogurt");
            groups.add("butter");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Dry/Baking Goods")) {
            jSubgroupS.removeAllItems();
            groups.add("cereals");
            groups.add("flour");
            groups.add("sugar");
            groups.add("pasta");
            groups.add("mixes");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Frozen Foods")) {
            jSubgroupS.removeAllItems();
            groups.add("waffles");
            groups.add("vegetables");
            groups.add("individual meals");
            groups.add("ice cream");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Meat")) {
            jSubgroupS.removeAllItems();
            groups.add("lunch meat");
            groups.add("poultry");
            groups.add("beef");
            groups.add("pork");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Produce")) {
            jSubgroupS.removeAllItems();
            groups.add("fruits");
            groups.add("vegetables");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Cleaners")) {
            jSubgroupS.removeAllItems();
            groups.add("all- purpose");
            groups.add("laundry detergent");
            groups.add("dishwashing liquid/detergent");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Paper Goods")) {
            jSubgroupS.removeAllItems();
            groups.add("paper towels");
            groups.add("toilet paper");
            groups.add("aluminum foil");
            groups.add("sandwich bags");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Personal Care")) {
            jSubgroupS.removeAllItems();
            groups.add("shampoo");
            groups.add("soap");
            groups.add("hand soap");
            groups.add("shaving cream");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        } else if (jGroupS.getSelectedItem().equals("Other")) {
            jSubgroupS.removeAllItems();
            groups.add("baby items");
            groups.add("pet items");
            groups.add("batteries");
            groups.add("greeting cards");
            iter = groups.iterator();
            while (iter.hasNext()) {
                jSubgroupS.addItem(iter.next());
            }
        }
    }//GEN-LAST:event_jGroupSItemStateChanged

    // Add to Sale
    private void bAddToSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddToSaleActionPerformed
        
        String brandName = jBrandNameS.getText();
        String productTypeName = jProductTypeS.getText();
        double measuredValue = Double.parseDouble(jMeasuredValueS.getText());
        String measuredUnit = jMeasuredUnitS.getSelectedItem().toString();
        String itemNumber = jItemNumber1.getText();
        String subgroup = jSubgroupS.getSelectedItem().toString();
        String group = jGroupS.getSelectedItem().toString();
        double price = Double.parseDouble(jPriceS.getText());

        itemList.add(new Item(itemNumber, product, subgroup, group));
        productNameList.add(new ProductName(brandName, productTypeName, measuredValue, measuredUnit));
        productList.add(new Product(brandName, productTypeName, measuredValue, measuredUnit, price));

        String bill = jItemNumber1.getText() + " | " + jBrandNameS.getText() + "_" + jProductType.getText() + "_" + jMeasuredValueS.getText() + "_" + jMeasuredUnitS.getSelectedItem().toString() + " | " + jGroupS.getSelectedItem().toString() + " | " + jSubgroupS.getSelectedItem().toString() + " | " + jPriceS.getText();
        jBillDetails.setText(bill);

        double Total = Double.parseDouble(jPriceS.getText());
        String totalAmount = Double.toString(Total);
        jTotalAmount.setText(totalAmount);

        double discountAmount = Discount.getDiscountAmount(Total);
        String totalDiscount = Double.toString(discountAmount);
        jDiscountAmount.setText(totalDiscount);
    }//GEN-LAST:event_bAddToSaleActionPerformed

    // Clearing the Item
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        jItemNumber1.setText("");
        jBrandNameS.setText("");
        jProductTypeS.setText("");
        jMeasuredValueS.setText("");
        jPriceS.setText("");
        jMeasuredUnitS.setSelectedIndex(0);
        jGroupS.setSelectedIndex(0);
        jSubgroupS.setSelectedIndex(0);
    }//GEN-LAST:event_jButton11ActionPerformed

     // Complete Sale
    private void jCompleteSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCompleteSaleActionPerformed
       
        String bill = jBillDetails.getText();
        String total = jTotalAmount.getText();
        String dis = jDiscountAmount.getText();
        int gst = Parameters.getStartingGSTNumber();
        String sGST = Integer.toString(gst);
        int id = Parameters.getStartingSaleID();
        String sID = Integer.toString(id);
        String name = jTextField2.getText();

        ArrayList<String> sales = new ArrayList<>();
        sales.add(bill);
        sales.add(dis);
        sales.add(total);
        sales.add(sGST);
        jGST.setText("GST Number:" + sGST);
        jID.setText("ID:" + sID);
        jSalesHistory.setText(bill);
        jName.setText("Sold by:" + name);
        jTAmount.setText(total);
        jDiscount.setText(dis);

        BuyMoreCoord.completeCurrentSale();
        jBillDetails.setText("");
        jTotalAmount.setText("");
        jDiscountAmount.setText("");
        SalesManager.completeCurrentSale();

        jGST.setVisible(false);
        jSalesHistory.setVisible(false);
        jID.setVisible(false);
        jName.setVisible(false);
        jDate.setVisible(false);
        jTAmount.setVisible(false);
        jDiscount.setVisible(false);

        JOptionPane.showMessageDialog(null, "The sale has now been complete", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jCompleteSaleActionPerformed

    // Sales History
    private void jSaleHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaleHistoryActionPerformed
        
        jGST.setVisible(true);
        jSalesHistory.setVisible(true);
        jID.setVisible(true);
        jName.setVisible(true);
        jDate.setVisible(true);
        jTAmount.setVisible(true);
        jDiscount.setVisible(true);
    }//GEN-LAST:event_jSaleHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(buyMoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyMoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyMoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyMoreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyMoreGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddToSale;
    private javax.swing.JComboBox<String> groupList;
    private javax.swing.JTextField jBillDetails;
    private javax.swing.JTextField jBrandName;
    private javax.swing.JTextField jBrandNameS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jCompleteSale;
    private javax.swing.JTextField jDate;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JTextField jDiscount;
    private javax.swing.JTextField jDiscountAmount;
    private javax.swing.JTextField jGST;
    private javax.swing.JComboBox<String> jGroupS;
    private javax.swing.JTextField jID;
    private javax.swing.JTextField jItemNumber;
    private javax.swing.JTextField jItemNumber1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMeasuredUnit;
    private javax.swing.JComboBox<String> jMeasuredUnitS;
    private javax.swing.JTextField jMeasuredValue;
    private javax.swing.JTextField jMeasuredValueS;
    private javax.swing.JTextField jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jPrice;
    private javax.swing.JTextField jPriceS;
    private javax.swing.JTextField jProductType;
    private javax.swing.JTextField jProductTypeS;
    private javax.swing.JButton jSaleHistory;
    private javax.swing.JTextField jSalesHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jSubgroupS;
    private javax.swing.JTextField jTAmount;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTotalAmount;
    private javax.swing.JComboBox<String> subgroupList;
    // End of variables declaration//GEN-END:variables
}
