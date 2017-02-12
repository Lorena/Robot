/**
 * Created by lorena on 12/02/17.
 */
public class Command {

    public void executeCommands(Robot robot, String commands, String sizePlateau) {
        for (int i = 0; i<commands.length(); i++) {
            char command = commands.charAt(i);
            if ('L' == command) {
                commandL(robot);
            }
            if ('R' == command) {
                commandR(robot);
            }
            if ('M' == command) {
                commandM(robot);
            }
        }
    }
    private void commandL(Robot robot){
        if(robot.getDirection().equals("N")){
            robot.setDirection("W");
        }else if(robot.getDirection().equals("S")){
            robot.setDirection("E");
        } else if(robot.getDirection().equals("W")){
            robot.setDirection("S");
        } else if(robot.getDirection().equals("E")){
            robot.setDirection("N");
        }
    }

    private void commandR(Robot robot){
        if(robot.getDirection().equals("N")){
            robot.setDirection("E");
        } else if(robot.getDirection().equals("S")){
            robot.setDirection("W");
        } else if(robot.getDirection().equals("W")){
            robot.setDirection("N");
        } else if(robot.getDirection().equals("E")){
            robot.setDirection("S");
        }
    }

    private void commandM(Robot robot){
        if(robot.getDirection().equals("N")){
            robot.setPositionNorthY();
        }
        if(robot.getDirection().equals("S")){
            robot.setPositionSouthY();
        }
        if(robot.getDirection().equals("W")){
            robot.setPositionWestX();
        }
        if(robot.getDirection().equals("E")){
            robot.setPositionEastX();
        }
    }
}
