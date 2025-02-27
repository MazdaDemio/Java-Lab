import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class NewJFrame extends javax.swing.JFrame {
    private ArrayList<RecIntegral> integralsList;
    public NewJFrame() {
        initComponents();
        integralsList = new ArrayList<>();
    }
    public void Table(){   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldLowLim = new javax.swing.JTextField();
        jTextFieldUpLim = new javax.swing.JTextField();
        jTextFieldStep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Удалить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижняя граница", "Верхняя гранциа", "Шаг", "Результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Рассчитать");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Добавить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldLowLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLowLimActionPerformed(evt);
            }
        });

        jLabel1.setText("Нижняя граница");

        jLabel2.setText("Верхняя граница");

        jLabel3.setText("Шаг интегрирования");

        jButton4.setText("Заполнить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Очистить");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Работа со списком");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5))
                                .addGap(8, 8, 8))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLowLim, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUpLim, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldStep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLowLim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUpLim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        
        int rowNum = jTable1.getSelectedRow();
        
        if (rowNum == -1){
            JOptionPane.showMessageDialog(null, "выберите строку");
        }else tModel.removeRow(rowNum);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldLowLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLowLimActionPerformed

    }//GEN-LAST:event_jTextFieldLowLimActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            double upperLim;
            double lowLim;
            double step;

            // Парсим введенные данные
            lowLim = Double.parseDouble(jTextFieldLowLim.getText());
            upperLim = Double.parseDouble(jTextFieldUpLim.getText());
            step = Double.parseDouble(jTextFieldStep.getText());

            // Создаем экземпляр RecIntegral с проверкой данных
            RecIntegral recIntegral = new RecIntegral(lowLim, upperLim, step, 0.0);

            // Добавляем строку в таблицу
            DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
            tModel.addRow(new Object[]{lowLim, upperLim, step});

            // Добавляем запись в коллекцию
            integralsList.add(recIntegral);

            // Очищаем поля ввода
            jTextFieldLowLim.setText("");
            jTextFieldUpLim.setText("");
            jTextFieldStep.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Введены некорректные данные. Пожалуйста, введите числа.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        } catch (InvalidDataException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        for(int i = 0; i < tModel.getRowCount();i++){
            
            double downLim = ((Number) tModel.getValueAt(i, 0)).doubleValue();
            double upLim = ((Number) tModel.getValueAt(i, 1)).doubleValue();
            double step = ((Number) tModel.getValueAt(i, 2)).doubleValue();
            double n = (upLim - downLim) / step; 
            int w = (int) Math.floor(n);
           
            double sum = 0;
            for(int j = 0; j < w; j++ ){
                
                double x_i = downLim + (j + 0.5) * step;
                sum += Math.cos(x_i);
            }
            double integral = step * sum;
     
            Object res = integral;
            tModel.setValueAt(res, i, 3);
            
            integralsList.get(i).setResult(integral);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0); 

        for (RecIntegral rec : integralsList) {
            tModel.addRow(new Object[]{
                rec.getLowerLimit(),
                rec.getUpperLimit(),
                rec.getStep(),
                rec.getResult()
            });
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0);
        integralsList.clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public class RecIntegral {
    private double lowerLimit;
    private double upperLimit;
    private double step;
    private double result;

    public RecIntegral(double lowerLimit, double upperLimit, double step, double result) throws InvalidDataException {
        if (lowerLimit < 0.000001 || lowerLimit > 1000000 ||
            upperLimit < 0.000001 || upperLimit > 1000000 ||
            step < 0.000001 || step > 1000000) {
            throw new InvalidDataException("Значения должны быть в диапазоне от 0.000001 до 1000000");
        }
        if (lowerLimit + step > upperLimit) {
            throw new InvalidDataException("Некорректно  введенный шаг интегрирования");
        }
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.step = step;
        this.result = result;
    }
    

    public double getLowerLimit() {
        return lowerLimit;
    }

    public double getUpperLimit() {
        return upperLimit;
    }

    public double getStep() {
        return step;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
    
    public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLowLim;
    private javax.swing.JTextField jTextFieldStep;
    private javax.swing.JTextField jTextFieldUpLim;
    // End of variables declaration//GEN-END:variables
}
