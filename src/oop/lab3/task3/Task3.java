package oop.lab3.task3;

public class Task3 {
    public static void main(String[] args) {
        Text hugeText = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dignissim sodales" +
                " ex sed rhoncus. Etiam venenatis nibh quis tincidunt posuere. Sed iaculis dui et nunc laoreet," +
                " et malesuada risus egestas. Nullam vulputate risus volutpat augue tincidunt efficitur." +
                " Suspendisse odio lectus, suscipit nec pharetra semper, ornare vitae nisi. Duis at nibh" +
                " non nulla dapibus lacinia.");

        System.out.println("Top five words: ");
        hugeText.getTopFiveWords();
        System.out.println("\nThe longest word is " + hugeText.getLongestWord());
    }
}
