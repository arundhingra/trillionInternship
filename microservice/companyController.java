package hello;

import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/companies")
    public ArrayList<String> greeting() throws SQLException {
        CompanyInformation ci = new CompanyInformation();
        ArrayList<String> companies = ci.getCompanies();
        return companies;
    }
}
