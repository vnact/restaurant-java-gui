package kma.qlbh.interfaces.admin;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author Tran Duc Cuong<clonebmn2itt@gmail.com>
 */
public class MenuItem extends javax.swing.JPanel {

    private ArrayList<MenuItem> subMenu = new ArrayList<>();
    private String id;

    public MenuItem(String id, Icon icon, String menuName, MenuItem... subMenu) {
        initComponents();
        this.id = id;
        if (icon != null) {
            lbIcon.setIcon(icon);
        }
        lbMenuName.setText(menuName);
        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
        }
    }

    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    public void addSubMenu(MenuItem item) {
        this.subMenu.add(item);
    }

    public String getId() {
        return id;
    }

    public void changeStateMenu() {
        for (MenuItem menuItem : subMenu) {
            menuItem.setVisible(!menuItem.isVisible());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbMenuName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(200, 45));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(45, 45));
        jPanel1.setMinimumSize(new java.awt.Dimension(45, 45));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(45, 45));

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kma/qlbh/resources/icons/next_page_25px.png"))); // NOI18N
        lbIcon.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(155, 45));

        lbMenuName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMenuName.setText("Menu Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbMenuName)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbMenuName)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbMenuName;
    // End of variables declaration//GEN-END:variables
}