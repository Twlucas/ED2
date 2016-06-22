    package test;

    import java.util.Vector;
    import javax.swing.event.DocumentEvent;
    import javax.swing.event.DocumentListener;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;

    public class TableSearch11 extends javax.swing.JFrame {
    Vector originalTableModel;
    DocumentListener documentListener;
    Object columnNames[] = { "Column One", "Column Two", "Column Three"};
    String[] colunas = new String[]{"Nome","Idade","Sexo"};

    String[][] dados = new String[][]{
        {"Rodrigo","28","Masculino"},
        {"Maria","30","Feminino"}
    };
    //DefaultTableModel dftm= new DefaultTableModel(dados, columnNames);
    DefaultTableModel dftm = new DefaultTableModel(dados, columnNames) {	
      public boolean isCellEditable(int rowIndex, int mColIndex){
            return false;
      }			
    };

    public TableSearch11() {
        initComponents();
        table.setModel(dftm);

        setLocationRelativeTo(null);
        //backup of original values to check
        originalTableModel = (Vector) ((DefaultTableModel) table.getModel()).getDataVector().clone();
        //add document listener to jtextfield to search contents as soon as something typed on it
        addDocumentListener();
    }

    private void addDocumentListener() {
        documentListener = new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent documentEvent) {
                search();
            }

            @Override
            public void insertUpdate(DocumentEvent documentEvent) {
                search();
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent) {
                search();
            }

            private void search() {
                searchTableContents(jTextField1.getText());
            }
        };
        searchOnType.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        searchOnType = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
//        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"masd", "asdad", "asdasda", "ert"},
                {"gdfg", "name", "test", "dfg"},
                {"rrrh", "dfg", "sdfsf", "sdf"},
                {"ter", "retg", "wersd", "wer"}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        searchOnType.setText("Search on Type");
        searchOnType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                searchOnTypeItemStateChanged(evt);
            }
        });

        /*searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });*/
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                //.addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                //.addComponent(searchOnType)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   // .addComponent(searchButton)
                   // .addComponent(searchOnType)
                )
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);
        pack();
    }// </editor-fold>                        

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        searchTableContents(jTextField1.getText());
    }                                            

    private void searchOnTypeItemStateChanged(java.awt.event.ItemEvent evt) {                                              
        //if (searchOnType.isSelected()) {
            jTextField1.getDocument().addDocumentListener(documentListener);
       /* } else {
            jTextField1.getDocument().addDocumentListener(null);
        }*/
    }                                             

    public void searchTableContents(String searchString) {
        DefaultTableModel currtableModel = (DefaultTableModel) table.getModel();
        //To empty the table before search
        currtableModel.setRowCount(0);
        //To search for contents from original table content
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().toLowerCase().contains(searchString.toLowerCase())) {
                    //content found so adding to table
                    currtableModel.addRow(rowVector);
                    break;
                }
            }

        }
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableSearch11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
   // private javax.swing.JButton searchButton;
    private javax.swing.JCheckBox searchOnType;
    private javax.swing.JTable table;
    // End of variables declaration                   
    }