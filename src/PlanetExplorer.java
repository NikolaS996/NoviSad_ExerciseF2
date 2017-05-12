import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	
	private int x;
	private int y;
	private String obstacles;
	private String direction;
	List<String> list;
	private int[] coordinates = new int[2];
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
		direction = "N";
		coordinates[0] = 0;	//x
		coordinates[1] = 0;	//y
	}
	
	public PlanetExplorer(int x, int y)
	{
		this.x = x;
		this.y = y;
		direction = "N";
		coordinates[0] = 0;
		coordinates[1] = 0;
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		/*String[] values;
		values = obstacles.split(")(");
		for(int i = 0 ; i < values.length ; i++)
		{
			list.add(values[i]);
		}
		
		
		String obst = values[1];*/
		switch(command)
		{
		case "f":
			if(direction == "N")
			{
					if(coordinates[1] < y - 1)
						coordinates[1]++;
					else
						coordinates[1] = 0;
			}
			else if(direction == "S")
			{
				if(coordinates[1] == 0)
					coordinates[1] = y;
				else
					coordinates[1]--;
			}
			break;
		case "b":
			break;
		case "l":
			break;
		case "r":
			break;
		}
		
		return "(pos_" + coordinates[0] + ",pos_" + coordinates[1] +"," + direction + ")";
	}
}
