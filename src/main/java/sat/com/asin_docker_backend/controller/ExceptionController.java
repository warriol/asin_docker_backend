package sat.com.asin_docker_backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

public class ExceptionController {
    @ControllerAdvice
    public class AccessDeniedExceptionHandler {

        @ExceptionHandler(AccessDeniedException.class)
        @ResponseBody
        @ResponseStatus(HttpStatus.FORBIDDEN)
        public Map<String, String> handleAccessDeniedException(AccessDeniedException ex) {
            Map<String, String> response = new HashMap<>();
            response.put("error", "permisos insuficientes");
            return response;
        }
    }

}
