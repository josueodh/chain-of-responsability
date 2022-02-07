public class BlankAnswer implements TypeAnswer {

    private static BlankAnswer blankAnswer = new BlankAnswer();

    private BlankAnswer() {
    }

    public static BlankAnswer getBlankAnswer() {
        return blankAnswer;
    }
}