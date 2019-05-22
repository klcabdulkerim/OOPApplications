/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooproject2;

/**
 * OBJECT ORIENTED PROGRAMMING
 *
 * PROJECT--2 PAINTING PROGRAM
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * Marmara University
 *
 * @abdulkerim kilic 150713017
 * @mehmet ata tutunekici 150713049
 */
public class Ooproject2 extends JFrame {

    public static void main(String[] args) {

        Ooproject2 project = new Ooproject2();
    }
    Show canvas;

    JButton redBtn, greenBtn, blueBtn, yellowBtn,
            blackBtn, cyanBtn, magentaBtn, whiteBtn;
    JToolBar colorBar, shapeBar, colorBar2, shapeBar2;
    JMenuBar menubar;
    JMenuItem newItem, openItem, saveItem, saveAsItem,
            closeItem, exitItem, aboutItem;
    JFrame frame;
    JButton ovalBtn, rectBtn, pointBtn, lineBtn, freeBtn,
            fillRectBtn, fillOvalBtn, clearBtn, undoBtn, backGroundBtn, quitBtn;

    public boolean standControl = true;

    public Ooproject2() {
        canvas = new Show();  // The drawing area.==>>white

        frame = new JFrame("PAINT");

        colorBar = new JToolBar();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        redBtn = new JButton("      Red     ");
        redBtn.addActionListener(canvas);
        colorBar.add(redBtn);
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        blueBtn = new JButton("     Blue    ");
        colorBar.add(blueBtn);
        blueBtn.addActionListener(canvas);
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        greenBtn = new JButton("    Green    ");
        colorBar.add(greenBtn);
        greenBtn.addActionListener(canvas);
        colorBar.addSeparator();
        colorBar.addSeparator();
        colorBar.addSeparator();
        yellowBtn = new JButton("    Yellow    ");
        colorBar.add(yellowBtn);
        yellowBtn.addActionListener(canvas);

        colorBar2 = new JToolBar();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        blackBtn = new JButton("    Black    ");
        colorBar2.add(blackBtn);
        blackBtn.addActionListener(canvas);
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        cyanBtn = new JButton("    Cyan    ");
        colorBar2.add(cyanBtn);
        cyanBtn.addActionListener(canvas);
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        magentaBtn = new JButton("  Magenta  ");
        colorBar2.add(magentaBtn);
        magentaBtn.addActionListener(canvas);
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        colorBar2.addSeparator();
        whiteBtn = new JButton("    White    ");
        colorBar2.add(whiteBtn);
        whiteBtn.addActionListener(canvas);

        redBtn.setBackground(Color.red);
        blueBtn.setBackground(Color.blue.brighter().brighter());
        greenBtn.setBackground(Color.green);
        yellowBtn.setBackground(Color.yellow);
        blackBtn.setBackground(Color.black.brighter());
        cyanBtn.setBackground(Color.cyan);
        magentaBtn.setBackground(Color.magenta);
        whiteBtn.setBackground(Color.white);

        blackBtn.setForeground(Color.gray);
        colorBar.setBackground(Color.ORANGE);

        colorBar.setFloatable(false);
        frame.add(colorBar, BorderLayout.NORTH);

        colorBar2.setBackground(Color.ORANGE);

        colorBar2.setFloatable(false);
        frame.add(colorBar2, BorderLayout.SOUTH);

        shapeBar = new JToolBar(null, JToolBar.VERTICAL);
        shapeBar.setBackground(Color.ORANGE);

        shapeBar.addSeparator();
        backGroundBtn = new JButton("Background  ");
        shapeBar.add(backGroundBtn);
        backGroundBtn.addActionListener(canvas);
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        clearBtn = new JButton("Clear               ");
        shapeBar.add(clearBtn);
        clearBtn.addActionListener(canvas);
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        undoBtn = new JButton("Undo               ");
        shapeBar.add(undoBtn);
        undoBtn.addActionListener(canvas);
        shapeBar.addSeparator();
        shapeBar.addSeparator();
        quitBtn = new JButton("Quit                 ");
        shapeBar.add(quitBtn);
        quitBtn.addActionListener(canvas);

        shapeBar2 = new JToolBar(null, JToolBar.VERTICAL);
        shapeBar2.setBackground(Color.ORANGE);
        shapeBar2.addSeparator();
        rectBtn = new JButton("Rectangle      ");
        shapeBar2.add(rectBtn);
        rectBtn.addActionListener(canvas);
        shapeBar2.addSeparator();
        shapeBar2.addSeparator();
        ovalBtn = new JButton("Oval                 ");
        shapeBar2.add(ovalBtn);
        ovalBtn.addActionListener(canvas);
        shapeBar2.addSeparator();
        shapeBar2.addSeparator();
        pointBtn = new JButton("Point                ");
        shapeBar2.add(pointBtn);
        pointBtn.addActionListener(canvas);
        shapeBar2.addSeparator();
        shapeBar2.addSeparator();
        lineBtn = new JButton("Line                 ");
        shapeBar2.add(lineBtn);
        lineBtn.addActionListener(canvas);
        shapeBar2.addSeparator();
        shapeBar2.addSeparator();
        freeBtn = new JButton("Free                 ");
        shapeBar2.add(freeBtn);
        freeBtn.addActionListener(canvas);
        shapeBar2.addSeparator();
        shapeBar2.addSeparator();
        fillRectBtn = new JButton("Fill Rectangle");
        shapeBar2.add(fillRectBtn);
        fillRectBtn.addActionListener(canvas);
        shapeBar2.addSeparator();
        shapeBar2.addSeparator();
        fillOvalBtn = new JButton("Fill Oval           ");
        shapeBar2.add(fillOvalBtn);
        fillOvalBtn.addActionListener(canvas);

        ovalBtn.setBackground(Color.LIGHT_GRAY);
        rectBtn.setBackground(Color.LIGHT_GRAY);
        pointBtn.setBackground(Color.LIGHT_GRAY);
        lineBtn.setBackground(Color.LIGHT_GRAY);
        freeBtn.setBackground(Color.LIGHT_GRAY);
        fillRectBtn.setBackground(Color.LIGHT_GRAY);
        fillOvalBtn.setBackground(Color.LIGHT_GRAY);
        clearBtn.setBackground(Color.LIGHT_GRAY);
        undoBtn.setBackground(Color.LIGHT_GRAY);
        backGroundBtn.setBackground(Color.LIGHT_GRAY);
        quitBtn.setBackground(Color.LIGHT_GRAY);

        shapeBar2.setFloatable(false);
        frame.add(shapeBar2, BorderLayout.WEST);
        shapeBar.setFloatable(false);
        frame.add(shapeBar, BorderLayout.EAST);

        menubar = new JMenuBar();
        JMenu editMenu = new JMenu("File", true);
        menubar.add(editMenu);
        JMenu aboutMenu = new JMenu("About", true);
        menubar.add(aboutMenu);

        frame.setJMenuBar(menubar);
        menubar.setBackground(Color.ORANGE);

        aboutItem = new JMenuItem("About");
        aboutItem.addActionListener(canvas);
        aboutMenu.add(aboutItem);

        newItem = new JMenuItem("New");
        newItem.addActionListener(canvas);
        editMenu.add(newItem);

        openItem = new JMenuItem("Open");
        openItem.addActionListener(canvas);
        editMenu.add(openItem);

        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(canvas);
        editMenu.add(saveItem);

        saveAsItem = new JMenuItem("Save As");
        saveAsItem.addActionListener(canvas);
        editMenu.add(saveAsItem);

        closeItem = new JMenuItem("Close");
        closeItem.addActionListener(canvas);
        editMenu.add(closeItem);

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(canvas);
        editMenu.add(exitItem);

        setContentPane(canvas); // set a window that user can paint on
        frame.add(canvas, BorderLayout.CENTER);
        frame.pack();

        frame.setSize(600, 450);
        frame.setResizable(false);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.show();
        canvas.startScreen();//start message name and ID
    }

