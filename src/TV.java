public class TV {


    String name;
    boolean isOne;
    int currentChannel ;



    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOne=" + isOne +
                ", currentChannel=" + currentChannel +
                '}';
    }

    public int getCurrentChannel(){
        return  currentChannel;
    }

    public void setCurrentChannel(int newChannel){
        if ((isOne==true)){
            if (newChannel>50||newChannel<0){
                System.out.println("invalid channel ");
                return;
            }else {
                currentChannel=newChannel;
            }

        }
        else {
            System.out.println("turn on the TV first.");
        }
    }









}
