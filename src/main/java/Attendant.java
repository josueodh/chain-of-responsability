public class Attendant extends User{
    public Attendant(User user){
        answerList.add(PromoterAnswer.getPromoterAnswer());
        setUser(user);
    }

    public String getRole(){
        return "Attendant";
    }
}
