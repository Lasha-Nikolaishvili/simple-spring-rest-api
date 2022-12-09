package ge.ibsu.demo.controllers;

import ge.ibsu.demo.controllers.dto.Person;
import ge.ibsu.demo.controllers.dto.Test;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/test")
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/call", method = RequestMethod.GET, produces = {"application/json"})
    public String test() {
        return ".   ____          _            __ _ _\n" +
                " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                " =========|_|==============|___/=/_/_/_/";
    }

    @ResponseBody
    @RequestMapping(value = "/person", method = RequestMethod.POST, produces = {"application/json"})
    public Test testPost(@RequestBody Person rd) {
        Test t = new Test();
        t.setFullName(rd.getFirstName() + " " + rd.getLastName());
        return t;
    }

}
