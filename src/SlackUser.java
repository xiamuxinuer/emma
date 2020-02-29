public class SlackUser {

     String name;

    protected String status;

    public SlackUser() {
    }

    public SlackUser(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void sendMessage(){
        System.out.println("send message to "+name);
    }

    public void makeCalls(){
        System.out.println("calling "+name);
    }

    public void addEmoji(){
        System.out.println("creating");
    }




}
