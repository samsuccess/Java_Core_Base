package homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleField extends JPanel {
    private GameWindow gameWindow;
    public WinWindow winWindow = new WinWindow(this);
    public WinAiWindow winAiWindow = new WinAiWindow(this);
    public DrawWindow drawWindow = new DrawWindow(this);
    private int mode;
    private int fieldSize;
    private int winLine;

    private boolean isInit;

    int cellWidth;
    int cellHeight;

//    public WinWindow getWinWindow() {
//        return winWindow;
//    }

    public BattleField(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellHeight;

//                System.out.println(cellY + " " + cellX);

                if (!Logic.isFinishedGame) {
                    Logic.humanTurn(cellX, cellY);

                    if(Logic.isFinishedGame && Logic.winnerHum){
                        winWindow.setVisible(true);

                    }

                    if (Logic.isFinishedGame && Logic.winnerAi) {
                        winAiWindow.setVisible(true);
                    }

                    if (Logic.isFinishedGame && Logic.isFull()) {
                        drawWindow.setVisible(true);
                    }
                }


                repaint();
            }
        });
    }

    public void startNewGame(int mode, int fieldSize, int winningLength) {
        this.mode = mode;
        this.fieldSize = fieldSize;
        this.winLine = winLine;

        isInit = true;

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (!isInit) {
            return;
        }

        cellWidth = getWidth() / fieldSize;
        cellHeight = getHeight() / fieldSize;

        for (int i = 0; i < fieldSize; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, getWidth(), y);
        }

        for (int i = 0; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, getHeight());
        }

        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, j, i);
                }
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, j, i);
                }
            }
        }

    }

    private void drawO(Graphics g, int cellX, int cellY) {
//        g.setFont(new Font("Arial", Font.BOLD, 30));
//        g.drawString("O", cellX * cellWidth + (cellWidth / 2), cellY * cellHeight + (cellHeight / 2));
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.setColor(Color.DARK_GRAY);
        g.drawOval(cellX * cellWidth, cellY * cellHeight, cellWidth, cellHeight);

    }

    private void drawX(Graphics g, int cellX, int cellY) {
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        g.setColor(Color.BLUE);
        g.drawLine(cellX * cellWidth, cellY * cellHeight, (cellX + 1) * cellWidth, (cellY + 1) * cellHeight);
        g.drawLine(cellX * cellWidth, (cellY + 1) * cellWidth, (cellX +1) * cellHeight, cellY * cellWidth);
    }
}
