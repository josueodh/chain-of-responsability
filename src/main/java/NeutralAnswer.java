public class NeutralAnswer implements TypeAnswer {

    private static NeutralAnswer neutralAnswer = new NeutralAnswer();

    private NeutralAnswer() {
    }

    public static NeutralAnswer getNeutralAnswer() {
        return neutralAnswer;
    }
}