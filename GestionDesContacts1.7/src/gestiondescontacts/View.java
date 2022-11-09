package gestiondescontacts;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class View{
    private JFrame mainFrame;
    private JPanel mainPanel, titlePanel, leftPanel, rigthPanel, contactListPanel, viewContactPanel, addContactPanel, updateContactPanel, groupListPanel, addNewGroupPanel, checkBoxPanel;
    private JLabel titleLabel, menuLabel, firstNameLabel, lastNameLabel, cityLabel, phoneNumbersLabel, contactGroupsLabel, searchLabel, listOfGroupsLabel, groupNameLabel, descriptionLabel;
    private JButton contactsButton, groupsButton, sortByFirstNameButton, sortByLastNameButton, sortByCityButton, addNewContactButton, addNewGroupButton, backButton, viewContactButton, updateContactButton, deleteContactButton, saveNewContactButton, cancelButton, saveChangesButton, updateGroupButton, deleteGroupButton, saveGroupButton, cancelGroupButton, saveGroupChangesButton;
    private JTextField firstNameTextField, lastNameTextField, cityTextField, searchTextField, groupNameTextField, descriptionTextField;
    private JList<Record> viewContactsList;
    private JScrollPane viewContactsListScrollPane, phoneNumbersTableScrollPane, groupListTableScrollPane, contactListTableScrollPane, addNewGroupTableScrollPane, checkBoxScrollPane;
    private JTable phoneNumbersTable, groupListTable, contactListTable, addNewGroupTable;
    private DefaultListModel<Record> listModel;
    private DefaultTableModel tableModel, groupListTableModel, contactListTableModel, addNewGroupTableModel;
    private String addNewGroupTableHeaders[];
    private Object[][] addNewGroupTableData;
    private ArrayList<JCheckBox> checkBoxArray;
    
    public View(){
        mainFrame = new JFrame();
        
        mainPanel = new JPanel();
     	titlePanel = new JPanel();
     	leftPanel = new JPanel();
     	rigthPanel = new JPanel();
        contactListPanel = new JPanel();
        viewContactPanel = new JPanel();
        addContactPanel = new JPanel();
        updateContactPanel = new JPanel();
        viewContactPanel = new JPanel();
        addContactPanel = new JPanel();
        updateContactPanel = new JPanel();
        groupListPanel = new JPanel();
        addNewGroupPanel = new JPanel();
        checkBoxPanel = new JPanel();
        
        firstNameTextField = new JTextField();
        lastNameTextField = new JTextField();
        cityTextField = new JTextField();
        searchTextField = new JTextField();
        groupNameTextField = new JTextField();
        descriptionTextField = new JTextField();
        
     	titleLabel = new JLabel("Gestion des contacts");
        menuLabel = new JLabel("Manage");
        firstNameLabel = new JLabel("First name");
        lastNameLabel = new JLabel("Last name");
        cityLabel = new JLabel("City");
        phoneNumbersLabel = new JLabel("Phone numbers");
        contactGroupsLabel = new JLabel("Contact Groups");
        searchLabel = new JLabel("Search");
        listOfGroupsLabel = new JLabel("List of groups");
        groupNameLabel = new JLabel("Group name");
        descriptionLabel = new JLabel("Description");
        
     	contactsButton = new JButton("Contacts");
     	groupsButton = new JButton("Groups");
        sortByFirstNameButton = new JButton("Sort by First name");
        sortByLastNameButton = new JButton("Sort by Last name");
        sortByCityButton = new JButton("Sort by City");
        addNewContactButton = new JButton("Add new Contact");
        backButton = new JButton("Back");
        viewContactButton = new JButton("View");
        updateContactButton = new JButton("Update");
        deleteContactButton = new JButton("Delete");
        saveNewContactButton = new JButton("Save");
        cancelButton = new JButton("Cancel");
        saveChangesButton = new JButton("Save");
        addNewGroupButton = new JButton("Add new Group");
        updateGroupButton = new JButton("Update Group");
        deleteGroupButton = new JButton("Delete");
        saveGroupButton = new JButton("Save Group");
        cancelGroupButton = new JButton("Cancel");
        saveGroupChangesButton = new JButton("Save Group");
        
        checkBoxArray = new ArrayList();
        
        
        
        listModel = new DefaultListModel<>();
        viewContactsList = new JList<>(listModel);
        
        
        String headers[] = {"Region Code", "Phone Number"};
        Object data[][] = new Object[7][2];
        
        tableModel = new DefaultTableModel(data, headers);
        
        phoneNumbersTable = new JTable(tableModel);
        
        phoneNumbersTableScrollPane = new JScrollPane(phoneNumbersTable);
        
        
        String groupListTableHeaders[] = {"Group name", "Nb. of contacts"};
        Object groupListTableData[][] = new Object[7][2];
        
        groupListTableModel = new DefaultTableModel(groupListTableData, groupListTableHeaders);
        
        groupListTable = new JTable(groupListTableModel);
        
        groupListTableScrollPane = new JScrollPane(groupListTable);
        
        
//        groupListTable.setPreferredScrollableViewportSize(groupListTable.getPreferredSize());
//        groupListTable.setFillsViewportHeight(true);
        
        String contactListTableHeaders[] = {"Contact Name", "Contact City"};
        Object contactListTableData[][] = new Object[7][2];
        
        contactListTableModel = new DefaultTableModel(contactListTableData, contactListTableHeaders);
        
        contactListTable = new JTable(contactListTableModel);
        
        contactListTableScrollPane = new JScrollPane(contactListTable);
        
//        contactListTable.setPreferredScrollableViewportSize(contactListTable.getPreferredSize());
//        contactListTable.setFillsViewportHeight(true);

        addNewGroupTableHeaders = new String[3];
        
        setAddNewGroupTableModel(15);
        
        //setBounds(int x-coordinate, int y-coordinate, int width, int height)
        //Setup Title
        Font titleFont = new Font("Ariel",Font.BOLD,24);
    	titleLabel.setFont(titleFont);
    	titleLabel.setForeground(Color.BLUE);
        
        //setup menu title
        Font menuTitleFont = new Font("Ariel",Font.BOLD,24);
    	menuLabel.setFont(menuTitleFont);
    	menuLabel.setForeground(Color.RED);
        
        //Title Panel
        titlePanel.add(titleLabel);
    	titlePanel.setBounds(0, 0, 550, 30); 
        
        //Left Panel
        leftPanel.add(menuLabel);
        leftPanel.add(contactsButton);
    	leftPanel.add(groupsButton);
    	GridLayout leftLayout = new GridLayout(6,1);
    	leftLayout.setVgap(25);
    	leftPanel.setLayout(leftLayout);
    	leftPanel.setBounds(10, 100, 150, 300);
        
        //Rigth Panel
        rigthPanel.setBackground(Color.CYAN);
    	rigthPanel.setLayout(null);
        rigthPanel.setBounds(180, 40, 355, 430);
        
        //Main Panel
        mainPanel.setLayout(null);
        mainPanel.add(rigthPanel);
        mainPanel.add(titlePanel);
        mainPanel.add(leftPanel);
        
        //Frame
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(550, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setTitle("Gestion des contacts");
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
    }
    
    public void ContactsListPanelMethod(){
        searchLabel.setBounds(10,10,50,25);
        searchTextField.setBounds(60, 10, 240, 25);
        viewContactButton.setBounds(40, 400, 80, 25);
        updateContactButton.setBounds(125, 400, 80, 25);
        deleteContactButton.setBounds(210, 400, 80, 25);
        
        
//        viewContactsListScrollPane = new JScrollPane(viewContactsList);
//        viewContactsListScrollPane.setBounds(60, 50, 200, 300);

        viewContactsList.setBounds(60, 50, 200, 300);
        contactListPanel.add(viewContactsList);
        contactListPanel.add(searchLabel);
        contactListPanel.add(searchTextField);
//        contactListPanel.add(viewContactsListScrollPane);
        contactListPanel.add(viewContactButton);
        contactListPanel.add(updateContactButton);
        contactListPanel.add(deleteContactButton);

        contactListPanel.setBounds(50, 0, 350, 430);
        //rigthPanel.add(contactListPanel);
    }
    
    public void viewContactsPanelMethod(String[] arr){
        firstNameTextField.setEditable(false);
        lastNameTextField.setEditable(false);
        cityTextField.setEditable(false);
        
        phoneNumbersTable.setEnabled(false);
        
        for(JCheckBox cb : checkBoxArray){
            checkBoxPanel.remove(cb);
        }
        
        checkBoxArray = new ArrayList();
        
        checkBoxPanel.removeAll();
        
        for(int i = 0; i< arr.length; i++){
            checkBoxArray.add(new JCheckBox(arr[i], true));
        }
        
        int y = 0;
        for(JCheckBox cb : checkBoxArray){
            cb.setEnabled(false);
            cb.setBounds(0,y,110, 25);
            checkBoxPanel.add(cb);
            y += 25;
            
        }

        
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));
        
        firstNameLabel.setBounds(10,10,100,25);
        lastNameLabel.setBounds(10,35,100,25);
        cityLabel.setBounds(10,60,100,25);
        firstNameTextField.setBounds(100,10,220,25);
        lastNameTextField.setBounds(100,35,220,25);
        cityTextField.setBounds(100,60,220,25);
        phoneNumbersLabel.setBounds(120, 85, 100, 25);
        phoneNumbersTableScrollPane.setBounds(10, 110, 300, 130);
        contactGroupsLabel.setBounds(120, 240, 100, 25);
        cancelButton.setBounds(120, 400, 80, 25);
        checkBoxPanel.setBounds(110, 270, 110, 120);
        
        viewContactPanel.add(firstNameLabel);
        viewContactPanel.add(lastNameLabel);
        viewContactPanel.add(cityLabel);
        viewContactPanel.add(firstNameTextField);
        viewContactPanel.add(lastNameTextField);
        viewContactPanel.add(cityTextField);
        viewContactPanel.add(phoneNumbersLabel);
        viewContactPanel.add(phoneNumbersTableScrollPane);
        viewContactPanel.add(contactGroupsLabel);
        viewContactPanel.add(checkBoxPanel);
        viewContactPanel.add(cancelButton);
        
        viewContactPanel.setBounds(20, 0, 350, 430);
        viewContactPanel.setLayout(null);
        rigthPanel.add(viewContactPanel);
    }
    
    public void addContactsPanelMethod(String[] arr){
        firstNameTextField.setEditable(true);
        lastNameTextField.setEditable(true);
        cityTextField.setEditable(true);
        
        phoneNumbersTable.setEnabled(true);
        
        for (int count = 0; count < tableModel.getRowCount(); count++){
            for(int i = 0; i < 2; i++)
                tableModel.setValueAt(null, count, i);
        }
    
        
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        cityTextField.setText("");
        
        for(JCheckBox cb : checkBoxArray){
            checkBoxPanel.remove(cb);
        }
        
        checkBoxArray = new ArrayList();
        
        checkBoxPanel.removeAll();
        
        for(int i = 0; i< arr.length; i++){
            checkBoxArray.add(new JCheckBox(arr[i]));
        }
        
        int y = 0;
        for(JCheckBox cb : checkBoxArray){
            cb.setBounds(0,y,110, 25);
            checkBoxPanel.add(cb);
            y += 25;
        }

        
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));
        
        //checkBoxScrollPane = new JScrollPane(checkBoxPanel,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        firstNameLabel.setBounds(10,10,100,25);
        lastNameLabel.setBounds(10,35,100,25);
        cityLabel.setBounds(10,60,100,25);
        firstNameTextField.setBounds(100,10,220,25);
        lastNameTextField.setBounds(100,35,220,25);
        cityTextField.setBounds(100,60,220,25);
        phoneNumbersLabel.setBounds(120, 85, 100, 25);
        phoneNumbersTableScrollPane.setBounds(10, 110, 300, 130);
        contactGroupsLabel.setBounds(120, 240, 100, 25);
        saveNewContactButton.setBounds(80, 400, 80, 25);
        cancelButton.setBounds(170, 400, 80, 25);
        checkBoxPanel.setBounds(110, 270, 110, 120);
        //checkBoxScrollPane.setBounds(110, 270, 110, 120);
        
        addContactPanel.add(firstNameLabel);
        addContactPanel.add(lastNameLabel);
        addContactPanel.add(cityLabel);
        addContactPanel.add(firstNameTextField);
        addContactPanel.add(lastNameTextField);
        addContactPanel.add(cityTextField);
        addContactPanel.add(phoneNumbersLabel);
        addContactPanel.add(phoneNumbersTableScrollPane);
        addContactPanel.add(contactGroupsLabel);
        addContactPanel.add(checkBoxPanel);
        addContactPanel.add(saveNewContactButton);
        addContactPanel.add(cancelButton);
        
        
        
        addContactPanel.setBounds(20, 0, 350, 430);
        addContactPanel.setLayout(null);
        rigthPanel.add(addContactPanel);
    }
    
    public void updateContactsPanelMethod(String[] arr, ArrayList<String> groupNames){
        firstNameTextField.setEditable(true);
        lastNameTextField.setEditable(true);
        cityTextField.setEditable(true);
        
        phoneNumbersTable.setEnabled(true);
        
//        for (int count = 0; count < tableModel.getRowCount(); count++){
//            for(int i = 0; i < 2; i++)
//                tableModel.setValueAt(null, count, i);
//        }
    
        
//        firstNameTextField.setText("");
//        lastNameTextField.setText("");
//        cityTextField.setText("");

        for(JCheckBox cb : checkBoxArray){
            checkBoxPanel.remove(cb);
        }
        
        checkBoxArray = new ArrayList();
        
        checkBoxPanel.removeAll();
        
        for(int i = 0; i< arr.length; i++){
            if(groupNames.contains(arr[i]))
                checkBoxArray.add(new JCheckBox(arr[i], true));
            else
                checkBoxArray.add(new JCheckBox(arr[i]));    
        }
            
            
                
            
        
        
        int y = 0;
        for(JCheckBox cb : checkBoxArray){
            cb.setBounds(0,y,110, 25);
            checkBoxPanel.add(cb);
            y += 25;
        }

        
        checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.Y_AXIS));
        
        firstNameLabel.setBounds(10,10,100,25);
        lastNameLabel.setBounds(10,35,100,25);
        cityLabel.setBounds(10,60,100,25);
        firstNameTextField.setBounds(100,10,220,25);
        lastNameTextField.setBounds(100,35,220,25);
        cityTextField.setBounds(100,60,220,25);
        phoneNumbersLabel.setBounds(120, 85, 100, 25);
        phoneNumbersTableScrollPane.setBounds(10, 110, 300, 130);
        contactGroupsLabel.setBounds(120, 240, 100, 25);
        saveChangesButton.setBounds(80, 400, 80, 25);
        cancelButton.setBounds(170, 400, 80, 25);
        checkBoxPanel.setBounds(110, 270, 110, 120);
        
        updateContactPanel.add(firstNameLabel);
        updateContactPanel.add(lastNameLabel);
        updateContactPanel.add(cityLabel);
        updateContactPanel.add(firstNameTextField);
        updateContactPanel.add(lastNameTextField);
        updateContactPanel.add(cityTextField);
        updateContactPanel.add(phoneNumbersLabel);
        updateContactPanel.add(phoneNumbersTableScrollPane);
        updateContactPanel.add(contactGroupsLabel);
        updateContactPanel.add(checkBoxPanel);
        updateContactPanel.add(saveChangesButton);
        updateContactPanel.add(cancelButton);
        
        updateContactPanel.setBounds(20, 0, 350, 430);
        updateContactPanel.setLayout(null);
        rigthPanel.add(updateContactPanel);
    }
    
    public void listOfGroupsPanelMethod(){
        contactListTable.setEnabled(false);
        groupListPanel.setLayout(null);
        listOfGroupsLabel.setBounds(60, 10, 100, 25);
        groupListTableScrollPane.setBounds(5, 50, 215, 150);
        contactListTableScrollPane.setBounds(5, 220, 215, 150);
        updateGroupButton.setBounds(15, 400, 120, 25);
        deleteGroupButton.setBounds(145, 400, 70, 25);
        groupListPanel.setBounds(135, 0, 220, 430);
        
        groupListPanel.add(listOfGroupsLabel);
        groupListPanel.add(groupListTableScrollPane);
        groupListPanel.add(contactListTableScrollPane);
        groupListPanel.add(updateGroupButton);
        groupListPanel.add(deleteGroupButton);
        
        rigthPanel.add(groupListPanel);
    }
    
    public void setAddNewGroupTableModel(int row){
        addNewGroupTableHeaders[0] = "Contact name";
        addNewGroupTableHeaders[1] = "City";
        addNewGroupTableHeaders[2] = "Add to group";
        
        addNewGroupTableData = new Object[row][3];

        addNewGroupTableModel = new DefaultTableModel(addNewGroupTableData, addNewGroupTableHeaders) {
            @Override
            public Class getColumnClass(int columnIndex) {
                if(columnIndex == 2)
                    return Boolean.class;
                else return Object.class;
            }
         };
        
        for(int i = 0; i<addNewGroupTableModel.getRowCount(); i++){                
            addNewGroupTableModel.setValueAt(Boolean.FALSE, i, 2);
        }
        
        addNewGroupTable = new JTable(addNewGroupTableModel);
        
        addNewGroupTableScrollPane = new JScrollPane(addNewGroupTable);
    }
    
    public void addNewGroupPanelMethod(int row){
        
        addNewGroupPanel.setLayout(null);
        
        for (int count = 0; count < addNewGroupTableModel.getRowCount(); count++){
            for(int i = 0; i < 3; i++)
                addNewGroupTableModel.setValueAt(null, count, i);
        }
        
        groupNameTextField.setText(null);
        descriptionTextField.setText(null);
        
        groupNameLabel.setBounds(10,10,100,25);
        descriptionLabel.setBounds(10,45,100,25);
        groupNameTextField.setBounds(90,10,220,25);
        descriptionTextField.setBounds(90,45,220,25);
        addNewGroupTableScrollPane.setBounds(10, 90, 300, 300);
        saveGroupButton.setBounds(30, 400, 120, 25);
        cancelGroupButton.setBounds(170, 400, 100, 25);
        addNewGroupPanel.setBounds(40, 0, 320, 430);
        
        
        addNewGroupPanel.add(groupNameLabel);
        addNewGroupPanel.add(groupNameTextField);
        addNewGroupPanel.add(descriptionLabel);
        addNewGroupPanel.add(descriptionTextField);
        addNewGroupPanel.add(saveGroupButton);
        addNewGroupPanel.add(cancelGroupButton);
        addNewGroupPanel.add(addNewGroupTableScrollPane);
        addNewGroupPanel.remove(saveGroupChangesButton);

        rigthPanel.add(addNewGroupPanel);
    }
    
        public void updateNewGroupPanelMethod(int row){
        
        addNewGroupPanel.setLayout(null);
        
        groupNameLabel.setBounds(10,10,100,25);
        descriptionLabel.setBounds(10,45,100,25);
        groupNameTextField.setBounds(90,10,220,25);
        descriptionTextField.setBounds(90,45,220,25);
        addNewGroupTableScrollPane.setBounds(10, 90, 300, 300);
        saveGroupChangesButton.setBounds(30, 400, 120, 25);
        cancelGroupButton.setBounds(170, 400, 100, 25);
        addNewGroupPanel.setBounds(40, 0, 320, 430);
        
        
        addNewGroupPanel.add(groupNameLabel);
        addNewGroupPanel.add(groupNameTextField);
        addNewGroupPanel.add(descriptionLabel);
        addNewGroupPanel.add(descriptionTextField);
        addNewGroupPanel.add(saveGroupChangesButton);
        addNewGroupPanel.add(cancelGroupButton);
        addNewGroupPanel.add(addNewGroupTableScrollPane);

        rigthPanel.add(addNewGroupPanel);
    }
        
    public void cancelGroupMethod(){
        groupNameTextField.setText(null);
        descriptionTextField.setText(null);
        menuLabel.setText("Groups");
        for (int count = 0; count < addNewGroupTableModel.getRowCount(); count++){
            for(int i = 0; i < 2; i++)
                addNewGroupTableModel.setValueAt(null, count, i);
            addNewGroupTableModel.setValueAt(Boolean.FALSE, count, 2);
        }
    }
    
    public void messge(String message){
        JOptionPane.showMessageDialog(this.mainFrame, message, "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    //Getters
    public JFrame getMainFrame() {
        return mainFrame;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getTitlePanel() {
        return titlePanel;
    }
    
    public JLabel getMenuLabel() {
        return menuLabel;
    }

    public JPanel getLeftPanel() {
        return leftPanel;
    }

    public JPanel getRigthPanel() {
        return rigthPanel;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public JButton getContactsButton() {
        return contactsButton;
    }

    public JButton getGroupsButton() {
        return groupsButton;
    }

    public JButton getSortByFirstNameButton() {
        return sortByFirstNameButton;
    }

    public JButton getSortByLastNameButton() {
        return sortByLastNameButton;
    }

    public JButton getSortByCityButton() {
        return sortByCityButton;
    }

    public JButton getAddNewContactButton() {
        return addNewContactButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getViewContactButton() {
        return viewContactButton;
    }

    public JButton getUpdateContactButton() {
        return updateContactButton;
    }

    public JButton getDeleteContactButton() {
        return deleteContactButton;
    }

    public JPanel getContactListPanel() {
        return contactListPanel;
    }

    public JPanel getViewContactPanel() {
        return viewContactPanel;
    }

    public JPanel getAddContactPanel() {
        return addContactPanel;
    }

    public JPanel getUpdateContactPanel() {
        return updateContactPanel;
    }

    public JLabel getFirstNameLabel() {
        return firstNameLabel;
    }

    public JLabel getLastNameLabel() {
        return lastNameLabel;
    }

    public JLabel getCityLabel() {
        return cityLabel;
    }

    public JLabel getPhoneNumbersLabel() {
        return phoneNumbersLabel;
    }

    public JLabel getContactGroupsLabel() {
        return contactGroupsLabel;
    }

    public JLabel getSearchLabel() {
        return searchLabel;
    }

    public JTextField getFirstNameTextField() {
        return firstNameTextField;
    }

    public JTextField getLastNameTextField() {
        return lastNameTextField;
    }

    public JTextField getCityTextField() {
        return cityTextField;
    }

    public JTextField getSearchTextField() {
        return searchTextField;
    }

    public JList<Record> getViewContactsList() {
        return viewContactsList;
    }

    public JTable getPhoneNumbersTable() {
        return phoneNumbersTable;
    }

    public JScrollPane getViewContactsListScrollPane() {
        return viewContactsListScrollPane;
    }

    public JButton getSaveNewContactButton() {
        return saveNewContactButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
    
    public DefaultListModel<Record> getListModel(){
        return listModel;
    }
    
    public DefaultTableModel getTableModel(){
        return tableModel;
    }

    public JButton getSaveChangesButton() {
        return saveChangesButton;
    }

    public JScrollPane getPhoneNumbersTableScrollPane() {
        return phoneNumbersTableScrollPane;
    }

    public JButton getAddNewGroupButton() {
        return addNewGroupButton;
    }

    public JPanel getGroupListPanel() {
        return groupListPanel;
    }

    public JPanel getAddNewGroupPanel() {
        return addNewGroupPanel;
    }

    public JLabel getListOfGroupsLabel() {
        return listOfGroupsLabel;
    }

    public JLabel getGroupNameLabel() {
        return groupNameLabel;
    }

    public JLabel getDescriptionLabel() {
        return descriptionLabel;
    }

    public JButton getUpdateGroupButton() {
        return updateGroupButton;
    }

    public JButton getDeleteGroupButton() {
        return deleteGroupButton;
    }

    public JButton getSaveGroupButton() {
        return saveGroupButton;
    }

    public JButton getCancelGroupButton() {
        return cancelGroupButton;
    }

    public JTextField getGroupNameTextField() {
        return groupNameTextField;
    }

    public JTextField getDescriptionTextField() {
        return descriptionTextField;
    }

    public JScrollPane getGroupListTableScrollPane() {
        return groupListTableScrollPane;
    }

    public JScrollPane getContactListTableScrollPane() {
        return contactListTableScrollPane;
    }

    public JScrollPane getAddNewGroupTableScrollPane() {
        return addNewGroupTableScrollPane;
    }

    public JTable getGroupListTable() {
        return groupListTable;
    }

    public JTable getContactListTable() {
        return contactListTable;
    }

    public JTable getAddNewGroupTable() {
        return addNewGroupTable;
    }

    public DefaultTableModel getGroupListTableModel() {
        return groupListTableModel;
    }

    public DefaultTableModel getContactListTableModel() {
        return contactListTableModel;
    }

    public DefaultTableModel getAddNewGroupTableModel() {
        return addNewGroupTableModel;
    }

    public JButton getSaveGroupChangesButton() {
        return saveGroupChangesButton;
    }

    public String[] getAddNewGroupTableHeaders() {
        return addNewGroupTableHeaders;
    }

    public Object[][] getAddNewGroupTableData() {
        return addNewGroupTableData;
    }

    public JPanel getCheckBoxPanel() {
        return checkBoxPanel;
    }

    public JScrollPane getCheckBoxScrollPane() {
        return checkBoxScrollPane;
    }

    public ArrayList<JCheckBox> getCheckBoxArray() {
        return checkBoxArray;
    }

    

    // Setters
    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void setTitlePanel(JPanel titlePanel) {
        this.titlePanel = titlePanel;
    }

    public void setLeftPanel(JPanel leftPanel) {
        this.leftPanel = leftPanel;
    }

    public void setRigthPanel(JPanel rigthPanel) {
        this.rigthPanel = rigthPanel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public void setMenuLabel(JLabel menuLabel) {
        this.menuLabel = menuLabel;
    }

    public void setContactsButton(JButton contactsButton) {
        this.contactsButton = contactsButton;
    }

    public void setGroupsButton(JButton groupsButton) {
        this.groupsButton = groupsButton;
    }

    public void setSortByFirstNameButton(JButton sortByFirstNameButton) {
        this.sortByFirstNameButton = sortByFirstNameButton;
    }

    public void setSortByLastNameButton(JButton sortByLastNameButton) {
        this.sortByLastNameButton = sortByLastNameButton;
    }

    public void setSortByCityButton(JButton sortByCityButton) {
        this.sortByCityButton = sortByCityButton;
    }

    public void setAddNewContactButton(JButton addNewContactButton) {
        this.addNewContactButton = addNewContactButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public void setViewContactButton(JButton viewContactButton) {
        this.viewContactButton = viewContactButton;
    }

    public void setUpdateContactButton(JButton updateContactButton) {
        this.updateContactButton = updateContactButton;
    }

    public void setDeleteContactButton(JButton deleteContactButton) {
        this.deleteContactButton = deleteContactButton;
    }

    public void setContactListPanel(JPanel contactListPanel) {
        this.contactListPanel = contactListPanel;
    }

    public void setViewContactPanel(JPanel viewContactPanel) {
        this.viewContactPanel = viewContactPanel;
    }

    public void setAddContactPanel(JPanel addContactPanel) {
        this.addContactPanel = addContactPanel;
    }

    public void setUpdateContactPanel(JPanel updateContactPanel) {
        this.updateContactPanel = updateContactPanel;
    }

    public void setFirstNameLabel(JLabel firstNameLabel) {
        this.firstNameLabel = firstNameLabel;
    }

    public void setLastNameLabel(JLabel lastNameLabel) {
        this.lastNameLabel = lastNameLabel;
    }

    public void setCityLabel(JLabel cityLabel) {
        this.cityLabel = cityLabel;
    }

    public void setPhoneNumbersLabel(JLabel phoneNumbersLabel) {
        this.phoneNumbersLabel = phoneNumbersLabel;
    }

    public void setContactGroupsLabel(JLabel contactGroupsLabel) {
        this.contactGroupsLabel = contactGroupsLabel;
    }

    public void setSearchLabel(JLabel searchLabel) {
        this.searchLabel = searchLabel;
    }

    public void setFirstNameTextField(JTextField firstNameTextField) {
        this.firstNameTextField = firstNameTextField;
    }

    public void setLastNameTextField(JTextField lastNameTextField) {
        this.lastNameTextField = lastNameTextField;
    }

    public void setCityTextField(JTextField cityTextField) {
        this.cityTextField = cityTextField;
    }

    public void setSearchTextField(JTextField searchTextField) {
        this.searchTextField = searchTextField;
    }

    public void setPhoneNumbersTable(JTable phoneNumbersTable) {
        this.phoneNumbersTable = phoneNumbersTable;
    }

    public void setViewContactsListScrollPane(JScrollPane viewContactsListScrollPane) {
        this.viewContactsListScrollPane = viewContactsListScrollPane;
    }

    public void setSaveNewContactButton(JButton saveNewContactButton) {
        this.saveNewContactButton = saveNewContactButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }
    
    public void setTableModel(DefaultTableModel tableModel){
        this.tableModel = tableModel;
    }

    public void setSaveChangesButton(JButton saveChangesButton) {
        this.saveChangesButton = saveChangesButton;
    }

    public void setListModel(DefaultListModel<Record> listModel) {
        this.listModel = listModel;
    }

    public void setViewContactsList(JList<Record> viewContactsList) {
        this.viewContactsList = viewContactsList;
    }

    public void setPhoneNumbersTableScrollPane(JScrollPane phoneNumbersTableScrollPane) {
        this.phoneNumbersTableScrollPane = phoneNumbersTableScrollPane;
    }

    public void setAddNewGroupButton(JButton addNewGroupButton) {
        this.addNewGroupButton = addNewGroupButton;
    }

    public void setGroupListPanel(JPanel groupListPanel) {
        this.groupListPanel = groupListPanel;
    }

    public void setAddNewGroupPanel(JPanel addNewGroupPanel) {
        this.addNewGroupPanel = addNewGroupPanel;
    }

    public void setListOfGroupsLabel(JLabel listOfGroupsLabel) {
        this.listOfGroupsLabel = listOfGroupsLabel;
    }

    public void setGroupNameLabel(JLabel groupNameLabel) {
        this.groupNameLabel = groupNameLabel;
    }

    public void setDescriptionLabel(JLabel descriptionLabel) {
        this.descriptionLabel = descriptionLabel;
    }

    public void setUpdateGroupButton(JButton updateGroupButton) {
        this.updateGroupButton = updateGroupButton;
    }

    public void setDeleteGroupButton(JButton deleteGroupButton) {
        this.deleteGroupButton = deleteGroupButton;
    }

    public void setSaveGroupButton(JButton saveGroupButton) {
        this.saveGroupButton = saveGroupButton;
    }

    public void setCancelGroupButton(JButton cancelGroupButton) {
        this.cancelGroupButton = cancelGroupButton;
    }

    public void setGroupNameTextField(JTextField groupNameTextField) {
        this.groupNameTextField = groupNameTextField;
    }

    public void setDescriptionTextField(JTextField descriptionTextField) {
        this.descriptionTextField = descriptionTextField;
    }

    public void setGroupListTableScrollPane(JScrollPane groupListTableScrollPane) {
        this.groupListTableScrollPane = groupListTableScrollPane;
    }

    public void setContactListTableScrollPane(JScrollPane contactListTableScrollPane) {
        this.contactListTableScrollPane = contactListTableScrollPane;
    }

    public void setAddNewGroupTableScrollPane(JScrollPane addNewGroupTableScrollPane) {
        this.addNewGroupTableScrollPane = addNewGroupTableScrollPane;
    }

    public void setGroupListTable(JTable groupListTable) {
        this.groupListTable = groupListTable;
    }

    public void setContactListTable(JTable contactListTable) {
        this.contactListTable = contactListTable;
    }

    public void setAddNewGroupTable(JTable addNewGroupTable) {
        this.addNewGroupTable = addNewGroupTable;
    }

    public void setGroupListTableModel(DefaultTableModel groupListTableModel) {
        this.groupListTableModel = groupListTableModel;
    }

    public void setContactListTableModel(DefaultTableModel contactListTableModel) {
        this.contactListTableModel = contactListTableModel;
    }

    public void setAddNewGroupTableModel(DefaultTableModel addNewGroupTableModel) {
        this.addNewGroupTableModel = addNewGroupTableModel;
    }

    public void setSaveGroupChangesButton(JButton saveGroupChangesButton) {
        this.saveGroupChangesButton = saveGroupChangesButton;
    }

    public void setAddNewGroupTableHeaders(String[] addNewGroupTableHeaders) {
        this.addNewGroupTableHeaders = addNewGroupTableHeaders;
    }

    public void setAddNewGroupTableData(Object[][] addNewGroupTableData) {
        this.addNewGroupTableData = addNewGroupTableData;
    }

    public void setCheckBoxPanel(JPanel checkBoxPanel) {
        this.checkBoxPanel = checkBoxPanel;
    }

    public void setCheckBoxScrollPane(JScrollPane checkBoxScrollPane) {
        this.checkBoxScrollPane = checkBoxScrollPane;
    }

    public void setCheckBoxArray(ArrayList<JCheckBox> checkBoxArray) {
        this.checkBoxArray = checkBoxArray;
    }
    
    

}
