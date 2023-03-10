import com.bulkashmak.reqres.ReqresService;
import com.bulkashmak.reqres.dto.RequestLogin;
import com.bulkashmak.reqres.dto.RequestRegister;
import com.bulkashmak.reqres.dto.ResponseLogin;
import com.bulkashmak.reqres.dto.ResponseUsers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AuthTest {

    private static final ReqresService reqresService = new ReqresService();

    @Test
    public void loginTest() {

        ResponseLogin responseLogin = reqresService.postLogin(new RequestLogin(
                        "eve.holt@reqres.in",
                        "asdf1234"
                ))
                .statusCode(200)
                .extract().as(ResponseLogin.class);
    }

    @Test
    public void registerTest() {

        reqresService.postRegister(new RequestRegister(
                    "eve.holt@reqres.in",
                        "asdf1234"
                ))
                .statusCode(200);
    }

    @Test
    public void getUsersTest() {

        ResponseUsers responseUsers = reqresService.getUsers()
                .statusCode(200)
                .extract().as(ResponseUsers.class);

        responseUsers.getData()
                .forEach(user -> Assertions.assertTrue(user.getAvatar().contains(Integer.toString(user.getId()))));
    }
//
//    @Test
//    public void test() {
//
//        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
//        List<String> ids  = users.stream().map(x->x.getId().toString()).collect(Collectors.toList());
//
//        for(int i = 0; i < avatars.size(); i++) {
//            Assertions.assertTrue(avatars.get(i).contains(ids.get(i)));
//        }
//    }
}