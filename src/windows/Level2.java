/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package windows;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author imartinb04
 */
public class Level2 extends javax.swing.JDialog
{
    private MainWindow main_win;
    
    private ArrayList <JPanel> allJPanels = new ArrayList();
    private Color[] colors = {new Color(0x7345FF), new Color(0x8245FF), new Color(0x6745FF)};
    private int colorIndex = 0;
    private Timer timer;
    
    private long score = 0;
    private int time = 0;
    
    public Level2(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        
        // Cambia el color de fondo del panel
        this.Level2_Panel.setBackground(new Color(0x3C3F41));
        
        // Inicializa la variable principal con la ventana principal
        this.main_win = (MainWindow) parent;
        
        // Roza el botón suavemente para satisfacerlo eróticamente y ganar
        touchFinish();
        
        cursorInitPos();
        setNoContactZone();
        changePanelColors();
        setGemContact();
        timeFlies();
    }
    
    public void timeFlies()
    {
        // Configura el temporizador para aumentar la variable time cada segundo
        timer = new Timer(1000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                time++;
                
                if(score > 1000)
                {
                    // Tu puntuación baja en 25 puntos cada segundo si tienes más de 1000
                    score -= 25;
                    
                    refreshScore();
                    
                }
                
                // Vale, ésto en teoría debería controlar que, en EL REMOTO CASO de que
                // el entero llegue a su limite, pues el timer sea majo y se pare ahí
                if(time == 2147483647)
                {
                    // Qué majo eres, timer uwu
                    timer.stop();
                }
                
            }
        });
        
        timer.start(); // Inicia el temporizador
    }
    
    // Actualiza el valor de score dentro del JButton, baby
    private void refreshScore()
    {
        // Actualizamos el texto de START al score
        START.setText(String.valueOf(score)); // Convierte score a String
    }
    
    // Resetea las gemas, el tiempo y la puntuación (o debería hacerlo, PERO NO FUNCIONA LA MIERDA ESTA)
    public void resetGame()
    {
        this.gem1.setVisible(true);
        this.gem2.setVisible(true);
        this.gem3.setVisible(true);
        this.gem4.setVisible(true);
        this.gem5.setVisible(true);
        this.gem6.setVisible(true);
        this.gem7.setVisible(true);
        this.gem8.setVisible(true);
        this.gem9.setVisible(true);
        this.gem10.setVisible(true);
        this.gem11.setVisible(true);
        this.gem12.setVisible(true);
        this.gem13.setVisible(true);
        this.gem14.setVisible(true);
        this.gem15.setVisible(true);
        
        this.score = 0;
        
        // MORE SCORE, NOW WITH A NEW REFRESHING TASTE (ZERO)
        refreshScore();
        
        // Redibuja todo (EN TEORÍA D:< )
        this.repaint();
    }
    
    // Si, exacto, cambia los colorinchis cada medio segundo; ¿a que es una puta pasada?
    public void changePanelColors()
    {
        ActionListener colorChangeAction = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Cambiar el color de todos los JPanel
                for (javax.swing.JPanel jPanel : allJPanels)
                {
                    jPanel.setBackground(colors[colorIndex]);
                }

                // Avanzar al siguiente color en el arreglo circularmente
                colorIndex = (colorIndex + 1) % colors.length;
            }
        };

        // Crear un temporizador para cambiar el color cada medio segundo (500 ms)
        Timer timer = new Timer(500, colorChangeAction);
        timer.start();
    }
    
    // Establece la posición inicial del cursor
    public void cursorInitPos()
    {
        try
        {
            Robot robot = new Robot();
            
            // Mueve el cursor a la posición del botón START (o debería)
            robot.mouseMove(260, 60);
            
        } catch (AWTException e)
        {
            e.printStackTrace();
        }

    }
    
    private void setNoContactZone()
    {
        // Esta parte es chunga...
        doNotTouch(this.BorderBottom);
        doNotTouch(this.BorderTop);
        doNotTouch(this.BorderLeft);
        doNotTouch(this.BorderRight);
        
        doNotTouch(this.jPanel2);
        doNotTouch(this.jPanel3);
        doNotTouch(this.jPanel4);
        doNotTouch(this.jPanel5);
        doNotTouch(this.jPanel7);
        doNotTouch(this.jPanel8);
        doNotTouch(this.jPanel9);
        doNotTouch(this.jPanel10);
        doNotTouch(this.jPanel50);
        doNotTouch(this.jPanel12);
        doNotTouch(this.jPanel13);
        doNotTouch(this.jPanel14);
        doNotTouch(this.jPanel15);
        doNotTouch(this.jPanel16);
        doNotTouch(this.jPanel17);
        doNotTouch(this.jPanel18);
        doNotTouch(this.jPanel19);
        doNotTouch(this.jPanel20);
        doNotTouch(this.jPanel22);
        doNotTouch(this.jPanel23);
        doNotTouch(this.jPanel24);
        doNotTouch(this.jPanel25);
        doNotTouch(this.jPanel26);
        doNotTouch(this.jPanel27);
        doNotTouch(this.jPanel29);
        doNotTouch(this.jPanel30);
        doNotTouch(this.jPanel31);
        doNotTouch(this.jPanel32);
        doNotTouch(this.jPanel33);
        doNotTouch(this.jPanel34);
        doNotTouch(this.jPanel35);
        doNotTouch(this.jPanel36);
        doNotTouch(this.jPanel37);
        doNotTouch(this.jPanel38);
        doNotTouch(this.jPanel39);
        doNotTouch(this.jPanel40);
        doNotTouch(this.jPanel41);
        doNotTouch(this.jPanel42);
        doNotTouch(this.jPanel43);
        doNotTouch(this.jPanel44);
        doNotTouch(this.jPanel45);
        doNotTouch(this.jPanel46);
        doNotTouch(this.jPanel47);
        doNotTouch(this.jPanel48);
        
        // Pa'l ArrayList, pequeñajos
        allJPanels.add(this.jPanel2);
        allJPanels.add(this.jPanel3);
        allJPanels.add(this.jPanel4);
        allJPanels.add(this.jPanel5);
        allJPanels.add(this.jPanel7);
        allJPanels.add(this.jPanel8);
        allJPanels.add(this.jPanel9);
        allJPanels.add(this.jPanel10);
        allJPanels.add(this.jPanel50);
        allJPanels.add(this.jPanel12);
        allJPanels.add(this.jPanel13);
        allJPanels.add(this.jPanel14);
        allJPanels.add(this.jPanel15);
        allJPanels.add(this.jPanel16);
        allJPanels.add(this.jPanel17);
        allJPanels.add(this.jPanel18);
        allJPanels.add(this.jPanel19);
        allJPanels.add(this.jPanel20);
        allJPanels.add(this.jPanel22);
        allJPanels.add(this.jPanel23);
        allJPanels.add(this.jPanel24);
        allJPanels.add(this.jPanel25);
        allJPanels.add(this.jPanel26);
        allJPanels.add(this.jPanel27);
        allJPanels.add(this.jPanel29);
        allJPanels.add(this.jPanel30);
        allJPanels.add(this.jPanel31);
        allJPanels.add(this.jPanel32);
        allJPanels.add(this.jPanel33);
        allJPanels.add(this.jPanel34);
        allJPanels.add(this.jPanel35);
        allJPanels.add(this.jPanel36);
        allJPanels.add(this.jPanel37);
        allJPanels.add(this.jPanel38);
        allJPanels.add(this.jPanel39);
        allJPanels.add(this.jPanel40);
        allJPanels.add(this.jPanel41);
        allJPanels.add(this.jPanel42);
        allJPanels.add(this.jPanel43);
        allJPanels.add(this.jPanel44);
        allJPanels.add(this.jPanel45);
        allJPanels.add(this.jPanel46);
        allJPanels.add(this.jPanel47);
        allJPanels.add(this.jPanel48);
        
    }
 
    // Las gemitas hacen cositas ahora
    private void setGemContact()
    {
        doTouch(this.gem1);
        doTouch(this.gem2);
        doTouch(this.gem3);
        doTouch(this.gem4);
        doTouch(this.gem5);
        doTouch(this.gem6);
        doTouch(this.gem7);
        doTouch(this.gem8);
        doTouch(this.gem9);
        doTouch(this.gem10);
        doTouch(this.gem11);
        doTouch(this.gem12);
        doTouch(this.gem13);
        doTouch(this.gem14);
        doTouch(this.gem15);
    }
    
    private void doNotTouch(JPanel panel)
    {
        Level2 level2Instance = Level2.this;
        
        panel.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent e)
            {
                // Aquí puedes mostrar el JDialog de Game Over
                GameOver gameOverDialog = new GameOver(main_win, true);
                gameOverDialog.setVisible(true);
                
                // Resetea los elementos del juego
                resetGame();

                // Pone el cursor donde debe estar
                cursorInitPos();
            }
        });
    }

    private void doTouch(JLabel gem)
    {
        gem.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent e)
            {
                // Cada gema da 1500 puntos
                score += 1500;
                
                refreshScore();
                
                gem.setVisible(false);
            }
        });
    }
    
    private void touchFinish()
    {
        Level2 level2Instance = Level2.this;
        
        FINISH.addMouseListener(new MouseAdapter()
        {
            public void mouseEntered(MouseEvent e)
            {   
                // Aquí puedes mostrar el JDialog de YouWin, PORQUE TE LO MERECES, COÑO
                YouWin youwinbabi = new YouWin(main_win, true);
                
                // Asignamos los valores que aparecerán en el score board
                main_win.score_info[1] = "Nivel 2"; // Nivel 2
                main_win.score_info[2] = String.valueOf(time); // THE VALUE OF TIME!
                main_win.score_info[3] = String.valueOf(score);
                
                youwinbabi.setVisible(true);
                dispose();
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Level2_Panel = new javax.swing.JPanel();
        BorderLeft = new javax.swing.JPanel();
        BorderRight = new javax.swing.JPanel();
        BorderBottom = new javax.swing.JPanel();
        BorderTop = new javax.swing.JPanel();
        FINISH = new javax.swing.JButton();
        START = new javax.swing.JButton();
        gem1 = new javax.swing.JLabel();
        gem2 = new javax.swing.JLabel();
        gem3 = new javax.swing.JLabel();
        gem4 = new javax.swing.JLabel();
        gem5 = new javax.swing.JLabel();
        gem6 = new javax.swing.JLabel();
        gem7 = new javax.swing.JLabel();
        gem8 = new javax.swing.JLabel();
        gem9 = new javax.swing.JLabel();
        gem10 = new javax.swing.JLabel();
        gem11 = new javax.swing.JLabel();
        gem12 = new javax.swing.JLabel();
        gem13 = new javax.swing.JLabel();
        gem14 = new javax.swing.JLabel();
        gem15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Level2_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BorderLeft.setBackground(new java.awt.Color(110, 51, 51));
        BorderLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BorderLeftLayout = new javax.swing.GroupLayout(BorderLeft);
        BorderLeft.setLayout(BorderLeftLayout);
        BorderLeftLayout.setHorizontalGroup(
            BorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        BorderLeftLayout.setVerticalGroup(
            BorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Level2_Panel.add(BorderLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 420));

        BorderRight.setBackground(new java.awt.Color(110, 51, 51));
        BorderRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BorderRightLayout = new javax.swing.GroupLayout(BorderRight);
        BorderRight.setLayout(BorderRightLayout);
        BorderRightLayout.setHorizontalGroup(
            BorderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        BorderRightLayout.setVerticalGroup(
            BorderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        Level2_Panel.add(BorderRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 10, -1));

        BorderBottom.setBackground(new java.awt.Color(110, 51, 51));
        BorderBottom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BorderBottomLayout = new javax.swing.GroupLayout(BorderBottom);
        BorderBottom.setLayout(BorderBottomLayout);
        BorderBottomLayout.setHorizontalGroup(
            BorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        BorderBottomLayout.setVerticalGroup(
            BorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(BorderBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 510, 10));

        BorderTop.setBackground(new java.awt.Color(110, 51, 51));
        BorderTop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BorderTopLayout = new javax.swing.GroupLayout(BorderTop);
        BorderTop.setLayout(BorderTopLayout);
        BorderTopLayout.setHorizontalGroup(
            BorderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );
        BorderTopLayout.setVerticalGroup(
            BorderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(BorderTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 10));

        FINISH.setBackground(new java.awt.Color(0, 204, 204));
        FINISH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finish_flag.png"))); // NOI18N
        FINISH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, java.awt.Color.darkGray));
        FINISH.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                FINISHActionPerformed(evt);
            }
        });
        Level2_Panel.add(FINISH, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 40, 30));

        START.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                STARTActionPerformed(evt);
            }
        });
        Level2_Panel.add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 80, 30));

        gem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 20, 20));

        gem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, 20));

        gem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 20, 20));

        gem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        gem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        gem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        gem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        gem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        gem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        gem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        gem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        gem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 20, 20));

        gem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 20));

        gem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 20, 20));

        gem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gem.png"))); // NOI18N
        Level2_Panel.add(gem15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jPanel2.setBackground(new java.awt.Color(115, 69, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        jPanel3.setBackground(new java.awt.Color(115, 69, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 40, 160));

        jPanel4.setBackground(new java.awt.Color(115, 69, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 90));

        jPanel5.setBackground(new java.awt.Color(115, 69, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, 50));

        jPanel7.setBackground(new java.awt.Color(115, 69, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 30, 100));

        jPanel8.setBackground(new java.awt.Color(115, 69, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 50));

        jPanel9.setBackground(new java.awt.Color(115, 69, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 264, 30, 150));

        jPanel10.setBackground(new java.awt.Color(115, 69, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 204, 40, 180));

        jPanel12.setBackground(new java.awt.Color(115, 69, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 40, 40));

        jPanel13.setBackground(new java.awt.Color(115, 69, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 70));

        jPanel14.setBackground(new java.awt.Color(115, 69, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, 80));

        jPanel15.setBackground(new java.awt.Color(115, 69, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, -1));

        jPanel16.setBackground(new java.awt.Color(115, 69, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 160, 20));

        jPanel17.setBackground(new java.awt.Color(115, 69, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 50, 140));

        jPanel18.setBackground(new java.awt.Color(115, 69, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 30, 170));

        jPanel19.setBackground(new java.awt.Color(115, 69, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel19.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 90, 100));

        jPanel22.setBackground(new java.awt.Color(115, 69, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel22.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 120, 40));

        jPanel23.setBackground(new java.awt.Color(115, 69, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel23.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 30, 10));

        jPanel24.setBackground(new java.awt.Color(115, 69, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel24.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 10, 30));

        jPanel25.setBackground(new java.awt.Color(115, 69, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel25.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 10, 10));

        jPanel29.setBackground(new java.awt.Color(115, 69, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel29.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 10, 40));

        jPanel30.setBackground(new java.awt.Color(115, 69, 255));
        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel30.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 10, 50));

        jPanel27.setBackground(new java.awt.Color(115, 69, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel27.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 90, 10));

        jPanel31.setBackground(new java.awt.Color(115, 69, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel31.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 20, 10));

        jPanel32.setBackground(new java.awt.Color(115, 69, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel32.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 10, 20));

        jPanel33.setBackground(new java.awt.Color(115, 69, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel33.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 90, 20));

        jPanel35.setBackground(new java.awt.Color(115, 69, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel35.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 30, -1));

        jPanel34.setBackground(new java.awt.Color(115, 69, 255));
        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel34.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 10));

        jPanel36.setBackground(new java.awt.Color(115, 69, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel36.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 30, 10));

        jPanel37.setBackground(new java.awt.Color(115, 69, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel37.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 90));

        jPanel38.setBackground(new java.awt.Color(115, 69, 255));
        jPanel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel38.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 180, 20));

        jPanel39.setBackground(new java.awt.Color(115, 69, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel39.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 80, -1));

        jPanel40.setBackground(new java.awt.Color(115, 69, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel40.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 80));

        jPanel41.setBackground(new java.awt.Color(115, 69, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel41.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jPanel42.setBackground(new java.awt.Color(115, 69, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel42.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 10, 20));

        jPanel43.setBackground(new java.awt.Color(115, 69, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel43.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 20, 20));

        jPanel44.setBackground(new java.awt.Color(115, 69, 255));
        jPanel44.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel44.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 20, 10));

        jPanel45.setBackground(new java.awt.Color(115, 69, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel45.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 10, 10));

        jPanel46.setBackground(new java.awt.Color(115, 69, 255));
        jPanel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel46.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 10, -1));

        jPanel47.setBackground(new java.awt.Color(115, 69, 255));
        jPanel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel47.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 30, 30));

        jPanel48.setBackground(new java.awt.Color(115, 69, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel48.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 10, -1));

        jPanel20.setBackground(new java.awt.Color(115, 69, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel20.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 90));

        jPanel26.setBackground(new java.awt.Color(115, 69, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel26.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 50, 40));

        jPanel50.setBackground(new java.awt.Color(115, 69, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel50.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        Level2_Panel.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 40, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Level2_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Level2_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FINISHActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_FINISHActionPerformed
    {//GEN-HEADEREND:event_FINISHActionPerformed
        // Nothing to see here :(
    }//GEN-LAST:event_FINISHActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_STARTActionPerformed
    {//GEN-HEADEREND:event_STARTActionPerformed
        dispose();
    }//GEN-LAST:event_STARTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Level2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Level2 dialog = new Level2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BorderBottom;
    private javax.swing.JPanel BorderLeft;
    private javax.swing.JPanel BorderRight;
    private javax.swing.JPanel BorderTop;
    private javax.swing.JButton FINISH;
    private javax.swing.JPanel Level2_Panel;
    private javax.swing.JButton START;
    private javax.swing.JLabel gem1;
    private javax.swing.JLabel gem10;
    private javax.swing.JLabel gem11;
    private javax.swing.JLabel gem12;
    private javax.swing.JLabel gem13;
    private javax.swing.JLabel gem14;
    private javax.swing.JLabel gem15;
    private javax.swing.JLabel gem2;
    private javax.swing.JLabel gem3;
    private javax.swing.JLabel gem4;
    private javax.swing.JLabel gem5;
    private javax.swing.JLabel gem6;
    private javax.swing.JLabel gem7;
    private javax.swing.JLabel gem8;
    private javax.swing.JLabel gem9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
