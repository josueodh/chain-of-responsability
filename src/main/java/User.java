import java.util.ArrayList;

public abstract class User {

    protected ArrayList answerList = new ArrayList();
    private User user;

    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public abstract String getRole();

    public String seeAnswer(Answer answer){
        if(answerList.contains(answer.getTypeAnswer())){
            return getRole();
        }else{
            if(user != null){
                return user.seeAnswer(answer);
            }else{
                return "Responta em branco";
            }
        }
    }

}
