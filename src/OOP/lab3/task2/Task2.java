package OOP.lab3.task2;

public class Task2 {
    public static void main(String[] args) {
        Text HugeText = new Text("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dignissim sodales" +
                " ex sed rhoncus. Etiam venenatis nibh quis tincidunt posuere. Sed iaculis dui et nunc laoreet," +
                " et malesuada risus egestas. Nullam vulputate risus volutpat augue tincidunt efficitur." +
                " Suspendisse odio lectus, suscipit nec pharetra semper, ornare vitae nisi. Duis at nibh" +
                " non nulla dapibus lacinia.");

        System.out.println("The number of letters is " + HugeText.GetNumberOfLetters());
        System.out.println("The number of vowels is " + HugeText.GetNumberOfVowels());
        System.out.println("The number of consonants is " + HugeText.GetNumberOfConsonants());
    }
}
