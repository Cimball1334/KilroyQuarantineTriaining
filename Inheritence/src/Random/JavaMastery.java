package Random;

public class JavaMastery {
static String result  = "sdfs";
public static void main(String[] args) {
    boolean[][] grid = {{true,false,false}, {false,true,false}};
for(int r = 0; r < grid.length; r++){
    for(int c = 0; c < grid[r].length; c++){
        if(grid[r][c]){
            System.out.print("T");

        }else{
            System.out.print("F");

        }

    }
    System.out.println();
}


}
}