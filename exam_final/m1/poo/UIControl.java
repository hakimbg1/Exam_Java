package m1.poo;

public abstract class UIControl{
    private boolean isEnable = true;



    public abstract void render();

    public void enable(){
        isEnable = true;
    }

    public void disable(){
        this.isEnable = false;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
