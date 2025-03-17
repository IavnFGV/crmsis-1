package dti.crmsis.back.users;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.HashMap;
import java.util.Map;

@Path("/api/v1/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsersResource {


    @POST
    @Path("/login")
    public Map<String,String> login(Credentials credentials) {

        System.out.println(credentials.toString());

        Map<String,String> result = new HashMap<String,String>();

        result.put("user_name",credentials.getUsername());
        return result;
    }

    public static class Credentials {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "Credentials{" +
                   "username='" + username + '\'' +
                   ", password='" + password + '\'' +
                   '}';
        }
    }




}
