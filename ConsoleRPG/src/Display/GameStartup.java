package Display;

import Management.CommandManagerSingleton;
import Management.PlayerDataManager;

import java.util.Scanner;

public class GameStartup {

    boolean skipIntro = false;
    boolean skipRegister = false;

    Scanner input = new Scanner(System.in);

    public void startGame(){
        PlayerDataManager pDataMgr = new PlayerDataManager();

        if(!skipIntro) startIntro();

        if(!skipRegister) pDataMgr.registerNewPlayer(Game.player);
    }

    public void startIntro(){
        CommandManagerSingleton cmdMgr = CommandManagerSingleton.getInstance();
        System.out.println("======================================================================="); cmdMgr.wait(350);
        System.out.println("\r _____                _        _ _____                           \r"); cmdMgr.wait(350);
        System.out.println("/  __ \\              | |      | |  __ \\                          \r"); cmdMgr.wait(350);
        System.out.println("| /  \\/_ __ _   _ ___| |_ __ _| | |  \\/ __ _ _ __ ___   ___  ___ \r"); cmdMgr.wait(350);
        System.out.println("| |   | '__| | | / __| __/ _` | | | __ / _` | '_ ` _ \\ / _ \\/ __|\r"); cmdMgr.wait(350);
        System.out.println("| \\__/\\ |  | |_| \\__ \\ || (_| | | |_\\ \\ (_| | | | | | |  __/\\__ \\\r"); cmdMgr.wait(350);
        System.out.println(" \\____/_|   \\__, |___/\\__\\__,_|_|\\____/\\__,_|_| |_| |_|\\___||___/\r"); cmdMgr.wait(350);
        System.out.println("             __/ |                                               \r"); cmdMgr.wait(350);
        System.out.println("            |___/                                                \r"); cmdMgr.wait(350);
        System.out.println(" _____                       _     ____________ _____            \r"); cmdMgr.wait(350);
        System.out.println("/  __ \\                     | |    | ___ \\ ___ \\  __ \\           \r"); cmdMgr.wait(350);
        System.out.println("| /  \\/ ___  _ __  ___  ___ | | ___| |_/ / |_/ / |  \\/           \r"); cmdMgr.wait(350);
        System.out.println("| |    / _ \\| '_ \\/ __|/ _ \\| |/ _ \\    /|  __/| | __            \r"); cmdMgr.wait(350);
        System.out.println("| \\__/\\ (_) | | | \\__ \\ (_) | |  __/ |\\ \\| |   | |_\\ \\           \r"); cmdMgr.wait(350);
        System.out.println(" \\____/\\___/|_| |_|___/\\___/|_|\\___\\_| \\_\\_|    \\____/           \r"); cmdMgr.wait(350);
        System.out.println("======================================================================="); cmdMgr.wait(350);
        System.out.println("Press Any Key To Continue...");
        input.nextLine();
    }
}