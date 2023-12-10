package software.ulpgc.kata6;

public class GraphicBoard {

    private final String[] cells;

    public GraphicBoard(String cells) {
        this.cells = cells.split("\n");;
    }

    public void Board(){

        StringBuilder sb = new StringBuilder("\n");
        for (String cell : cells) {
            for (int j = 0; j < cell.length(); j++) {
                sb.append(cell.charAt(j)).append("      ");
            }
            sb.append("\n\n");
        }
        System.out.println(sb);
    }

}
