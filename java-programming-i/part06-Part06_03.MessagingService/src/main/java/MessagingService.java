/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Eric R Smith
 */
public class MessagingService {
    private ArrayList<Message> list;
    
    public MessagingService() {
        this.list = new ArrayList<>();
    }
    
    public void add(Message message) {
        String newMessage = message.getContent();
        if (newMessage.length() < 281)
            this.list.add(message);
    }
    
    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
