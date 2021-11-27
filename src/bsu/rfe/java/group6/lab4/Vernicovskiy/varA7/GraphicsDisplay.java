package bsu.rfe.java.group6.lab4.Vernicovskiy.varA7;

import javax.swing.*;
import java.awt.*;

public class GraphicsDisplay extends JPanel {
    // Basic Stroke класс для задания типа линий
    // класс Font задание шрифта отображения надписей
    private  BasicStroke graphicsStroke; // Тип пера для черчения линии графика
    private  BasicStroke axisStroke; // Тип пера для черчения осей координат
    private  BasicStroke markerStroke; // Тип пера для черчения контуров маркеров
    private Font axisFont; //Шрифт для вывода подписей осей координат
    private Double[][] graphicsData;
    private boolean showAxis = true;
    private boolean showMarkers = true;

    public GraphicsDisplay() {
        setBackground(Color.WHITE);

        graphicsStroke = new BasicStroke(2.0f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_ROUND, 10.0f, new float[]{3, 1, 1, 1, 1, 1, 2, 1, 2, 1}, 0.0f);
        axisStroke = new BasicStroke(2.0f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER, 10.0f, null, 0.0f);
        markerStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER, 10.0F, null, 0.0f);

        axisFont = new Font("Serif", Font.BOLD, 36);
    }
    public void ShowGraphics(Double[][] graphicsData){
        this.graphicsData = graphicsData;
        repaint();
    }
    public void setShowAxis(boolean showAxis) {
        this.showAxis = showAxis;
        repaint();
    }

    public void setShowMarkers(boolean showMarkers) {
        this.showMarkers = showMarkers;
        repaint();
    }
}

