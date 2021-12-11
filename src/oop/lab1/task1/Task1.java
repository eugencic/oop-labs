package oop.lab1.task1;

public class Task1 {
    public static void main(String[] args) {
        Monitor Samsung = new Monitor();

        Samsung.color = "black";
        Samsung.height = 10;
        Samsung.width = 20;
        Samsung.size = 15;
        Samsung.resolution = "1920x1080";

        Monitor LG = new Monitor();
        LG.color = "gray";
        LG.height = 20;
        LG.width = 30;
        LG.size = 20;
        LG.resolution = "1280x720";

        System.out.println(Samsung.height == LG.height);
        System.out.println(Samsung.width < LG.width);
        System.out.println(Samsung.size != LG.size);
    }
}

