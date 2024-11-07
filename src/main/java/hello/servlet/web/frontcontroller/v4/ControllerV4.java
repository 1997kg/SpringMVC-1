package hello.servlet.web.frontcontroller.v4;

import java.util.Map;
import java.util.Objects;

public interface ControllerV4 {

    /**
     *
     * @return
     */
    String process(Map<String , String> paramMap, Map<String, Object> model);
}
