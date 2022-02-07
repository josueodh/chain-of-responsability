public class Owner extends User{
    public Owner(User user){
        answerList.add(DetractorAnswer.getDetractorAnswer());
        setUser(user);
    }

    public String getRole(){
        return "Owner";
    }
}
