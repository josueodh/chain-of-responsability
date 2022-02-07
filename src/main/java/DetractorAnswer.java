public class DetractorAnswer implements TypeAnswer {

    private static DetractorAnswer detractorAnswer = new DetractorAnswer();

    private DetractorAnswer() {
    }

    public static DetractorAnswer getDetractorAnswer() {
        return detractorAnswer;
    }
}