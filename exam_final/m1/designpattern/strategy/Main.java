package m1.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        //Code evolutive
        //Code avec des responsabilités partagées
        //Code clean
        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("mesvacances");
    }
}
