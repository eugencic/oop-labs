package OOP.lab3.task1;

public class Task1 {
    public static void main(String[] args) {
        Text hugeText = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dignissim sodales" +
                " ex sed rhoncus. Etiam venenatis nibh quis tincidunt posuere. Sed iaculis dui et nunc laoreet," +
                " et malesuada risus egestas. Nullam vulputate risus volutpat augue tincidunt efficitur." +
                " Suspendisse odio lectus, suscipit nec pharetra semper, ornare vitae nisi. Duis at nibh" +
                " non nulla dapibus lacinia.");

        System.out.println("The number of sentences is " + hugeText.getNumberOfSentences());
        System.out.println("The number of words is " + hugeText.getNumberOfWords());
    }
}
