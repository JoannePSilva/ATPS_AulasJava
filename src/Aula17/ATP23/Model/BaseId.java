package Aula17.ATP23.Model;

import java.util.UUID;

public class BaseId {

    public String gerador_id(){
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        return uuidAsString;
    }
}
