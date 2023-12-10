# Kata 6
## Conway's Game of Life in Java

<p style="text-align: justify;">
Welcome to the implementation of Conway's Game of Life in Java. The Game of Life is a cellular automaton devised by mathematician John Conway. It is a zero-player game, meaning that its evolution is determined by its initial state, with no further input. Despite its simple rules, the Game of Life exhibits complex and fascinating patterns.
</p>


## Project Structure

The project comprises the following classes:

1. `Point:` Represents a point on the board. Each point has coordinates (x, y) and can be alive or dead.

2. `Main:` Main class to execute the game. It contains the main method that initiates the game.

3. `GraphicBoard:` Class for visualizing the board with all cells. It provides methods to display the current state of the board graphically.

4. `GameOfLife:` The main class where the game is created, and relevant rules are applied. It contains the game logic, including the evolution of the board according to the rules of the Game of Life.

5. `Test:` Test class for unit testing. Test-Driven Development (TDD) principles are applied to test and improve the game incrementally.
     
   
**NOTE!** This project uses Maven for dependency management and build automation.
