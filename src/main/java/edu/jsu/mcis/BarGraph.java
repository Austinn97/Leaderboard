package edu.jsu.mcis;
//import java.awt.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.*;

public class BarGraph extends JPanel implements ComponentListener, MouseListener{
    
    public ArrayList<Bar> barList = new ArrayList<>();
    private GUIPanels leaderBoard; 
    private Bar bar;
    
    public BarGraph(GUIPanels lB){
        leaderBoard = lB;
        GridLayout grid = new GridLayout(0,1);
        this.setLayout(grid);
        addMouseListener(this);
        addComponentListener(this);
        refreshPanel();
    }
    
    public void refreshPanel(){
        int count = 0; 
        removeAll();
        List<Float> gradeList = GUIPanels.columnCg.getGrades(); 
        List<String> idList = GUIPanels.columnCg.getIds();
        barList = new ArrayList<Bar>();
        float highestGrade = GUIPanels.maxGradeInAssignment;
        Collections.sort(idList, Collections.reverseOrder());
        Collections.sort(gradeList, Collections.reverseOrder());
        for(float grade: gradeList){
            barList.add(new Bar(highestGrade, grade, idList.get(count)));
            count++;
        }
        barList.get(0).barColor = Color.BLUE; 
        bar = barList.get(0);
        for(Bar b: barList){
            add(b);
        }
    }
    
    
    @Override
    public void componentResized(ComponentEvent e) {
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Bar position = null;
        if(bar != null){
            bar.barColor = Color.GREEN;
            bar.repaint();
        }
        try{
            int x = e.getX();
            int y = e.getY();            
            position = (Bar)getComponentAt(x,y);
            System.out.println(position);
            System.out.println(bar);
        }
        catch(ClassCastException event){}
        //if(position instanceof Bar){
            bar = position; 
            System.out.println(bar);
            System.out.println(bar.barColor);
            System.out.println(position.barColor);
        //}
        bar.barColor = Color.BLUE;
        System.out.println(bar.barColor);
        bar.repaint();
        leaderBoard.setLabel(bar.id, bar.score);
        refreshPanel();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
