package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService
{
    private User user;

    private List<User> userlist;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final String USERS_PATH = "app/src/main/java/ticket.booking/localDB/users.json";

    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        File users = new File(USERS_PATH);
        userlist = objectMapper.readValue(users, new TypeReference<List<User>>(){});
    }
}
