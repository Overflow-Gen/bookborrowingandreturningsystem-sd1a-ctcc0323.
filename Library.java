import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Library {
	private static final int MAX_USERS = 5;
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Book> books = new ArrayList<>();
    private static User currentUser;
    public static void main(String[] args) {
        addBooks();
        showLoginForm();
    }

    // Method to display the login form
    private static void showLoginForm() {
        // Frame setup
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setSize(475, 700);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.getContentPane().setBackground(Color.white);

        // Labels setup
        String imagePath = "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/logo.jpg";
        int width = 200;
        int height = 60;

        // Scale the image and create the label
        ImageIcon scaledIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        JLabel logoLabel = new JLabel(scaledIcon);
        logoLabel.setBounds(150, 70, width, height);
        loginFrame.add(logoLabel);
        
       
        
        Label l1 = new Label("====================================================");
        Label l2 = new Label("📚📚📚  Book Borrowing and Returning System  📚📚📚");
        Label l3 = new Label("====================================================");
        Label l4 = new Label("   🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹");
        Label l5 = new Label("   🔹                                                                                        🔹");
        Label l6 = new Label("   🔹                     WELCOME TO SUPERBOOK                     🔹");
        Label l7 = new Label("   🔹                                                                                        🔹");
        Label l8 = new Label("    🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹🔹");
        Label l9 = new Label("====================================================");
        Label l10 = new Label("📚📚📚  Book Borrowing and Returning System  📚📚📚");
        Label l11 = new Label("====================================================");
        
        // Welcome Message Bounds and adding in Frame
        l1.setBounds(40, 250, 420, 25);
        loginFrame.add(l1);
        l2.setBounds(60, 270, 420, 25);
        loginFrame.add(l2);
        l3.setBounds(40, 290, 420, 25);
        loginFrame.add(l3);
        l4.setBounds(40, 310, 420, 25);
        loginFrame.add(l4);
        l5.setBounds(40, 330, 420, 25);
        loginFrame.add(l5);
        l6.setBounds(40, 350, 420, 25);
        loginFrame.add(l6);
        l7.setBounds(40, 370, 420, 25);
        loginFrame.add(l7);
        l8.setBounds(40, 390, 420, 25);
        loginFrame.add(l8);
        l9.setBounds(40, 410, 420, 25);
        loginFrame.add(l9);
        l10.setBounds(60, 430, 420, 25);
        loginFrame.add(l10);
        l11.setBounds(40, 450, 420, 25);
        loginFrame.add(l11);
        
        
        // Panels setup
        Panel Labels = new Panel();
        Labels.add(l1);
        Labels.add(l2);
        Labels.add(l3);
        Labels.add(l4);
        Labels.add(l5);
        Labels.add(l6);
        Labels.add(l7);
        Labels.add(l8);
        Labels.add(l9);
        Labels.add(l10);
        Labels.add(l11);
        Labels.setBounds(20, 140, 460, 300);
        loginFrame.add(Labels);

        // Buttons and fields setup
        Label l12 = new Label("Press 'OK' to Continue...");
        l12.setBounds(185, 450, 200, 20);
        loginFrame.add(l12);

        Button b1 = new Button("OK");
        b1.setBounds(225, 475, 40, 20);
        b1.setBackground(new Color(224, 255, 255));
        b1.setFont(new Font("Arial", Font.BOLD, 12));
        loginFrame.add(b1);
        
        String imagePath2 = "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/logo.jpg";
        int width2 = 200;
        int height2 = 60;

        // Scale the image and create the label
        ImageIcon scaledIcon2 = new ImageIcon(new ImageIcon(imagePath2).getImage().getScaledInstance(width2, height2, Image.SCALE_SMOOTH));
        JLabel logoLabel2 = new JLabel(scaledIcon2);
        logoLabel2.setBounds(150, 80, width2, height2);
        logoLabel2.setVisible(false);
        loginFrame.add(logoLabel2);
        
        JLabel l132 = new JLabel("Books are a unique portable magic");
        l132.setBounds(130, 160, 300, 20); // Adjust width as needed
        l132.setFont(new Font("Arial", Font.BOLD, 14)); // Set the font, style, and size
        loginFrame.add(l132);
        
        Label usernameLabel = new Label("Username:");
        usernameLabel.setBounds(150, 200, 170, 20);
        loginFrame.add(usernameLabel);
        usernameLabel.setVisible(false);

        TextField usernameField = new TextField();
        usernameField.setBounds(150, 220, 170, 20);
        loginFrame.add(usernameField);
        usernameField.setVisible(false);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setBounds(150, 250, 170, 20);
        loginFrame.add(passwordLabel);
        passwordLabel.setVisible(false);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 270, 170, 20);
        loginFrame.add(passwordField);
        passwordField.setVisible(false);

        Button loginButton = new Button("Login");
        loginButton.setBounds(150, 320, 170, 20);
        loginButton.setBackground(new Color(224, 255, 255));
        loginButton.setFont(new Font("Arial", Font.BOLD, 12));
        loginButton.setVisible(false);
        
        loginFrame.add(loginButton);

        Label signUpLabel = new Label("Don't have an account?");
        signUpLabel.setBounds(150, 350, 170, 20);
        loginFrame.add(signUpLabel);
        signUpLabel.setVisible(false);

        Button signUpButton = new Button("Sign Up");
        signUpButton.setBounds(150, 380, 170, 20);
        signUpButton.setFont(new Font("Arial", Font.BOLD, 12));
        signUpButton.setBackground(new Color(224, 255, 255));
        signUpButton.setVisible(false);
        loginFrame.add(signUpButton);

        // Action Listeners setup
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Labels.setVisible(false);
                logoLabel.setVisible(false);
                l12.setVisible(false);
                b1.setVisible(false);
                logoLabel2.setVisible(true);
                usernameLabel.setVisible(true);
                usernameField.setVisible(true);
                passwordField.setVisible(true);
                passwordLabel.setVisible(true);
                loginButton.setVisible(true);
                signUpLabel.setVisible(true);
                signUpButton.setVisible(true);
               
            }
        });

        loginFrame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                for (User user : users) {
                    if (user.username.equals(username) && user.password.equals(password)) {
                        currentUser = user;
                        
                        loginFrame.setVisible(false);
                        showMainMenu();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (users.size() < MAX_USERS) {
            		loginFrame.setVisible(false);
                    showSignUpForm();
                } else {
                    
                    JOptionPane.showMessageDialog(null, "User limit reached. Cannot add more users.");
                    
                
                }
              
            }
        });
   }
    
        
    

    // Method to display the sign-up form
    private static void showSignUpForm() {
        // Frame setup
        JFrame signUpFrame = new JFrame("Sign Up");
        signUpFrame.setSize(475, 700);
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setLayout(null);
        signUpFrame.setLocationRelativeTo(null);
        signUpFrame.getContentPane().setBackground(Color.white);

        // Logo setup
        String imagePath3 = "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/logo.jpg";
        int width3 = 200;
        int height3 = 60;
        ImageIcon scaledIcon3 = new ImageIcon(new ImageIcon(imagePath3).getImage().getScaledInstance(width3, height3, Image.SCALE_SMOOTH));
        JLabel logoLabel3 = new JLabel(scaledIcon3);
        logoLabel3.setBounds(140, 30, width3, height3);
        signUpFrame.add(logoLabel3);

        // Fields setup
        Label firstNameLabel = new Label("First Name:");
        TextField firstNameField = new TextField();
        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameField = new TextField();
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        JPasswordField passwordField = new JPasswordField();
        Label confirmPasswordLabel = new Label("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();
        Label genderLabel = new Label("Gender:");
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);
        Checkbox notToSayCheckbox = new Checkbox("Rather not to say", genderGroup, false);
        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();
        Label contactLabel = new Label("Email or Phone Number:");
        TextField contactField = new TextField();

        // Button setup
        Button createAccountButton = new Button("Create Account");
        Button returnButton = new Button("Return");

        // Adding components to frame
        signUpFrame.add(firstNameLabel);
        signUpFrame.add(firstNameField);
        signUpFrame.add(lastNameLabel);
        signUpFrame.add(lastNameField);
        signUpFrame.add(usernameLabel);
        signUpFrame.add(usernameField);
        signUpFrame.add(passwordLabel);
        signUpFrame.add(passwordField);
        signUpFrame.add(confirmPasswordLabel);
        signUpFrame.add(confirmPasswordField);
        signUpFrame.add(genderLabel);
        signUpFrame.add(maleCheckbox);
        signUpFrame.add(femaleCheckbox);
        signUpFrame.add(notToSayCheckbox);
        signUpFrame.add(ageLabel);
        signUpFrame.add(ageField);
        signUpFrame.add(contactLabel);
        signUpFrame.add(contactField);
        signUpFrame.add(createAccountButton);
        signUpFrame.add(returnButton);

        // Setting bounds for components
        // (left, top, width, height)
        firstNameLabel.setBounds(150, 100, 170, 20);
        firstNameField.setBounds(150, 130, 170, 20);
        lastNameLabel.setBounds(150, 160, 170, 20);
        lastNameField.setBounds(150, 190, 170, 20);
        usernameLabel.setBounds(150, 220, 170, 20);
        usernameField.setBounds(150, 250, 170, 20);
        passwordLabel.setBounds(150, 280, 170, 20);
        passwordField.setBounds(150, 310, 170, 20);
        confirmPasswordLabel.setBounds(150, 340, 170, 20);
        confirmPasswordField.setBounds(150, 370, 170, 20);
        genderLabel.setBounds(150, 400, 170, 20);
        maleCheckbox.setBounds(150, 430, 50, 20);
        femaleCheckbox.setBounds(210, 430, 60, 20);
        notToSayCheckbox.setBounds(280, 430, 110, 20);
        ageLabel.setBounds(150, 460, 170, 20);
        ageField.setBounds(150, 490, 170, 20);
        contactLabel.setBounds(150, 520, 170, 20);
        contactField.setBounds(150, 550, 170, 20);
        createAccountButton.setBounds(150, 580, 170, 20);
        returnButton.setBounds(150, 610, 170, 20);

        // Setting button background and font
        createAccountButton.setBackground(new Color(224, 255, 255));
        createAccountButton.setFont(new Font("Arial", Font.BOLD, 12));
        returnButton.setBackground(new Color(224, 255, 255));
        returnButton.setFont(new Font("Arial", Font.BOLD, 12));

        // Setting frame visibility
        signUpFrame.setVisible(true);

        // Action listeners
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve input values
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());
                String gender = null;
                if (genderGroup.getSelectedCheckbox() != null) {
                    gender = genderGroup.getSelectedCheckbox().getLabel();
                }
                String ageText = ageField.getText();
                String contact = contactField.getText();

                // Validation checks
                boolean isUsernameTaken = false;
                boolean isNameTaken = false;
                boolean isContactTaken = false;

                for (User user : users) {
                    if (username.equals(user.username)) {
                        isUsernameTaken = true;
                        break;
                    } else if (firstName.equals(user.name)) {
                        isNameTaken = true;
                        break;
                    } else if (contact.equals(user.contact)) {
                        isContactTaken = true;
                        break;
                    }
                }

                if (isUsernameTaken) {
                    JOptionPane.showMessageDialog(null, "Username already taken. Please choose another username.");
                } else if (isNameTaken) {
                    JOptionPane.showMessageDialog(null, "Name already taken. Please choose another name.");
                } else if (isContactTaken) {
                    JOptionPane.showMessageDialog(null, "Email/Phone number already taken. Please use another contact.");
                } else if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || contact.isEmpty() || ageText.isEmpty()) {
                    JOptionPane.showMessageDialog(signUpFrame, "Please fill all the fields!");
                } else if (gender == null || !password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(signUpFrame, "Please select a gender and ensure passwords match.");
                } else {
                    try {
                        int age = Integer.parseInt(ageText);
                        if (age <= 0) {
                            JOptionPane.showMessageDialog(signUpFrame, "Please enter a valid positive age.");
                        } else {
                            // If all validations pass, create the account
                            users.add(new User(username, password, firstName + " " + lastName, gender, age, contact));
                            JOptionPane.showMessageDialog(signUpFrame, "Sign Up Successful! Please Login.");
                            signUpFrame.setVisible(false);
                            showLoginForm();
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(signUpFrame, "Please enter a valid age.");
                    }
                }
            }
        });

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Return to login form
                signUpFrame.setVisible(false);
                showLoginForm();
            }
        
        });
      }


    

    private static void showMainMenu() {
        // Frame setup
        JFrame mainFrame = new JFrame("Main System");
        mainFrame.setSize(395, 390);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new BorderLayout());

        // Menu setup
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem profileItem = new JMenuItem("Profile");
        JMenuItem logoutItem = new JMenuItem("Logout");
        menu.add(profileItem);
        menu.add(logoutItem);
        menuBar.add(menu);
        mainFrame.setJMenuBar(menuBar);

        // Panel setup
        JPanel panel = new JPanel();
        JLabel titleLabel = new JLabel("SUPERBOOK", JLabel.CENTER);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        
        Label nameLabel = new Label("Welcome to SUPERBOOK! Enjoy your visit.");
        nameLabel.setBounds(45, 30, 300, 20);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14)); 
        
        JButton borrowButton = new JButton("Borrow Books");
        borrowButton.setBounds(20, 100, 160, 200);
        borrowButton.setBackground(new Color(144, 238, 144));
        borrowButton.setFont(new Font("Arial", Font.BOLD, 12));


        JButton returnButton = new JButton("Return Books");
        returnButton.setBounds(200, 100, 160, 200);
        returnButton.setBackground(new Color(255, 182, 193)); 
        returnButton.setFont(new Font("Arial", Font.BOLD, 12));

        // Adding components to the frame
        mainFrame.add(nameLabel);
        mainFrame.add(returnButton);
        mainFrame.add(borrowButton);
        mainFrame.add(titleLabel, BorderLayout.NORTH);
        mainFrame.add(panel);

        // Setting frame visibility
        mainFrame.setVisible(true);

        // Action Listeners setup
        borrowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                showGenreSelection();
            }
        });

        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                showReturnBookScreen();
            }
        });

        profileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentUser == null) {
                    JOptionPane.showMessageDialog(null, "No user logged in");
                } else {
                    showProfile();
                }
            }
        });

        
        
        logoutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    // Return to login form
                    mainFrame.setVisible(false);
                    showLoginForm();
                    currentUser = null;
                }
            }
        });}

   
    
    
    
    private static void showProfile() {
        // Profile frame setup
        JFrame profileFrame = new JFrame("Profile");
        profileFrame.setSize(400, 400);
        profileFrame.setLayout(new BorderLayout());
        profileFrame.setLocationRelativeTo(null);
        profileFrame.getContentPane().setBackground(Color.white);

        // Labels setup
        String imagePath;
        int width = 150;
        int height = 150;

        // Load different image paths based on the gender of the current user
        if (currentUser.gender.equalsIgnoreCase("male")) {
            imagePath = "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/guy.jpg";
        } else if (currentUser.gender.equalsIgnoreCase("female")) {
            imagePath = "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/girl.jpg";
        } else {
            // For other genders, you can set a default image or handle it as needed
            imagePath = "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/mark.jpg";
        }

        // Scale the image and create the label
        ImageIcon scaledIcon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        JLabel logoLabel = new JLabel(scaledIcon);
        logoLabel.setBounds(220, 10, width, height);
        profileFrame.add(logoLabel);

        // Labels setup
        Label nameLabel = new Label("Name: " + currentUser.name);
        Label ageLabel = new Label("Age: " + currentUser.age);
        Label genderLabel = new Label("Gender: " + currentUser.gender);
        Label contactLabel = new Label("Email or Phone Number: " + currentUser.contact);
        Label borrowedBooksLabel = new Label("Borrowed Books: " + currentUser.borrowedBooks.size());
        

        // Panel for other labels
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(5, 1));
        infoPanel.add(nameLabel);
        infoPanel.add(ageLabel);
        infoPanel.add(genderLabel);
        infoPanel.add(contactLabel);
        infoPanel.add(borrowedBooksLabel);
        profileFrame.add(infoPanel, BorderLayout.CENTER); // Add the labels to the center of the frame

        // Button setup
        Button backButton = new Button("Back");
        backButton.setBackground(new Color(224, 255, 255));
        backButton.setFont(new Font("Arial", Font.BOLD, 12));
        profileFrame.add(backButton, BorderLayout.SOUTH); // Add the button to the bottom of the frame

        // Setting frame visibility
        profileFrame.setVisible(true);

        // Action Listeners setup
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                profileFrame.setVisible(false);
            }
        });
    }

    private static void showGenreSelection() {
        JFrame genreFrame = new JFrame("Borrow Books");
        genreFrame.setSize(800, 600);
        genreFrame.setLocationRelativeTo(null);
        genreFrame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("SUPERBOOK", JLabel.CENTER);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));

        JPanel genrePanel = new JPanel();
        genrePanel.setLayout(new BorderLayout());

        JPanel genreSelectionPanel = new JPanel();
        genreSelectionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel genreLabel = new JLabel("Genre: ");
        genreLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        String[] genres = {"Fiction", "Non-Fiction", "Science", "History", "Fantasy"};
        JComboBox<String> genreChoice = new JComboBox<>(genres);
        genreChoice.setPreferredSize(new Dimension(150, 25));

        genreSelectionPanel.add(genreLabel);
        genreSelectionPanel.add(genreChoice);
        genrePanel.add(genreSelectionPanel, BorderLayout.NORTH);

        JPanel booksPanel = new JPanel();
        booksPanel.setLayout(new GridBagLayout());
        JScrollPane scrollPane = new JScrollPane(booksPanel);

        genrePanel.add(scrollPane, BorderLayout.CENTER);

        // Load default genre books
        loadBooksByGenre(booksPanel, "Fiction");

        genreChoice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedGenre = (String) genreChoice.getSelectedItem();
                loadBooksByGenre(booksPanel, selectedGenre);
            }
        });

        JButton borrowButton = new JButton("Borrow Selected Books");
        borrowButton.setBackground(new Color(224, 255, 255));
        borrowButton.setFont(new Font("Arial", Font.BOLD, 12));
        borrowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                borrowSelectedBooks(booksPanel);
                genreFrame.setVisible(false);
                showMainMenu();
            }
        });

        JButton backButton = new JButton("Back to Main Menu");
        backButton.setBackground(new Color(224, 255, 255));
        backButton.setFont(new Font("Arial", Font.BOLD, 12));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                genreFrame.setVisible(false);
                showMainMenu();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(borrowButton);
        buttonPanel.add(backButton);

        genreFrame.add(titleLabel, BorderLayout.NORTH);
        genreFrame.add(genrePanel, BorderLayout.CENTER);
        genreFrame.add(buttonPanel, BorderLayout.SOUTH);

        genreFrame.setVisible(true);
        
    }


    private static void loadBooksByGenre(JPanel booksPanel, String genre) {
        booksPanel.removeAll();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add header row
        gbc.gridx = 0;
        gbc.gridy = 0;
        booksPanel.add(new JLabel("Check box"), gbc);
        gbc.gridx = 1;
        booksPanel.add(new JLabel("Name of the Books"), gbc);
        gbc.gridx = 2;
        booksPanel.add(new JLabel("Copies Left"), gbc);
        gbc.gridx = 3;
        booksPanel.add(new JLabel("Book Cover"), gbc);

        int row = 1;
        for (Book book : books) {
            if (book.genre.equals(genre)) {
                gbc.gridx = 0;
                gbc.gridy = row;
                booksPanel.add(new JCheckBox(), gbc);

                gbc.gridx = 1;
                booksPanel.add(new JLabel(book.title), gbc);

                gbc.gridx = 2;
                booksPanel.add(new JLabel("Copies Left: " + (3 - book.timesBorrowed)), gbc);

                gbc.gridx = 3;
                // Load the image
                ImageIcon bookIcon = new ImageIcon(book.imagePath);
                Image image = bookIcon.getImage().getScaledInstance(50, 75, Image.SCALE_SMOOTH);
                booksPanel.add(new JLabel(new ImageIcon(image)), gbc);

                row++;
            }
        }

        booksPanel.revalidate();
        booksPanel.repaint();
    }

    private static void borrowSelectedBooks(JPanel booksPanel) {
        int booksBorrowed = currentUser.borrowedBooks.size();
        boolean bookSelected = false; // Flag to check if any book is selected
        StringBuilder errorMessages = new StringBuilder();

        Component[] components = booksPanel.getComponents();
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) components[i];
                
                
                
                if (checkBox.isSelected()) {
                    bookSelected = true; // A book is selected
                    JLabel nameLabel = (JLabel) components[i + 1];
                    String bookTitle = nameLabel.getText();

                    Book book = getBookByTitle(bookTitle);
                    if (book != null && booksBorrowed < 5 && book.timesBorrowed < 3 && !currentUser.borrowedBooks.contains(book)) {
                        book.timesBorrowed++;
                        currentUser.borrowedBooks.add(book);
                        booksBorrowed++;
                    } else if (booksBorrowed >= 5) {
                        errorMessages.append("You cannot borrow more than 5 books.\n");
                        break;
                    } else if (book.timesBorrowed >= 3) {
                        errorMessages.append(bookTitle).append(" cannot be borrowed anymore.\n");
                    } else if (currentUser.borrowedBooks.contains(book)) {
                        errorMessages.append("You cannot borrow the same book twice.\n");
                        
                    }
                }
            }
        }

        if (!bookSelected) {
            JOptionPane.showMessageDialog(null, "No book selected.");
        } else if (errorMessages.length() > 0) {
            JOptionPane.showMessageDialog(null, errorMessages.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Books borrowed successfully.");
            
        }
    }



    private static void showReturnBookScreen() {
        JFrame returnFrame = new JFrame("Return Books");
        returnFrame.setSize(800, 600);
        returnFrame.setLocationRelativeTo(null);
        returnFrame.setLayout(new BorderLayout());

        JPanel booksPanel = new JPanel();
        booksPanel.setLayout(new GridBagLayout());
        JScrollPane scrollPane = new JScrollPane(booksPanel);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add header row
        gbc.gridx = 0;
        gbc.gridy = 0;
        booksPanel.add(new JLabel("Check Box"), gbc);
        gbc.gridx = 1;
        booksPanel.add(new JLabel("Name of the Book"), gbc);
        gbc.gridx = 2;
        booksPanel.add(new JLabel("Book Cover"), gbc);

        int row = 1;
        for (Book book : currentUser.borrowedBooks) {
            gbc.gridx = 0;
            gbc.gridy = row;
            
            
            
            
            JPanel checkBoxPanel = new JPanel(new BorderLayout());
            checkBoxPanel.add(new JLabel(""), BorderLayout.WEST);

            
            
            JCheckBox checkBox = new JCheckBox();
            checkBox.setName(book.title);  // Set the checkbox name to the book title
            checkBox.setPreferredSize(new Dimension(150, 20)); // Resize checkbox

            checkBoxPanel.add(checkBox, BorderLayout.CENTER);
            booksPanel.add(checkBoxPanel, gbc);

            gbc.gridx = 1;
            booksPanel.add(new JLabel(book.title), gbc);

            gbc.gridx = 2;
            // Load the image
            ImageIcon bookIcon = new ImageIcon(book.imagePath);
            Image image = bookIcon.getImage().getScaledInstance(50, 75, Image.SCALE_SMOOTH);
            booksPanel.add(new JLabel(new ImageIcon(image)), gbc);

            row++;
        }

        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // Creating a panel to hold the titleLabel
        JLabel titleLabel = new JLabel("SUPERBOOK", JLabel.CENTER);
        titleLabel.setForeground(Color.RED);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        northPanel.add(titleLabel); // Adding the titleLabel to the northPanel

        returnFrame.add(northPanel, BorderLayout.NORTH); // Adding the northPanel to the returnFrame in the NORTH position
        JButton returnButton = new JButton("Return Selected Books");
        returnButton.setBackground(new Color(224, 255, 255));
        returnButton.setFont(new Font("Arial", Font.BOLD, 12));
        returnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Book> booksToReturn = new ArrayList<>();
                for (Component comp : booksPanel.getComponents()) {
                    if (comp instanceof JPanel) {
                        JPanel panel = (JPanel) comp;
                        for (Component innerComp : panel.getComponents()) {
                            if (innerComp instanceof JCheckBox) {
                                JCheckBox checkBox = (JCheckBox) innerComp;
                                if (checkBox.isSelected()) {
                                    String bookTitle = checkBox.getName();
                                    Book book = getBookByTitle(bookTitle);
                                    if (book != null) {
                                        booksToReturn.add(book);
                                    }
                                }
                            }
                        }
                    }
                }

                for (Book book : booksToReturn) {
                    book.timesBorrowed--;
                    currentUser.borrowedBooks.remove(book);
                }
                
                
                if (!booksToReturn.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selected books returned successfully.");
                } else { // if Empty will Say and error message
                    JOptionPane.showMessageDialog(null, "No books selected for return.");
                }

                returnFrame.setVisible(false);
                showMainMenu();
            }
        });
        
        // Back Button
        JButton backButton = new JButton("Back to Main Menu");
        backButton.setBackground(new Color(224, 255, 255));
        backButton.setFont(new Font("Arial", Font.BOLD, 12));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                returnFrame.setVisible(false);
                showMainMenu();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(returnButton);
        buttonPanel.add(backButton);
        
        returnFrame.add(scrollPane, BorderLayout.CENTER);
        returnFrame.add(buttonPanel, BorderLayout.SOUTH);

        returnFrame.setVisible(true);
    }



    private static Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    private static void addBooks() {
    	
    	// List of Books
        books.add(new Book("To Kill a Mockingbird", "Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/bird.jpg"));
        books.add(new Book("1984", "Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/1984.jpg"));
        books.add(new Book("The Great Gatsby", "Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/gats.jpg"));
        books.add(new Book("Pride and Prejudice", "Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/pride.jpg"));
        books.add(new Book("The Catcher in the Rye", "Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/rye.jpg"));

        books.add(new Book("Sapiens", "Non-Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/sap.jpg"));
        books.add(new Book("Educated", "Non-Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/edu.jpg"));
        books.add(new Book("Becoming", "Non-Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/bec.jpg"));
        books.add(new Book("The Immortal Life of Henrietta Lacks", "Non-Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/imo.jpg"));
        books.add(new Book("The Wright Brothers", "Non-Fiction", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/writ.jpg"));

        books.add(new Book("A Brief History of Time", "Science", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/bri.jpg"));
        books.add(new Book("The Selfish Gene", "Science", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/gene.jpg"));
        books.add(new Book("The Origin of Species", "Science", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/orig.jpg"));
        books.add(new Book("Cosmos", "Science", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/cos.jpg"));
        books.add(new Book("The Gene", "Science", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/theg.jpg"));

        books.add(new Book("Guns, Germs, and Steel", "History", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/gun.jpg"));
        books.add(new Book("The Diary of a Young Girl", "History", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/dia.jpg"));
        books.add(new Book("The History of the Ancient World", "History", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/anc.jpg"));
        books.add(new Book("The Silk Roads", "History", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/sil.jpg"));
        books.add(new Book("Team of Rivals", "History", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/tea.jpg"));

        books.add(new Book("Mistborn", "Fantasy", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/mist.jpeg"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/harrystone.jpg"));
        books.add(new Book("The Hobbit", "Fantasy", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/hobbit.jpg"));
        books.add(new Book("The Name of the Wind", "Fantasy", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/wind.jpg"));
        books.add(new Book("The Way of Kings", "Fantasy", "C:/Users/mattg/Desktop/eme eme ko sa coding/ComProg2/src/Image/wayking.jpg"));
        
    }

    static class User {
        String username;
        String password;
        String name;
        String gender;
        int age;
        String contact;
        ArrayList<Book> borrowedBooks;

        User(String username, String password, String name, String gender, int age, String contact) {
            this.username = username;
            this.password = password;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.contact = contact;
            this.borrowedBooks = new ArrayList<>();
        }
    }

    static class Book {
        String title;
        String genre;
        int timesBorrowed;
        String imagePath; // Added imagePath

        Book(String title, String genre, String imagePath) {
            this.title = title;
            this.genre = genre;
            this.imagePath = imagePath; // Initialize imagePath
            this.timesBorrowed = 0;
        }
    }
}