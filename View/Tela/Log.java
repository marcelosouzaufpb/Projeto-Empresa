package Tela;

import javax.swing.JPanel;

public class Log extends javax.swing.JFrame {
    
    public JPanel getJpIF() {
        return jpIF;
    }
    
    public Log() {
        initComponents();
        TelaFundo tela = new TelaFundo();
        this.jpIF.add(tela);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIF = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpIF.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jpIF.setMinimumSize(new java.awt.Dimension(960, 540));
        jpIF.setPreferredSize(new java.awt.Dimension(960, 540));

        javax.swing.GroupLayout jpIFLayout = new javax.swing.GroupLayout(jpIF);
        jpIF.setLayout(jpIFLayout);
        jpIFLayout.setHorizontalGroup(
            jpIFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpIFLayout.setVerticalGroup(
            jpIFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpIF, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpIF, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Log l = new Log();
        l.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpIF;
    // End of variables declaration//GEN-END:variables
}
