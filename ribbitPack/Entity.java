package ribbitPack;

class Entity {
    public String name;
    public int x;
    public int y;
    public int width;
    public int height;

    public Entity(String name, int x, int y, int width, int height) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    public void moveLeft() {
        this.x-=Const.FSPEED;
    }

    public void moveRight() {
        this.x+=Const.FSPEED;
    }

    public void moveDown() {
        this.y+=Const.FSPEED;
    }

    public void moveUp() {
        this.y-=Const.FSPEED;
    }

}