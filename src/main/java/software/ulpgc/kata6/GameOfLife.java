package software.ulpgc.kata6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static software.ulpgc.kata6.Point.at;

public class GameOfLife {


    private static final char Alive = 'X';
    private static final char Dead = '.';

    private final String[] states;

    public GameOfLife(String states) {
        this.states = states.split("\n");
    }

    public GameOfLife next(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < rows(); i++){
            for(int j = 0; j < cols(); j++)
                stringBuilder.append(shouldBeAlive((at(i,j))));
            stringBuilder.append("\n");
        }
        return new GameOfLife(stringBuilder.toString());
    }

    private static final List<Point> offsets = List.of(
            at(-1,-1),at(-1,0),at(-1,1),
            at(0,-1),at(0,1),
            at(1,-1),at(1,0),at(1,1) );

    private char shouldBeAlive(Point point) {
        List<Character> neighbors = new ArrayList<>();
        char cell = states[point.x()].charAt(point.y());
        for(Point p: offsets){
            Point p2 = point.add(p);
            if(p2.x()>=0 && p2.y()>=0 && p2.x() < cols() && p2.y() < rows()){
                neighbors.add(states[p2.x()].charAt(p2.y()));
            }
        }
        if(neighbors.stream().filter(character -> character == Alive).count() >= 3){
            return Alive;
        }else if (neighbors.stream().filter(character -> character == Alive).count() == 2){
            return cell;
        }return Dead;
    }


    private int cols() {
        return states[0].length();
    }

    private int rows() {
        return states.length;
    }

    @Override
    public String toString() {
        return String.join("\n", states) + "\n";
    }
}

