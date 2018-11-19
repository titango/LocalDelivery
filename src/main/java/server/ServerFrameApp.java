package main.java.server;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import main.java.component.customJButton.JButtonColor;
import main.java.server.listeners.MainServerListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class ServerFrameApp extends JFrame {
    public JPanel mainPanel;
    public JList listOrder;
    public JButton exitBtn;
    public JPanel rightPanel;
    public JComboBox userCombo;
    public JPanel leftPanel;
    public JButton viewMapButton;
    public JPanel detailsPanel;
    public JPanel viewMapPanel;
    public JPanel exitArea;
    public JPanel topArea;
    public JPanel exitWrapper;
    public JPanel listOrderWrapper;
    public JButton refreshBtn;

    private int appWidth = 800;
    private int appHeight = 600;

    MainServerListener msl;

    DefaultListModel userListModel;

    public ServerFrameApp(MainServerListener msl) {
        this.msl = msl;
        $$$setupUI$$$();
        setContentPane(mainPanel);
        assignListeners();

    }

    public int getAppWidth() {
        return appWidth;
    }

    public void setAppWidth(int appWidth) {
        this.appWidth = appWidth;
    }

    public int getAppHeight() {
        return appHeight;
    }

    public void setAppHeight(int appHeight) {
        this.appHeight = appHeight;
    }

    public void refreshData()
    {
        
        userListModel = new DefaultListModel();

    }

    private void createUIComponents() {
        mainPanel = new JPanel();
        mainPanel.setOpaque(true);
        mainPanel.setBackground(Color.BLUE);


        rightPanel = new JPanel();
        exitBtn = new JButtonColor("Exit", Color.RED, Color.WHITE);
        refreshBtn = new JButtonColor("Refresh", Color.RED, Color.WHITE);
//        mapPanel.add(new JFrame());
    }

    private void assignListeners() {
        exitBtn.addActionListener(this.msl);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        mainPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.setAutoscrolls(false);
        mainPanel.setBackground(new Color(-4735245));
        mainPanel.setDoubleBuffered(true);
        mainPanel.setEnabled(true);
        mainPanel.setFocusCycleRoot(false);
        mainPanel.setFocusTraversalPolicyProvider(false);
        mainPanel.setFocusable(false);
        mainPanel.setInheritsPopupMenu(false);
        mainPanel.setOpaque(true);
        mainPanel.setRequestFocusEnabled(false);
        mainPanel.setVerifyInputWhenFocusTarget(false);
        mainPanel.setVisible(true);
        rightPanel.setLayout(new BorderLayout(0, 0));
        rightPanel.setBackground(new Color(-9998707));
        rightPanel.setOpaque(true);
        mainPanel.add(rightPanel, BorderLayout.CENTER);
        viewMapPanel = new JPanel();
        viewMapPanel.setLayout(new GridLayoutManager(2, 9, new Insets(0, 0, 0, 0), -1, -1));
        viewMapPanel.setDoubleBuffered(false);
        viewMapPanel.setEnabled(true);
        viewMapPanel.setFocusable(false);
        viewMapPanel.setOpaque(false);
        viewMapPanel.setRequestFocusEnabled(false);
        viewMapPanel.setVerifyInputWhenFocusTarget(false);
        viewMapPanel.setVisible(true);
        rightPanel.add(viewMapPanel, BorderLayout.SOUTH);
        viewMapButton = new JButton();
        viewMapButton.setBackground(new Color(-270858));
        viewMapButton.setBorderPainted(false);
        Font viewMapButtonFont = this.$$$getFont$$$("Ayuthaya", -1, 12, viewMapButton.getFont());
        if (viewMapButtonFont != null) viewMapButton.setFont(viewMapButtonFont);
        viewMapButton.setForeground(new Color(-12762020));
        viewMapButton.setOpaque(true);
        viewMapButton.setText("View Map");
        viewMapPanel.add(viewMapButton, new GridConstraints(0, 7, 1, 1, GridConstraints.ANCHOR_EAST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        viewMapPanel.add(spacer1, new GridConstraints(1, 7, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 10), null, 0, false));
        final Spacer spacer2 = new Spacer();
        viewMapPanel.add(spacer2, new GridConstraints(0, 8, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        viewMapPanel.add(spacer3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        viewMapPanel.add(spacer4, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        viewMapPanel.add(spacer5, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer6 = new Spacer();
        viewMapPanel.add(spacer6, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        viewMapPanel.add(spacer7, new GridConstraints(0, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer8 = new Spacer();
        viewMapPanel.add(spacer8, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer9 = new Spacer();
        viewMapPanel.add(spacer9, new GridConstraints(0, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        detailsPanel = new JPanel();
        detailsPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        Font detailsPanelFont = this.$$$getFont$$$("Ayuthaya", -1, 12, detailsPanel.getFont());
        if (detailsPanelFont != null) detailsPanel.setFont(detailsPanelFont);
        detailsPanel.setForeground(new Color(-131073));
        detailsPanel.setOpaque(false);
        rightPanel.add(detailsPanel, BorderLayout.CENTER);
        leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout(0, 0));
        leftPanel.setOpaque(false);
        mainPanel.add(leftPanel, BorderLayout.WEST);
        topArea = new JPanel();
        topArea.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        topArea.setOpaque(false);
        leftPanel.add(topArea, BorderLayout.NORTH);
        userCombo = new JComboBox();
        Font userComboFont = this.$$$getFont$$$("Courier", -1, 12, userCombo.getFont());
        if (userComboFont != null) userCombo.setFont(userComboFont);
        userCombo.setForeground(new Color(-9998707));
        topArea.add(userCombo, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(200, -1), null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-12762020));
        Font label1Font = this.$$$getFont$$$("Ayuthaya", Font.BOLD, 16, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-12762020));
        label1.setText("User List");
        topArea.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        exitWrapper = new JPanel();
        exitWrapper.setLayout(new GridLayoutManager(1, 4, new Insets(10, 0, 10, 0), -1, 100));
        exitWrapper.setOpaque(false);
        leftPanel.add(exitWrapper, BorderLayout.SOUTH);
        exitArea = new JPanel();
        exitArea.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        exitWrapper.add(exitArea, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        exitBtn.setBackground(new Color(-1294763));
        Font exitBtnFont = this.$$$getFont$$$("Ayuthaya", Font.BOLD, 14, exitBtn.getFont());
        if (exitBtnFont != null) exitBtn.setFont(exitBtnFont);
        exitBtn.setForeground(new Color(-131073));
        exitBtn.setText("Exit");
        exitBtn.setVerifyInputWhenFocusTarget(false);
        exitArea.add(exitBtn, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        refreshBtn.setBackground(new Color(-12762020));
        refreshBtn.setBorderPainted(false);
        refreshBtn.setDefaultCapable(true);
        Font refreshBtnFont = this.$$$getFont$$$("Ayuthaya", Font.BOLD, 14, refreshBtn.getFont());
        if (refreshBtnFont != null) refreshBtn.setFont(refreshBtnFont);
        refreshBtn.setForeground(new Color(-593420));
        refreshBtn.setText("Refresh");
        refreshBtn.setVerifyInputWhenFocusTarget(false);
        exitWrapper.add(refreshBtn, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer10 = new Spacer();
        exitWrapper.add(spacer10, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(5, -1), null, 0, false));
        final Spacer spacer11 = new Spacer();
        exitWrapper.add(spacer11, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(5, -1), null, 0, false));
        listOrderWrapper = new JPanel();
        listOrderWrapper.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        leftPanel.add(listOrderWrapper, BorderLayout.CENTER);
        listOrderWrapper.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), null));
        listOrder = new JList();
        final DefaultListModel defaultListModel1 = new DefaultListModel();
        listOrder.setModel(defaultListModel1);
        listOrder.setOpaque(true);
        listOrder.setPreferredSize(new Dimension(200, 0));
        listOrderWrapper.add(listOrder, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
