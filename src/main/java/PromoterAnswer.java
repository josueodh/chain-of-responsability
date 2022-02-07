public class PromoterAnswer implements TypeAnswer {

    private static PromoterAnswer promoterAnswer = new PromoterAnswer();

    private PromoterAnswer(){};

    public static PromoterAnswer getPromoterAnswer(){
        return promoterAnswer;
    }
}
