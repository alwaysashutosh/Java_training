class Player {
    String gname;

    Player(String gname) {
        this.gname = gname;
    }
}

class CricketPlayer extends Player {
    int no_of_players;

    CricketPlayer(String gname, int no_of_players) {
        super(gname);
        this.no_of_players = no_of_players;
    }

    void display() {
        System.out.println("Game name = " + gname);
        System.out.println("Number of Players = " + no_of_players);
    }
}

class FootballPlayer extends Player {
    int no_of_players;

    FootballPlayer(String gname, int no_of_players) {
        super(gname);
        this.no_of_players = no_of_players;
    }

    void display() {
        System.out.println("Game name = " + gname);
        System.out.println("Number of Players = " + no_of_players);
    }
}

class HockeyPlayer extends Player {
    int no_of_players;

    HockeyPlayer(String gname, int no_of_players) {
        super(gname);
        this.no_of_players = no_of_players;
    }

    void display() {
        System.out.println("Game name = " + gname);
        System.out.println("Number of Players = " + no_of_players);
    }
}

public class inheritance {
    public static void main(String args[]) {
        CricketPlayer c = new CricketPlayer("Cricket", 11);
        FootballPlayer d = new FootballPlayer("Football", 11);
        HockeyPlayer e = new HockeyPlayer("Hockey", 6);

        c.display();
        d.display();
        e.display();
    }
}
