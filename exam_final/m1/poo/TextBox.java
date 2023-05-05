package m1.poo;

public class TextBox extends UIControl {
    // Etat
    public String text;

    public TextBox() {
        System.out.println("TextBox");
    }

    // Les actions sur l'objet
    public void setText(String text, int length){
        this.text = text;
    }

    public void clear(){
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("Render for TextBox");
    }
}