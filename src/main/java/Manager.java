public class Manager extends User{
    public Manager(User user){
        answerList.add(NeutralAnswer.getNeutralAnswer());
        setUser(user);
    }

    public String getRole(){
        return "Manager";
    }
}
