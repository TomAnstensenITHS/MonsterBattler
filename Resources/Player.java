package Resources;

public class Player extends Character {
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