    private class Show extends JPanel
            implements MouseListener, MouseMotionListener, ActionListener {

        int shapeControl = 0;  //number to control current shapes
        int colorControl = 0;//number to control current color
        int checkExit = 0;   //this integer value will change by clicking buttons
        private final static int FREE = 0,
                LINE = 1,
                RECT = 2, // Some constants for the different types 
                OVAL = 3,
                FILLED_RECT = 4,
                FILLED_OVAL = 5,
                POINT = 6;


        /* Some variables used for backing up the contents of the panel. */
        Image offScreen;  // The off-screen image (created in checkOffScreen()).
        Image openScreen; // The offScreen will be copied to the openScreen
        //to open last saved image
        int widthOffScreen, heightOffScreen;

        Image undoBuffer;  //when we start to draw , 
        //the offScreen will be copied to  undoBuffer
        //and when click on btn undoBuffer and OSi will be swapped
        Color backGroundColor = Color.gray;
        /* The following variables are used when the user is sketching a
         curve while dragging a mouse. */
        private int mouseX, mouseY;   // The location of the mouse.

        private int prevX, prevY;     // The previous location of the mouse.

        private int startX, startY;   // The starting position of the mouse.
        // (Not used for drawing curves.)

        private boolean dragging;     // This will be true when the user is drawing.

        private int figure;    // What type of figure is being drawn.  This is
        //    specified by the figureChoice menu.

        private Graphics dragGraphics;  // A graphics context for the off-screen image,
        // to be used while a drag is in progress.
        public Graphics2D graph;
        private Color currentColor;  // The color that is used for the figure that is
        // being drawn.

        Show() {
            // Constructor.  When this component is first created, it is set to
            // listen for mouse events and mouse motion events from
            // itself.  The initial background color is white.
            addMouseListener(this);
            addMouseMotionListener(this);
            setBackground(Color.white);
            setPreferredSize(new Dimension(450, 450));
        }

        public void startScreen() {
            //Print out the names and ID's
            JOptionPane.showMessageDialog(null, " MEHMET ATA TUTUNEKICI     150713049 "
                    + "\n ABDULKERIM  KILIC                 150713017 ", "   NAME--ID  ", JOptionPane.INFORMATION_MESSAGE);
        }

        private Color getColor() {
            // Check the Color menu and return the color
            // that is currently selected.
            if (colorControl == 1) {
                return Color.red;
            } else if (colorControl == 2) {
                return Color.blue;
            } else if (colorControl == 3) {
                return Color.green;
            } else if (colorControl == 4) {
                return Color.yellow;
            } else if (colorControl == 5) {
                return Color.cyan;
            } else if (colorControl == 6) {
                return Color.magenta;
            } else if (colorControl == 7) {
                return Color.white;
            } else {
                return Color.black;
            }
        }

        private int getShape() {
            // Check the "Shape" menu and return the code
            // for the shape that is currently selected.
            if (shapeControl == 2) {
                return LINE;
            } else if (shapeControl == 3) {
                return RECT;
            } else if (shapeControl == 4) {
                return OVAL;
            } else if (shapeControl == 5) {
                return FILLED_RECT;
            } else if (shapeControl == 6) {
                return FILLED_OVAL;
            } else if (shapeControl == 7) {
                return POINT;
            } else {
                return FREE;
            }
        }

        private void drawFigure(Graphics g, int shape, int x1, int y1, int x2, int y2) {
//            System.out.println("draw");
            // This method is called to do ALL drawing
            // Draws a shape in the graphics context g.
            // The shape parameter tells what kind of shape to draw.  This
            // can be LINE, RECT, OVAL, FILLED_RECT,
            // FILLED_OVAL.
            //For a LINE, a line is drawn from
            // the point (x1,y1) to (x2,y2).  For other shapes,  the
            // points (x1,y1) and (x2,y2) give two corners of the shape
            // (or of a rectangle that contains the shape).
            if (shape == LINE) {
                // For a line, just draw the line between the two points.
                g.drawLine(x1, y1, x2, y2);
                return;
            }
            int x, y;  // Top left corner of rectangle that contains the figure.
            int w, h;  // Width and height of rectangle that contains the figure.
            if (x1 >= x2) {  // x2 is left edge
                x = x2;
                w = x1 - x2;
            } else {          // x1 is left edge
                x = x1;
                w = x2 - x1;
            }
            if (y1 >= y2) {  // y2 is top edge
                y = y2;
                h = y1 - y2;
            } else {          // y1 is top edge.
                y = y1;
                h = y2 - y1;
            }
            switch (shape) {   // Draw the appropriate figure.
                case RECT:
                    g.drawRect(x, y, w, h);
                    break;
                case OVAL:
                    g.drawOval(x, y, w, h);
                    break;

                case FILLED_RECT:
                    g.fillRect(x, y, w, h);
                    break;
                case FILLED_OVAL:
                    g.fillOval(x, y, w, h);
                    break;
                case POINT:
                    g.drawLine(prevX, prevY, mouseX, mouseY);
                    break;

            }

        }

        private void putMultiFigure(Graphics g, int shape, int x1, int y1, int x2, int y2) {
            // Draws the shape and possibly some of its reflections.
            //  The shapes are drawn by calling
            // the drawFigure method.

            int width = getWidth();
            int height = getHeight();

            drawFigure(g, shape, x1, y1, x2, y2);  // Draw the basic figure

        }

        private void repaintRect(int x1, int y1, int x2, int y2) {
            // Call repaint on a rectangle that contains the points (x1,y1)
            // and (x2,y2).  (Add a 1-pixel border along right and bottom 
            // edges to allow for the pen overhang when drawing a line.)
            int x, y;  // top left corner of rectangle that contains the figure
            int w, h;  // width and height of rectangle that contains the figure
            if (x2 >= x1) {  // x1 is left edge
                x = x1;
                w = x2 - x1;
            } else {          // x2 is left edge
                x = x2;
                w = x1 - x2;
            }
            if (y2 >= y1) {  // y1 is top edge
                y = y1;
                h = y2 - y1;
            } else {          // y2 is top edge.
                y = y2;
                h = y1 - y2;
            }
            repaint(x, y, w + 1, h + 1);

        }

        private void repaintMultiRect(int x1, int y1, int x2, int y2) {
            // Call repaint on a rectangle that contains the points (x1,y1)
            // and (x2,y2).  Also call repaint on reflections of this
            // rectangle, depending on the type of symmetry.  The
            // rects are repainted by calling repaintRect().
            int width = getWidth();
            int height = getHeight();
            repaintRect(x1, y1, x2, y2); // repaint the original rect

        }

        private void checkScreen() {
            // This method is responsible for creating the off-screen image. 
            // It will make a new offScreen if
            // the size of the panel changes.
            if (offScreen == null || widthOffScreen != getSize().width || heightOffScreen != getSize().height) {
                // Create the OSI, or make a new one if panel size has changed.
                offScreen = null;  // (If offScreen already exists, this frees up the memory.)
                undoBuffer = null;  // (Free memory.)
                widthOffScreen = getWidth();
                heightOffScreen = getHeight();
                offScreen = createImage(widthOffScreen, heightOffScreen);
                Graphics OSG = offScreen.getGraphics();  // Graphics context for drawing to OSI.
                OSG.setColor(getBackground());
                OSG.fillRect(0, 0, widthOffScreen, heightOffScreen);
                OSG.dispose();
                undoBuffer = createImage(widthOffScreen, heightOffScreen);
                OSG = undoBuffer.getGraphics();  // Graphics context for drawing to undoBuffer
                OSG.setColor(getBackground());
                OSG.fillRect(0, 0, widthOffScreen, heightOffScreen);
                OSG.dispose();

            }

        }

        @Override
        public void paintComponent(Graphics g) {
            // Copy the off-screen image to the screen,
            // after checking to make sure it exists.
            checkScreen();
            g.drawImage(offScreen, 0, 0, this);
            if (dragging && figure != FREE) {
                g.setColor(currentColor);
                putMultiFigure(g, figure, startX, startY, mouseX, mouseY);
            }

        }

        @Override
        public void actionPerformed(ActionEvent ae) {

            checkScreen();
            //background button
            if (ae.getSource() == backGroundBtn) {
                Color c = JColorChooser.showDialog(this, "Please Select Background Color", backGroundColor);
                if (c != null) {
                    // Change the custom color and select it for use as
                    // the drawing color.
                    backGroundColor = c;
                    clear(backGroundColor);

                    if (c.getBlue() == 0 && c.getGreen() == 0 && c.getRed() == 0) {
                        colorControl = 7;
                    }
                    if (c.getBlue() == 255 && c.getGreen() == 255 && c.getRed() == 255) {
                        colorControl = 0;
                    }

                }

            }
            //clear button
            if (ae.getSource() == clearBtn) {
                // Clear to current background color
                repaint();
                offScreen = null;

            }
            //undo button
            if (ae.getSource() == undoBtn) {
                // Undo the most recent drawing operation

                Image temp = offScreen;
                offScreen = undoBuffer;
                undoBuffer = temp;

                repaint();

            }
            //quit button
            if (ae.getSource() == quitBtn) {
                int value = JOptionPane.showConfirmDialog(null,
                        "DO YOU REALLY WANT TO QUIT ? ", "Confirm", JOptionPane.YES_NO_OPTION);
                dispose();

                if (standControl && value == 0) {
                    if (checkExit == 1) {
                        int control = JOptionPane.showConfirmDialog(null,
                                "DO YOU WANT TO SAVE ?", "Confirm", JOptionPane.YES_NO_OPTION);
                        if (control == 0) {

                            // SAVE
                            doSave();
                        }
                    }
                    System.exit(0);
                }

            }

            // Control The Current Shapes And Color With Numbers
            if (ae.getSource() == freeBtn) {
                shapeControl = 1;
            } else if (ae.getSource() == lineBtn) {
                shapeControl = 2;
            } else if (ae.getSource() == rectBtn) {
                shapeControl = 3;
            } else if (ae.getSource() == ovalBtn) {
                shapeControl = 4;
            } else if (ae.getSource() == fillRectBtn) {
                shapeControl = 5;
            } else if (ae.getSource() == fillOvalBtn) {
                shapeControl = 6;
            } else if (ae.getSource() == pointBtn) {
                shapeControl = 7;
            }
            if (ae.getSource() == redBtn) {
                colorControl = 1;
            } else if (ae.getSource() == blueBtn) {
                colorControl = 2;
            } else if (ae.getSource() == greenBtn) {
                colorControl = 3;
            } else if (ae.getSource() == yellowBtn) {
                colorControl = 4;
            } else if (ae.getSource() == cyanBtn) {
                colorControl = 5;
            } else if (ae.getSource() == magentaBtn) {
                colorControl = 6;
            } else if (ae.getSource() == whiteBtn) {
                colorControl = 7;
            } else if (ae.getSource() == blackBtn) {
                colorControl = 0;
            }
            // Respond when the user selects an item from the "Control" menu.
            String command = ae.getActionCommand();

            if (command.equals("About")) {
                //About
                Info info = new Info();
            }
            if (command.equals("New")) {

                //if checkExit==0 a new drawing will be opened without asking anything
                if (checkExit == 1) {
                    int value = JOptionPane.showConfirmDialog(null,
                            "DO YOU WANT TO SAVE ?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (value == 0) {

                        // SAVE
                        doSave();
                    } else {
                        // CLOSE ALL DRAWING
                        repaint();
                        offScreen = null;

                    }
                } else {
                    //JUST CLOSE
                    repaint();
                    offScreen = null;
                    canvas.setBackground(new Color(255, 255, 255));
                    canvas.setBackground(new Color(255, 255, 255));

                }
                //save and close 
                repaint();
                offScreen = null;
                canvas.setBackground(new Color(255, 255, 255));
                canvas.setBackground(new Color(255, 255, 255));

            }

            if (command.equals("Open")) {
                BufferedImage image;

                try {

                    JFileChooser fileChooser = new JFileChooser();
                    if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                        java.io.File file = fileChooser.getSelectedFile();
                        getTypeDescription(file);
                        file.setReadable(true);
                        file.setWritable(true);

                    
                        Scanner input = new Scanner(file);

                        image = ImageIO.read(new File(file.getName()));

                        image.createGraphics();
                        offScreen = image;
                        Graphics2D g = image.createGraphics();
                        canvas.paintComponent(g);
                        canvas.repaint();
                        System.out.println("height:  "+image.getHeight()+"width:  "+image.getWidth());
                    }

                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            if (command.equals("Save")) {
                //save
                doSave();  // Save method
            }
            if (command.equals("Save As")) {
                //save with new name
                doSaveAs();
            }
            if (command.equals("Close")) {
                //if checkExit==0 the drawing will be closed without asking anything
                if (checkExit == 1) {
                    int value = JOptionPane.showConfirmDialog(null,
                            "DO YOU WANT TO SAVE ?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (value == 0) {

                        // SAVE
                        doSave();
                    } else {
                        // CLOSE ALL DRAWING
                        checkExit = 0;

                        closeDrawing();

                    }
                } else {
                    //JUST CLOSE
                    checkExit = 0;
                    closeDrawing();

                }
                //save and close 
                checkExit = 0;
                closeDrawing();

            }
            if (command.equals("Exit")) {
                //if checkExit==0 the program will exit without asking anything
                if (checkExit == 1) {
                    int value = JOptionPane.showConfirmDialog(null,
                            "DO YOU WANT TO SAVE", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (value == 0) {

                        // SAVE
                        doSave();

                    } else {
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }
                System.exit(0);
            }

        }
//Image type method

        public String getTypeDescription(File file) {
            String extention = Utils.getExtension(file);
            String type = null;
            if (extention != null) {
                switch (extention) {
                    case Utils.jpeg:
                    case Utils.jpg:
                        type = "JPEG Image";
                        break;
                    case Utils.png:
                        type = "PNG Image";
                        break;
                }
            }
            return type;
        }

        //Save method
        public void doSave() {
            BufferedImage bi = new BufferedImage(
                    canvas.getWidth(), canvas.getHeight(),
                    BufferedImage.TYPE_INT_RGB);

            Graphics2D g = bi.createGraphics();
            canvas.paintComponent(g);

            try {

                File file = new File("imageTest.jpg");
                if (!file.exists()) {  //if there is not a file that has same name, save this

                    ImageIO.write(bi, "JPEG",
                            new File("imageTest.jpg"));
                    JOptionPane.showMessageDialog(frame, "imageTest Saved");
                    graph = g;//
                    openScreen = offScreen;
                } else {
                    //save with a new name
                    doSaveAs();

                }

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

        }

        public void doSaveAs() {

            BufferedImage bi = new BufferedImage(
                    canvas.getWidth(), canvas.getHeight(),
                    BufferedImage.TYPE_INT_RGB);

            Graphics2D g = bi.createGraphics();
            canvas.paintComponent(g);
            graph = g;//
            openScreen = offScreen;
            try {
                //save with a new name
                boolean control = true;  // check if same name exists
                while (control) {
                    String name = JOptionPane.showInputDialog(frame, "Save With A New Title");
                    File file = new File(name + ".jpg");
                    if (!file.exists() && !name.isEmpty()) {
                        ImageIO.write(bi, "JPEG",
                                new File(name + ".jpg"));
                        JOptionPane.showMessageDialog(frame, name + " Saved");
                        control = false;

                    } else {

                    }
                }

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

        public void closeDrawing() {
            repaint();
            offScreen = null;

        }

        private void clear(Color background) {
            // Fill with the specified color.  If the
            // color is equal to the current drawing color, then
            // the current drawing color is changed, so that
            // drawing operations will not be invisible.
            setBackground(background);
            if (background.equals(getColor())) {
                if (background.equals(Color.black)) {
                    whiteBtn.setSelected(true);  // On a black background, draw in white.
                } else {
                    blackBtn.setSelected(true);  // On other backgrounds, use black.
                }
            }
            Graphics g = offScreen.getGraphics();
            g.setColor(getBackground());
            g.fillRect(0, 0, getSize().width, getSize().height);
            g.dispose();
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent me) {

            checkExit = 1;  //if mouse pressed ask for saving or not
            if (dragging == true) // Ignore mouse presses that occur
            {
                return;
            }

            prevX = startX = me.getX();  // Save mouse coordinates.
            prevY = startY = me.getY();

            figure = getShape();      // Get data from menus for drawing.
            currentColor = getColor();

            checkScreen();

            Graphics undoGraphics = undoBuffer.getGraphics();
            undoGraphics.drawImage(offScreen, 0, 0, null);  // remember the current image,
            // for "Undo" operations,
            // before changing the image.
            undoGraphics.dispose();

            dragGraphics = offScreen.getGraphics();
            dragGraphics.setColor(currentColor);

            dragging = true;  // Start drawing.

        }

        @Override
        public void mouseReleased(MouseEvent me) {
            // If the user was drawing a shape, we make the shape
            // permanent by drawing it to the off-screen image.
            if (dragging == false) {
                return;  // Nothing to do because the user isn't drawing.
            }
            dragging = false;
            mouseX = me.getX();
            mouseY = me.getY();
            if (figure == FREE) {
                // free drawing as a series of lines
                putMultiFigure(dragGraphics, LINE, prevX, prevY, mouseX, mouseY);
                repaintMultiRect(prevX, prevY, mouseX, mouseY);
            } else if (figure == LINE) {
                repaintMultiRect(startX, startY, prevX, prevY);
                if (mouseX != startX || mouseY != startY) {
                    // Draw the line only if it has non-zero length.
                    putMultiFigure(dragGraphics, figure, startX, startY, mouseX, mouseY);
                    repaintMultiRect(startX, startY, mouseX, mouseY);
                }
            } else {
                repaintMultiRect(startX, startY, prevX, prevY);
                if (mouseX != startX && mouseY != startY) {
                    // Draw the shape only if both its height
                    // and width are both non-zero.
                    putMultiFigure(dragGraphics, figure, startX, startY, mouseX, mouseY);
                    repaintMultiRect(startX, startY, mouseX, mouseY);
                }
            }
            dragGraphics.dispose();
            dragGraphics = null;

        }

        @Override
        public void mouseDragged(MouseEvent me) {

            if (dragging == false) {
                return;  // Nothing to do because the user isn't drawing.
            }
            mouseX = me.getX();   // x-coordinate of mouse.
            mouseY = me.getY();   // y=coordinate of mouse.

            if (figure == FREE) {
                // A CURVE is drawn as a series of LINEs.
                putMultiFigure(dragGraphics, LINE, prevX, prevY, mouseX, mouseY);
                repaintMultiRect(prevX, prevY, mouseX, mouseY);
            } else {
                // Repaint two rectangles:  The one that contains the previous
                // version of the figure, and the one that will contain the
                // new version.  The first repaint is necessary to restore
                // the picture from the off-screen image in that rectangle.
                repaintMultiRect(startX, startY, prevX, prevY);
                repaintMultiRect(startX, startY, mouseX, mouseY);
            }

            prevX = mouseX;  // Save coords for the next call to mouseDragged or mouseReleased.
            prevY = mouseY;

        }

        @Override
        public void mouseMoved(MouseEvent me) {

        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

        @Override
        public void mouseClicked(MouseEvent me) {
        }

    }
}
