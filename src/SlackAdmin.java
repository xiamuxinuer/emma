public class SlackAdmin extends SlackUser {
    int adminId;


    public void addChannel(){
        System.out.println("add channel to "+name);
    }

    public void deleteMessage(){
        System.out.println("deleting message form "+name);
    }

    @Override
    public String toString() {
        return "SlackAdmin{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
// this is constructor:
    public SlackAdmin(String name, String status, int adminId) {
        super(name, status);
        this.adminId = adminId;
    }



    //main class here:
    public static void main(String[] args) {

        SlackAdmin s1=new SlackAdmin("emma","current",123456);

        System.out.println(s1);

        s1.sendMessage();
        s1.deleteMessage();
        s1.addEmoji();
        s1.makeCalls();
        s1.addChannel();






    }
}
