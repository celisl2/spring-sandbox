package web.sandbox.controller;

import java.time.ZonedDateTime;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import web.sandbox.model.BaseModel;
import web.sandbox.util.Constants;

@RestController
@RequestMapping("/api")
public class SandboxController {
    Log LOGGER = LogFactory.getLog(SandboxController.class);

    @RequestMapping(value = Constants.SYSTEM_TIME_ENDPOINT, method = RequestMethod.GET)
    public @ResponseBody BaseModel getRootEndpoint(){
        BaseModel response = new BaseModel();
        response.setUuid_id(UUID.randomUUID());
        response.setTimeZone(ZonedDateTime.now().getZone());
        LOGGER.info("[info] hitting the response");
        return response;
    }
}
